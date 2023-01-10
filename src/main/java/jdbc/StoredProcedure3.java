package jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class StoredProcedure3 {

    public static void main(String[] args) {

        String query = """
                            CALL AddEmployee(?, ?, ?);
                        """;

        try (Connection connection = DbConnector.connectToDb();
             CallableStatement statement = connection.prepareCall(query)) {

            statement.setString(1, "Colombia");
            statement.setString(2, "Panther");
            statement.setDouble(3, 45);

            statement.execute();

            System.out.println("StoredProcedure data inserted successfully");

        } catch (SQLException sqle) {
            sqle.printStackTrace();
            System.exit(-1);
        }
    }
}
