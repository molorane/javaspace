package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSetMetaData {

    public static void main(String[] args) {

        try (Connection connection = DbConnector.connectToDbWithProp();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT * FROM employee")) {

            int numberOfColumns = resultSet.getMetaData().getColumnCount();

            while (resultSet.next()) {
                for (int i = 1; i <= numberOfColumns; i++) {
                    System.out.print(resultSet.getObject(i) + "\t");
                }
                System.out.println();
            }

        } catch (SQLException sqle) {
            sqle.printStackTrace();
            System.exit(-1);
        }
    }
}
