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
import smsModel.Courses;

/**
 *
 * @author IHAME
 */
public class CourseDAO extends ConnectToDB{
    public void saveCourse(Courses c){
    getConnection();
    try {
           pr=con.prepareStatement("INSERT INTO courses Values(?,?,?,?,?);");
            pr.setString(1, c.getCourseName());
            pr.setInt(2, c.getCourseId());
            pr.setString(3, c.getCourseTeacher());
            pr.setInt(4, c.getCredit());
            pr.setInt(5, c.getCoursePrice());
            pr.executeUpdate();
           
       } catch (Exception e) {
           Logger.getLogger(studentDAO.class.getName()).log(Level.SEVERE,null,e);
       }
    
    }
    
    public void deletCourse (Courses d){
        getConnection();
        
        try {
            
           pr = con.prepareStatement("DELETE FROM  courses WHERE courseId=? ");
                pr.setInt(1, d.getCourseId());
                pr.executeUpdate();
        
        
        } catch (SQLException ex) {
            Logger.getLogger(StaffDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            getDeconnect();
        }
    }
    
    public void UpdateCourses (Courses d){
        getConnection();
        
        try {
            pr = con.prepareStatement("UPDATE  courses SET courseName=?,courseId=?,courseTeacher=?,courseCredit=?,coursePrice=? WHERE courseId=?");
            
            pr.setString(1, d.getCourseName());
            pr.setInt(2, d.getCourseId());
            pr.setString(3, d.getCourseTeacher());
            pr.setInt(4, d.getCredit());
            pr.setInt(5, d.getCoursePrice());
           
            pr.executeUpdate();
        
        } catch (SQLException ex) {
            Logger.getLogger(StaffDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            getDeconnect();
        }
    }
    
    
}
