
package Myproject.oop;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RegisterOperation {
    public static void makeEntry(String username,String email,String password,String nickname,String usertype){
        
        
        
        String sql = "INSERT INTO sonu.new_table(UID,Username,Email,Password,Nickname,Usertype) "
                   + "VALUES(?,?,?,?,?,?)";
        
        try{
            Connection conn=MySQLConnection.getConnection();
            PreparedStatement pstmt;
            pstmt= conn.prepareStatement(sql);
            
            
           pstmt.setInt(1, 2);
            pstmt.setString(2, username);
            pstmt.setString(3, email);
            pstmt.setString(4, password);
            pstmt.setString(5, nickname);
            pstmt.setString(6, usertype);
            
            pstmt.executeUpdate();

        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
