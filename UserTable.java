/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author imran
 */
public class UserTable {
    public static void insertToDatabase(Integer id, String userName, String name, Boolean adminStatus, String email){
        Connection connect= DB.getConnection();
        String sql ="INSERT INTO database (ID, userName, name, adminStatus, email) VALUES" +"("+ "'"
                +id+"',"
                +"'"+userName
                +"','"+name+"','"+adminStatus+"','"+email
                +"')";
        
        
        try {
            Statement statement = connect.createStatement();
            statement.executeUpdate(sql);
            System.out.println("User " +name + " inserted into database");
            connect.close();
        } catch (Exception ex) {
            System.out.println("[User Table] - error while inserting into database"+ex.getMessage());
        }
    
    }
 public static ResultSet get(String email){
        Connection connect= DB.getConnection();
        
        String sql ="SELECT * FROM database WHERE email= '"+email+"'";
        
        ResultSet result =null;
        try {
            Statement statement = connect.createStatement();
            result = statement.executeQuery(sql);
            connect.close();
            
            
        } catch (Exception ex) {
            System.out.println("[User Table] - error while getting from the database "+ex.getMessage());
        }
    
    return result;
}

}
