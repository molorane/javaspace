package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;


public class DemoPreparedStatementSQLInjectionPrevention2 {

    public static void main(String[] args) {
        String id = "51";

        String query = """
                            DELETE FROM employee WHERE id=?;
                        """;

        try (Connection connection = DbConnector.connectToDb();
             PreparedStatement statement = connection.prepareStatement(query)) {

            statement.setString(1, id);
            statement.executeUpdate();

            System.out.println("statement successfully");

        } catch (SQLException sqle) {
            sqle.printStackTrace();
            System.exit(-1);
        }
    }
}
