package jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;


public class DbConnector {

    public static void main(String[] args) throws SQLException {
        connectToDbWithProp();
    }

    public static Connection connectToDb() throws SQLException {
        String url = "jdbc:mysql://localhost/";
        String database = "javaspace?serverTimezone=UTC";
        String userName = "root";
        String password = "blessing";
        return DriverManager.getConnection(url + database, userName, password);
    }

    public static Connection connectToDbWithProp() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/javaspace?serverTimezone=UTC";
        Properties p = new Properties();
        p.setProperty("user", "root");
        p.setProperty("password", "blessing");
        return DriverManager.getConnection(url, p);
    }

    public static Connection connectToDbJustUrl() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/javaspace?user=root&password=blessing&serverTimezone=UTC";
        return DriverManager.getConnection(url);
    }
}