package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Demo3Select2 {

    public static void main(String[] args) throws SQLException {

        ResultSet resultSet = null;
        try (Connection connection = DbConnector.connectToDb();
             Statement statement = connection.createStatement()) {

            resultSet = statement.executeQuery("SELECT * FROM employee");

            System.out.println("ID \tFirstName \tLastName");
        } catch (SQLException sqle) {
            sqle.printStackTrace();
            System.exit(-1);
        }

        while (resultSet.next()) {
            System.out.printf("%s\t%s\t%s\n",
                    resultSet.getObject(1),
                    resultSet.getString("first_name"),
                    resultSet.getString("last_name")
            );
        }
    }
}
