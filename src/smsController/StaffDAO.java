/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smsController;

import internaljfram.ConnectToDB;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import smsModel.Staff;

/**
 *
 * @author IHAME
 */
public class StaffDAO extends ConnectToDB{
    public void saveStaff(Staff s){
        
        getConnection();
       try {
           pr=con.prepareStatement("INSERT INTO staff Values(?,?,?,?,?);");
            pr.setInt(1, s.getStaffId());
            pr.setInt(2, s.getStaffManagerId());
            pr.setString(3, s.getStaffAdress());
            pr.setString(4, s.getEmail());
            pr.setString(5, s.getGender());
            pr.executeUpdate();
           
       } catch (Exception e) {
           Logger.getLogger(studentDAO.class.getName()).log(Level.SEVERE,null,e);
       }
    
    }
    
    
    public void UpdateStaff (Staff d){
        getConnection();
        
        try {
            pr = con.prepareStatement("UPDATE  staff SET staffid=?,staffmanagerid=?,staffaddress=?,email=?,gender=? WHERE staffid=?");
            
            pr.setInt(1, d.getStaffId());
            pr.setInt(2, d.getStaffManagerId());
            pr.setString(3, d.getStaffAdress());
            pr.setString(4, d.getEmail());
            pr.setString(5, d.getGender());
            pr.executeUpdate();
        
        } catch (SQLException ex) {
            Logger.getLogger(StaffDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            getDeconnect();
        }
    }
    public void deletstaff (Staff d){
        getConnection();
        
        try {
            
           pr = con.prepareStatement("DELETE FROM  staff WHERE staffid=? ");
                pr.setInt(1, d.getStaffId());
                pr.executeUpdate();
        
        
        } catch (SQLException ex) {
            Logger.getLogger(StaffDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            getDeconnect();
        }
    }
    
}
