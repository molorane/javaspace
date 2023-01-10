package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;


public class Transaction1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        try (Connection connection = DbConnector.connectToDb();
             Statement statement = connection.createStatement()) {

            statement.executeUpdate(
                    """
                            INSERT INTO employee
                            VALUES (1, 'OCP', 'Java11', 5400);
                        """
            );

            statement.executeUpdate(
                    """
                            INSERT INTO employee (first_name, last_name, salary) []
                            VALUES ('Mothusi', 'Mo', 27);
                        """
            );

            System.out.println("Transaction successfully");

        } catch (SQLException sqle) {
            sqle.printStackTrace();
            System.exit(-1);
        }
    }
}
