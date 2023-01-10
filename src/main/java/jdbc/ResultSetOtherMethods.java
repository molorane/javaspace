package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSetOtherMethods {

    public static void main(String[] args) {
        try (Connection connection = DbConnector.connectToDb();
             Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
             ResultSet rs = statement.executeQuery("select * from employee order by id")) {

            //rs.beforeFirst();
            //rs.first();

            // positives
            //rs.absolute(2);
            //rs.relative(2);

            // negatives
            //rs.afterLast();
            //rs.relative(-2); // throws Exception
            //rs.absolute(-1);

            rs.last();
            //rs.afterLast();

            // boolean versions
            //rs.isAfterLast();
            //rs.isFirst();
            //rs.isLast();
            System.out.println(rs.isLast());

            //MyUtil.printRow(rs);
        } catch (SQLException sqle) {
            sqle.printStackTrace();
            System.exit(-1);
        }
    }

}
