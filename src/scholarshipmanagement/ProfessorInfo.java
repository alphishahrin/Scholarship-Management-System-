/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scholarshipmanagement;

/**
 *
 * @author HP
 */
public class ProfessorInfo {
    
    private int profId, noSeats, uniId;
    private String firstName; 
    private String email, eduBackground, funding, password,  department;
    private byte[] picture;

    public ProfessorInfo(int profId, int noSeats, String firstName, int uniId, String email, String eduBackground, String funding, String password, byte[] picture, String department) {
        this.profId = profId;
        this.noSeats = noSeats;
        this.firstName = firstName;
        this.uniId = uniId;
        this.email = email;
        this.eduBackground = eduBackground;
        this.funding = funding;
        this.password = password;
        this.picture = picture;
        this.department = department;
        
    }
    
    public ProfessorInfo()
    {
        ;
    }

    public int getProfId() {
        return profId;
    }

    public void setProfId(int profId) {
        this.profId = profId;
    }

    public int getNoSeats() {
        return noSeats;
    }

    public void setNoSeats(int noSeats) {
        this.noSeats = noSeats;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getUniId() {
        return uniId;
    }

    public void setUniId(int uniId) {
        this.uniId = uniId;
    }

    

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEduBackground() {
        return eduBackground;
    }

    public void setEduBackground(String eduBackground) {
        this.eduBackground = eduBackground;
    }

    public String getFunding() {
        return funding;
    }

    public void setFunding(String funding) {
        this.funding = funding;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public byte[] getPicture() {
        return picture;
    }

    public void setPicture(byte[] picture) {
        this.picture = picture;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    
    
    
    
}
