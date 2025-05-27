import java.sql.*;

public class StudentDAO {
    static String url = "jdbc:mysql://localhost:3306/your_database";
    static String user = "root";
    static String password = "your_password";

    public void insertStudent(int id, String name) throws SQLException {
        Connection conn = DriverManager.getConnection(url, user, password);
        String sql = "INSERT INTO students (id, name) VALUES (?, ?)";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setInt(1, id);
        stmt.setString(2, name);
        stmt.executeUpdate();
        conn.close();
    }

    public void updateStudent(int id, String name) throws SQLException {
        Connection conn = DriverManager.getConnection(url, user, password);
        String sql = "UPDATE students SET name = ? WHERE id = ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, name);
        stmt.setInt(2, id);
        stmt.executeUpdate();
        conn.close();
    }

    public static void main(String[] args) throws SQLException {
        StudentDAO dao = new StudentDAO();
        dao.insertStudent(1, "Meghana");
        dao.updateStudent(1, "Duguru Meghana");
    }
}
