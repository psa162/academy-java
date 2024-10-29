package com.bptn.course._26_postgresql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//import java.sql.Connection;


public class ToDoListClass {


 private static final String userName = "postgres";
 private static final String password = "pg123";
 private static final String dbName = "todoList";
 private static final String port = "5432";
 private static final String dbUrl = "localhost";


 public Connection createConnection() {
  Connection conn = null;
  try {
   conn = DriverManager.getConnection("jdbc:postgresql://" + dbUrl + ":" + port + "/" + dbName, userName, password);
  } catch (Exception e) {
   System.out.println(e.getClass().getName() + " : " + e.getMessage());
   System.exit(0);
  }
  System.out.println("Connected to DB!");
  return conn;
 }
 
 public void getAllUsers(Connection conn) {
	  try {
	   // Step 1 - Create the statement
	   Statement myStatement = conn.createStatement();
	   // Step 2 - Define the Query
	   String myQuery = "SELECT * FROM users";
	   // Step 3 - Execute/Run the Query and store the result
	   ResultSet rs = myStatement.executeQuery(myQuery);
	   while (rs.next()) {
	    System.out.print("User Id: " + rs.getInt("userId") + "\t");
	    System.out.print("User Name: " + rs.getString("username") + "\t");
	    System.out.print("Email: " + rs.getString("email") + "\t");
	    System.out.print("Created At: " + rs.getString("createdAt") + "\t");
	    System.out.println();
	   }
	   myStatement.close();
	  } catch (SQLException e) {
	   System.out.println("Exception: " + e.getMessage());
	  }
	 }

 
 
 public boolean closeConnection(Connection conn) {
	  boolean flag = true;
	  try {
	   conn.close();
	  } catch (SQLException e) {
	   flag = false;
	   System.out.println("Exception: " + e.getMessage());
	  }
	  return flag;
	 }
}


