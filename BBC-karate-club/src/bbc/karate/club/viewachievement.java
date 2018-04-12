/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bbc.karate.club;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Abhirham
 */
public class viewachievement extends javax.swing.JFrame {
Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    String wantdate="no";
    int swit=0;
    /**
     * Creates new form viewachievement
     */
    public viewachievement() {
        initComponents();
        togglbtn(true);
         try {
            conn = sqlcon.connecrDB();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "JDBC connction failed");
        }
         filltable();
         setbtn(false);
         sidbtn.setSelected(true);
         fromdate.setDateFormatString("yyyy-MM-dd");
        todate.setDateFormatString("yyyy-MM-dd");
        
        Date date = new Date();
            fromdate.setDate(date);
            todate.setDate(date);
            fromdate.setMaxSelectableDate(date);
            todate.setMaxSelectableDate(date);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        isdate = new javax.swing.JCheckBox();
        todate = new com.toedter.calendar.JDateChooser();
        from = new javax.swing.JLabel();
        fromdate = new com.toedter.calendar.JDateChooser();
        to = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        achivtable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        sid = new javax.swing.JTextField();
        stud = new javax.swing.JLabel();
        rank = new javax.swing.JComboBox<>();
        rankl = new javax.swing.JLabel();
        rankbtn = new javax.swing.JRadioButton();
        sidbtn = new javax.swing.JRadioButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ACHIEVEMENTS");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Date"));

        isdate.setText("Date?");
        isdate.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                isdateItemStateChanged(evt);
            }
        });

        from.setText("From:");

        to.setText("to:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(from)
                    .addComponent(to))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(isdate)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fromdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(todate, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(to)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(isdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(fromdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(from))
                        .addGap(18, 18, 18)
                        .addComponent(todate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        achivtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(achivtable);

        jButton1.setText("Generate");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        stud.setText("Student no:");

        rank.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Rank", "White", "Yellow", "Half Green", "Green", "Half Blue", "Blue", "Half Red", "Red", "Half Black", "Black" }));

        rankl.setText("Rank:");

        buttonGroup1.add(rankbtn);
        rankbtn.setText("Use Rank");
        rankbtn.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rankbtnItemStateChanged(evt);
            }
        });

        buttonGroup1.add(sidbtn);
        sidbtn.setText("Use SID");
        sidbtn.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                sidbtnItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(stud)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sid, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rankl)
                .addGap(18, 18, 18)
                .addComponent(rank, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(sidbtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rankbtn)
                .addGap(39, 39, 39))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sidbtn)
                    .addComponent(rankbtn))
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stud)
                    .addComponent(sid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rankl)
                    .addComponent(rank, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jButton3.setText("Add");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(32, 32, 32)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(70, 70, 70)))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2)
                            .addComponent(jButton3))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void isdateItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_isdateItemStateChanged
        if(isdate.isSelected()){
            setbtn(true);
            wantdate="yes";
        }else{
            setbtn(false);
            wantdate="no";}// TODO add your handling code here:
    }//GEN-LAST:event_isdateItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       String sql=null;
       String ranks = rank.getSelectedItem().toString();
       if(!ranks.equals("Select Rank")){
            if(wantdate.equals("yes")){
                Date fdate = fromdate.getDate();   
                Date tdate = todate.getDate();
                sql="select a.STU_NUM, a.ACHIE_DATE from ACHIEVEMENT a, RANK_TABLE r where a.RANK_NUM=r.RANK_NUM and RANK_COLOR='"+ranks+"' and ACHIE_DATE between '"+getdate(fdate)+"' and '"+getdate(tdate)+"' order by ACHIE_DATE";
            }else if(wantdate.equals("no")){
                sql="select a.STU_NUM, a.ACHIE_DATE from ACHIEVEMENT a, RANK_TABLE r where a.RANK_NUM=r.RANK_NUM and RANK_COLOR='"+ranks+"' order by STU_NUM";
        }
       }else if(!sid.getText().equals("")){
           if(wantdate.equals("yes")){
                Date fdate = fromdate.getDate();   
                Date tdate = todate.getDate();
                sql="select r.RANK_COLOR, a.ACHIE_DATE from ACHIEVEMENT a, RANK_TABLE r where a.RANK_NUM=r.RANK_NUM and STU_NUM='"+sid.getText()+"' and ACHIE_DATE between '"+getdate(fdate)+"' and '"+getdate(tdate)+"' order by ACHIE_DATE";
            }else if(wantdate.equals("no")){
                sql="select r.RANK_COLOR, a.ACHIE_DATE from ACHIEVEMENT a, RANK_TABLE r where a.RANK_NUM=r.RANK_NUM and STU_NUM='"+sid.getText()+"' order by a.RANK_NUM desc";
        }
       }else if(wantdate.equals("yes")){
                Date fdate = fromdate.getDate();   
                Date tdate = todate.getDate();
                sql="select STU_NUM, r.RANK_COLOR, a.ACHIE_DATE from ACHIEVEMENT a, RANK_TABLE r where a.RANK_NUM=r.RANK_NUM and ACHIE_DATE between '"+getdate(fdate)+"' and '"+getdate(tdate)+"' order by ACHIE_DATE";
       }else
           filltable();
        try {
            pst = conn.prepareStatement(sql);
//          pst.setString(1, sid.getText());
            rs = pst.executeQuery();
            achivtable.setModel(DbUtils.resultSetToTableModel(rs));
         } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);} // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      try {
               conn.close();
           } catch (SQLException ex) {
               JOptionPane.showMessageDialog(null, "jdbc closing failed");
           }

        home a=new home();
      a.setVisible(true);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void sidbtnItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_sidbtnItemStateChanged
      if(sidbtn.isSelected()){
          togglbtn(true);
      rank.setSelectedIndex(0);}
          // TODO add your handling code here:
    }//GEN-LAST:event_sidbtnItemStateChanged

    private void rankbtnItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rankbtnItemStateChanged
        if(rankbtn.isSelected()){
          togglbtn(false);
        sid.setText("");}

