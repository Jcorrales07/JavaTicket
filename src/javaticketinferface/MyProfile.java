package javaticketinferface;

/** @author Joe Corrales */
public class MyProfile extends javax.swing.JFrame {

    public MyProfile() {
        initComponents();
        this.setTitle("My Profile");
        this.setLocationRelativeTo(null);
        showMyProfile();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtEvents = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtProfile = new javax.swing.JTextArea();
        btnPrincipalMenu = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(42, 40, 40));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("My Profile");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 100));

        txtEvents.setEditable(false);
        txtEvents.setBackground(new java.awt.Color(102, 102, 102));
        txtEvents.setColumns(20);
        txtEvents.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtEvents.setForeground(new java.awt.Color(255, 255, 255));
        txtEvents.setRows(5);
        jScrollPane1.setViewportView(txtEvents);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 570, 750, 310));

        txtProfile.setEditable(false);
        txtProfile.setBackground(new java.awt.Color(102, 102, 102));
        txtProfile.setColumns(20);
        txtProfile.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtProfile.setForeground(new java.awt.Color(255, 255, 255));
        txtProfile.setRows(5);
        jScrollPane2.setViewportView(txtProfile);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 750, 310));

        btnPrincipalMenu.setBackground(new java.awt.Color(51, 51, 51));
        btnPrincipalMenu.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        btnPrincipalMenu.setForeground(new java.awt.Color(255, 255, 255));
        btnPrincipalMenu.setText("Go Back");
        btnPrincipalMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPrincipalMenu.setFocusPainted(false);
        btnPrincipalMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrincipalMenuActionPerformed(evt);
            }
        });
        jPanel1.add(btnPrincipalMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 900, 430, 90));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Events created:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 510, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Your data:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1009, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPrincipalMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrincipalMenuActionPerformed
        ReportsSubMenu menu = new ReportsSubMenu();
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnPrincipalMenuActionPerformed

    private void showMyProfile() {
        User UserG = Login.userLogged;
        String events = ""; int i = 1;
        if (UserG instanceof Admin) {
            Admin user = (Admin) UserG;
            txtProfile.setText(user.toString());
            if(user.eventIds.size() > 0) {
                for (Event event : user.eventIds) {
                    events += ("["+i+"]. Event ID: "+event.getId()
                            +"\nType: "+event.getClass().getSimpleName()
                            +"\nTitle: "+event.getTitle()
                            +"\nAmount: "+event.getRentAmount()+"$\n\n");
                }
                txtEvents.setText(events);
            } else txtEvents.setText("NO INFO");
        } else if (UserG instanceof ContentUser) {
            ContentUser user = (ContentUser) UserG;
            txtProfile.setText(user.toString());
            if(user.eventIds.size() > 0) {
                for (Event event : user.eventIds) {
                    events += ("["+i+"]. Event ID: "+event.getId()
                            +"\nType: "+event.getClass().getSimpleName()
                            +"\nTitle: "+event.getTitle()
                            +"\nAmount: "+event.getRentAmount()+"$\n\n");
                }
                txtEvents.setText(events);
            } else txtEvents.setText("NO INFO");
        } else if (UserG instanceof LimitedUser){
            LimitedUser user = (LimitedUser) UserG;
            txtProfile.setText(user.toString());
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
            java.util.logging.Logger.getLogger(MyProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MyProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MyProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MyProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyProfile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPrincipalMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea txtEvents;
    private javax.swing.JTextArea txtProfile;
    // End of variables declaration//GEN-END:variables
}
