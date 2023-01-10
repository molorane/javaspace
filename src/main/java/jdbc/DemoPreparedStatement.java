package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;


public class DemoPreparedStatement {

    public static void main(String[] args) {

        String query = """
                            INSERT INTO employee (first_name, last_name, salary)
                            VALUES (?,?,?);
                        """;

        try (Connection connection = DbConnector.connectToDb();
             PreparedStatement statement = connection.prepareStatement(query)) {

            statement.setString(1, "Deon");
            statement.setString(2, "Sid");
            statement.setDouble(3, 45);

            statement.executeUpdate();

            System.out.println("PreparedStatement data inserted successfully");

        } catch (SQLException sqle) {
            sqle.printStackTrace();
            System.exit(-1);
        }
    }
}
