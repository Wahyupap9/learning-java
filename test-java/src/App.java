import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class App {
 private static final String URL = "jdbc:mysql://localhost:3306/test";
 private static final String USER = "root";
 private static final String PASSWORD = "";

 private static Connection connection;

 public static void main(String[] args) {
     try {
         connection = DriverManager.getConnection(URL, USER, PASSWORD);

         if (connection != null) {
             System.out.println("Connected to the database successfully!");
         }
     } catch (SQLException e) {
         System.err.println("Error connecting to the database:");
         e.printStackTrace();
     } finally {
         if (connection != null) {
             try {
                 connection.close();
                 System.out.println("Connection closed.");
             } catch (SQLException ex) {
                 ex.printStackTrace();
             }
         }
     }
 }
}
