/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scholarshipmanagement;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
/**
 *
 * @author HP
 */
public class StudentGradeResearch extends javax.swing.JFrame {

    String ProfId, StudentId;
    String query = "where StudentId = '" + this.StudentId + "'";
    
    int currentLength1 = 0;
    int modIndex1  =0;
    ArrayList<CourseResultInfo> arr1 = new ArrayList ();
    
    int currentLength2 = 0;
    int modIndex2  =0;
    ArrayList<StudentResearchPaperInfo> arr2 = new ArrayList ();
    
    /** * Creates new form StudentGradeResearch */
    public StudentGradeResearch() {
        initComponents();
    }
    
    public StudentGradeResearch(String ProfId, String StudentId) {
        this.ProfId = ProfId;
        this.StudentId = StudentId;
        initComponents();
        
        arr1 = new ConnectMSSQL().getCourseResultInfo("where StudentID = "+Integer.valueOf(StudentId));
        gradeTable.setDefaultEditor(Object.class, null);
        clearTable(gradeTable);
        
        if((modIndex1+1)*15>arr1.size())
            currentLength1 = arr1.size()%15;
        else currentLength1 = 15;
        
        for(int i=0;i<currentLength1;i++)
        {
            gradeTable.getModel().setValueAt(arr1.get(i).getCourseName(), i, 0);
            gradeTable.getModel().setValueAt(arr1.get(i).getGrade(), i, 1);
            gradeTable.getModel().setValueAt(arr1.get(i).getYear(), i, 2);
            gradeTable.getModel().setValueAt(arr1.get(i).getSemester(), i, 3);
            
        }
        prev.setVisible(false);
        if(arr1.size()<=15)
            next.setVisible(false);
        
        arr2 = new ConnectMSSQL().getStudentResearchPaperInfo("where StudentID = "+Integer.valueOf(StudentId));
        paperTable.setDefaultEditor(Object.class, null);
        clearTable(paperTable);
        
        currentLength2 = arr2.size();
        
        for(int i=0;i<currentLength2;i++)
        {
            paperTable.getModel().setValueAt(arr2.get(i).getDOI(), i, 0);
            paperTable.getModel().setValueAt(arr2.get(i).getTitle(), i, 1);
            paperTable.getModel().setValueAt(arr2.get(i).getPageNo(), i, 2);
            paperTable.getModel().setValueAt(arr2.get(i).getVolume(), i, 3);
            paperTable.getModel().setValueAt(arr2.get(i).getPublicationDate(), i, 4);
            paperTable.getModel().setValueAt(arr2.get(i).getPublisher(), i, 5);
            paperTable.getModel().setValueAt(arr2.get(i).getCite(), i, 6);
            
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        gradeTable = new javax.swing.JTable();
        prev = new javax.swing.JButton();
        next = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        gradeFrom = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        gradeTo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        yearFrom = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        yearTo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        semesterFrom = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        semesterTo = new javax.swing.JTextField();
        search = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        course = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        paperTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 238, 211));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(82, 111, 111));
        jLabel2.setText("Student Academic Activity");

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(414, 414, 414)
                .addComponent(jLabel2)
                .addContainerGap(639, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1550, 60));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0,80));

        gradeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Course Name", "Grade", "Year", "Semester"
            }
        ));
        jScrollPane2.setViewportView(gradeTable);

        prev.setText("Prev");
        prev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prevActionPerformed(evt);
            }
        });

        next.setText("Next");
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Grade in Range :");

        gradeFrom.setPreferredSize(new java.awt.Dimension(70, 25));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("To :");

        gradeTo.setPreferredSize(new java.awt.Dimension(70, 25));
        gradeTo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gradeToActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Year in Range :");

        yearFrom.setPreferredSize(new java.awt.Dimension(70, 25));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("To :");

        yearTo.setPreferredSize(new java.awt.Dimension(70, 25));
        yearTo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearToActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setText("Semester in Range :");

        semesterFrom.setPreferredSize(new java.awt.Dimension(70, 25));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setText("To :");

        semesterTo.setPreferredSize(new java.awt.Dimension(70, 25));
        semesterTo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                semesterToActionPerformed(evt);
            }
        });

        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel9.setText("Search Course Name:");

        course.setPreferredSize(new java.awt.Dimension(70, 25));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(prev)
                .addGap(18, 18, 18)
                .addComponent(next)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(yearFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(yearTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(gradeFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(gradeTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(course, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(semesterFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(semesterTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(search, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(reset, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(42, 42, 42))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(gradeFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(gradeTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(yearFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(yearTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(semesterFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(semesterTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(course, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reset))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(next)
                    .addComponent(prev))
                .addGap(34, 34, 34))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 550, 610));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0,80));

        paperTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "DOI", "Title", "Page", "Volume", "Date", "Publisher", "Citation"
            }
        ));
        jScrollPane1.setViewportView(paperTable);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 916, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(298, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 90, 940, 610));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/scholarshipmanagement/aa.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, -4, 1550, 720));

        setSize(new java.awt.Dimension(1568, 767));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void clearTable(final JTable table) {
        for (int i = 0; i < table.getRowCount(); i++) {
            for(int j = 0; j < table.getColumnCount(); j++) {
                table.setValueAt("", i, j);
            }
        }
    }
    
    private void prevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prevActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prevActionPerformed

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nextActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void gradeToActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gradeToActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gradeToActionPerformed

    private void yearToActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearToActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yearToActionPerformed

    private void semesterToActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_semesterToActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_semesterToActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
        String query = "where StudentId = '" + this.StudentId + "'";
        String temp ;
        Double tempFrom, tempTo;
        Integer from, to;
        
        temp = course.getText().toString();
        if(temp.equals("")==false && temp.length()>0)
        {
            if(query.length()==0)
            {
                query+= "where CourseName LIKE '%"+temp+"%'";
            }
            else query+="and CourseName LIKE '%"+temp+"%'";
        }
        
        if (gradeFrom.getText().length()==0 || gradeTo.getText().length() ==0 ){
            //warning
        }
        else if(gradeFrom.getText().toString().equals("")==false && gradeTo.getText().toString().equals("")==false){
            tempFrom = Double.valueOf(gradeFrom.getText());
            tempTo = Double.valueOf(gradeTo.getText());
            if(query.length()==0)
            {
                query+= "where Grade between "+tempFrom+" AND "+tempTo;
            }
            else query+="and Grade between "+tempFrom+" AND "+tempTo;
            
        }
        
        if (yearFrom.getText().length()==0 || yearTo.getText().length() ==0 ){
            //warning
        }
        else if(yearFrom.getText().toString().equals("")==false && yearTo.getText().toString().equals("")==false){
            from = Integer.valueOf(yearFrom.getText());
            to = Integer.valueOf(yearTo.getText());
            if(query.length()==0)
            {
                query+= "where Year between "+from+" AND "+to;
            }
            else query+="and Year between "+from+" AND "+to;
            
        }
        
        if (semesterFrom.getText().length()==0 || semesterTo.getText().length() ==0 ){
            //warning
        }
        else if(semesterFrom.getText().toString().equals("")==false && semesterTo.getText().toString().equals("")==false){
            from = Integer.valueOf(semesterFrom.getText());
            to = Integer.valueOf(semesterTo.getText());
            if(query.length()==0)
            {
                query+= "where Semester between "+from+" AND "+to;
            }
            else query+="and Semester between "+from+" AND "+to;
            
        }
        
        
        arr1.clear();
        arr1 = new ConnectMSSQL().getCourseResultInfo(query);
        modIndex1 = 0;

        clearTable(gradeTable);
        
        if((modIndex1+1)*15>arr1.size())
            currentLength1 = arr1.size()%15;
        else currentLength1 = 15;
        
        for(int i=0;i<currentLength1;i++)
        {
            gradeTable.getModel().setValueAt(arr1.get(i).getCourseName(), i, 0);
            gradeTable.getModel().setValueAt(arr1.get(i).getGrade(), i, 1);
            gradeTable.getModel().setValueAt(arr1.get(i).getYear(), i, 2);
            gradeTable.getModel().setValueAt(arr1.get(i).getSemester(), i, 3);
            
        }
        prev.setVisible(false);
        if(arr1.size()<=15)
            next.setVisible(false);
    }//GEN-LAST:event_searchActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resetActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StudentGradeResearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentGradeResearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentGradeResearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentGradeResearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentGradeResearch().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField course;
    private javax.swing.JTextField gradeFrom;
    private javax.swing.JTable gradeTable;
    private javax.swing.JTextField gradeTo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton next;
    private javax.swing.JTable paperTable;
    private javax.swing.JButton prev;
    private javax.swing.JButton reset;
    private javax.swing.JButton search;
    private javax.swing.JTextField semesterFrom;
    private javax.swing.JTextField semesterTo;
    private javax.swing.JTextField yearFrom;
    private javax.swing.JTextField yearTo;
    // End of variables declaration//GEN-END:variables
}
