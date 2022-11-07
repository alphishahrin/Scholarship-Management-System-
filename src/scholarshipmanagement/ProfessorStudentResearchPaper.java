/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package scholarshipmanagement;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author SARK
 */
public class ProfessorStudentResearchPaper extends javax.swing.JInternalFrame {
    public Connection connection;
    
    String ProfId;
    int currentLength1 = 0;
    int modIndex1  =0;
    ArrayList<StudentResearchInfo> arr1 = new ArrayList ();

    /** Creates new form PackageInfo */
    public ProfessorStudentResearchPaper() {
        initComponents();
        
    }
    
    public ProfessorStudentResearchPaper(String ProfId) {
        this.ProfId = ProfId;
        initComponents();
        
        arr1 = new ConnectMSSQL().getStudentResearchInfo("");
        jTable1.setDefaultEditor(Object.class, null);
        clearTable(jTable1);
        
        TableColumnModel columnModel = jTable1.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(10);
        columnModel.getColumn(1).setPreferredWidth(30);
        columnModel.getColumn(2).setPreferredWidth(70);
        columnModel.getColumn(3).setPreferredWidth(30);
        columnModel.getColumn(4).setPreferredWidth(30);
        columnModel.getColumn(5).setPreferredWidth(10);
        columnModel.getColumn(6).setPreferredWidth(250);
        columnModel.getColumn(7).setPreferredWidth(10);
        columnModel.getColumn(8).setPreferredWidth(30);
        columnModel.getColumn(9).setPreferredWidth(30);
        columnModel.getColumn(10).setPreferredWidth(30);
        columnModel.getColumn(11).setPreferredWidth(30);
        
        if((modIndex1+1)*10>arr1.size())
            currentLength1 = arr1.size()%10;
        else currentLength1 = 10;
        
        for(int i=0;i<currentLength1;i++)
        {
            jTable1.getModel().setValueAt(arr1.get(i).getStudentID(), i, 0);
            jTable1.getModel().setValueAt(arr1.get(i).getFirstName(), i, 1);
            jTable1.getModel().setValueAt(arr1.get(i).getDepartment(), i, 2);
            jTable1.getModel().setValueAt(arr1.get(i).getSession(), i, 3);
            jTable1.getModel().setValueAt(arr1.get(i).getGrade(), i, 4);
            jTable1.getModel().setValueAt(arr1.get(i).getDOI(), i, 5);
            jTable1.getModel().setValueAt(arr1.get(i).getTitle(), i, 6);
            jTable1.getModel().setValueAt(arr1.get(i).getPageNO(), i, 7);
            jTable1.getModel().setValueAt(arr1.get(i).getVolume(), i, 8);
            jTable1.getModel().setValueAt(arr1.get(i).getPublicationDate(), i, 9);
            jTable1.getModel().setValueAt(arr1.get(i).getPublisher(), i, 10);
            jTable1.getModel().setValueAt(arr1.get(i).getCite(), i, 11);
            
        }
        
        prev.setVisible(false);
        if(arr1.size()<=10)
            next.setVisible(false);
        
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        prev = new javax.swing.JButton();
        next = new javax.swing.JButton();
        title = new javax.swing.JTextField();
        dateTo = new javax.swing.JTextField();
        dept = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        dateFrom = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        resetBtn = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        searchBtn = new javax.swing.JButton();
        maxCiteCombo = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(750, 570));
        setMinimumSize(new java.awt.Dimension(750, 570));
        setPreferredSize(new java.awt.Dimension(1320, 730));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(155, 147, 163));
        jPanel1.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Student Research Paper");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(502, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(438, 438, 438))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1310, 70));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Student Id", "Name", "Department", "Session", "Grade", "DOI", "Title", "Page", "Volume", "Date", "Publisher", "Citation"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 1290, 200));

        prev.setBackground(new java.awt.Color(132, 120, 96));
        prev.setText("Prev");
        prev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prevActionPerformed(evt);
            }
        });
        getContentPane().add(prev, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 570, 70, -1));

        next.setBackground(new java.awt.Color(132, 120, 96));
        next.setText("Next");
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });
        getContentPane().add(next, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 570, 70, -1));

        title.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        title.setText("Search Title");
        getContentPane().add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 360, 30));

        dateTo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        dateTo.setText("To");
        getContentPane().add(dateTo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, 100, 30));

        dept.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        dept.setText("Search Department");
        getContentPane().add(dept, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 170, 30));

        name.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        name.setText("Search Name");
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 170, 30));

        dateFrom.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        dateFrom.setText("From");
        dateFrom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateFromActionPerformed(evt);
            }
        });
        getContentPane().add(dateFrom, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 100, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Publication Date :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 130, 20));

        resetBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/scholarshipmanagement/arrows-circle.png"))); // NOI18N
        resetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtnActionPerformed(evt);
            }
        });
        getContentPane().add(resetBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 220, 60, 30));

        jButton2.setText("Student with Maximum Paper");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 190, 230, 40));

        searchBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/scholarshipmanagement/transparency.png"))); // NOI18N
        searchBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchBtnMouseClicked(evt);
            }
        });
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });
        getContentPane().add(searchBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 170, 60, 30));

        maxCiteCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Name wise", "Department wise" }));
        getContentPane().add(maxCiteCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 130, 150, 40));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/scholarshipmanagement/transparency.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 130, 70, 40));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("See Maximum Cited Paper :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 130, -1, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/scholarshipmanagement/ccs.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1310, 730));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void prevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prevActionPerformed
        // TODO add your handling code here:
        modIndex1--;
        if(modIndex1==0)
            prev.setVisible(false);
        next.setVisible(true);
        clearTable(jTable1);
        if((modIndex1+1)*10>arr1.size())
            currentLength1 = arr1.size()%10;
        else currentLength1 = 10;
        
        for(int i=0;i<currentLength1;i++)
        {
            jTable1.getModel().setValueAt(arr1.get(i+10*modIndex1).getStudentID(), i, 0);
            jTable1.getModel().setValueAt(arr1.get(i+10*modIndex1).getFirstName(), i, 1);
            jTable1.getModel().setValueAt(arr1.get(i+10*modIndex1).getDepartment(), i, 2);
            jTable1.getModel().setValueAt(arr1.get(i+10*modIndex1).getSession(), i, 3);
            jTable1.getModel().setValueAt(arr1.get(i+10*modIndex1).getGrade(), i, 4);
            jTable1.getModel().setValueAt(arr1.get(i+10*modIndex1).getDOI(), i, 5);
            jTable1.getModel().setValueAt(arr1.get(i+10*modIndex1).getTitle(), i, 6);
            jTable1.getModel().setValueAt(arr1.get(i+10*modIndex1).getPageNO(), i, 7);
            jTable1.getModel().setValueAt(arr1.get(i+10*modIndex1).getVolume(), i, 8);
            jTable1.getModel().setValueAt(arr1.get(i+10*modIndex1).getPublicationDate(), i, 9);
            jTable1.getModel().setValueAt(arr1.get(i+10*modIndex1).getPublisher(), i, 10);
            jTable1.getModel().setValueAt(arr1.get(i+10*modIndex1).getCite(), i, 11);
            
        }
    }//GEN-LAST:event_prevActionPerformed

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        // TODO add your handling code here:
        modIndex1++;
        prev.setVisible(true);
        if((modIndex1+1)*10>=arr1.size())
            next.setVisible(false);
        clearTable(jTable1);
        if((modIndex1+1)*10>arr1.size())
            currentLength1 = arr1.size()%10;
        else currentLength1 = 10;
        
        for(int i=0;i<currentLength1;i++)
        {
            jTable1.getModel().setValueAt(arr1.get(i+10*modIndex1).getStudentID(), i, 0);
            jTable1.getModel().setValueAt(arr1.get(i+10*modIndex1).getFirstName(), i, 1);
            jTable1.getModel().setValueAt(arr1.get(i+10*modIndex1).getDepartment(), i, 2);
            jTable1.getModel().setValueAt(arr1.get(i+10*modIndex1).getSession(), i, 3);
            jTable1.getModel().setValueAt(arr1.get(i+10*modIndex1).getGrade(), i, 4);
            jTable1.getModel().setValueAt(arr1.get(i+10*modIndex1).getDOI(), i, 5);
            jTable1.getModel().setValueAt(arr1.get(i+10*modIndex1).getTitle(), i, 6);
            jTable1.getModel().setValueAt(arr1.get(i+10*modIndex1).getPageNO(), i, 7);
            jTable1.getModel().setValueAt(arr1.get(i+10*modIndex1).getVolume(), i, 8);
            jTable1.getModel().setValueAt(arr1.get(i+10*modIndex1).getPublicationDate(), i, 9);
            jTable1.getModel().setValueAt(arr1.get(i+10*modIndex1).getPublisher(), i, 10);
            jTable1.getModel().setValueAt(arr1.get(i+10*modIndex1).getCite(), i, 11);
            
        }
        
    }//GEN-LAST:event_nextActionPerformed

    private void dateFromActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateFromActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateFromActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        // TODO add your handling code here:
        String query = "";
        String temp;
        String tempFrom, tempTo;
        
        temp = name.getText();
        if(temp.equals("Search Name")==false && temp.length()>0)
        {
            if(query.length()==0)
            {
                query+= " where Student.FirstName  LIKE '%"+temp+"%'";
            }
            else query+=" and Student.FirstName  LIKE '%"+temp+"%'";
        }
        
        temp = dept.getText();
        if(temp.equals("Search Department")==false && temp.length()>0)
        {
            if(query.length()==0)
            {
                query+= " where Student.Department  LIKE '%"+temp+"%'";
            }
            else query+=" and Student.Department  LIKE '%"+temp+"%'";
        }
        
        if (dateFrom.getText().length()==0 || dateTo.getText().length() ==0 ){
            JOptionPane.showMessageDialog(this, "Both of the Date Field Has to be Filled", "Warning",JOptionPane.WARNING_MESSAGE);
        }
        
        else if(dateFrom.getText().toString().equals("From")==false && dateTo.getText().toString().equals("To")==false)
        {
            tempFrom = dateFrom.getText();
            tempTo = dateTo.getText();
            if(query.length()==0)
            {
                query+= " where StudentResearchPaper.PublicationDate between '"+tempFrom+"' AND '"+tempTo+"'";
            }
            else query+=" and StudentResearchPaper.PublicationDate between '"+tempFrom+"' AND '"+tempTo+"'";
        }
        
        arr1.clear();
        arr1 = new ConnectMSSQL().getStudentResearchInfo(query);

        modIndex1 = 0;

        clearTable(jTable1);
        
        if((modIndex1+1)*10>arr1.size())
            currentLength1 = arr1.size()%10;
        else currentLength1 = 10;
        
        for(int i=0;i<currentLength1;i++)
        {
            jTable1.getModel().setValueAt(arr1.get(i).getStudentID(), i, 0);
            jTable1.getModel().setValueAt(arr1.get(i).getFirstName(), i, 1);
            jTable1.getModel().setValueAt(arr1.get(i).getDepartment(), i, 2);
            jTable1.getModel().setValueAt(arr1.get(i).getSession(), i, 3);
            jTable1.getModel().setValueAt(arr1.get(i).getGrade(), i, 4);
            jTable1.getModel().setValueAt(arr1.get(i).getDOI(), i, 5);
            jTable1.getModel().setValueAt(arr1.get(i).getTitle(), i, 6);
            jTable1.getModel().setValueAt(arr1.get(i).getPageNO(), i, 7);
            jTable1.getModel().setValueAt(arr1.get(i).getVolume(), i, 8);
            jTable1.getModel().setValueAt(arr1.get(i).getPublicationDate(), i, 9);
            jTable1.getModel().setValueAt(arr1.get(i).getPublisher(), i, 10);
            jTable1.getModel().setValueAt(arr1.get(i).getCite(), i, 11);
            
        }
        
        prev.setVisible(false);
        if(arr1.size()<=10)
            next.setVisible(false);
        else
            next.setVisible(true);
        
    }//GEN-LAST:event_searchBtnActionPerformed

    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtnActionPerformed
        // TODO add your handling code here:
        name.setText("Search Name");
        dept.setText("Search Department");
        title.setText("Search Title");
        dateFrom.setText("From");
        dateTo.setText("To");
    }//GEN-LAST:event_resetBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(maxCiteCombo.getSelectedItem() == "Name wise")
        {
            ArrayList<StudentResearchInfo> database = new ArrayList();
            
            try
            {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=Scholarship;selectMethod=cursor", "sa", "123456");
            
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement
                    .executeQuery("Select s.StudentID, s.FirstName, s.Department, s.Session, s.AverageGrade, ss.DOI, ss.Title, ss.PageNO, ss.Volume, ss.PublicationDate, ss.Publisher, ss.Citation \n" +
                                  "FROM Student  AS s INNER JOIN StudentResearchPaper AS ss\n" +
                                  "ON (s.StudentID = ss.StudentID) INNER JOIN (Select p.FirstName as temp, MAX(ps.Citation) as MaxGrade\n" +
                                  "FROM Student  AS p INNER JOIN StudentResearchPaper AS ps\n" +
                                  "ON (p.StudentID = ps.StudentID) GROUP BY p.FirstName ) dd ON (dd.temp=s.FirstName and dd.MaxGrade=ss.Citation)");
                System.out.println("Select s.StudentID, s.FirstName, s.Department, s.Session, s.AverageGrade, ss.DOI, ss.Title, ss.PageNO, ss.Volume, ss.PublicationDate, ss.Publisher, ss.Citation \n" +
                                  "FROM Student  AS s INNER JOIN StudentResearchPaper AS ss\n" +
                                  "ON (s.StudentID = ss.StudentID) INNER JOIN (Select p.FirstName as temp, MAX(ps.Citation) as MaxGrade\n" +
                                  "FROM Student  AS p INNER JOIN StudentResearchPaper AS ps\n" +
                                  "ON (p.StudentID = ps.StudentID) GROUP BY p.FirstName ) dd ON (dd.temp=s.FirstName and dd.MaxGrade=ss.Citation)");
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
            
            } 
            catch (Exception e)
            {
                     e.printStackTrace();
            }
            
            arr1.clear();
            arr1 = database;

            modIndex1 = 0;
            
            clearTable(jTable1);
            if((modIndex1+1)*10>arr1.size())
                currentLength1 = arr1.size()%10;
            else currentLength1 = 10;
         
            for(int i=0;i<currentLength1;i++)
            {
                jTable1.getModel().setValueAt(arr1.get(i+10*modIndex1).getStudentID(), i, 0);
                jTable1.getModel().setValueAt(arr1.get(i+10*modIndex1).getFirstName(), i, 1);
                jTable1.getModel().setValueAt(arr1.get(i+10*modIndex1).getDepartment(), i, 2);
                jTable1.getModel().setValueAt(arr1.get(i+10*modIndex1).getSession(), i, 3);
                jTable1.getModel().setValueAt(arr1.get(i+10*modIndex1).getGrade(), i, 4);
                jTable1.getModel().setValueAt(arr1.get(i+10*modIndex1).getDOI(), i, 5);
                jTable1.getModel().setValueAt(arr1.get(i+10*modIndex1).getTitle(), i, 6);
                jTable1.getModel().setValueAt(arr1.get(i+10*modIndex1).getPageNO(), i, 7);
                jTable1.getModel().setValueAt(arr1.get(i+10*modIndex1).getVolume(), i, 8);
                jTable1.getModel().setValueAt(arr1.get(i+10*modIndex1).getPublicationDate(), i, 9);
                jTable1.getModel().setValueAt(arr1.get(i+10*modIndex1).getPublisher(), i, 10);
                jTable1.getModel().setValueAt(arr1.get(i+10*modIndex1).getCite(), i, 11);
            
            }
            prev.setVisible(false);
            if(arr1.size()<=10)
                next.setVisible(false);
        }
        
        else if(maxCiteCombo.getSelectedItem() == "Department wise")
        {
            ArrayList<StudentResearchInfo> database = new ArrayList();
            
            try
            {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=Scholarship;selectMethod=cursor", "sa", "123456");
            
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement
                    .executeQuery("Select s.StudentID, s.FirstName, s.Department, s.Session, s.AverageGrade, ss.DOI, ss.Title, ss.PageNO, ss.Volume, ss.PublicationDate, ss.Publisher, ss.Citation \n" +
                                  "FROM Student  AS s INNER JOIN StudentResearchPaper AS ss\n" +
                                  "ON (s.StudentID = ss.StudentID) INNER JOIN (Select p.Department as temp, MAX(ps.Citation) as MaxGrade\n" +
                                  "FROM Student  AS p INNER JOIN StudentResearchPaper AS ps\n" +
                                  "ON (p.StudentID = ps.StudentID) GROUP BY p.Department ) dd ON (dd.temp=s.Department and dd.MaxGrade=ss.Citation)");
                System.out.println("Select s.StudentID, s.FirstName, s.Department, s.Session, s.AverageGrade, ss.DOI, ss.Title, ss.PageNO, ss.Volume, ss.PublicationDate, ss.Publisher, ss.Citation \n" +
                                  "FROM Student  AS s INNER JOIN StudentResearchPaper AS ss\n" +
                                  "ON (s.StudentID = ss.StudentID) INNER JOIN (Select p.Department as temp, MAX(ps.Citation) as MaxGrade\n" +
                                  "FROM Student  AS p INNER JOIN StudentResearchPaper AS ps\n" +
                                  "ON (p.StudentID = ps.StudentID) GROUP BY p.Department ) dd ON (dd.temp=s.Department and dd.MaxGrade=ss.Citation)");
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
            
            } 
            catch (Exception e)
            {
                     e.printStackTrace();
            }
            
            arr1.clear();
            arr1 = database;

            modIndex1 = 0;
            
            clearTable(jTable1);
            if((modIndex1+1)*10>arr1.size())
                currentLength1 = arr1.size()%10;
            else currentLength1 = 10;
         
            for(int i=0;i<currentLength1;i++)
            {
                jTable1.getModel().setValueAt(arr1.get(i+10*modIndex1).getStudentID(), i, 0);
                jTable1.getModel().setValueAt(arr1.get(i+10*modIndex1).getFirstName(), i, 1);
                jTable1.getModel().setValueAt(arr1.get(i+10*modIndex1).getDepartment(), i, 2);
                jTable1.getModel().setValueAt(arr1.get(i+10*modIndex1).getSession(), i, 3);
                jTable1.getModel().setValueAt(arr1.get(i+10*modIndex1).getGrade(), i, 4);
                jTable1.getModel().setValueAt(arr1.get(i+10*modIndex1).getDOI(), i, 5);
                jTable1.getModel().setValueAt(arr1.get(i+10*modIndex1).getTitle(), i, 6);
                jTable1.getModel().setValueAt(arr1.get(i+10*modIndex1).getPageNO(), i, 7);
                jTable1.getModel().setValueAt(arr1.get(i+10*modIndex1).getVolume(), i, 8);
                jTable1.getModel().setValueAt(arr1.get(i+10*modIndex1).getPublicationDate(), i, 9);
                jTable1.getModel().setValueAt(arr1.get(i+10*modIndex1).getPublisher(), i, 10);
                jTable1.getModel().setValueAt(arr1.get(i+10*modIndex1).getCite(), i, 11);
            
            }
            prev.setVisible(false);
            if(arr1.size()<=10)
                next.setVisible(false);
        }
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void searchBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchBtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_searchBtnMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        ArrayList<StudentResearchInfo> database = new ArrayList();
            
            try
            {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=Scholarship;selectMethod=cursor", "sa", "123456");
            
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement
                    .executeQuery("Select Student.StudentID, Student.FirstName, Student.Department, Student.Session, Student.AverageGrade, StudentResearchPaper.*\n" +
                                  "From Student INNER JOIN StudentResearchPaper On Student.StudentID = StudentResearchPaper.StudentID\n" +
                                  "where StudentResearchPaper.StudentID In (SELECT StudentID FROM StudentResearchPaper\n" +
                                  "GROUP BY StudentID HAVING count(*) = \n" +
                                  "(select top 1 count(*) from StudentResearchPaper\n" +
                                  "group by StudentID order by count(*) desc))");
                System.out.println("Select Student.StudentID, Student.FirstName, Student.Department, Student.Session, Student.AverageGrade, StudentResearchPaper.*\n" +
                                  "From Student INNER JOIN StudentResearchPaper On Student.StudentID = StudentResearchPaper.StudentID\n" +
                                  "where StudentResearchPaper.StudentID In (SELECT StudentID FROM StudentResearchPaper\n" +
                                  "GROUP BY StudentID HAVING count(*) = \n" +
                                  "(select top 1 count(*) from StudentResearchPaper\n" +
                                  "group by StudentID order by count(*) desc))");
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
            
            } 
            catch (Exception e)
            {
                     e.printStackTrace();
            }
            
            arr1.clear();
            arr1 = database;

            modIndex1 = 0;
            
            clearTable(jTable1);
            if((modIndex1+1)*10>arr1.size())
                currentLength1 = arr1.size()%10;
            else currentLength1 = 10;
         
            for(int i=0;i<currentLength1;i++)
            {
                jTable1.getModel().setValueAt(arr1.get(i+10*modIndex1).getStudentID(), i, 0);
                jTable1.getModel().setValueAt(arr1.get(i+10*modIndex1).getFirstName(), i, 1);
                jTable1.getModel().setValueAt(arr1.get(i+10*modIndex1).getDepartment(), i, 2);
                jTable1.getModel().setValueAt(arr1.get(i+10*modIndex1).getSession(), i, 3);
                jTable1.getModel().setValueAt(arr1.get(i+10*modIndex1).getGrade(), i, 4);
                jTable1.getModel().setValueAt(arr1.get(i+10*modIndex1).getDOI(), i, 5);
                jTable1.getModel().setValueAt(arr1.get(i+10*modIndex1).getTitle(), i, 6);
                jTable1.getModel().setValueAt(arr1.get(i+10*modIndex1).getPageNO(), i, 7);
                jTable1.getModel().setValueAt(arr1.get(i+10*modIndex1).getVolume(), i, 8);
                jTable1.getModel().setValueAt(arr1.get(i+10*modIndex1).getPublicationDate(), i, 9);
                jTable1.getModel().setValueAt(arr1.get(i+10*modIndex1).getPublisher(), i, 10);
                jTable1.getModel().setValueAt(arr1.get(i+10*modIndex1).getCite(), i, 11);
            
            }
            prev.setVisible(false);
            if(arr1.size()<=10)
                next.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void clearTable(final JTable table) {
        for (int i = 0; i < table.getRowCount(); i++) {
            for(int j = 0; j < table.getColumnCount(); j++) {
                table.setValueAt("", i, j);
            }
        }
    }
    
    public static Instant getDateFromString(String string)
    {
  
        // Create an Instant object
        Instant timestamp = null;
  
        // Parse the String to Date
        timestamp = Instant.parse(string);
  
        // return the converted timestamp
        return timestamp;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField dateFrom;
    private javax.swing.JTextField dateTo;
    private javax.swing.JTextField dept;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> maxCiteCombo;
    private javax.swing.JTextField name;
    private javax.swing.JButton next;
    private javax.swing.JButton prev;
    private javax.swing.JButton resetBtn;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField title;
    // End of variables declaration//GEN-END:variables

}
