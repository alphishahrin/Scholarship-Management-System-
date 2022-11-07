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
public class CourseResultInfo {
    
    private int StudentID,Year,Semester;
    private String CourseName;
    private float Grade;

    public CourseResultInfo(int StudentID, int Year, int Semester, String CourseName, float Grade) {
        this.StudentID = StudentID;
        this.Year = Year;
        this.Semester = Semester;
        this.CourseName = CourseName;
        this.Grade = Grade;
    }

    public CourseResultInfo() {
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

    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String CourseName) {
        this.CourseName = CourseName;
    }

    public float getGrade() {
        return Grade;
    }

    public void setGrade(float Grade) {
        this.Grade = Grade;
    }
    
    
    
    
    
       
}



