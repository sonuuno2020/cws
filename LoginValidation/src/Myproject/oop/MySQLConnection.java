
package Myproject.oop;
import java.sql.*;

import java.sql.DriverManager;


public class MySQLConnection {
    public static Connection getConnection() throws Exception{
        String dbRoot = "jdbc:mysql://";
        String hostName = "localhost:3306/";
        String dbName = "sonu";
        String dbUrl = dbRoot+hostName+dbName;
        
        String hostUsername = "root";
        String hostPassword = "root";
        
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println(dbUrl);
        
        Connection myConn = null;
        myConn=(Connection)DriverManager.getConnection(dbUrl, "root","root");

        return myConn;
    }
}
