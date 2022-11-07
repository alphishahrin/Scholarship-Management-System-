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
public class InterestInfo {
    
    private int StudentId;
    private String TopicName,Reason;

    public InterestInfo(int StudentId, String TopicName, String Reason) {
        this.StudentId = StudentId;
        this.TopicName = TopicName;
        this.Reason = Reason;
    }

    public InterestInfo() {
        ;
    }

    public int getStudentId() {
        return StudentId;
    }

    public void setStudentId(int StudentId) {
        this.StudentId = StudentId;
    }

    public String getTopicName() {
        return TopicName;
    }

    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    public String getReason() {
        return Reason;
    }

    public void setReason(String Reason) {
        this.Reason = Reason;
    }
    
    
    
    
    
    
}
