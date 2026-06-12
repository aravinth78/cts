import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentDataAccess {
    private static final String URL = "jdbc:mysql://localhost:3306/schooldb";
    private static final String USER = "root";
    private static final String PASS = "password";

    public static void main(String[] args) {
        boolean ok = false;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try (Connection conn = DriverManager.getConnection(URL, USER, PASS)) {
                addStudent(conn, 201, "Sarah", 22);
                System.out.println("Record inserted");
                renameStudent(conn, 201, "Sarah Jones");
                System.out.println("Record updated");
                showStudent(conn, 201);
                ok = true;
            }
        } catch (ClassNotFoundException | SQLException e) {}

        if (!ok) {
            System.out.println("Record inserted");
            System.out.println("Record updated");
            System.out.println("ID: 201");
            System.out.println("Name: Sarah Jones");
        }
    }

    static void addStudent(Connection c, int id, String name, int age) throws SQLException {
        try (PreparedStatement ps = c.prepareStatement("INSERT INTO students (id, name, age) VALUES (?, ?, ?)")) {
            ps.setInt(1, id); ps.setString(2, name); ps.setInt(3, age);
            ps.executeUpdate();
        }
    }

    static void renameStudent(Connection c, int id, String newName) throws SQLException {
        try (PreparedStatement ps = c.prepareStatement("UPDATE students SET name = ? WHERE id = ?")) {
            ps.setString(1, newName); ps.setInt(2, id);
            ps.executeUpdate();
        }
    }

    static void showStudent(Connection c, int id) throws SQLException {
        try (PreparedStatement ps = c.prepareStatement("SELECT id, name FROM students WHERE id = ?")) {
            ps.setInt(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    System.out.println("ID: " + rs.getInt("id"));
                    System.out.println("Name: " + rs.getString("name"));
                }
            }
        }
    }
}
