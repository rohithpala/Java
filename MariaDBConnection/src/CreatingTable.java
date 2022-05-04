import java.sql.*;

public class CreatingTable {
    public static void main(String[] args) {
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            String url = "jdbc:mariadb://localhost:3306/db";
            Connection connection = DriverManager.getConnection(url, "root", "");
            System.out.println(connection);

            Statement statement = connection.createStatement();
            statement.executeUpdate("create table student(sno integer, sname varchar(20), dept varchar(5))");
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }
}
