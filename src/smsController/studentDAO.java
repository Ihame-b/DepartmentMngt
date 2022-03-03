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
import smsModel.Student;

/**
 *
 * @author IHAME
 */
public class studentDAO extends ConnectToDB{
   public void SaveStudent(Student s){
   getConnection();
       try {
            pr=con.prepareStatement("INSERT INTO student Values(?,?,?,?,?,?);");
            pr.setString(1, s.getFirstName());
            pr.setString(2, s.getLastName());
            pr.setInt(3, s.getId());
            pr.setString(4, s.getGender());
            pr.setString(5, s.getDepartment());
            pr.setString(6, s.getPhone());
            pr.executeUpdate();
           
       } catch (Exception e) {
           Logger.getLogger(studentDAO.class.getName()).log(Level.SEVERE,null,e);
       }
   }
   
   public void UpdateStudent (Student d){
        getConnection();
        
        try {
            pr = con.prepareStatement("UPDATE  student SET firstName=?,lastName=?,id=?,gender=?,department=?,phone=? WHERE id=?");
            
            pr.setString(1, d.getFirstName());
            pr.setString(2, d.getLastName());
            pr.setInt(3, d.getId());
            pr.setString(4, d.getGender());
            pr.setString(5, d.getDepartment());
            pr.setString(6, d.getPhone());
           
            pr.setInt(7, d.getId()); 
            pr.executeUpdate();
        
        } catch (SQLException ex) {
            Logger.getLogger(StaffDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            getDeconnect();
        }
    }
    public void deletSudent (Student d){
        getConnection();
        
        try {
            
           pr = con.prepareStatement("DELETE FROM  student WHERE id=? ");
           pr.setInt(1, d.getId());
           pr.executeUpdate();
        
        
        } catch (SQLException ex) {
            Logger.getLogger(StaffDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            getDeconnect();
        }
    }
   
}