// TODO add your handling code here:
    }//GEN-LAST:event_rankbtnItemStateChanged

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       try {
               conn.close();
           } catch (SQLException ex) {
               JOptionPane.showMessageDialog(null, "jdbc closing failed");
           }

        achievement a=new achievement();
      a.setVisible(true);
        this.dispose();  // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(viewachievement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewachievement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewachievement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewachievement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewachievement().setVisible(true);
            }
        });
    }

    public void setbtn(boolean a){
           fromdate.setEnabled(a);
           todate.setEnabled(a);
           from.setEnabled(a);
           to.setEnabled(a);
       }
    public String getdate(Date a){
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String s = df.format(a);
        return s;
    }
    
    public void filltable(){
        String sql="select STU_NUM, r.RANK_COLOR, a.ACHIE_DATE from ACHIEVEMENT a, " +
" RANK_TABLE r where a.RANK_NUM=r.RANK_NUM order by STU_NUM, a.RANK_NUM desc";
        try {
            pst = conn.prepareStatement(sql);
//          pst.setString(1, sid.getText());
            rs = pst.executeQuery();
            achivtable.setModel(DbUtils.resultSetToTableModel(rs));
         } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);}
    }
    
    public void togglbtn(boolean a){
           sid.setEnabled(a);
           stud.setEnabled(a);
           rank.setEnabled(!a);
           rankl.setEnabled(!a);
       }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable achivtable;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel from;
    private com.toedter.calendar.JDateChooser fromdate;
    private javax.swing.JCheckBox isdate;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> rank;
    private javax.swing.JRadioButton rankbtn;
    private javax.swing.JLabel rankl;
    private javax.swing.JTextField sid;
    private javax.swing.JRadioButton sidbtn;
    private javax.swing.JLabel stud;
    private javax.swing.JLabel to;
    private com.toedter.calendar.JDateChooser todate;
    // End of variables declaration//GEN-END:variables
}
