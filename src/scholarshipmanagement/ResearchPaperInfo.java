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
public class ResearchPaperInfo {
    
    private int DOI,PageNo,ProfId,Cite;
    private String Title,Volume,Publisher;
    private Date PublicationDate ;

    public ResearchPaperInfo(int DOI, int ProfId, int PageNo, String Title, String Volume, String Publisher, String AuthorName, Date PublicationDate,int Cite) {
        this.DOI = DOI;
        this.ProfId = ProfId;
        this.PageNo = PageNo;
        this.Title = Title;
        this.Volume = Volume;
        this.Publisher = Publisher;
        this.PublicationDate = PublicationDate;
        this.Cite = Cite;
    }

    public ResearchPaperInfo() {
        ;
    }

    public int getDOI() {
        return DOI;
    }

    public void setDOI(int DOI) {
        this.DOI = DOI;
    }

    public int getPageNo() {
        return PageNo;
    }

    public void setPageNo(int PageNo) {
        this.PageNo = PageNo;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public String getVolume() {
        return Volume;
    }

    public void setVolume(String Volume) {
        this.Volume = Volume;
    }

    public String getPublisher() {
        return Publisher;
    }

    public void setPublisher(String Publisher) {
        this.Publisher = Publisher;
    }

    public Date getPublicationDate() {
        return PublicationDate;
    }

    public void setPublicationDate(Date PublicationDate) {
        this.PublicationDate = PublicationDate;
    }

    public int getProfId() {
        return ProfId;
    }

    public void setProfId(int ProfId) {
        this.ProfId = ProfId;
    }

    public int getCite() {
        return Cite;
    }

    public void setCite(int Cite) {
        this.Cite = Cite;
    }
    
    
    
    
    
    
}
