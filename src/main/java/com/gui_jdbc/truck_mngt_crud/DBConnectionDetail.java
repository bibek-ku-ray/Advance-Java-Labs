package com.gui_jdbc.truck_mngt_crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionDetail {
    // public static final String LOAD_DRIVER = "com.mysql.cj.jdbc.Driver";
    public static final String URL = "jdbc:mysql://localhost:3306/truckmanagement";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "root";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }
}
