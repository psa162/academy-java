package com.bptn.course._27_capstone;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FeedAppClass {
	
	private static final String userName = "postgres";
	 private static final String password = "pg123";
	 private static final String dbName = "feedapp";
	 private static final String port = "5432";
	 private static final String dbUrl = "localhost";
	 
	 public Connection createConnection() {
		 
		 Connection conn =null;
		 
		 try {
			   conn = DriverManager.getConnection("jdbc:postgresql://" + dbUrl + ":" + port + "/" + dbName, userName, password);
			  } catch (Exception e) {
			   System.out.println(e.getClass().getName() + " : " + e.getMessage());
			   System.exit(0);
			  }
			  System.out.println("Opened database successfully");
			  return conn;
			 }
	 
	 public void addUser(Connection conn, String firstName, String lastName, String username, String phone,String emailId, String password, boolean emailVerified) {
		 String sql = "INSERT INTO \"user\" (\"firstName\", \"lastName\", \"username\", \"phone\", \"emailId\", " +
                 "\"password\", \"emailVerified\", \"createdOn\") VALUES (?, ?, ?, ?, ?, ?, ?, CURRENT_TIMESTAMP)";
	 
	 try (PreparedStatement stmt = conn.prepareStatement(sql)) {
         stmt.setString(1, firstName);
         stmt.setString(2, lastName);
         stmt.setString(3, username);
         stmt.setString(4, phone);
         stmt.setString(5, emailId);
         stmt.setString(6, password);
         stmt.setBoolean(7, emailVerified);
         int resultCount = stmt.executeUpdate();
         System.out.println(resultCount + " record(s) inserted");
     } catch (SQLException ex) {
         System.err.println("Insertion error: " + ex.getMessage());
     }
 }

 // Method to close the database connection
 public void closeConnection(Connection conn) {
     if (conn != null) {
         try {
             conn.close();
             System.out.println("Connection closed successfully");
         } catch (SQLException ex) {
             System.err.println("Error closing connection: " + ex.getMessage());
         }
     }
 }
}

