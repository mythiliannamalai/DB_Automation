package com.bridgelabz.dbautomation.testing;

import com.bridgelabz.dbautomation.Base_Class;
import org.testng.annotations.Test;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBTest extends Base_Class {
@Test
    public void DB_Test_InsertData() throws SQLException {
    con=this.setUp();
    PreparedStatement ps= con.prepareStatement("insert into Users values(?,?,?)");
    ps.setInt(1,107);
    ps.setString(2,"Vijaya");
    ps.setString(3,"MBA");
    ps.executeUpdate();
    DB_Test_SelectQuery();
}
@Test
public void DB_Test_UpdateData() throws SQLException {
    con=this.setUp();
    PreparedStatement ps= con.prepareStatement("update Users set Department='BA' where User_Id=107");
    ps.executeUpdate();
    DB_Test_SelectQuery();
}
@Test
public void DB_Test_DeleteData() throws SQLException {
    con=this.setUp();
    PreparedStatement ps= con.prepareStatement("delete from Users where User_Id=106");
    ps.executeUpdate();
    DB_Test_SelectQuery();
}
@Test
    public void DB_Test_SelectQuery() throws SQLException {
    con=this.setUp();
    Statement stm =con.createStatement();
    ResultSet rs=stm.executeQuery("Select * from Users");
    while (rs.next())
    {
        int User_Id =rs.getInt(1);
        String User_Name=rs.getString(2);
        String Department =rs.getString(3);
        System.out.println(User_Id+"  "+User_Name+"  "+Department);
    }
}

}
