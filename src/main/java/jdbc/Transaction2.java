package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;


public class Transaction2 {

    public static void main(String[] args) throws SQLException {

        Connection connection = DbConnector.connectToDb();
        try (Statement statement = connection.createStatement()) {

            connection.setAutoCommit(false);

            statement.executeUpdate(
                    """
                            INSERT INTO employee
                            VALUES (100, 'KKJ', 'JKAS', 32);
                        """
            );

            statement.executeUpdate(
                    """
                            INSERT INTO employee []
                            VALUES (2, 'FASA', 'AKSHA', 87);
                        """
            );

            System.out.println("Transaction successfully");

            connection.commit();
        } catch (SQLException sqle) {
            sqle.printStackTrace();
            connection.rollback();
        }
    }
}
