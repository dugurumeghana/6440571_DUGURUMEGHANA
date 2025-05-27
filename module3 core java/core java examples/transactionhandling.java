import java.sql.*;

public class TransactionExample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/your_database";
        String user = "root";
        String password = "your_password";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            conn.setAutoCommit(false);

            Statement stmt = conn.createStatement();
            stmt.executeUpdate("UPDATE accounts SET balance = balance - 500 WHERE id = 1"); // debit
            stmt.executeUpdate("UPDATE accounts SET balance = balance + 500 WHERE id = 2"); // credit

            conn.commit();
            System.out.println("Transaction successful.");

        } catch (SQLException e) {
            e.printStackTrace();
            try {
                Connection conn = DriverManager.getConnection(url, user, password);
                conn.rollback();
                System.out.println("Transaction failed. Rolled back.");
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
}
