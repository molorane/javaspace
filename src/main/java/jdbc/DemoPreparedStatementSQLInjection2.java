package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;


public class DemoPreparedStatementSQLInjection2 {

    public static void main(String[] args) {


        try (Connection connection = DbConnector.connectToDb();
             Statement statement = connection.createStatement()) {

            String id = "1 OR id<>0";

            String query = """
                            DELETE FROM employee WHERE id=%s;
                        """.formatted(id);

            statement.executeUpdate(query);

            System.out.println("statement successfully");

        } catch (SQLException sqle) {
            sqle.printStackTrace();
            System.exit(-1);
        }
    }
}
