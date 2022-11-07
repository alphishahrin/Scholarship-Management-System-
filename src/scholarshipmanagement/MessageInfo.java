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
public class MessageInfo {
    private int MessageId,StudentId,ProfId,Year,Semester;
    private String FirstName,LastName,Department,Email,TextMessage;

    public MessageInfo(int MessageId, int StudentId, int ProfId, int Year, int Semester, String FirstName, String LastName, String Department, String Email, String TextMessage) {
        this.MessageId = MessageId;
        this.StudentId = StudentId;
        this.ProfId = ProfId;
        this.Year = Year;
        this.Semester = Semester;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Department = Department;
        this.Email = Email;
        this.TextMessage = TextMessage;
    }
    
    public MessageInfo(){
        
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

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getTextMessage() {
        return TextMessage;
    }

    public void setTextMessage(String TextMessage) {
        this.TextMessage = TextMessage;
    }
    
    
    
}
