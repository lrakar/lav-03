// args: 
// author: Lovro Rakar 
// menthor: Marko Kastelic 
/*<StartComments>
</endComments>*/
import java.sql.*;

public class Naloga1{
    // Connect to your database.
    public static void main(String[] args) {
        System.out.println("hello");
        String connectionUrl =
                "jdbc:mysql://localhost:3306;"
                        + "database=lovronet;"
                        + "user=root;"
                        + "password=;";
        ResultSet resultSet = null;
        try (Connection connection = DriverManager.getConnection(connectionUrl);) {
            String selectSql = "SELECT * FROM uporabniki";
            while (resultSet.next()) {
                System.out.println(resultSet.getString(2) + " " + resultSet.getString(3));
            }
        }
        // Handle any errors that may have occurred.
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}