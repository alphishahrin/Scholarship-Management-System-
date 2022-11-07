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
public class StudentInfo {
    
    private int StudentID,Year,Semester;
    private String FirstName,LastName,Department,Session,Email,ExtracurricularActivities,Blog,Reference,Password;
    private float AverageGrade,CompletedCredit;

    public StudentInfo(int StudentID, int Year, int Semester, String FirstName, String LastName, String Department, String Session, String Email, String ExtracurricularActivities, String Blog, String Reference, String Password, float AverageGrade, float CompletedCredit) {
        this.StudentID = StudentID;
        this.Year = Year;
        this.Semester = Semester;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Department = Department;
        this.Session = Session;
        this.Email = Email;
        this.ExtracurricularActivities = ExtracurricularActivities;
        this.Blog = Blog;
        this.Reference = Reference;
        this.Password = Password;
        this.AverageGrade = AverageGrade;
        this.CompletedCredit = CompletedCredit;
    }

    public StudentInfo() {
        ;
    }

    public int getStudentID() {
        return StudentID;
    }

    public void setStudentID(int StudentID) {
        this.StudentID = StudentID;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int Year) {
        this.Year = Year;
    }

    public int getSemester() {
        return Semester;
    }

    public void setSemester(int Semester) {
        this.Semester = Semester;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String Department) {
        this.Department = Department;
    }

    public String getSession() {
        return Session;
    }

    public void setSession(String Session) {
        this.Session = Session;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getExtracurricularActivities() {
        return ExtracurricularActivities;
    }

    public void setExtracurricularActivities(String ExtracurricularActivities) {
        this.ExtracurricularActivities = ExtracurricularActivities;
    }

    public String getBlog() {
        return Blog;
    }

    public void setBlog(String Blog) {
        this.Blog = Blog;
    }

    public String getReference() {
        return Reference;
    }

    public void setReference(String Reference) {
        this.Reference = Reference;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public float getAverageGrade() {
        return AverageGrade;
    }

    public void setAverageGrade(float AverageGrade) {
        this.AverageGrade = AverageGrade;
    }

    public float getCompletedCredit() {
        return CompletedCredit;
    }

    public void setCompletedCredit(float CompletedCredit) {
        this.CompletedCredit = CompletedCredit;
    }
    
    
    
    
    
    
}
