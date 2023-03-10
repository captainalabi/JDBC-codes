package UserAccess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateDBTable {
   static final String DB_URL = "jdbc:mysql://localhost:3306/user";
   static final String USER = "root";
   static final String PASS = "";

   public static void main(String[] args) {
      // Open a connection
      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
         Statement stmt = conn.createStatement();
      ) {		      
          String sql = "CREATE TABLE IF NOT EXISTS USER " +
                   "(full_name INTEGER not NULL, " +
                   " pin VARCHAR(255), " + 
                   " email VARCHAR(255), "  + 
                   " PRIMARY KEY ( email ))"; 

         stmt.executeUpdate(sql);
         System.out.println("Created table in given database...");   	  
      } catch (SQLException e) {
         e.printStackTrace();
      } 
   }
}