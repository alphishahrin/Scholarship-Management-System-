/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scholarshipmanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author HP
 */
public class Connectpaper {
    public Connection connection;
    
    public void connectDB() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=Scholarship;selectMethod=cursor", "sa", "123456");
            
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void readData() {
        connectDB();
        try{
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement
                    .executeQuery("Select Professor.FirstName, Professor.Department, ResearchPaper.DOI, ResearchPaper.Title, ResearchPaper.PageNO, ResearchPaper.Volume, ResearchPaper.PublicationDate, ResearchPaper.Publisher\n" +
                                  "From Professor INNER JOIN ResearchPaper \n" +
                                  "On Professor.ProfID = ResearchPaper.ProfID");
           
            
            while (resultSet.next()) {
                
                System.out.println("Data: " + 
                        resultSet.getString("FirstName") + " " +
                        resultSet.getString("Department") + " " +
                        resultSet.getString("DOI") + " " +
                        resultSet.getString("Title") + " " +
                        resultSet.getString("PageNO") + " " +
                        resultSet.getString("Volume") + " " +
                        resultSet.getString("PublicationDate") + " " +
                        resultSet.getString("Publisher") + "\n") ;
                
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        Connectpaper cnObj = new Connectpaper();
        cnObj.readData();
    }
    
}
