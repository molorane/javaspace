package jdbc;

import java.sql.SQLException;
import java.sql.Statement;

public class Demo1DDLCreateTable {

    public static void main(String[] args) {
        try (var connection = DbConnector.connectToDb();
             Statement statement = connection.createStatement()) {

            statement.executeUpdate(
                    """
                        CREATE TABLE IF NOT EXISTS employee
                        ( id INT PRIMARY KEY AUTO_INCREMENT,
                          first_name VARCHAR(50) NOT NULL,
                          last_name VARCHAR(50),
                          salary DECIMAL(10,2)
                        );
                        """
            );

            System.out.println("Table created successfully");
        } catch (SQLException sqle) {
            sqle.printStackTrace();
            System.exit(-1);
        }
    }
}