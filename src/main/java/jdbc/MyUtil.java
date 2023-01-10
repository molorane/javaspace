package jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MyUtil {

    public static void print(ResultSet resultSet) throws SQLException {
        System.out.println("id \tFirstName \tLastName \tSalary");
        while (resultSet.next()) {
            System.out.printf("%s \t%s \t%s \t%s\n",
                    resultSet.getInt("id"),
                    resultSet.getString("first_name"),
                    resultSet.getString("last_name"),
                    resultSet.getString("salary")
            );
        }
    }

    public static void printRow(ResultSet resultSet) throws SQLException {
        System.out.println("id \tFirstName \tLastName \tSalary");
        System.out.printf("%s \t%s \t%s \t%s\n",
                resultSet.getInt("id"),
                resultSet.getString("first_name"),
                resultSet.getString("last_name"),
                resultSet.getString("salary")
        );
    }
}
