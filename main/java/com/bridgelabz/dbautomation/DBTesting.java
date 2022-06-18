package com.bridgelabz.dbautomation;

import java.sql.*;

public class DBTesting {
    public static void main(String[] args) throws SQLException {
        String dburl ="jdbc:mysql://localhost:3306/Student";
        String UserName="root";
        String Password="Mylikanna45";
        //Class.forName("Com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(dburl,UserName,Password);
        Statement stm =con.createStatement();
        ResultSet rs=stm.executeQuery("Select * from Users");
        while (rs.next())
        {
            int User_Id =rs.getInt(1);
            String User_Name=rs.getString(2);
            String Department =rs.getString(3);
            System.out.println(User_Id+"  "+User_Name+"  "+Department);
        }
        con.close();
    }
}
