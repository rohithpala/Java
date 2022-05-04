import java.sql.*;

public class InsertingIntoTable {
    public static void main(String[] args) {
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            String url = "jdbc:mariadb://localhost:3306/db";
            Connection connection = DriverManager.getConnection(url, "root", "");
            System.out.println(connection);

            Statement statement = connection.createStatement();
            statement.executeUpdate("insert into student values(1, 'Rohith', 'CSE')");
            statement.executeUpdate("insert into student values(2, 'Sree Teja', 'IT')");
            statement.executeUpdate("insert into student values(2, 'Mani Sai', 'ECE')");
            statement.executeUpdate("insert into student values(2, 'Pranesh', 'EEE')");
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }
}
