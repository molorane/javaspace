package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;


public class Demo4Update {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        try (Connection connection = DbConnector.connectToDb();
             Statement statement = connection.createStatement()) {

            statement.executeUpdate(
                    """
                              UPDATE employee
                              SET first_name = 'Mothusi', last_name = 'Molorane'
                              WHERE id = 2;
                            """
            );

            System.out.println("Data updated successfully");

        } catch (SQLException sqle) {
            sqle.printStackTrace();
            System.exit(-1);
        }
    }
}
