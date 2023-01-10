package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author Mothusi Molorane
 */
public class DemoDeleteWithResultSet {

    public static void main(String[] args) throws SQLException {

        try (Connection connection = DbConnector.connectToDb();
             Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
             ResultSet resultSet = statement.executeQuery("SELECT * FROM employee")) {
            resultSet.next();
            //delete the first row
            resultSet.deleteRow();

            //now fetch again from the database

            //demo
            resultSet.relative(1);
            MyUtil.print(resultSet);
        } catch (SQLException e) {
            e.printStackTrace();
            System.exit(-1);
        }
    }
}