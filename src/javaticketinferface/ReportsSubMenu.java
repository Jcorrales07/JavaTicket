package javaticketinferface;

/** @author Joe Corrales */
public class ReportsSubMenu extends javax.swing.JFrame {

    public ReportsSubMenu() {
        initComponents();
        this.setTitle("Reports Menu");
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnListEvents = new javax.swing.JButton();
        btnListCancelledEvents = new javax.swing.JButton();
        btnMyProfile = new javax.swing.JButton();
        btnPrincipalMenu = new javax.swing.JButton();
        btnIncomeGenerated = new javax.swing.JButton();
        btnListFutureEvents = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(42, 40, 40));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Reports Menu");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 100));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Options:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, -1, -1));

        btnListEvents.setBackground(new java.awt.Color(51, 51, 51));
        btnListEvents.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        btnListEvents.setForeground(new java.awt.Color(255, 255, 255));
        btnListEvents.setText("List events");
        btnListEvents.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnListEvents.setFocusPainted(false);
        btnListEvents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListEventsActionPerformed(evt);
            }
        });
        jPanel1.add(btnListEvents, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 430, 90));

        btnListCancelledEvents.setBackground(new java.awt.Color(51, 51, 51));
        btnListCancelledEvents.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        btnListCancelledEvents.setForeground(new java.awt.Color(255, 255, 255));
        btnListCancelledEvents.setText("List cancelled events");
        btnListCancelledEvents.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnListCancelledEvents.setFocusPainted(false);
        btnListCancelledEvents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListCancelledEventsActionPerformed(evt);
            }
        });
        jPanel1.add(btnListCancelledEvents, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, 430, 90));

        btnMyProfile.setBackground(new java.awt.Color(51, 51, 51));
        btnMyProfile.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        btnMyProfile.setForeground(new java.awt.Color(255, 255, 255));
        btnMyProfile.setText("My Profile");
        btnMyProfile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMyProfile.setFocusPainted(false);
        btnMyProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMyProfileActionPerformed(evt);
            }
        });
        jPanel1.add(btnMyProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 580, 430, 90));

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
        jPanel1.add(btnPrincipalMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 680, 430, 90));

        btnIncomeGenerated.setBackground(new java.awt.Color(51, 51, 51));
        btnIncomeGenerated.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        btnIncomeGenerated.setForeground(new java.awt.Color(255, 255, 255));
        btnIncomeGenerated.setText("Income generated by date");
        btnIncomeGenerated.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIncomeGenerated.setFocusPainted(false);
        btnIncomeGenerated.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncomeGeneratedActionPerformed(evt);
            }
        });
        jPanel1.add(btnIncomeGenerated, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 480, 430, 90));

        btnListFutureEvents.setBackground(new java.awt.Color(51, 51, 51));
        btnListFutureEvents.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        btnListFutureEvents.setForeground(new java.awt.Color(255, 255, 255));
        btnListFutureEvents.setText("List future events");
        btnListFutureEvents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListFutureEventsActionPerformed(evt);
            }
        });
        jPanel1.add(btnListFutureEvents, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 430, 90));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 746, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 810, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnListEventsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListEventsActionPerformed
        ListEvents menu = new ListEvents();
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnListEventsActionPerformed

    private void btnListCancelledEventsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListCancelledEventsActionPerformed
        ListCancelledEvents menu = new ListCancelledEvents();
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnListCancelledEventsActionPerformed

    private void btnMyProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMyProfileActionPerformed
        MyProfile menu = new MyProfile();
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnMyProfileActionPerformed

    private void btnPrincipalMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrincipalMenuActionPerformed
        PrincipalMenu menu = new PrincipalMenu();
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnPrincipalMenuActionPerformed

    private void btnIncomeGeneratedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncomeGeneratedActionPerformed
        IncomeByDate menu = new IncomeByDate();
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnIncomeGeneratedActionPerformed

    private void btnListFutureEventsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListFutureEventsActionPerformed
        ListFutureEvents menu = new ListFutureEvents();
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnListFutureEventsActionPerformed

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
            java.util.logging.Logger.getLogger(ReportsSubMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReportsSubMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReportsSubMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReportsSubMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReportsSubMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIncomeGenerated;
    private javax.swing.JButton btnListCancelledEvents;
    private javax.swing.JButton btnListEvents;
    private javax.swing.JButton btnListFutureEvents;
    private javax.swing.JButton btnMyProfile;
    private javax.swing.JButton btnPrincipalMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
