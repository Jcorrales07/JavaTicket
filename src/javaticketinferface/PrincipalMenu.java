package javaticketinferface;

import javax.swing.JOptionPane;

/** @author Joe Corrales */
public class PrincipalMenu extends javax.swing.JFrame {

    public PrincipalMenu() {
        initComponents();
        this.setTitle("Welcome - Principal Menu");
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnEvntManage = new javax.swing.JButton();
        btnReports = new javax.swing.JButton();
        btnUsrManage = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnLogOut = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Principal Menu");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 100));

        jPanel3.setBackground(new java.awt.Color(42, 40, 40));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEvntManage.setBackground(new java.awt.Color(51, 51, 51));
        btnEvntManage.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btnEvntManage.setForeground(new java.awt.Color(255, 255, 255));
        btnEvntManage.setText("Event Management");
        btnEvntManage.setFocusPainted(false);
        btnEvntManage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEvntManageActionPerformed(evt);
            }
        });
        jPanel3.add(btnEvntManage, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 402, 84));

        btnReports.setBackground(new java.awt.Color(51, 51, 51));
        btnReports.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btnReports.setForeground(new java.awt.Color(255, 255, 255));
        btnReports.setText("Reports");
        btnReports.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportsActionPerformed(evt);
            }
        });
        jPanel3.add(btnReports, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 402, 84));

        btnUsrManage.setBackground(new java.awt.Color(51, 51, 51));
        btnUsrManage.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btnUsrManage.setForeground(new java.awt.Color(255, 255, 255));
        btnUsrManage.setText("User Management");
        btnUsrManage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsrManageActionPerformed(evt);
            }
        });
        jPanel3.add(btnUsrManage, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 402, 84));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Options:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, -1));

        btnLogOut.setBackground(new java.awt.Color(51, 51, 51));
        btnLogOut.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btnLogOut.setForeground(new java.awt.Color(255, 255, 255));
        btnLogOut.setText("Log out");
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });
        jPanel3.add(btnLogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, 402, 84));

        btnExit.setBackground(new java.awt.Color(51, 51, 51));
        btnExit.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setText("EXIT");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        jPanel3.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 480, 402, 84));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 720, 630));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 720, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 732, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        Login login = new Login();
        login.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void btnUsrManageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsrManageActionPerformed
        if(Login.userLogged instanceof Admin) {
            UserManagementSubMenu menu = new UserManagementSubMenu();
            menu.setVisible(true);
            this.setVisible(false);
        } else JOptionPane.showMessageDialog(this, "No mirrey, solo admins");
    }//GEN-LAST:event_btnUsrManageActionPerformed

    private void btnReportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportsActionPerformed
        ReportsSubMenu menu = new ReportsSubMenu();
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnReportsActionPerformed

    private void btnEvntManageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEvntManageActionPerformed
        EventManagementSubMenu menu = new EventManagementSubMenu();
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnEvntManageActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

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
            java.util.logging.Logger.getLogger(PrincipalMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEvntManage;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnReports;
    private javax.swing.JButton btnUsrManage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
