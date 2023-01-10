package jdbc;

import java.sql.*;


public class StoredProcedure2 {

    public static void main(String[] args) {

        String query = """
                            CALL GetAllEmployees();
                        """;

        try (Connection connection = DbConnector.connectToDb();
             CallableStatement statement = connection.prepareCall(query);
             ResultSet resultSet = statement.executeQuery()) {

            MyUtil.print(resultSet);

        } catch (SQLException sqle) {
            sqle.printStackTrace();
            System.exit(-1);
        }
    }
}
