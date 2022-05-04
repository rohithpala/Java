import java.sql.*;

public class DeleteFromTable {
    public static void main(String[] args) {
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            String url = "jdbc:mariadb://localhost:3306/first_database";
            Connection connection = DriverManager.getConnection(url, "root", "");
            System.out.println(connection);

            Statement statement = connection.createStatement();
            statement.executeUpdate("delete from student where dept='CSE'");
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }
}
