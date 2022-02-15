package javaticketinferface;

import javax.swing.JOptionPane;

/**
 *
 * @author Corra
 */
public class ViewEvent extends javax.swing.JFrame {

    /**
     * Creates new form viewEvent
     */
    public ViewEvent() {
        initComponents();
        this.setTitle("View Event");
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnSearchID = new javax.swing.JButton();
        txtEventId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtEventsDetails = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        btnGoBack = new javax.swing.JButton();

        jToolBar1.setRollover(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(42, 40, 40));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("View an Event");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, -1, -1));

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 100));

        btnSearchID.setBackground(new java.awt.Color(51, 51, 51));
        btnSearchID.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnSearchID.setForeground(new java.awt.Color(255, 255, 255));
        btnSearchID.setText("Search ID");
        btnSearchID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchIDActionPerformed(evt);
            }
        });
        jPanel3.add(btnSearchID, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, 280, 50));

        txtEventId.setBackground(new java.awt.Color(102, 102, 102));
        txtEventId.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        txtEventId.setForeground(new java.awt.Color(255, 255, 255));
        txtEventId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEventIdActionPerformed(evt);
            }
        });
        jPanel3.add(txtEventId, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 300, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Details: ");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, -1));

        txtEventsDetails.setEditable(false);
        txtEventsDetails.setBackground(new java.awt.Color(102, 102, 102));
        txtEventsDetails.setColumns(20);
        txtEventsDetails.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtEventsDetails.setForeground(new java.awt.Color(255, 255, 255));
        txtEventsDetails.setRows(5);
        jScrollPane1.setViewportView(txtEventsDetails);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 620, 440));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Event's Code: ");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        btnGoBack.setBackground(new java.awt.Color(51, 51, 51));
        btnGoBack.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        btnGoBack.setForeground(new java.awt.Color(255, 255, 255));
        btnGoBack.setText("Go Back");
        btnGoBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoBackActionPerformed(evt);
            }
        });
        btnGoBack.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnGoBackKeyPressed(evt);
            }
        });
        jPanel3.add(btnGoBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 760, 210, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 723, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 869, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchIDActionPerformed
        int id = Integer.parseInt(txtEventId.getText());
        if (searchEventId(id) != null) {
            txtEventsDetails.setText(searchEventId(id).toString());
        } else JOptionPane.showMessageDialog(this, "It doesn't exists!");
    }//GEN-LAST:event_btnSearchIDActionPerformed

    private void txtEventIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEventIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEventIdActionPerformed

    private void btnGoBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoBackActionPerformed
        PrincipalMenu menu = new PrincipalMenu();
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnGoBackActionPerformed

    private void btnGoBackKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnGoBackKeyPressed
        PrincipalMenu menu = new PrincipalMenu();
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnGoBackKeyPressed

    public Event searchEventId(int id) {
        for(Event event : Event.events) {
            if (event.getId() == id) 
                return event;
        }
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
            java.util.logging.Logger.getLogger(ViewEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewEvent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGoBack;
    private javax.swing.JButton btnSearchID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTextField txtEventId;
    private javax.swing.JTextArea txtEventsDetails;
    // End of variables declaration//GEN-END:variables
}
