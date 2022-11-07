/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package scholarshipmanagement;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author SARK
 */
public class University extends javax.swing.JInternalFrame {
    
    String StudentId;
    int currentLength1 = 0;
    int modIndex1  =0;
    ArrayList<UniversityInfo> arr = new ArrayList ();

    /** Creates new form PackageInfo */
    public University() {
        initComponents();
    }
    
    public University(String StudentId) {
        this.StudentId = StudentId;
        initComponents();
        
        arr = new ConnectMSSQL().getUniversityInfo("where  exists (Select UniID from University) ");
        unitable.setDefaultEditor(Object.class, null);
        clearTable(unitable);
        
        if((modIndex1+1)*8>arr.size())
            currentLength1 = arr.size()%8;
        else currentLength1 = 8;
        
        for(int i=0;i<currentLength1;i++)
        {
            unitable.getModel().setValueAt(arr.get(i).getUniID(), i, 0);
            unitable.getModel().setValueAt(arr.get(i).getUniName(), i, 1);
            unitable.getModel().setValueAt(arr.get(i).getUniRating(), i, 2);
            unitable.getModel().setValueAt(arr.get(i).getLocation(), i, 3);
        }
        
        prev.setVisible(false);
        if(arr.size()<=8)
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

        rateFrom = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        searchName = new javax.swing.JTextField();
        searchLocation = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        rateTo = new javax.swing.JTextField();
        searchId = new javax.swing.JTextField();
        resetbtn = new javax.swing.JButton();
        searchbtn = new javax.swing.JButton();
        next = new javax.swing.JButton();
        prev = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        unitable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(750, 570));
        setMinimumSize(new java.awt.Dimension(750, 570));
        setPreferredSize(new java.awt.Dimension(1320, 730));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rateFrom.setBackground(new java.awt.Color(194, 222, 213));
        rateFrom.setFont(new java.awt.Font("Tempus Sans ITC", 0, 18)); // NOI18N
        rateFrom.setText("From");
        rateFrom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                rateFromKeyTyped(evt);
            }
        });
        getContentPane().add(rateFrom, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, 190, 40));

        jPanel1.setBackground(new java.awt.Color(8, 62, 8));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("University");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(545, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(553, 553, 553))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1310, 65));

        searchName.setBackground(new java.awt.Color(194, 222, 213));
        searchName.setFont(new java.awt.Font("Tempus Sans ITC", 0, 18)); // NOI18N
        searchName.setText("Search By Name");
        searchName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchNameMouseClicked(evt);
            }
        });
        searchName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchNameActionPerformed(evt);
            }
        });
        getContentPane().add(searchName, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, 190, 40));

        searchLocation.setBackground(new java.awt.Color(194, 222, 213));
        searchLocation.setFont(new java.awt.Font("Tempus Sans ITC", 0, 18)); // NOI18N
        searchLocation.setText("Search By Location");
        searchLocation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchLocationMouseClicked(evt);
            }
        });
        getContentPane().add(searchLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 100, 190, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Range of Rating :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 160, 40));

        rateTo.setBackground(new java.awt.Color(194, 222, 213));
        rateTo.setFont(new java.awt.Font("Tempus Sans ITC", 0, 18)); // NOI18N
        rateTo.setText("To");
        rateTo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                rateToKeyTyped(evt);
            }
        });
        getContentPane().add(rateTo, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 160, 190, 40));

        searchId.setBackground(new java.awt.Color(194, 222, 213));
        searchId.setFont(new java.awt.Font("Tempus Sans ITC", 0, 18)); // NOI18N
        searchId.setText("Search By ID");
        searchId.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchIdMouseClicked(evt);
            }
        });
        searchId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchIdActionPerformed(evt);
            }
        });
        getContentPane().add(searchId, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 190, 40));

        resetbtn.setText("RESET");
        resetbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetbtnActionPerformed(evt);
            }
        });
        getContentPane().add(resetbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 110, 80, 60));

        searchbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/scholarshipmanagement/transparency.png"))); // NOI18N
        searchbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbtnActionPerformed(evt);
            }
        });
        getContentPane().add(searchbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 110, 60, 60));

        next.setBackground(new java.awt.Color(255, 255, 255));
        next.setText("Next");
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });
        getContentPane().add(next, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 480, 70, -1));

        prev.setBackground(new java.awt.Color(255, 255, 255));
        prev.setText("Prev");
        prev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prevActionPerformed(evt);
            }
        });
        getContentPane().add(prev, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 480, 60, -1));

        unitable.setModel(new javax.swing.table.DefaultTableModel(
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
                "University ID", "Name", "Rating", "Location"
            }
        ));
        jScrollPane1.setViewportView(unitable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 1200, 160));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/scholarshipmanagement/ek.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1310, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void clearTable(final JTable table) {
        for (int i = 0; i < table.getRowCount(); i++) {
            for(int j = 0; j < table.getColumnCount(); j++) {
                table.setValueAt("", i, j);
            }
        }
    }
    
    private void searchNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchNameMouseClicked
        // TODO add your handling code here:
        if(searchName.getText().equals("Search By Name"))
        searchName.setText("");
    }//GEN-LAST:event_searchNameMouseClicked

    private void searchNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchNameActionPerformed

    private void searchLocationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchLocationMouseClicked
        // TODO add your handling code here:
        if(searchLocation.getText().equals("Search By Location"))
        searchLocation.setText("");
    }//GEN-LAST:event_searchLocationMouseClicked

    private void searchIdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchIdMouseClicked
        // TODO add your handling code here:
        if(searchId.getText().equals("Search By ID"))
        searchId.setText("");
    }//GEN-LAST:event_searchIdMouseClicked

    private void searchIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchIdActionPerformed

    private void resetbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetbtnActionPerformed
        // TODO add your handling code here:
        searchId.setText("Search By ID");
        searchName.setText("Search By Name");
        searchLocation.setText("Search By Location");

    }//GEN-LAST:event_resetbtnActionPerformed

    private void searchbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbtnActionPerformed
        // TODO add your handling code here:
        String query = "";
        String temp ;
        Double tempFrom, tempTo;

        temp = searchId.getText().toString();
        if(temp.equals("Search By ID")==false && temp.length()>0)
        {
            if(query.length()==0)
            {
                query+= "where UniID='"+temp+"'";
            }
            else query+="and UniID='"+temp+"'";
        }

        temp = searchName.getText().toString();
        if(temp.equals("Search By Name")==false && temp.length()>0)
        {
            if(query.length()==0)
            {
                query+= "where UniName LIKE '%"+temp+"%'";
            }
            else query+="and UniName LIKE '%"+temp+"%'";
        }

        temp = searchLocation.getText().toString();
        if(temp.equals("Search By Location")==false && temp.length()>0)
        {
            if(query.length()==0)
            {
                query+= "where Location LIKE '%"+temp+"%'";
            }
            else query+="and Location LIKE '%"+temp+"%'";
        }
        
        if((rateFrom.getText().toString().equals("From")  && rateTo.getText().toString().equals("To")) || (rateFrom.getText().length()==0 && rateTo.getText().length() ==0 ))
        {
            if(query.length()==0)
            {
                query+= "where UniRating between 1 AND 5";
            }
            else query+="and UniRating between 1 AND 5";
            
        }
        else if (rateFrom.getText().length()==0 || rateTo.getText().length() ==0 ){
            //warning
        }
        
        else if(rateFrom.getText().toString().equals("From")==false && rateTo.getText().toString().equals("To")==false){
            tempFrom = Double.valueOf(rateFrom.getText());
            tempTo = Double.valueOf(rateTo.getText());
            if(query.length()==0)
            {
                query+= "where UniRating between "+tempFrom+" AND "+tempTo;
            }
            else query+="and UniRating between "+tempFrom+" AND "+tempTo;
            
        }
        System.out.println(query);

        /*tempFrom = Double.valueOf(rateFrom.getText());
        tempTo = Double.valueOf(rateTo.getText());
        if(tempFrom.equals("From")==false && tempFrom>0 && tempTo.equals("To")==false && tempTo>0 )
        {
            if(query.length()==0)
            {
                query+= "where UniRating between "+tempFrom+" AND "+tempTo;
            }
            else query+="and UniRating between "+tempFrom+" AND "+tempTo;
        }*/
        

        arr.clear();
        arr = new ConnectMSSQL().getUniversityInfo(query);

        modIndex1 = 0;

        clearTable(unitable);

        if((modIndex1+1)*8>arr.size())
        currentLength1 = arr.size()%8;
        else currentLength1 = 8;

        for(int i=0;i<currentLength1;i++)
        {
            unitable.getModel().setValueAt(arr.get(i+8*modIndex1).getUniID(), i, 0);
            unitable.getModel().setValueAt(arr.get(i+8*modIndex1).getUniName(), i, 1);
            unitable.getModel().setValueAt(arr.get(i+8*modIndex1).getUniRating(), i, 2);
            unitable.getModel().setValueAt(arr.get(i+8*modIndex1).getLocation(), i, 3);
        }

        prev.setVisible(false);
        if(arr.size()<=8)
        next.setVisible(false);
        else
        next.setVisible(true);
    }//GEN-LAST:event_searchbtnActionPerformed

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        // TODO add your handling code here:
        modIndex1++;
        prev.setVisible(true);
        if((modIndex1+1)*8>=arr.size())
        next.setVisible(false);
        clearTable(unitable);
        if((modIndex1+1)*8>arr.size())
        currentLength1 = arr.size()%8;
        else currentLength1 = 8;

        for(int i=0;i<currentLength1;i++)
        {
            unitable.getModel().setValueAt(arr.get(i+8*modIndex1).getUniID(), i, 0);
            unitable.getModel().setValueAt(arr.get(i+8*modIndex1).getUniName(), i, 1);
            unitable.getModel().setValueAt(arr.get(i+8*modIndex1).getUniRating(), i, 2);
            unitable.getModel().setValueAt(arr.get(i+8*modIndex1).getLocation(), i, 3);
        }
    }//GEN-LAST:event_nextActionPerformed

    private void prevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prevActionPerformed
        // TODO add your handling code here:
        modIndex1--;
        if(modIndex1==0)
        prev.setVisible(false);
        next.setVisible(true);
        clearTable(unitable);
        if((modIndex1+1)*8>arr.size())
        currentLength1 = arr.size()%8;
        else currentLength1 = 8;

        for(int i=0;i<currentLength1;i++)
        {
            unitable.getModel().setValueAt(arr.get(i+8*modIndex1).getUniID(), i, 0);
            unitable.getModel().setValueAt(arr.get(i+8*modIndex1).getUniName(), i, 1);
            unitable.getModel().setValueAt(arr.get(i+8*modIndex1).getUniRating(), i, 2);
            unitable.getModel().setValueAt(arr.get(i+8*modIndex1).getLocation(), i, 3);
        }
    }//GEN-LAST:event_prevActionPerformed

    private void rateFromKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rateFromKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!((c >= '0') && (c <= '9') ||
         (c == KeyEvent.VK_BACK_SPACE) ||
         (c == KeyEvent.VK_DELETE))) {
        getToolkit().beep();
        evt.consume();
        }
    }//GEN-LAST:event_rateFromKeyTyped

    private void rateToKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rateToKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!((c >= '0') && (c <= '9') ||
         (c == KeyEvent.VK_BACK_SPACE) ||
         (c == KeyEvent.VK_DELETE))) {
        getToolkit().beep();
        evt.consume();
        }
    }//GEN-LAST:event_rateToKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton next;
    private javax.swing.JButton prev;
    private javax.swing.JTextField rateFrom;
    private javax.swing.JTextField rateTo;
    private javax.swing.JButton resetbtn;
    private javax.swing.JTextField searchId;
    private javax.swing.JTextField searchLocation;
    private javax.swing.JTextField searchName;
    private javax.swing.JButton searchbtn;
    private javax.swing.JTable unitable;
    // End of variables declaration//GEN-END:variables

}
