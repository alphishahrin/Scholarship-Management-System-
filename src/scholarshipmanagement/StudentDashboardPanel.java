/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scholarshipmanagement;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import javax.swing.JCheckBox;
import javax.swing.JTable;

/**
 *
 * @author SARK
 */
public class StudentDashboardPanel extends javax.swing.JInternalFrame {

    /**
     * Creates new form DashBoard2
     */
    String StudentId;
    int currentLength = 0;
    int modIndex  =0;
    
    int currentLength1 = 0;
    int modIndex1  =0;
    
    ArrayList<ProfessorInfo> arr = new ArrayList ();
    ArrayList<ScholarshipInfo> arr1 = new ArrayList ();
    
    public StudentDashboardPanel() {
        initComponents();
        
    }
    
    public StudentDashboardPanel(String StudentId) {
        this.StudentId = StudentId;
        initComponents();
        profTable.getColumnModel().getColumn(0).setPreferredWidth(100);
        profTable.getColumnModel().getColumn(1).setPreferredWidth(100);
        profTable.getColumnModel().getColumn(2).setPreferredWidth(70);
        profTable.getColumnModel().getColumn(3).setPreferredWidth(30);
        
        schoTable.getColumnModel().getColumn(0).setPreferredWidth(130);
        schoTable.getColumnModel().getColumn(1).setPreferredWidth(130);
        schoTable.getColumnModel().getColumn(2).setPreferredWidth(60);
        schoTable.getColumnModel().getColumn(3).setPreferredWidth(40);
        
        arr = new ConnectMSSQL().getProfessorInfo("where  exists (Select ProfID from Professor) ");
        arr1 = new ConnectMSSQL().getScholarshipInfo("where  exists (Select ScholarshipID from Scholarship) ");
        
        profTable.setDefaultEditor(Object.class, null);
        schoTable.setDefaultEditor(Object.class, null);
        
        clearTable(profTable);
        clearTable(schoTable);
        
        if((modIndex+1)*8>arr.size())
            currentLength = arr.size()%8;
        else currentLength = 8;
        
        for(int i=0;i<currentLength;i++)
        {
           
            profTable.getModel().setValueAt(arr.get(i).getFirstName(),i, 0);
            profTable.getModel().setValueAt(new ConnectMSSQL().getUniversityInfo("where UniID = "+ arr.get(i).getUniId()).get(0).getUniName() ,i, 1);
            profTable.getModel().setValueAt(arr.get(i).getDepartment(), i, 2);
            profTable.getModel().setValueAt("Details", i,3);
            
        }
        
        if((modIndex1+1)*8>arr1.size())
            currentLength1 = arr1.size()%8;
        else currentLength1 = 8;
        
        for(int i=0;i<currentLength1;i++)
        {
            schoTable.getModel().setValueAt(arr1.get(i).getDegreeName(),i, 0);
            schoTable.getModel().setValueAt(arr1.get(i).getUniversity(),i, 1);
            schoTable.getModel().setValueAt(arr1.get(i).getDate(),i, 2);
            schoTable.getModel().setValueAt("Details", i,3);
        }
        
        profTable.getColumn("Action").setCellRenderer(new ButtonRenderer(currentLength));
        profTable.getColumn("Action").setCellEditor(new ButtonEditor(new JCheckBox(),profTable));
        
        schoTable.getColumn("Action").setCellRenderer(new ButtonRenderer(currentLength));
        schoTable.getColumn("Action").setCellEditor(new ButtonEditor(new JCheckBox(),schoTable));
        
        
        prevButton.setVisible(false);
        if(arr.size()<=8)
            nextButton.setVisible(false);
        
        prev1Button.setVisible(false);
        if(arr1.size()<=8)
            next1Button.setVisible(false);
        
    }
    
