/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package scholarshipmanagement;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author SARK
 */
public class ProfessorScholarship extends javax.swing.JInternalFrame {
    
    String ProfId;
    int currentLength1 = 0;
    int modIndex1  =0;
    ArrayList<ScholarshipInfo> arr = new ArrayList ();

    /** Creates new form PackageInfo */
    public ProfessorScholarship() {
        initComponents();
    }
    
    public ProfessorScholarship(String ProfId) {
        this.ProfId = ProfId;
        initComponents();
        
        arr = new ConnectMSSQL().getScholarshipInfo("where  exists (Select ScholarshipID from Scholarship) ");
        unitable.setDefaultEditor(Object.class, null);
        clearTable(unitable);
        
        unitable.setRowHeight(20);
        TableColumnModel columnModel = unitable.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(100);
        columnModel.getColumn(1).setPreferredWidth(180);
        columnModel.getColumn(2).setPreferredWidth(120);
        columnModel.getColumn(3).setPreferredWidth(30);
        columnModel.getColumn(4).setPreferredWidth(30);
        columnModel.getColumn(5).setPreferredWidth(30);
        
        currentLength1 = arr.size();
        
        for(int i=0;i<currentLength1;i++)
        {
            unitable.getModel().setValueAt(arr.get(i).getDegreeName(), i, 0);
            unitable.getModel().setValueAt(arr.get(i).getUniversity(), i, 1);
            unitable.getModel().setValueAt(arr.get(i).getSubject(), i, 2);
            unitable.getModel().setValueAt(arr.get(i).getPercentageOfScholarship(), i, 3);
            unitable.getModel().setValueAt(arr.get(i).getSession(), i, 4);
            unitable.getModel().setValueAt(arr.get(i).getMinimumGPA(), i, 5);
        }
        
        
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
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtdegree = new javax.swing.JTextField();
        txtuni = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        txtcon = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtsub = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtper = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtses = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtseats = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtcg = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtother = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        txtdate = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        unitable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(750, 570));
        setMinimumSize(new java.awt.Dimension(750, 570));
        setPreferredSize(new java.awt.Dimension(1320, 730));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(116, 134, 138));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Scholarship Update");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(494, 494, 494)
                .addComponent(jLabel5)
                .addContainerGap(517, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1310, 60));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0,80));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Degree :");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("University :");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Country :");

        txtdegree.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtdegree.setPreferredSize(new java.awt.Dimension(69, 25));

        txtuni.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtuni.setPreferredSize(new java.awt.Dimension(69, 25));

        jButton1.setBackground(new java.awt.Color(104, 146, 171));
        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtcon.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtcon.setPreferredSize(new java.awt.Dimension(69, 25));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Subject :");

        txtsub.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtsub.setPreferredSize(new java.awt.Dimension(69, 25));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Percentage :");

        txtper.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtper.setPreferredSize(new java.awt.Dimension(69, 25));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Session:");

        txtses.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtses.setPreferredSize(new java.awt.Dimension(69, 25));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Seats :");

        txtseats.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtseats.setPreferredSize(new java.awt.Dimension(69, 25));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Min CGPA :");

        txtcg.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtcg.setPreferredSize(new java.awt.Dimension(69, 25));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Others :");

        txtother.setColumns(20);
        txtother.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txtother.setRows(5);
        jScrollPane3.setViewportView(txtother);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Date :");

        txtdate.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtdate.setPreferredSize(new java.awt.Dimension(69, 25));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtuni, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtcon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtsub, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtdegree, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtper, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtses, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9)
                                .addGap(117, 117, 117))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtseats, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11))
                                .addGap(4, 4, 4)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
                                    .addComponent(txtcg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(77, 77, 77)
                                .addComponent(txtdate, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdegree, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtuni, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtcon, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtsub, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtper, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtses, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtseats, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtcg, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtdate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 520, 600));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0,80));

        unitable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Degree", "University", "Subject", "%", "Session", "Min CGPA"
            }
        ));
        jScrollPane1.setViewportView(unitable);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 726, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(209, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 90, 750, 590));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/scholarshipmanagement/ww.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1310, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void clearTable(final JTable table) {
        for (int i = 0; i < table.getRowCount(); i++) {
            for(int j = 0; j < table.getColumnCount(); j++) {
                table.setValueAt("", i, j);
            }
        }
    }
    
    Connection con1;
    PreparedStatement insert;
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String degree = txtdegree.getText();
        String uni = txtuni.getText();
        String sub = txtsub.getText();
        String per = txtper.getText();
        String ses = txtses.getText();
        String cg = txtcg.getText();
        String con = txtcon.getText();
        String seat = txtseats.getText();
        String other = txtother.getText();
        String date = txtdate.getText();
        
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con1 = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=Scholarship;selectMethod=cursor", "sa", "123456");
            insert = con1.prepareStatement("insert into Scholarship(DegreeName,University,CountryName,Subject,PercentageOfScholarship,"
                    + "Session,Seats,MinimumGPA,OtherRequirements,LastDate) values(?,?,?,?,?,?,?,?,?,?)");
            insert.setString(1,degree);
            insert.setString(2,uni);
            insert.setString(3,con);
            insert.setString(4,sub);
            insert.setString(5,per);
            insert.setString(6,ses);
            insert.setString(7,seat);
            insert.setString(8,cg);
            insert.setString(9,other);
            insert.setString(10, date);
            insert.executeUpdate();
            
            JOptionPane.showMessageDialog(this,"Record added!");
            
            txtdegree.setText("");
            txtuni.setText("");
            txtsub.setText("");
            txtper.setText("");
            txtses.setText("");
            txtcg.setText("");
            txtcon.setText("");
            txtseats.setText("");
            txtother.setText("");
            txtdate.setText("");
            txtdegree.requestFocus();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProfessorScholarship.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ProfessorScholarship.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //ProfessorScholarship r = new ProfessorScholarship(ProfId);
        //r.setVisible(true);
        //this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField txtcg;
    private javax.swing.JTextField txtcon;
    private javax.swing.JTextField txtdate;
    private javax.swing.JTextField txtdegree;
    private javax.swing.JTextArea txtother;
    private javax.swing.JTextField txtper;
    private javax.swing.JTextField txtseats;
    private javax.swing.JTextField txtses;
    private javax.swing.JTextField txtsub;
    private javax.swing.JTextField txtuni;
    private javax.swing.JTable unitable;
    // End of variables declaration//GEN-END:variables

}
