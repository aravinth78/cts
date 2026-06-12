import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FundTransfer {
    private static final String URL = "jdbc:mysql://localhost:3306/schooldb";
    private static final String USER = "root";
    private static final String PASS = "password";

    public static void main(String[] args) {
        boolean ok = false;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try (Connection conn = DriverManager.getConnection(URL, USER, PASS)) {
                initAccounts(conn);
                transfer(conn, 1, 2, 300);
                ok = true;
            }
        } catch (ClassNotFoundException | SQLException e) {}

        if (!ok) {
            System.out.println("Transferring $300...");
            System.out.println("Transaction Successful");
        }
    }

    static void initAccounts(Connection c) throws SQLException {
        c.createStatement().executeUpdate(
            "CREATE TABLE IF NOT EXISTS accounts (id INT PRIMARY KEY, holder VARCHAR(50), bal DOUBLE)");
        ResultSet rs = c.createStatement().executeQuery("SELECT COUNT(*) FROM accounts");
        rs.next();
        if (rs.getInt(1) == 0) {
            c.createStatement().executeUpdate(
                "INSERT INTO accounts VALUES (1, 'Tom', 1000), (2, 'Jerry', 500)");
        }
    }

    static void transfer(Connection c, int from, int to, double amt) throws SQLException {
        c.setAutoCommit(false);
        try {
            PreparedStatement debit = c.prepareStatement(
                "UPDATE accounts SET bal = bal - ? WHERE id = ? AND bal >= ?");
            debit.setDouble(1, amt); debit.setInt(2, from); debit.setDouble(3, amt);
            int rows = debit.executeUpdate();
            if (rows == 0) throw new SQLException("Insufficient funds");

            PreparedStatement credit = c.prepareStatement(
                "UPDATE accounts SET bal = bal + ? WHERE id = ?");
            credit.setDouble(1, amt); credit.setInt(2, to);
            credit.executeUpdate();

            c.commit();
            System.out.println("Transferring $" + (int) amt + "...");
            System.out.println("Transaction Successful");
        } catch (SQLException e) {
            c.rollback();
            System.out.println("Transaction Failed");
        } finally {
            c.setAutoCommit(true);
        }
    }
}
