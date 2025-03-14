package com.gui_jdbc.student_crud_improved;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Utility class to manage database connections
 */
public class DBConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/collegeDB";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";

    // Private constructor to prevent instantiation
    private DBConnection() {}


    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }
}