    public static void clearTable(final JTable table) {
        for (int i = 0; i < table.getRowCount(); i++) {
            for(int j = 0; j < table.getColumnCount(); j++) {
                table.setValueAt("", i, j);
            }
        }
    }
    
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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentDashboardPanel().setVisible(true);
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        profTable = new javax.swing.JTable();
        searchbtnProf = new javax.swing.JButton();
        SearchProf = new javax.swing.JTextField();
        categoryProf = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        schoTable = new javax.swing.JTable();
        prevButton = new javax.swing.JButton();
        nextButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        categoryScho = new javax.swing.JComboBox<>();
        SearchScho = new javax.swing.JTextField();
        searchbtnScho = new javax.swing.JButton();
        prev1Button = new javax.swing.JButton();
        next1Button = new javax.swing.JButton();
        reset1btn = new javax.swing.JButton();
        reset2btn = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1320, 730));

        jPanel2.setBackground(new java.awt.Color(102, 133, 139));

        jPanel3.setBackground(new java.awt.Color(27, 71, 82));

        jLabel2.setFont(new java.awt.Font("Stencil", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Professor");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(27, 71, 82));

        jLabel3.setFont(new java.awt.Font("Stencil", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Scholarship");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        profTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
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
                "Professor Name", "University Name", "Department", "Action"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        profTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(profTable);

        searchbtnProf.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\ScholarshipManagement\\image\\transparency.png")); // NOI18N
        searchbtnProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbtnProfActionPerformed(evt);
            }
        });

        SearchProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchProfActionPerformed(evt);
            }
        });

        categoryProf.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Professor", "University", "Department" }));
        categoryProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryProfActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Search By:");

        schoTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
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
                "Degree Name", "University", "Last Date", "Action"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        schoTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                schoTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(schoTable);

        prevButton.setText("Prev");
        prevButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prevButtonActionPerformed(evt);
            }
        });

        nextButton.setText("Next");
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Search By:");

        categoryScho.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Degree", "University", "Date" }));

        SearchScho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchSchoActionPerformed(evt);
            }
        });

        searchbtnScho.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\ScholarshipManagement\\image\\transparency.png")); // NOI18N
        searchbtnScho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbtnSchoActionPerformed(evt);
            }
        });

        prev1Button.setText("Prev");
        prev1Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prev1ButtonActionPerformed(evt);
            }
        });

        next1Button.setText("Next");
        next1Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                next1ButtonActionPerformed(evt);
            }
        });

        reset1btn.setText("RESET");
        reset1btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset1btnActionPerformed(evt);
            }
        });

        reset2btn.setText("RESET");
        reset2btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset2btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(categoryScho, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(SearchScho, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(searchbtnScho, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(prevButton)
                .addGap(32, 32, 32)
                .addComponent(nextButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(reset1btn)
                .addGap(82, 82, 82))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(prev1Button)
                .addGap(28, 28, 28)
                .addComponent(next1Button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(reset2btn)
                .addGap(101, 101, 101))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(87, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1138, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(87, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(categoryProf, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(SearchProf, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(searchbtnProf, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(categoryProf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(searchbtnProf, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(SearchProf)
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prevButton)
                    .addComponent(nextButton)
                    .addComponent(reset1btn))
                .addGap(29, 29, 29)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchbtnScho, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(categoryScho, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SearchScho, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(prev1Button)
                            .addComponent(next1Button)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(reset2btn)))
                .addGap(52, 52, 52))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1322, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 734, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void profTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profTableMouseClicked
        // TODO add your handling code here:
        int row = profTable.getSelectedRow();
        int col = profTable.getSelectedColumn();
        System.out.println(row +" "+ col+" "+arr.size());
        if(col==3 && row<currentLength)
        { 
            new ProfessorInformation(StudentId,Integer.toString(arr.get(row+8*modIndex).getProfId())).setVisible(true);
            new StudentDashboard(StudentId).setVisible(false);
            //this.setVisible(false);
        }
    }//GEN-LAST:event_profTableMouseClicked

    private void searchbtnProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbtnProfActionPerformed
        // TODO add your handling code here:
        String query = "";
        String temp;

        temp = SearchProf.getText();

        if (categoryProf.getSelectedItem().toString() == "Professor"){
            if(temp.length()>0)
            {
                if(query.length()==0)
                {
                    query+= " where FirstName LIKE '%"+temp+"%'";
                }
                else
                query+=" and FirstName LIKE '%"+temp+"%'";
            }
        }
        else if (categoryProf.getSelectedItem().toString() == "University"){
            if(temp.length()>0)
            {
                ArrayList<UniversityInfo> un = new ConnectMSSQL().getUniversityInfo("where UniName = '"+ temp+"'");
                int v = 1000;
                if(un.size() != 0){
                    v = un.get(0).getUniID();
                }
                if(query.length()==0)
                {

                    query+= " where UniID ="+v;
                }
                else
                query+= " and UniID ="+v;
            }
        } else {
            if(temp.length()>0)
            {
                if(query.length()==0)
                {
                    query+= " where Department ='"+temp+"'";
                }
                else
                query+=" and Department ='"+temp+"'";
            }
        }

        arr.clear();
        arr = new ConnectMSSQL().getProfessorInfo(query);

        modIndex = 0;

        clearTable(profTable);

        if((modIndex+1)*8>arr.size())
        currentLength = arr.size()%8;
        else currentLength = 8;

        for(int i=0;i<currentLength;i++)
        {

            profTable.getModel().setValueAt(arr.get(i).getFirstName(),i, 0);
            profTable.getModel().setValueAt(new ConnectMSSQL().getUniversityInfo("where UniID = "+ arr.get(i).getUniId()).get(0).getUniName() ,i, 1);
            profTable.getModel().setValueAt(arr.get(i).getDepartment(), i, 2);
            profTable.getModel().setValueAt("Details", i,3);

        }

        profTable.getColumn("Action").setCellRenderer(new ButtonRenderer(currentLength));
        profTable.getColumn("Action").setCellEditor(new ButtonEditor(new JCheckBox(),profTable));

        prevButton.setVisible(false);
        if(arr.size()<=8)
        nextButton.setVisible(false);
        else nextButton.setVisible(true);

    }//GEN-LAST:event_searchbtnProfActionPerformed

    private void SearchProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchProfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchProfActionPerformed

    private void schoTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_schoTableMouseClicked
        // TODO add your handling code here:
        int row = schoTable.getSelectedRow();
        int col = schoTable.getSelectedColumn();
        System.out.println(row +" "+ col+" "+arr1.size());
        if(col==3 && row<currentLength1)
        {
            new ScholarshipDetails(StudentId,Integer.toString(arr1.get(row+8*modIndex1).getScholarshipID())).setVisible(true);
            //this.setVisible(false);
        }
    }//GEN-LAST:event_schoTableMouseClicked

    private void prevButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prevButtonActionPerformed
        // TODO add your handling code here:
        modIndex--;
        if(modIndex==0)
        prevButton.setVisible(false);
        nextButton.setVisible(true);
        clearTable(profTable);
        if((modIndex+1)*8>arr.size())
        currentLength = arr.size()%8;
        else currentLength = 8;
        for(int i=0;i<currentLength;i++)
        {

            profTable.getModel().setValueAt(arr.get(i).getFirstName(),i, 0);
            profTable.getModel().setValueAt(new ConnectMSSQL().getUniversityInfo("where UniID = "+ arr.get(i).getUniId()).get(0).getUniName(),i, 1);
            profTable.getModel().setValueAt(arr.get(i).getDepartment(),i,2);
            profTable.getModel().setValueAt("Details", i,3);
        }
    }//GEN-LAST:event_prevButtonActionPerformed

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        // TODO add your handling code here:
        modIndex++;
        prevButton.setVisible(true);
        if((modIndex+1)*8>=arr.size())
        nextButton.setVisible(false);
        clearTable(profTable);
        if((modIndex+1)*8>arr.size())
        currentLength = arr.size()%8;
        else currentLength = 8;

        for(int i=0;i<currentLength;i++)
        {

            profTable.getModel().setValueAt(arr.get(i).getFirstName(),i, 0);
            profTable.getModel().setValueAt(new ConnectMSSQL().getUniversityInfo("where UniID = "+ arr.get(i).getUniId()).get(0).getUniName(),i, 1);
            profTable.getModel().setValueAt(arr.get(i).getDepartment(),i,2);
            profTable.getModel().setValueAt("Details", i,3);
        }
    }//GEN-LAST:event_nextButtonActionPerformed

    private void SearchSchoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchSchoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchSchoActionPerformed

    private void searchbtnSchoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbtnSchoActionPerformed
        // TODO add your handling code here:
        String query = "";
        String temp;

        temp = SearchScho.getText();

        if (categoryScho.getSelectedItem().toString() == "Degree"){
            if(temp.length()>0)
            {
                if(query.length()==0)
                {
                    query+= "where DegreeName LIKE '%"+temp+"%'";
                }
                else
                query+="and DegreeName LIKE '%"+temp+"%'";
            }
        }
        else if (categoryScho.getSelectedItem().toString() == "University"){
            if(temp.length()>0)
            {
                if(query.length()==0)
                {
                    query+= "where University LIKE '%"+temp+"%'";
                }
                else
                query+="and University LIKE '%"+temp+"%'";

            }
        } else {
            if(temp.length()>0)
            {
                if(query.length()==0)
                {
                    query+= "where LastDate LIKE '%"+temp+"%'";
                }
                else
                query+="and LastDate LIKE '%"+temp+"%'";
            }
        }

        arr1.clear();
        arr1 = new ConnectMSSQL().getScholarshipInfo(query);

        modIndex1 = 0;

        clearTable(schoTable);

        if((modIndex1+1)*8>arr1.size())
        currentLength1 = arr1.size()%8;
        else currentLength1 = 8;

        for(int i=0;i<currentLength1;i++)
        {

            schoTable.getModel().setValueAt(arr1.get(i).getDegreeName(),i, 0);
            schoTable.getModel().setValueAt(arr1.get(i).getUniversity() ,i, 1);
            schoTable.getModel().setValueAt(arr1.get(i).getDate(),i, 2);
            schoTable.getModel().setValueAt("Details", i,3);

        }

        schoTable.getColumn("Action").setCellRenderer(new ButtonRenderer(currentLength1));
        schoTable.getColumn("Action").setCellEditor(new ButtonEditor(new JCheckBox(),schoTable));

        prev1Button.setVisible(false);
        if(arr1.size()<=8)
        next1Button.setVisible(false);
        else next1Button.setVisible(true);

    }//GEN-LAST:event_searchbtnSchoActionPerformed

    private void prev1ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prev1ButtonActionPerformed
        // TODO add your handling code here:
        modIndex1--;
        if(modIndex1==0)
        prev1Button.setVisible(false);
        next1Button.setVisible(true);
        clearTable(schoTable);
        if((modIndex1+1)*8>arr1.size())
        currentLength1 = arr1.size()%8;
        else currentLength1 = 8;
        for(int i=0;i<currentLength1;i++)
        {
            schoTable.getModel().setValueAt(arr1.get(i+8*modIndex1).getDegreeName(),i, 0);
            schoTable.getModel().setValueAt(arr1.get(i+8*modIndex1).getUniversity(),i, 1);
            schoTable.getModel().setValueAt(arr1.get(i+8*modIndex1).getDate(),i, 2);

            schoTable.getModel().setValueAt("Details", i,3);
        }
    }//GEN-LAST:event_prev1ButtonActionPerformed

    private void next1ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_next1ButtonActionPerformed
        // TODO add your handling code here:
        modIndex1++;
        prev1Button.setVisible(true);
        if((modIndex1+1)*8>=arr1.size())
        next1Button.setVisible(false);
        clearTable(schoTable);
        if((modIndex1+1)*8>arr1.size())
        currentLength1 = arr1.size()%8;
        else currentLength1 = 8;
        for(int i=0;i<currentLength1;i++)
        {
            schoTable.getModel().setValueAt(arr1.get(i+8*modIndex1).getDegreeName(),i, 0);
            schoTable.getModel().setValueAt(arr1.get(i+8*modIndex1).getUniversity(),i, 1);
            schoTable.getModel().setValueAt(arr1.get(i+8*modIndex1).getDate(),i, 2);

            schoTable.getModel().setValueAt("Details", i,3);
        }
    }//GEN-LAST:event_next1ButtonActionPerformed

    private void reset1btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset1btnActionPerformed
        // TODO add your handling code here:
        categoryProf.setSelectedItem(0);
        SearchProf.setText("");
    }//GEN-LAST:event_reset1btnActionPerformed

    private void reset2btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset2btnActionPerformed
        // TODO add your handling code here:
        categoryScho.setSelectedItem(0);
        SearchScho.setText("");
    }//GEN-LAST:event_reset2btnActionPerformed

    private void categoryProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryProfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_categoryProfActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField SearchProf;
    private javax.swing.JTextField SearchScho;
    private javax.swing.JComboBox<String> categoryProf;
    private javax.swing.JComboBox<String> categoryScho;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton next1Button;
    private javax.swing.JButton nextButton;
    private javax.swing.JButton prev1Button;
    private javax.swing.JButton prevButton;
    private javax.swing.JTable profTable;
    private javax.swing.JButton reset1btn;
    private javax.swing.JButton reset2btn;
    private javax.swing.JTable schoTable;
    private javax.swing.JButton searchbtnProf;
    private javax.swing.JButton searchbtnScho;
    // End of variables declaration//GEN-END:variables
}
