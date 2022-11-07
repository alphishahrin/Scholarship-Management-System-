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
public class ProfessorExpertiseInfo {
    
    private int profId;
    private String interest, expertise;

    public ProfessorExpertiseInfo(int profId, String interest, String expertise) {
        this.profId = profId;
        this.interest = interest;
        this.expertise = expertise;
    }
    
    public ProfessorExpertiseInfo()
    {
        ;
    }

    public int getProfId() {
        return profId;
    }

    public void setProfId(int profId) {
        this.profId = profId;
    }

    public String getInterest() {
        return interest;
    }

    public void setInterest(String interest) {
        this.interest = interest;
    }

    public String getExpertise() {
        return expertise;
    }

    public void setExpertise(String expertise) {
        this.expertise = expertise;
    }
    
    
}
