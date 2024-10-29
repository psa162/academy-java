package com.bptn.course._27_capstone;

import java.sql.Connection;

public class Main {
	
	public static void main(String[] args) {
        // Create an instance of FeedAppClass
        FeedAppClass jdbc = new FeedAppClass();

        // Establish a database connection
        Connection conn = jdbc.createConnection();

        // Check if the connection was successful before proceeding
        if (conn != null) {
            // Insert a new user into the User table
            jdbc.addUser(conn, "Ray", "Mist", "raymist", "18292831", "ray@mist.com", "Ray@22", true);

            // Close the database connection
            jdbc.closeConnection(conn);
        }
    }
}


