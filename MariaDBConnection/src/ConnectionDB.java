import java.sql.*;

public class ConnectionDB {
    public static void main(String[] arg) {
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/db","root","");
            Statement statement = connection.createStatement();
            
            statement.executeUpdate("create table emp(eid integer, name varchar(20), sal integer)");
            statement.executeUpdate("insert into emp values(1, 'Rohith', 50000)");
            statement.executeUpdate("insert into emp values(2, 'Raju', 50000)");
            ResultSet rs = statement.executeQuery("select * from emp");
            while (rs.next()) {
                System.out.println(rs.getString("eid") + " " + rs.getString("name"));
            }
            System.out.print(connection);
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
