package javaticketinferface;

/** @author Joe Corrales */
public class UserManagementSubMenu extends javax.swing.JFrame {

    
    public UserManagementSubMenu() {
        initComponents();
        this.setTitle("User Management Menu");
        this.setLocationRelativeTo(null);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnCreateUser = new javax.swing.JButton();
        btnDeleteUser = new javax.swing.JButton();
        btnEditEvent = new javax.swing.JButton();
        btnPrincipalMenu = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(42, 40, 40));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("User Management Menu");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 100));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Options:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, -1, -1));

        btnCreateUser.setBackground(new java.awt.Color(51, 51, 51));
        btnCreateUser.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        btnCreateUser.setForeground(new java.awt.Color(255, 255, 255));
        btnCreateUser.setText("Create User");
        btnCreateUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCreateUser.setFocusPainted(false);
        btnCreateUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateUserActionPerformed(evt);
            }
        });
        jPanel1.add(btnCreateUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 320, 90));

        btnDeleteUser.setBackground(new java.awt.Color(51, 51, 51));
        btnDeleteUser.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        btnDeleteUser.setForeground(new java.awt.Color(255, 255, 255));
        btnDeleteUser.setText("Delete User");
        btnDeleteUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDeleteUser.setFocusPainted(false);
        btnDeleteUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteUserActionPerformed(evt);
            }
        });
        jPanel1.add(btnDeleteUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 430, 320, 90));

        btnEditEvent.setBackground(new java.awt.Color(51, 51, 51));
        btnEditEvent.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        btnEditEvent.setForeground(new java.awt.Color(255, 255, 255));
        btnEditEvent.setText("Edit User");
        btnEditEvent.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditEvent.setFocusPainted(false);
        btnEditEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditEventActionPerformed(evt);
            }
        });
        jPanel1.add(btnEditEvent, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, 320, 90));

        btnPrincipalMenu.setBackground(new java.awt.Color(51, 51, 51));
        btnPrincipalMenu.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        btnPrincipalMenu.setForeground(new java.awt.Color(255, 255, 255));
        btnPrincipalMenu.setText("Principal Menu");
        btnPrincipalMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPrincipalMenu.setFocusPainted(false);
        btnPrincipalMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrincipalMenuActionPerformed(evt);
            }
        });
        jPanel1.add(btnPrincipalMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 530, 320, 90));
        jPanel1.add(filler1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 620, 20, 110));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 727, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateUserActionPerformed
        CreateUser create = new CreateUser();
        create.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCreateUserActionPerformed

    private void btnDeleteUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteUserActionPerformed
        DeleteUser delete = new DeleteUser();
        delete.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnDeleteUserActionPerformed

    private void btnEditEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditEventActionPerformed
        EditUser edit = new EditUser();
        edit.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnEditEventActionPerformed

    private void btnPrincipalMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrincipalMenuActionPerformed
        PrincipalMenu menu = new PrincipalMenu();
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnPrincipalMenuActionPerformed

    
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
            java.util.logging.Logger.getLogger(UserManagementSubMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserManagementSubMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserManagementSubMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserManagementSubMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserManagementSubMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateUser;
    private javax.swing.JButton btnDeleteUser;
    private javax.swing.JButton btnEditEvent;
    private javax.swing.JButton btnPrincipalMenu;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
