
package Myproject.oop;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Operations {
    public static boolean isLogin(String username, String password, String usertype, JFrame frame){
        try{
            Connection myConn = MySQLConnection.getConnection();
            String mySqlQuery = 
                    "SELECT UID, Usertype, Nickname FROM sonu.new_table WHERE Username = '"+
                    username+
                    "' AND Password = '"+
                    password+
                    "' AND Usertype = '"+
                    usertype+
                    "'";
            PreparedStatement preparedStatement = myConn.prepareStatement(mySqlQuery);
            ResultSet resultSet = preparedStatement.executeQuery();
            
            while(resultSet.next()){
                LoginSession.UID = resultSet.getInt("UID");
                LoginSession.Usertype = resultSet.getString("Usertype");
                LoginSession.Nickname = resultSet.getString("Nickname");
                
                return true;
            }
            
        }catch (Exception exception){
            exception.printStackTrace();
            System.out.println(exception.getMessage());
            JOptionPane.showMessageDialog(frame, "Database error: " + exception.getMessage());
        }
        
        return false;
    }
}
