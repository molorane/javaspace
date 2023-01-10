package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DemoInsertWithResultSet {

    public static void main(String[] args) throws SQLException {
        try (Connection connection = DbConnector.connectToDb();
             Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
             ResultSet resultSet = statement.executeQuery("SELECT * FROM employee")) {
            System.out.println("Before the insert");
            MyUtil.print(resultSet);
            resultSet.moveToInsertRow();
            resultSet.updateString("first_name", "Test");
            resultSet.updateString("last_name", "Java");
            resultSet.updateDouble("salary", 32);
            resultSet.insertRow();
            System.out.println("After the insert");
            resultSet.beforeFirst();
            MyUtil.print(resultSet);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}