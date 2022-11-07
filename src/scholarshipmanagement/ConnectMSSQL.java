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
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class ConnectMSSQL {
    
    public Connection connection;
    
    public String checkStuLogin(String userName,String password)
    {
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=Scholarship;selectMethod=cursor", "sa", "123456");
            
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement
                    .executeQuery("SELECT * FROM Student");
            
            while (resultSet.next()) {
                String tempuser,temppass;
                tempuser = resultSet.getString("StudentID");
                temppass = resultSet.getString("Password");
               
                //System.out.println(tempuser+" "+temppass);
               
                
                if(tempuser.compareTo(userName)==0 && temppass.compareTo(password)==0)
                {
                    //System.out.println("paisi");
                    return resultSet.getString("StudentID");
                }
                
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
        return "";
    }
    public String checkProfLogin(String userName,String password)
    {
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=Scholarship;selectMethod=cursor", "sa", "123456");
            
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement
                    .executeQuery("SELECT * FROM Professor");
            
            while (resultSet.next()) {
                String tempuser,temppass;
                tempuser = resultSet.getString("ProfID");
                temppass = resultSet.getString("password");
               
                //System.out.println(tempuser+" "+temppass);
               
                
                if(tempuser.compareTo(userName)==0 && temppass.compareTo(password)==0)
                {
                    //System.out.println("paisi");
                    return resultSet.getString("ProfID");
                }
                
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
        return "";
    }
    
    
    public void updateProfessor(ProfessorInfo user) throws Exception
    {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=Scholarship;selectMethod=cursor", "sa", "123456");

            PreparedStatement st = connection.prepareStatement("Update Professor Set FirstName = ? ,Email = ? ,EducationalBackground = ?,NoOfStudents = ?,Funding = ?,Department = ?,UniID = ?,Picture=? where ProfID=?");
            
            
            st.setString(1,user.getFirstName());
            st.setString(2,user.getEmail());
            st.setString(3, user.getEduBackground());
            st.setInt(4, user.getNoSeats());
            st.setString(5, user.getFunding());
            st.setString(6, user.getDepartment());
            st.setInt(7, user.getUniId());
            st.setInt(9, user.getProfId());
            st.setBytes(8, user.getPicture());
            st.executeUpdate();
            
        }
        catch(Exception e)
        {
            throw new Exception(e);
        }
    }
    
    public void updateProfessorExpertise(ProfessorExpertiseInfo user) throws Exception
    {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=Scholarship;selectMethod=cursor", "sa", "123456");

            PreparedStatement st = connection.prepareStatement("Update ProfessorExpertise Set TopicName = ? ,Interest = ?");
            
            
            st.setString(1,user.getExpertise());
            st.setString(2,user.getInterest());
            
            st.executeUpdate();
            
        }
        catch(Exception e)
        {
            throw new Exception(e);
        }
    }
    
    public ArrayList<ProfessorInfo> getProfessorInfo(String query)
    {
        ArrayList<ProfessorInfo> database = new ArrayList();
        
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=Scholarship;selectMethod=cursor", "sa", "123456");
            
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement
                    .executeQuery("SELECT * FROM Professor "+query+" ");
            System.out.println("SELECT * FROM Professor "+query+" ");
            while (resultSet.next()) {
                ProfessorInfo temp = new ProfessorInfo();
                temp.setProfId(resultSet.getInt("ProfID"));
                temp.setFirstName(resultSet.getString("FirstName").toString());
                temp.setUniId(resultSet.getInt("UniID"));
                temp.setDepartment(resultSet.getString("Department").toString());
                temp.setEduBackground(resultSet.getString("EducationalBackground").toString());
                temp.setEmail(resultSet.getString("Email").toString());
                temp.setFunding(resultSet.getString("Funding").toString());
                temp.setNoSeats(resultSet.getInt("NoOfStudents"));
                temp.setPicture(resultSet.getBytes("Picture"));
                
                database.add(temp);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(database.size());
        return database;
    }
    
    public ArrayList<StudentInfo> getStudentInfo(String query)
    {
        ArrayList<StudentInfo> database = new ArrayList();
        
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=Scholarship;selectMethod=cursor", "sa", "123456");
            
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement
                    .executeQuery("SELECT * FROM Student "+query+" Order by StudentID asc");
            System.out.println("SELECT * FROM Student "+query+" Order by StudentID asc");
            while (resultSet.next()) {
                StudentInfo temp = new StudentInfo();
                temp.setStudentID(resultSet.getInt("StudentID"));
                temp.setFirstName(resultSet.getString("FirstName").toString());
                temp.setLastName(resultSet.getString("LastName").toString());
                temp.setDepartment(resultSet.getString("Department").toString());
                temp.setSession(resultSet.getString("Session").toString());
                temp.setYear(resultSet.getInt("Year"));
                temp.setSemester(resultSet.getInt("Semester"));
                temp.setEmail(resultSet.getString("Email").toString());
                temp.setCompletedCredit(resultSet.getFloat("CompletedCredit"));
                temp.setAverageGrade(resultSet.getFloat("AverageGrade"));
                temp.setExtracurricularActivities(resultSet.getString("ExtracurricularActivities").toString());
                temp.setBlog(resultSet.getString("Blog").toString());
                temp.setReference(resultSet.getString("Reference").toString());
                temp.setPassword(resultSet.getString("Password").toString());
                
                
                database.add(temp);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(database.size());
        return database;
    }
    
    public ArrayList<ScholarshipInfo> getScholarshipInfo(String query)
    {
        ArrayList<ScholarshipInfo> database = new ArrayList();
        
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=Scholarship;selectMethod=cursor", "sa", "123456");
            
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement
                    .executeQuery("Select Scholarship.* from Scholarship "+query+"");
            System.out.println("Select Scholarship.* from Scholarship "+query+"");
            
            while (resultSet.next()) {
                ScholarshipInfo temp = new ScholarshipInfo();
                temp.setScholarshipID(resultSet.getInt("ScholarshipID"));
                temp.setDegreeName(resultSet.getString("DegreeName").toString());
                temp.setUniversity(resultSet.getString("University").toString());
                temp.setCountryName(resultSet.getString("CountryName").toString());
                temp.setSubject(resultSet.getString("Subject").toString());
                temp.setPercentageOfScholarship(resultSet.getFloat("PercentageOfScholarship"));
                temp.setSession(resultSet.getString("Session").toString());
                temp.setSeats(resultSet.getInt("Seats"));
                temp.setMinimumGPA(resultSet.getString("MinimumGPA").toString());
                temp.setOtherRequirements(resultSet.getString("OtherRequirements").toString());
                temp.setDate(resultSet.getString("LastDate").toString());
                
                
                database.add(temp);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return database;
    }
    
    public ArrayList<ProfessorExpertiseInfo> getProfessorExpertiseInfo(String query)
    {
        ArrayList<ProfessorExpertiseInfo> database = new ArrayList();
        
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=Scholarship;selectMethod=cursor", "sa", "123456");
            
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement
                    .executeQuery("SELECT * FROM ProfessorExpertise "+query+" Order by ProfID desc");
            
            while (resultSet.next()) {
                ProfessorExpertiseInfo temp = new ProfessorExpertiseInfo();
                temp.setProfId(resultSet.getInt("ProfID"));
                temp.setExpertise(resultSet.getString("TopicName").toString());
                temp.setInterest(resultSet.getString("Interest").toString());
                
                database.add(temp);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return database;
    }
    
    public ArrayList<UniversityInfo> getUniversityInfo(String query)
    {
        ArrayList<UniversityInfo> database = new ArrayList();
        
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=Scholarship;selectMethod=cursor", "sa", "123456");
            
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement
                    .executeQuery("SELECT * FROM University "+query+" Order by UniID ");
            System.out.println("SELECT * FROM University "+query+" Order by UniID ");
            while (resultSet.next()) {
                UniversityInfo temp = new UniversityInfo();
                temp.setUniID(resultSet.getInt("UniID"));
                temp.setUniName(resultSet.getString("UniName").toString());
                temp.setLocation(resultSet.getString("Location").toString());
                temp.setUniRating(resultSet.getFloat("UniRating"));
                
                database.add(temp);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return database;
    }
    
    public ArrayList<StudentMessageInfo> getStudentMessageInfo(String query)
    {
        ArrayList<StudentMessageInfo> database = new ArrayList();
        
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=Scholarship;selectMethod=cursor", "sa", "123456");
            
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement
                    .executeQuery("SELECT * FROM StudentMessage "+query+" Order by MessageId ");
            System.out.println("SELECT * FROM StudentMessage "+query+" Order by MessageId ");
            while (resultSet.next()) {
                StudentMessageInfo temp = new StudentMessageInfo();
                temp.setMessageId(resultSet.getInt("MessageId"));
                temp.setStudentId(resultSet.getInt("StudentId"));
                temp.setTextMessage(resultSet.getString("TextMessage").toString());
                temp.setProfId(resultSet.getInt("ProfId"));
                
                database.add(temp);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return database;
    }
    
    public ArrayList<CourseResultInfo> getCourseResultInfo(String query)
    {
        ArrayList<CourseResultInfo> database = new ArrayList();
        
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=Scholarship;selectMethod=cursor", "sa", "123456");
            
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement
                    .executeQuery("Select * From CourseResult "+query+" Order by StudentId,Year,Semester ");
            System.out.println(" Select * From CourseResult"+query+" Order by StudentId ");
            while (resultSet.next()) {
                CourseResultInfo temp = new CourseResultInfo();
                temp.setStudentID(resultSet.getInt("StudentId"));
                temp.setCourseName(resultSet.getString("CourseName").toString());
                temp.setGrade(resultSet.getFloat("Grade"));
                temp.setYear(resultSet.getInt("Year"));
                temp.setSemester(resultSet.getInt("Semester"));
                
                database.add(temp);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return database;
    }
    
    public ArrayList<StudentResearchPaperInfo> getStudentResearchPaperInfo(String query)
    {
        ArrayList<StudentResearchPaperInfo> database = new ArrayList();
        
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=Scholarship;selectMethod=cursor", "sa", "123456");
            
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement
                    .executeQuery("SELECT * FROM StudentResearchPaper "+query+" Order by DOI ");
            
            while (resultSet.next()) {
                StudentResearchPaperInfo temp = new StudentResearchPaperInfo();
                temp.setDOI(resultSet.getInt("DOI"));
                temp.setTitle(resultSet.getString("Title").toString());
                temp.setStudentID(resultSet.getInt("StudentID"));
                temp.setPageNo(resultSet.getInt("PageNo"));
                temp.setVolume(resultSet.getString("Volume").toString());   
                temp.setTitle(resultSet.getString("Publisher").toString());
                temp.setPublicationDate(resultSet.getString("PublicationDate").toString());
                temp.setPublisher(resultSet.getString("Publisher").toString());
                temp.setCite(resultSet.getInt("Citation"));
                
                database.add(temp);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return database;
    }
    
    public ArrayList<MessageInfo> getMessageInfo(String query)
    {
        ArrayList<MessageInfo> database = new ArrayList();
        
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=Scholarship;selectMethod=cursor", "sa", "123456");
            
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement
                    .executeQuery("Select Student.*, StudentMessage.*\n" +
                                   "From Student JOIN StudentMessage\n" +
                                   "On Student.StudentID = StudentMessage.StudentId "+query+" Order by MessageId ");
            System.out.println("Select Student.*, StudentMessage.*\n" +
                              "From Student JOIN StudentMessage\n" +
                              "On Student.StudentID = StudentMessage.StudentId "+query+" Order by MessageId ");
            while (resultSet.next()) {
                MessageInfo temp = new MessageInfo();
                temp.setMessageId(resultSet.getInt("MessageId"));
                temp.setStudentId(resultSet.getInt("StudentId"));
                temp.setProfId(resultSet.getInt("ProfId"));
                temp.setYear(resultSet.getInt("Year"));
                temp.setSemester(resultSet.getInt("Semester"));
                temp.setFirstName(resultSet.getString("FirstName").toString());
                temp.setLastName(resultSet.getString("LastName").toString());
                temp.setDepartment(resultSet.getString("Department").toString());
                temp.setEmail(resultSet.getString("Email").toString());
                temp.setTextMessage(resultSet.getString("TextMessage").toString());
                
                database.add(temp);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return database;
    }
    
    public ArrayList<StudentGradeInfo> getStudentGradeInfo(String query)
    {
        ArrayList<StudentGradeInfo> database = new ArrayList();
        
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=Scholarship;selectMethod=cursor", "sa", "123456");
            
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement
                    .executeQuery("Select Student.StudentID, Student.FirstName ,Student.Department, Student.Session, Student.Email, Student.AverageGrade , CourseResult.*\n" +
                                   "From Student JOIN CourseResult\n" +
                                   "On Student.StudentID = CourseResult.StudentId "+query);
            System.out.println("Select Student.StudentID, Student.FirstName ,Student.Department, Student.Session, Student.Email, Student.AverageGrade , CourseResult.*\n" +
                                   "From Student JOIN CourseResult\n" +
                                   "On Student.StudentID = CourseResult.StudentId "+query);
            while (resultSet.next()) {
                StudentGradeInfo temp = new StudentGradeInfo();
                temp.setStudentID(resultSet.getInt("StudentId"));
                temp.setFirstName(resultSet.getString("FirstName").toString());
                temp.setDepartment(resultSet.getString("Department").toString());
                temp.setSession(resultSet.getString("Session").toString());
                temp.setEmail(resultSet.getString("Email").toString());
                temp.setAverageGrade(resultSet.getFloat("AverageGrade"));
                temp.setCourseName(resultSet.getString("CourseName").toString());
                temp.setYear(resultSet.getInt("Year"));
                temp.setSemester(resultSet.getInt("Semester"));
                temp.setGrade(resultSet.getFloat("Grade"));
                
                database.add(temp);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return database;
    }
    
    public ArrayList<ProfessorResearchPaperInfo> getProfessorResearchPaperInfo(String query)
    {
        ArrayList<ProfessorResearchPaperInfo> database = new ArrayList();
        
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=Scholarship;selectMethod=cursor", "sa", "123456");
            
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement
                    .executeQuery("Select Professor.ProfID, Professor.FirstName, Professor.Email, Professor.Department, ResearchPaper.*\n" +
                                  "From Professor INNER JOIN ResearchPaper\n" +
                                  "On Professor.ProfID = ResearchPaper.ProfID"+query);
            
            System.out.println("Select Professor.ProfID, Professor.FirstName, Professor.Email, Professor.Department, ResearchPaper.*\n" +
                                  "From Professor INNER JOIN ResearchPaper\n" +
                                  "On Professor.ProfID = ResearchPaper.ProfID"+query);
            while (resultSet.next()) {
                ProfessorResearchPaperInfo temp = new ProfessorResearchPaperInfo();
                temp.setProfID(resultSet.getInt("ProfID"));
                temp.setFirstName(resultSet.getString("FirstName").toString());
                temp.setEmail(resultSet.getString("Email").toString());
                temp.setDepartment(resultSet.getString("Department").toString());
                temp.setDOI(resultSet.getInt("DOI"));
                temp.setTitle(resultSet.getString("Title").toString());
                temp.setPage(resultSet.getInt("PageNO"));
                temp.setVolume(resultSet.getString("Volume").toString());
                temp.setPdate(resultSet.getDate("PublicationDate"));
                temp.setPublisher(resultSet.getString("Publisher").toString());
                temp.setCite(resultSet.getInt("Citation"));
                database.add(temp);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return database;
    }
    
    public ArrayList<ResearchPaperInfo> getResearchPaperInfo(String query)
    {
        ArrayList<ResearchPaperInfo> database = new ArrayList();
        
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=Scholarship;selectMethod=cursor", "sa", "123456");
            
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement
                    .executeQuery("SELECT * FROM ResearchPaper "+query+" Order by DOI ");
            System.out.println("SELECT * FROM ResearchPaper "+query+" Order by DOI ");
            while (resultSet.next()) {
                ResearchPaperInfo temp = new ResearchPaperInfo();
                temp.setDOI(resultSet.getInt("DOI"));
                temp.setTitle(resultSet.getString("Title").toString());
                temp.setProfId(resultSet.getInt("ProfID"));
                temp.setPageNo(resultSet.getInt("PageNO"));
                temp.setVolume(resultSet.getString("Volume").toString());
                temp.setPublicationDate(resultSet.getDate("PublicationDate"));
                temp.setPublisher(resultSet.getString("Publisher"));
                temp.setCite(resultSet.getInt("Citation"));
                
                database.add(temp);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return database;
    }
    
    public ArrayList<StudentResearchInfo> getStudentResearchInfo(String query)
    {
        ArrayList<StudentResearchInfo> database = new ArrayList();
        
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=Scholarship;selectMethod=cursor", "sa", "123456");
            
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement
                    .executeQuery("Select Student.StudentID, Student.FirstName, Student.Department, Student.Session, Student.AverageGrade, StudentResearchPaper.*\n" +
                                  "From Student INNER JOIN StudentResearchPaper\n" +
                                  "On Student.StudentID = StudentResearchPaper.StudentID"+query);
            
            while (resultSet.next()) {
                StudentResearchInfo temp = new StudentResearchInfo();
                temp.setStudentID(resultSet.getInt("StudentID"));
                temp.setFirstName(resultSet.getString("FirstName").toString());
                temp.setDepartment(resultSet.getString("Department").toString());
                temp.setSession(resultSet.getString("Session").toString());
                temp.setGrade(resultSet.getFloat("AverageGrade"));
                temp.setDOI(resultSet.getInt("DOI"));
                temp.setTitle(resultSet.getString("Title").toString());
                temp.setPageNO(resultSet.getInt("PageNO"));
                temp.setVolume(resultSet.getString("Volume").toString());
                temp.setPublicationDate(resultSet.getDate("PublicationDate"));
                temp.setPublisher(resultSet.getString("Publisher").toString());
                temp.setCite(resultSet.getInt("Citation"));
                
                database.add(temp);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return database;
    }
    
    public void addStudentResearchInfo(ResearchPaperInfo r,int StudentID) throws Exception
    {
        
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=Scholarship;selectMethod=cursor", "sa", "123456");

            
            Statement statement = connection.createStatement();
            statement.executeUpdate("Insert into StudentResearchPaper(DOI,Title,StudentID,PageNo,Volume,PublicationDate,Publisher,Citation) values ("+r.getDOI()+",'"+r.getTitle()+"',"+StudentID+","+r.getPageNo()+",'"+r.getVolume()+"','"+r.getPublicationDate()+"','"+r.getPublisher()+"',"+r.getCite()+")");
                  
        } catch (Exception e) {
            throw new Exception(e);
            
        }
    }
    
    public void addCourseResultInfo(CourseResultInfo r) throws Exception
    {
        
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=Scholarship;selectMethod=cursor", "sa", "123456");

            
            Statement statement = connection.createStatement();
            statement.executeUpdate("Insert into CourseResult(StudentId,CourseName,Grade,Year,Semester) values ("+r.getStudentID()+",'"+r.getCourseName()+"',"+r.getGrade()+","+r.getYear()+","+r.getSemester()+")");
                  
        } catch (Exception e) {
            throw new Exception(e);
            
        }
    }
    
    public void updateStudentInfo(StudentInfo user)  throws Exception
    {
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=Scholarship;selectMethod=cursor", "sa", "123456");
            
            
            
            
            PreparedStatement st = connection.prepareStatement("Update Student Set FirstName = ? ,LastName = ? ,Department = ?,Session = ?,Year = ?,Semester = ?,Email = ?,AverageGrade = ?,CompletedCredit = ?,ExtracurricularActivities = ?,Blog = ?,Reference = ?,Password = ? where StudentID  = ?");
            
            
            st.setString(1,user.getFirstName());
            st.setString(2,user.getLastName());
            
            st.setString(3, user.getDepartment());
            st.setString(4, user.getSession());
            st.setInt(5, user.getYear());
            st.setInt(6, user.getSemester());
            st.setString(7, user.getEmail());
            st.setFloat(8, user.getAverageGrade());
            st.setFloat(9, user.getCompletedCredit());
            st.setString(10, user.getExtracurricularActivities());
            st.setString(11, user.getBlog());
            st.setString(12, user.getReference());
            st.setString(13, user.getPassword());
            st.setInt(14, user.getStudentID());
            
            st.executeUpdate();
            }catch(Exception e){
            e.printStackTrace();
        }
    }
}
