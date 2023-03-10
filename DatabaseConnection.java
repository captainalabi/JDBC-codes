package UserAccess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ALABI
 */
public class DatabaseConnection {
    
private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
private static final String USER_NAME = "root";
private static final String PASSWORD = "";
private static Connection con;
    
    public static Connection createAndConnect(String dbName){
        
    String dbAddress = "jdbc:mysql://localhost:3306/" + dbName + "?createDatabaseIfNotExist=true";
        
    try {
        Class.forName(JDBC_DRIVER);
        con = DriverManager.getConnection(dbAddress, USER_NAME, PASSWORD);
    }catch (ClassNotFoundException | SQLException e) {        
        System.out.println(e.getMessage());
    } 
   return con;
}

    public static void main(String[] args) {
        System.out.println(createAndConnect("Good"));
    }
}
