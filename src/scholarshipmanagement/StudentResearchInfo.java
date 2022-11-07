/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scholarshipmanagement;

import java.util.Date;

/**
 *
 * @author Hp
 */
public class StudentResearchInfo {
    
    private int StudentID,DOI, PageNO,Cite;
    private String FirstName,Department,Session,Volume,Publisher,Title;
    private Date PublicationDate;
    private float Grade;

    public StudentResearchInfo() {
        ;
    }

    public StudentResearchInfo(int StudentID, int DOI, int PageNO, String Volume, int Cite, String FirstName, String Department, String Session, String Publisher, String Title, Date PublicationDate, float Grade) {
        this.StudentID = StudentID;
        this.DOI = DOI;
        this.PageNO = PageNO;
        this.Volume = Volume;
        this.Cite = Cite;
        this.FirstName = FirstName;
        this.Department = Department;
        this.Session = Session;
        this.Publisher = Publisher;
        this.Title = Title;
        this.PublicationDate = PublicationDate;
        this.Grade = Grade;
    }

    public int getStudentID() {
        return StudentID;
    }

    public void setStudentID(int StudentID) {
        this.StudentID = StudentID;
    }

    public int getDOI() {
        return DOI;
    }

    public void setDOI(int DOI) {
        this.DOI = DOI;
    }

    public int getPageNO() {
        return PageNO;
    }

    public void setPageNO(int PageNO) {
        this.PageNO = PageNO;
    }

    public String getVolume() {
        return Volume;
    }

    public void setVolume(String Volume) {
        this.Volume = Volume;
    }

    public int getCite() {
        return Cite;
    }

    public void setCite(int Cite) {
        this.Cite = Cite;
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

    public String getPublisher() {
        return Publisher;
    }

    public void setPublisher(String Publisher) {
        this.Publisher = Publisher;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public Date getPublicationDate() {
        return PublicationDate;
    }

    public void setPublicationDate(Date PublicationDate) {
        this.PublicationDate = PublicationDate;
    }

    public float getGrade() {
        return Grade;
    }

    public void setGrade(float Grade) {
        this.Grade = Grade;
    }

    

    
}
