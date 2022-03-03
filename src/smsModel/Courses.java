/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smsModel;

/**
 *
 * @author IHAME
 */
public class Courses {
    private String courseName;
    private int courseId;
    private String courseTeacher;
    private int credit;
    private int coursePrice;

    public Courses(String courseName, int courseId, String courseTeacher, int credit, int coursePrice) {
        this.courseName = courseName;
        this.courseId = courseId;
        this.courseTeacher = courseTeacher;
        this.credit = credit;
        this.coursePrice = coursePrice;
    }

    public Courses() {
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseTeacher() {
        return courseTeacher;
    }

    public void setCourseTeacher(String courseTeacher) {
        this.courseTeacher = courseTeacher;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public int getCoursePrice() {
        return coursePrice;
    }

    public void setCoursePrice(int coursePrice) {
        this.coursePrice = coursePrice;
    }
    
    
    
}
