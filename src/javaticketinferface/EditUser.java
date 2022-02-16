package javaticketinferface;

import javax.swing.JOptionPane;

/** @author Joe Corrales */
public class EditUser extends javax.swing.JFrame {

    /**
     * Creates new form EditUser
     */
    public EditUser() {
        initComponents();
        this.setTitle("Edit User");
        this.setLocationRelativeTo(null);
    }
    CreateUser cFunc = new CreateUser();
    UserManagementSubMenu UserMenu = new UserManagementSubMenu();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtUserID = new javax.swing.JTextField();
        btnGoBack = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        btnEditUser = new javax.swing.JButton();
        btnSearchUser = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(42, 40, 40));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Edit a user");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 100));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ID: ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, -1, -1));

        txtUserID.setBackground(new java.awt.Color(102, 102, 102));
        txtUserID.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtUserID.setForeground(new java.awt.Color(255, 255, 255));
        txtUserID.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        txtUserID.setSelectionColor(new java.awt.Color(0, 0, 0));
        txtUserID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserIDActionPerformed(evt);
            }
        });
        txtUserID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUserIDKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUserIDKeyTyped(evt);
            }
        });
        jPanel1.add(txtUserID, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 200, 50));

        btnGoBack.setBackground(new java.awt.Color(51, 51, 51));
        btnGoBack.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        btnGoBack.setForeground(new java.awt.Color(255, 255, 255));
        btnGoBack.setText("Go Back");
        btnGoBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnGoBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 680, 170, 50));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Please type the number id of the user to edit it");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, -1, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Complete Name: ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, -1, -1));

        txtName.setBackground(new java.awt.Color(102, 102, 102));
        txtName.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtName.setForeground(new java.awt.Color(255, 255, 255));
        txtName.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        txtName.setSelectionColor(new java.awt.Color(0, 0, 0));
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 420, 50));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Username: ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, -1, -1));

        txtUsername.setBackground(new java.awt.Color(102, 102, 102));
        txtUsername.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtUsername.setForeground(new java.awt.Color(255, 255, 255));
        txtUsername.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        txtUsername.setSelectionColor(new java.awt.Color(0, 0, 0));
        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });
        txtUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUsernameKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUsernameKeyTyped(evt);
            }
        });
        jPanel1.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, 420, 50));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password: ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 450, -1, -1));

        txtPassword.setBackground(new java.awt.Color(102, 102, 102));
        txtPassword.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(255, 255, 255));
        txtPassword.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        txtPassword.setSelectionColor(new java.awt.Color(0, 0, 0));
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 490, 420, 50));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Age: ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 550, -1, -1));

        txtAge.setBackground(new java.awt.Color(102, 102, 102));
        txtAge.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtAge.setForeground(new java.awt.Color(255, 255, 255));
        txtAge.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        txtAge.setSelectionColor(new java.awt.Color(0, 0, 0));
        txtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeActionPerformed(evt);
            }
        });
        jPanel1.add(txtAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 590, 420, 50));

        btnEditUser.setBackground(new java.awt.Color(51, 51, 51));
        btnEditUser.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        btnEditUser.setForeground(new java.awt.Color(255, 255, 255));
        btnEditUser.setText("Edit");
        btnEditUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditUserActionPerformed(evt);
            }
        });
        jPanel1.add(btnEditUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 680, 170, 50));

        btnSearchUser.setBackground(new java.awt.Color(51, 51, 51));
        btnSearchUser.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        btnSearchUser.setForeground(new java.awt.Color(255, 255, 255));
        btnSearchUser.setText("Search ID");
        btnSearchUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchUserActionPerformed(evt);
            }
        });
        jPanel1.add(btnSearchUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, 180, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 787, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUserIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserIDActionPerformed

    }//GEN-LAST:event_txtUserIDActionPerformed

    private void txtUserIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserIDKeyPressed

    }//GEN-LAST:event_txtUserIDKeyPressed

    private void txtUserIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserIDKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserIDKeyTyped

    private void btnGoBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoBackActionPerformed
        UserMenu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnGoBackActionPerformed

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed

    }//GEN-LAST:event_txtUsernameActionPerformed

    private void txtUsernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsernameKeyPressed

    }//GEN-LAST:event_txtUsernameKeyPressed

    private void txtUsernameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsernameKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameKeyTyped

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeActionPerformed

    private void btnEditUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditUserActionPerformed
        editUser();
        JOptionPane.showMessageDialog(this, "User has been edited!");
        UserMenu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnEditUserActionPerformed

    private void btnSearchUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchUserActionPerformed
        int id = Integer.parseInt(txtUserID.getText());
        if(searchUserId(id) != null) {
            txtName.setText(searchUserId(id).getName());
            txtUsername.setText(searchUserId(id).getUsername());
            txtPassword.setText(searchUserId(id).getPassword());
            txtAge.setText(String.valueOf(searchUserId(id).getAge()));
        }
    }//GEN-LAST:event_btnSearchUserActionPerformed
    
    private void editUser() {
        int id = Integer.parseInt(txtUserID.getText());
        if(searchUserId(id) != null) {
            String name = txtName.getText();
            searchUserId(id).setName(name);
            String username = txtUsername.getText();
            searchUserId(id).setUsername(username);
            String password = txtPassword.getText();
            searchUserId(id).setPassword(password);
            int age = Integer.parseInt(txtAge.getText()); 
            if (cFunc.verifyAge(age)) searchUserId(id).setAge(age);
        }
    }
    
    public User searchUserId(int id) {
        for (User user: User.users) 
            if (user.getId() == id) 
                return user;
        JOptionPane.showConfirmDialog(this, "User not found");
        return null;
    }
    
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
            java.util.logging.Logger.getLogger(EditUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditUser;
    private javax.swing.JButton btnGoBack;
    private javax.swing.JButton btnSearchUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserID;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
