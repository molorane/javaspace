package jdbc;

import java.sql.SQLException;
import java.sql.Statement;

public class StoredProcedure1 {

    public static void main(String[] args) {
        try (var connection = DbConnector.connectToDb();
             Statement statement = connection.createStatement()) {
            statement.executeUpdate(
                    """
                        CREATE PROCEDURE IF NOT EXISTS GetAllEmployees()
                        BEGIN
                        	SELECT *  FROM employee;
                        END
                        """
            );

            statement.executeUpdate(
                    """
                        CREATE PROCEDURE IF NOT EXISTS AddEmployee(
                            IN firstName VARCHAR(255),
                            IN lastName VARCHAR(255),
                            IN salary DECIMAL(10,2)
                        )
                        BEGIN
                        	INSERT INTO employee(first_name, last_name, salary) VALUES (firstName, lastName, salary);
                        END
                        """
            );

            statement.executeUpdate(
                    """
                        CREATE PROCEDURE IF NOT EXISTS CountEmployeeWithSalaryGreator(
                            IN inSalary DECIMAL(10,2),
                            OUT outSalary INT
                        )
                        BEGIN
                        	SELECT COUNT(*) INTO outSalary FROM employee WHERE salary > inSalary;
                        END
                        """
            );

            System.out.println("Procedure created successfully");
        } catch (SQLException sqle) {
            sqle.printStackTrace();
            System.exit(-1);
        }
    }
}