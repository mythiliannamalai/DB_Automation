package com.bridgelabz.dbautomation;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Base_Class {
    public static Connection con;
    @BeforeTest
    public Connection setUp() throws SQLException {
        String dburl ="jdbc:mysql://localhost:3306/Student";
        String UserName="root";
        String Password="Mylikanna45";
        Connection con = DriverManager.getConnection(dburl,UserName,Password);
        return con;
    }
@AfterTest
public void tearDown() throws SQLException {
        con.close();
}
}
