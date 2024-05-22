package com.jdbclearning.util;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLConnector {
//    "com.mysql.cj.jdbc.Driver"

public static Connection createConnection() {
    Connection con = null;
     final String DB_NAME = "highschool";
     final String DB_URL = "jdbc:mysql://localhost:3306/highschool";
     final String DB_USERNAME = "root";
     final String DB_PASSWORD = "Kulsoom12_";
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
    } catch (ClassNotFoundException | SQLException e) {
        e.printStackTrace();
    }
    return con;
}
}