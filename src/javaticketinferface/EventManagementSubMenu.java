package javaticketinferface;

import javax.swing.JOptionPane;

/** @author Joe Corrales */
public class EventManagementSubMenu extends javax.swing.JFrame {

    public EventManagementSubMenu() {
        initComponents();
        this.setTitle("Event Management Menu");
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnPrincipalMenu = new javax.swing.JButton();
        btnCreateEvent = new javax.swing.JButton();
        btnDeleteEvent = new javax.swing.JButton();
        btnEditEvent = new javax.swing.JButton();
        btnViewEvent = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(720, 690));
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(42, 40, 40));
        jPanel3.setMaximumSize(new java.awt.Dimension(720, 690));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Event Management Menu");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 24, -1, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Options:");

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

        btnCreateEvent.setBackground(new java.awt.Color(51, 51, 51));
        btnCreateEvent.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        btnCreateEvent.setForeground(new java.awt.Color(255, 255, 255));
        btnCreateEvent.setText("Create Event");
        btnCreateEvent.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCreateEvent.setFocusPainted(false);
        btnCreateEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateEventActionPerformed(evt);
            }
        });

        btnDeleteEvent.setBackground(new java.awt.Color(51, 51, 51));
        btnDeleteEvent.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        btnDeleteEvent.setForeground(new java.awt.Color(255, 255, 255));
        btnDeleteEvent.setText("Delete Event");
        btnDeleteEvent.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDeleteEvent.setFocusPainted(false);
        btnDeleteEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteEventActionPerformed(evt);
            }
        });

        btnEditEvent.setBackground(new java.awt.Color(51, 51, 51));
        btnEditEvent.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        btnEditEvent.setForeground(new java.awt.Color(255, 255, 255));
        btnEditEvent.setText("Edit Event");
        btnEditEvent.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditEvent.setFocusPainted(false);
        btnEditEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditEventActionPerformed(evt);
            }
        });

        btnViewEvent.setBackground(new java.awt.Color(51, 51, 51));
        btnViewEvent.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        btnViewEvent.setForeground(new java.awt.Color(255, 255, 255));
        btnViewEvent.setText("View Event");
        btnViewEvent.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnViewEvent.setFocusPainted(false);
        btnViewEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewEventActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(btnCreateEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeleteEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnViewEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPrincipalMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(196, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jLabel2)
                .addGap(12, 12, 12)
                .addComponent(btnCreateEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btnDeleteEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btnEditEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btnViewEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btnPrincipalMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPrincipalMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrincipalMenuActionPerformed
        PrincipalMenu menu = new PrincipalMenu();
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnPrincipalMenuActionPerformed

    private void btnCreateEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateEventActionPerformed
        if (hasAccess()) {
            CreateEvent cevent = new CreateEvent();
            cevent.setVisible(true);
            this.setVisible(false);
        } else JOptionPane.showMessageDialog(this, "You can't do this action!");
    }//GEN-LAST:event_btnCreateEventActionPerformed

    private void btnDeleteEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteEventActionPerformed
        if (hasAccess()) {
            DeleteEvent delete = new DeleteEvent();
            delete.setVisible(true);
            this.setVisible(false);
        } else JOptionPane.showMessageDialog(this, "You can't do this action!");
    }//GEN-LAST:event_btnDeleteEventActionPerformed

    private void btnEditEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditEventActionPerformed
        if (hasAccess()) {
            EditEvent edit = new EditEvent();
            edit.setVisible(true);
            this.setVisible(false);
        } else JOptionPane.showMessageDialog(this, "You can't do this action!");
    }//GEN-LAST:event_btnEditEventActionPerformed

    private void btnViewEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewEventActionPerformed
       ViewEvent menu = new ViewEvent();
       menu.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_btnViewEventActionPerformed

    private boolean hasAccess() {
        return (Login.userLogged instanceof Admin || Login.userLogged instanceof ContentUser);
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
            java.util.logging.Logger.getLogger(EventManagementSubMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EventManagementSubMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EventManagementSubMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EventManagementSubMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EventManagementSubMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateEvent;
    private javax.swing.JButton btnDeleteEvent;
    private javax.swing.JButton btnEditEvent;
    private javax.swing.JButton btnPrincipalMenu;
    private javax.swing.JButton btnViewEvent;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
