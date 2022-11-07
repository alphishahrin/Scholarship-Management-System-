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
public class StudentGradeInfo {
    
    private int StudentID,Year,Semester;
    private String FirstName,Department,Session,Email,CourseName;
    private float AverageGrade,CompletedCredit,Grade;

    public StudentGradeInfo(int StudentID, int Year, int Semester, String FirstName, String Department, String Session, String Email, String CourseName, float AverageGrade, float CompletedCredit, float Grade) {
        this.StudentID = StudentID;
        this.Year = Year;
        this.Semester = Semester;
        this.FirstName = FirstName;
        this.Department = Department;
        this.Session = Session;
        this.Email = Email;
        this.CourseName = CourseName;
        this.AverageGrade = AverageGrade;
        this.CompletedCredit = CompletedCredit;
        this.Grade = Grade;
    }
    
    public StudentGradeInfo(){
        
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

    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String CourseName) {
        this.CourseName = CourseName;
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

    public float getGrade() {
        return Grade;
    }

    public void setGrade(float Grade) {
        this.Grade = Grade;
    }
    
    
}
