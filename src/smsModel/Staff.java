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
public class Staff {
    
    private int staffId;
    private int staffManagerId;
    private String staffAdress;
    private String email;
    private String gender;

    public Staff(int staffId, int staffManagerId, String staffAdress, String email, String gender) {
        this.staffId = staffId;
        this.staffManagerId = staffManagerId;
        this.staffAdress = staffAdress;
        this.email = email;
        this.gender = gender;
    }

    public Staff() {
    }

    public int getStaffId() {
        return staffId;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }

    public int getStaffManagerId() {
        return staffManagerId;
    }

    public void setStaffManagerId(int staffManagerId) {
        this.staffManagerId = staffManagerId;
    }

    public String getStaffAdress() {
        return staffAdress;
    }

    public void setStaffAdress(String staffAdress) {
        this.staffAdress = staffAdress;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    
    
}
