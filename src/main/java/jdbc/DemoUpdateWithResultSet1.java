package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DemoUpdateWithResultSet1 {

    public static void main(String[] args) throws SQLException {
        Connection connection = DbConnector.connectToDb();
        try (Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
             ResultSet resultSet = statement.executeQuery("SELECT * FROM employee")) {
            // first fetch the data and display it before the update operation
            System.out.println("Before the update");
            MyUtil.print(resultSet);
            // now update the resultset and display the modified data
            resultSet.beforeFirst();
            resultSet.next();
            resultSet.updateString("first_name", "BSG");
            resultSet.updateRow();
            System.out.println("After the update");
            resultSet.beforeFirst();
            MyUtil.print(resultSet);
        }

    }

}
