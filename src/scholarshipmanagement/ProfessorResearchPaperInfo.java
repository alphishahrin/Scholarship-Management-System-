/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scholarshipmanagement;

import java.util.Date;

/**
 *
 * @author HP
 */
public class ProfessorResearchPaperInfo {
    private int ProfID, DOI, Page,  Cite;
    private String FirstName, Email, Department, Title, Publisher,Volume;
    private Date Pdate;

    public ProfessorResearchPaperInfo(int ProfID, int DOI, int Page, String Volume, String FirstName, String Email, String Department, String Title, String Publisher, Date Pdate, int Cite) {
        this.ProfID = ProfID;
        this.DOI = DOI;
        this.Page = Page;
        this.Volume = Volume;
        this.FirstName = FirstName;
        this.Email = Email;
        this.Department = Department;
        this.Title = Title;
        this.Publisher = Publisher;
        this.Pdate = Pdate;
        this.Cite = Cite;
    }
    
    public ProfessorResearchPaperInfo(){
        ;
    }

    public int getProfID() {
        return ProfID;
    }

    public void setProfID(int ProfID) {
        this.ProfID = ProfID;
    }

    public int getDOI() {
        return DOI;
    }

    public void setDOI(int DOI) {
        this.DOI = DOI;
    }

    public int getPage() {
        return Page;
    }

    public void setPage(int Page) {
        this.Page = Page;
    }

    public String getVolume() {
        return Volume;
    }

    public void setVolume(String Volume) {
        this.Volume = Volume;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String Department) {
        this.Department = Department;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public String getPublisher() {
        return Publisher;
    }

    public void setPublisher(String Publisher) {
        this.Publisher = Publisher;
    }

    public Date getPdate() {
        return Pdate;
    }

    public void setPdate(Date Pdate) {
        this.Pdate = Pdate;
    }

    public int getCite() {
        return Cite;
    }

    public void setCite(int Cite) {
        this.Cite = Cite;
    }
    
    
    
}
