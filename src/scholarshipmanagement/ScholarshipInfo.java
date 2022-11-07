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
public class ScholarshipInfo {
    
    private int ScholarshipID, Seats;
    private String DegreeName, University, CountryName, Subject, Session, MinimumGPA, OtherRequirements;
    private float PercentageOfScholarship;
    private String date; 

    public ScholarshipInfo(int ScholarshipID, int Seats, String DegreeName, String University, String CountryName, String Subject, String Session, String MinimumGPA, String OtherRequirements, float PercentageOfScholarship, String date) {
        this.ScholarshipID = ScholarshipID;
        this.Seats = Seats;
        this.DegreeName = DegreeName;
        this.University = University;
        this.CountryName = CountryName;
        this.Subject = Subject;
        this.Session = Session;
        this.MinimumGPA = MinimumGPA;
        this.OtherRequirements = OtherRequirements;
        this.PercentageOfScholarship = PercentageOfScholarship;
        this.date = date;
    }
    
    public ScholarshipInfo()
    {
        ;
    }

    public int getScholarshipID() {
        return ScholarshipID;
    }

    public void setScholarshipID(int ScholarshipID) {
        this.ScholarshipID = ScholarshipID;
    }

    public int getSeats() {
        return Seats;
    }

    public void setSeats(int Seats) {
        this.Seats = Seats;
    }

    public String getDegreeName() {
        return DegreeName;
    }

    public void setDegreeName(String DegreeName) {
        this.DegreeName = DegreeName;
    }

    public String getUniversity() {
        return University;
    }

    public void setUniversity(String University) {
        this.University = University;
    }

    public String getCountryName() {
        return CountryName;
    }

    public void setCountryName(String CountryName) {
        this.CountryName = CountryName;
    }

    public String getSubject() {
        return Subject;
    }

    public void setSubject(String Subject) {
        this.Subject = Subject;
    }

    public String getSession() {
        return Session;
    }

    public void setSession(String Session) {
        this.Session = Session;
    }

    public String getMinimumGPA() {
        return MinimumGPA;
    }

    public void setMinimumGPA(String MinimumGPA) {
        this.MinimumGPA = MinimumGPA;
    }

    public String getOtherRequirements() {
        return OtherRequirements;
    }

    public void setOtherRequirements(String OtherRequirements) {
        this.OtherRequirements = OtherRequirements;
    }

    public float getPercentageOfScholarship() {
        return PercentageOfScholarship;
    }

    public void setPercentageOfScholarship(float PercentageOfScholarship) {
        this.PercentageOfScholarship = PercentageOfScholarship;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    
    
}
