import java.sql.*;

public class DBConnection {
    public static void main(String[] args) {
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            String url = "jdbc:mariadb://localhost:3306/first_database";
            Connection connection = DriverManager.getConnection(url, "root", "");
            System.out.println(connection);
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }
}
