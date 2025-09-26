package com.example.saucedemologin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.testng.AssertJUnit;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DatabaseTesting {
// Connection object
static Connection con = null;
// Statement object
private static Statement stmt,stmt2;
// Constant for Database URL
public static String DB_URL = "jdbc:mysql://localhost:3306/world?useSSL=false&useUnicode=true&characterEncoding=UTF-8"; //db  name
//Database Username
public static String DB_USER = "root";
// Database Password
public static String DB_PASSWORD = "cHinna";

@BeforeTest
public void setUp() throws Exception {
try{
// Database connection
String dbClass = "com.mysql.cj.jdbc.Driver";
Class.forName(dbClass).getDeclaredConstructor().newInstance();
// Get connection to DB
Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
// Statement object to send the SQL statement to the Database
stmt = con.createStatement();
stmt2=con.createStatement();
}
catch (Exception e)
{
e.printStackTrace();
}
}

@Test
public void test() {
try{
String query = "select * from country";
// Get the contents of userinfo table from DB
ResultSet res = stmt.executeQuery(query);
// Print the result untill all the records are printed
// res.next() returns true if there is any next record else returns false
ResultSet res2=stmt2.executeQuery("select count(*) from country");
res2.next(); //We need to move the cursor to the first row to get the data else we get "Before result set" error
System.out.println("No of total countries in the world :"+res2.getString(1));
AssertJUnit.assertEquals(res2.getString(1),"239");
while (res.next())
{
System.out.print(res.getString(1));
System.out.print(" " + res.getString(2));
System.out.print(" " + res.getString(3));
System.out.println(" " + res.getString(4));
}
}
catch(Exception e)
{
e.printStackTrace();
}
}

@AfterTest
public void tearDown() throws Exception {
// Close DB connection
if (con != null) {
con.close();
}
}
}
