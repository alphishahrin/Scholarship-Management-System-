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
public class ExpertiseInfo {
    
    private int StudentID;
    private String TopicName,CertificateName,Institution;

    public ExpertiseInfo(int StudentID, String TopicName, String CertificateName, String Institution) {
        this.StudentID = StudentID;
        this.TopicName = TopicName;
        this.CertificateName = CertificateName;
        this.Institution = Institution;
    }

    public ExpertiseInfo() {
        ;
    }

    public int getStudentID() {
        return StudentID;
    }

    public void setStudentID(int StudentID) {
        this.StudentID = StudentID;
    }

    public String getTopicName() {
        return TopicName;
    }

    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    public String getCertificateName() {
        return CertificateName;
    }

    public void setCertificateName(String CertificateName) {
        this.CertificateName = CertificateName;
    }

    public String getInstitution() {
        return Institution;
    }

    public void setInstitution(String Institution) {
        this.Institution = Institution;
    }
    
    
    
    
    
}
