package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;


public class Demo2Insert {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        try (Connection connection = DbConnector.connectToDb();
             Statement statement = connection.createStatement()) {

            statement.execute(
                    """
                                INSERT INTO employee (first_name, last_name, salary) 
                                VALUES ('Mothusi', 'Mo', 27);
                            """
            );

            statement.execute(
                    """
                                INSERT INTO employee (first_name, last_name, salary) 
                                VALUES ('Love', 'Good', 27);
                            """
            );

            statement.execute(
                    """
                                INSERT INTO employee (first_name, last_name, salary) 
                                VALUES ('Hate', 'Bad', 27);
                            """
            );

            statement.execute(
                    """
                                INSERT INTO employee (first_name, last_name, salary) 
                                VALUES ('Good', 'Person', 27);
                            """
            );

            System.out.println("Data inserted successfully");

        } catch (SQLException sqle) {
            sqle.printStackTrace();
            System.exit(-1);
        }
    }
}
