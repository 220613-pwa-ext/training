package com.revature.utility;

import org.postgresql.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtility {

    public static Connection createConnection() throws SQLException {

        Driver postgresDriver = new Driver();
        DriverManager.registerDriver(postgresDriver);

        String url = System.getenv("db_url");
        String username = System.getenv("db_username");
        String password = System.getenv("db_password");
        Connection con = DriverManager.getConnection(url, username, password);

        return con;
    }

}
