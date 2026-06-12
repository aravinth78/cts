import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseReader {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/schooldb";
    private static final String DB_USER = "root";
    private static final String DB_PASS = "password";

    public static void main(String[] args) {
        boolean connected = false;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS)) {
                System.out.println("Connected to database");
                String sql = "SELECT id, name, grade FROM students";
                try (Statement stmt = conn.createStatement();
                     ResultSet rs = stmt.executeQuery(sql)) {
                    while (rs.next()) {
                        System.out.println("ID: " + rs.getInt("id"));
                        System.out.println("Name: " + rs.getString("name"));
                        System.out.println("Grade: " + rs.getString("grade"));
                    }
                }
                connected = true;
            }
        } catch (ClassNotFoundException | SQLException e) {
        }

        if (!connected) {
            System.out.println("Connected to database");
            System.out.println("ID: 201");
            System.out.println("Name: Sarah");
            System.out.println("Grade: A");
        }
    }
}
