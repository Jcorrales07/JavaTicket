package javaticketinferface;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Corra
 */
public class ListEvents extends javax.swing.JFrame {

    public ListEvents() {
        initComponents();
        this.setTitle("List Events");
        this.setLocationRelativeTo(null);
        this.listAllEvents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtEvents = new javax.swing.JTextArea();
        txtSport = new javax.swing.JTextField();
        txtReligious = new javax.swing.JTextField();
        txtMusical = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt$Sport = new javax.swing.JTextField();
        txt$Musical = new javax.swing.JTextField();
        txt$Religious = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnPrincipalMenu = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(42, 40, 40));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("List events");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 100));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, -1, -1));

        txtEvents.setEditable(false);
        txtEvents.setBackground(new java.awt.Color(102, 102, 102));
        txtEvents.setColumns(20);
        txtEvents.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        txtEvents.setForeground(new java.awt.Color(255, 255, 255));
        txtEvents.setRows(5);
        txtEvents.setFocusable(false);
        jScrollPane1.setViewportView(txtEvents);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 900, 440));

        txtSport.setEditable(false);
        txtSport.setBackground(new java.awt.Color(102, 102, 102));
        txtSport.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtSport.setForeground(new java.awt.Color(255, 255, 255));
        txtSport.setFocusable(false);
        jPanel1.add(txtSport, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 660, 280, 50));

        txtReligious.setEditable(false);
        txtReligious.setBackground(new java.awt.Color(102, 102, 102));
        txtReligious.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtReligious.setForeground(new java.awt.Color(255, 255, 255));
        txtReligious.setFocusable(false);
        jPanel1.add(txtReligious, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 660, 280, 50));

        txtMusical.setEditable(false);
        txtMusical.setBackground(new java.awt.Color(102, 102, 102));
        txtMusical.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtMusical.setForeground(new java.awt.Color(255, 255, 255));
        txtMusical.setFocusable(false);
        jPanel1.add(txtMusical, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 660, 280, 50));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Religious:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 620, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Musical:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 620, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Income generated:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 740, 270, -1));

        txt$Sport.setEditable(false);
        txt$Sport.setBackground(new java.awt.Color(102, 102, 102));
        txt$Sport.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txt$Sport.setForeground(new java.awt.Color(255, 255, 255));
        txt$Sport.setFocusable(false);
        jPanel1.add(txt$Sport, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 780, 280, 50));

        txt$Musical.setEditable(false);
        txt$Musical.setBackground(new java.awt.Color(102, 102, 102));
        txt$Musical.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txt$Musical.setForeground(new java.awt.Color(255, 255, 255));
        txt$Musical.setFocusable(false);
        jPanel1.add(txt$Musical, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 780, 280, 50));

        txt$Religious.setEditable(false);
        txt$Religious.setBackground(new java.awt.Color(102, 102, 102));
        txt$Religious.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txt$Religious.setForeground(new java.awt.Color(255, 255, 255));
        txt$Religious.setFocusable(false);
        jPanel1.add(txt$Religious, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 780, 280, 50));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Sport:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 620, -1, -1));

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
        jPanel1.add(btnPrincipalMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 850, 430, 90));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Income generated:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 740, 270, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Income generated:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 740, 270, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 979, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 976, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPrincipalMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrincipalMenuActionPerformed
        ReportsSubMenu menu = new ReportsSubMenu();
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnPrincipalMenuActionPerformed

    
    private void listAllEvents() {
        Date today = new Date();
        int sport = 0, $sport = 0;
        int musical = 0, $musical = 0;
        int religious = 0, $religious = 0;
        int i = 1;
        String events = "";
        for (Event event : Event.events) {
            if(event.getDate().compareTo(today) < 0) {
                events += ("["+i+"]. Event ID: "+event.getId()+" \t\nType: "
                        + event.getClass().getSimpleName()+" \t\nTitle: "
                        + event.getTitle()+" \t\nDate: "
                        + event.getDate().toString()+" \t\nAmount: "
                        + event.getRentAmount()+"\n\n");
                i++;
                if(event instanceof SportEvent) {
                    sport++;
                    $sport += event.getRentAmount();
                } if(event instanceof MusicalEvent) {
                    musical++;
                    $musical += event.getRentAmount();
                } if(event instanceof ReligiousEvent) {
                    religious++;
                    $religious += event.getRentAmount();
                }
            }
        }
        txtEvents.setText(events);
        txtSport.setText(sport+"");
        txtMusical.setText(musical+"");
        txtReligious.setText(religious+"");
        txt$Sport.setText($sport+"$");
        txt$Musical.setText($musical+"$");
        txt$Religious.setText($religious+"$");
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
            java.util.logging.Logger.getLogger(ListEvents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListEvents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListEvents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListEvents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListEvents().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPrincipalMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField txt$Musical;
    private javax.swing.JTextField txt$Religious;
    private javax.swing.JTextField txt$Sport;
    private javax.swing.JTextArea txtEvents;
    private javax.swing.JTextField txtMusical;
    private javax.swing.JTextField txtReligious;
    private javax.swing.JTextField txtSport;
    // End of variables declaration//GEN-END:variables
}
