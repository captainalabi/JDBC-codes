/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserAccess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ALABI
 */
public class DBConnect {

    private static final String DB_DRIVER = 
		           "com.mysql.jdbc.Driver";
	private static final String DB_URL = 
		        "jdbc:mysql://localhost:3306/user";
	private static final String DB_USERNAME = "root";
	private static final String DB_PASSWORD = "";
 
	public static Connection connect(){
		Connection conn = null;
		try{
			//Register the JDBC driver
			Class.forName(DB_DRIVER);
 
			//Open the connection
			conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
                        
			if(conn != null){
			   System.out.println("Successfully connected.");
			}else{
			   System.out.println("Failed to connect.");
			}
                        
                        
		}catch(ClassNotFoundException | SQLException e){
                    System.out.println(e.getMessage());
		}
                return conn;
	}
        public static void main(String[] args) {
        connect();
    }
}
