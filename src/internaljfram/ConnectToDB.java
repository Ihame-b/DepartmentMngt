/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package internaljfram;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mirindi
 */
public class ConnectToDB {
  public  Connection con=null;
  public  Statement s =null;
   public PreparedStatement pr = null;
   public  ResultSet r=null;


    public void getConnection(){
        
        try {
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/deppro","root","");
            System.out.println("Inserted Successfully");
            //JOptionPane.showConfirmDialog(this, "Inserted Successfully");
        } catch (SQLException ex) {
            Logger.getLogger(ConnectToDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public void getDeconnect(){
        if(con!=null){
            try {
                con.close();
            System.out.println("Deconnect");
            } catch (SQLException ex) {
                Logger.getLogger(ConnectToDB.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        if(s!=null){
            try {
                s.close();
            } catch (SQLException ex) {
                Logger.getLogger(ConnectToDB.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if(pr!=null){
            try {
                pr.close();
            } catch (SQLException ex) {
                Logger.getLogger(ConnectToDB.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if(r!=null){
            try {
                r.close();
            } catch (SQLException ex) {
                Logger.getLogger(ConnectToDB.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    
}

