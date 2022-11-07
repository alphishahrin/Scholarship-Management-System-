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
public class StudentMessageInfo {
    
    private int MessageId,StudentId,ProfId;
    private String TextMessage;

    public StudentMessageInfo(int MessageId, int StudentId, int ProfId, String TextMessage) {
        this.MessageId = MessageId;
        this.StudentId = StudentId;
        this.ProfId = ProfId;
        this.TextMessage = TextMessage;
    }

    public StudentMessageInfo() {
        ;
    }

    public int getMessageId() {
        return MessageId;
    }

    public void setMessageId(int MessageId) {
        this.MessageId = MessageId;
    }

    public int getStudentId() {
        return StudentId;
    }

    public void setStudentId(int StudentId) {
        this.StudentId = StudentId;
    }

    public int getProfId() {
        return ProfId;
    }

    public void setProfId(int ProfId) {
        this.ProfId = ProfId;
    }

    public String getTextMessage() {
        return TextMessage;
    }

    public void setTextMessage(String TextMessage) {
        this.TextMessage = TextMessage;
    }
    
    
    
    
    
}
