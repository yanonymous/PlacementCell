/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package placement;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class WelcomeStudent extends javax.swing.JFrame {

    /** Creates new form WelcomeStudent */
    public String usern;
    public WelcomeStudent() {
        setUndecorated(true);
        initComponents();
        PreparedStatement ps;
        ResultSet rs;
        String sql = "SELECT loginID FROM `login` WHERE sr=1";
        try{
            ps = myconnection.getConnection().prepareStatement(sql);
            rs = ps.executeQuery();
            if(rs.next()){
                usern=rs.getString(1);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        PreparedStatement pstmt;
        ResultSet r;
        String query = "SELECT Name,PRN from studentlogin WHERE username= '"+usern+"'";
        try{
            pstmt = myconnection.getConnection().prepareStatement(query);
            r=pstmt.executeQuery();
            if(r.next()){
                Long p=r.getLong(2);
                String n=r.getString(1);
                prnlbl.setText("PRN: "+p);
                welcomelbl.setText("WELCOME!! "+n);
            }
        }catch(Exception es){
            JOptionPane.showMessageDialog(null, es);
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
        jPanel2 = new javax.swing.JPanel();
        welcomelbl = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        prnlbl = new javax.swing.JLabel();
        perdetailbtn = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        checkresultbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        welcomelbl.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        welcomelbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(welcomelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 550, 60));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setText("X");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 20, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, 640, 150));

        prnlbl.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        prnlbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(prnlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 210, 420, 30));

        perdetailbtn.setBackground(new java.awt.Color(255, 51, 51));
        perdetailbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        perdetailbtn.setForeground(new java.awt.Color(255, 255, 255));
        perdetailbtn.setText("Edit Personal Details");
        perdetailbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perdetailbtnActionPerformed(evt);
            }
        });
        jPanel1.add(perdetailbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 200, -1));

        jButton2.setBackground(new java.awt.Color(255, 51, 51));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Display Marks");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, 200, -1));

        jButton3.setBackground(new java.awt.Color(255, 51, 51));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Apply For Company");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 360, 200, -1));

        jButton4.setBackground(new java.awt.Color(255, 51, 51));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("SIGN OUT");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 490, 110, -1));

        checkresultbtn.setBackground(new java.awt.Color(255, 51, 51));
        checkresultbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        checkresultbtn.setForeground(new java.awt.Color(255, 255, 255));
        checkresultbtn.setText("Check Result");
        checkresultbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkresultbtnActionPerformed(evt);
            }
        });
        jPanel1.add(checkresultbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, 200, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 567, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void perdetailbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perdetailbtnActionPerformed
        new editperdetails().setVisible(true);
    }//GEN-LAST:event_perdetailbtnActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        new thanks().setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new applyCompany().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new displaymarks().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void checkresultbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkresultbtnActionPerformed
        new checkres().setVisible(true);
    }//GEN-LAST:event_checkresultbtnActionPerformed

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
            java.util.logging.Logger.getLogger(WelcomeStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WelcomeStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WelcomeStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WelcomeStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WelcomeStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton checkresultbtn;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton perdetailbtn;
    public javax.swing.JLabel prnlbl;
    public javax.swing.JLabel welcomelbl;
    // End of variables declaration//GEN-END:variables

}