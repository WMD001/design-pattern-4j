package main.java.top.wmd001.creational.factory_method;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Create by habit on 2024/6/26
 */
public class OracleConnection implements DatabaseConnection {

    private Connection connection;

    @Override
    public void connect(String url, String username, String password) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to Oracle database.");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void disconnect() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
                System.out.println("Disconnected from Oracle database.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
