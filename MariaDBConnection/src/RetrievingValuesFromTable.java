import java.sql.*;

public class RetrievingValuesFromTable {
    public static void main(String[] args) {
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            String url = "jdbc:mariadb://localhost:3306/db";
            Connection connection = DriverManager.getConnection(url, "root", "");
            System.out.println(connection);

            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("select * from student");

            while(rs.next()) {
                System.out.println(rs.getInt(1) + "-" + rs.getString(2) + "-" + rs.getString(3));
            }
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }
}
