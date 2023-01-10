package jdbc;

import java.sql.*;


public class StoredProcedure4 {

    public static void main(String[] args) {

        String query = """
                            CALL CountEmployeeWithSalaryGreator(?, ?);
                        """;

        try (Connection connection = DbConnector.connectToDb();
             CallableStatement statement = connection.prepareCall(query)) {

            statement.setDouble(1, 27);
            statement.registerOutParameter(2, Types.DECIMAL);

            statement.execute();

           System.out.println(statement.getString("outSalary"));

        } catch (SQLException sqle) {
            sqle.printStackTrace();
            System.exit(-1);
        }
    }
}
