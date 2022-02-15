package javaticketinferface;

import java.util.Date;
import javaticketinferface.SportEvent.Sports;
import javax.swing.JOptionPane;

/** @author Joe Corrales */
public class CreateSportEvent extends javax.swing.JFrame {
    static int counter;
    Login f = new Login();
    CreateEvent func = new CreateEvent();
    
    public CreateSportEvent() {
        initComponents();
        this.setTitle("Create Sport Event");
        this.setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescription = new javax.swing.JTextArea();
        txtMoneyAmount = new javax.swing.JTextField();
        txtTitle = new javax.swing.JTextField();
        txtCode = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnCreateEvent = new javax.swing.JButton();
        btnGoBack = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtNameTeam1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtNameTeam2 = new javax.swing.JTextField();
        cbxSports = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0));
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0));
        eventDate = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(42, 40, 40));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtDescription.setBackground(new java.awt.Color(102, 102, 102));
        txtDescription.setColumns(20);
        txtDescription.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        txtDescription.setForeground(new java.awt.Color(255, 255, 255));
        txtDescription.setRows(5);
        jScrollPane1.setViewportView(txtDescription);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 660, 680, 200));

        txtMoneyAmount.setBackground(new java.awt.Color(102, 102, 102));
        txtMoneyAmount.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        txtMoneyAmount.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtMoneyAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 570, 680, 50));

        txtTitle.setBackground(new java.awt.Color(102, 102, 102));
        txtTitle.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        txtTitle.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 680, 50));

        txtCode.setEditable(false);
        txtCode.setBackground(new java.awt.Color(102, 102, 102));
        txtCode.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        txtCode.setForeground(new java.awt.Color(255, 255, 255));
        txtCode.setText(String.valueOf(CreateSportEvent.counter)
        );
        txtCode.setToolTipText("");
        jPanel1.add(txtCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 680, 50));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 23)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Event's Code: ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 23)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Event's Title: ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, -1, -1));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Sport Event");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 100));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 23)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Amount: ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 530, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 23)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Event's Description: ");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 630, -1, -1));

        btnCreateEvent.setBackground(new java.awt.Color(51, 51, 51));
        btnCreateEvent.setFont(new java.awt.Font("Segoe UI", 0, 27)); // NOI18N
        btnCreateEvent.setForeground(new java.awt.Color(255, 255, 255));
        btnCreateEvent.setText("Create Event");
        btnCreateEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateEventActionPerformed(evt);
            }
        });
        btnCreateEvent.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnCreateEventKeyPressed(evt);
            }
        });
        jPanel1.add(btnCreateEvent, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 900, 210, 50));

        btnGoBack.setBackground(new java.awt.Color(51, 51, 51));
        btnGoBack.setFont(new java.awt.Font("Segoe UI", 0, 27)); // NOI18N
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
        jPanel1.add(btnGoBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 900, 210, 50));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 23)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Name team 1");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 440, -1, -1));

        txtNameTeam1.setBackground(new java.awt.Color(102, 102, 102));
        txtNameTeam1.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        txtNameTeam1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtNameTeam1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 470, 210, 50));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 23)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Name team 2");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 440, -1, -1));

        txtNameTeam2.setBackground(new java.awt.Color(102, 102, 102));
        txtNameTeam2.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        txtNameTeam2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtNameTeam2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 470, 220, 50));

        cbxSports.setBackground(new java.awt.Color(102, 102, 102));
        cbxSports.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        cbxSports.setForeground(new java.awt.Color(255, 255, 255));
        cbxSports.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select an option", "1. Football", "2. Tennis", "3. Rugby", "4. Baseball" }));
        cbxSports.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(cbxSports, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 470, 210, 50));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 23)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Type of sport:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 440, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Please insert the date in numbers:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, -1, -1));
        jPanel1.add(filler1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 180, 70, -1));
        jPanel1.add(filler2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 960, -1, 60));

        eventDate.setBackground(new java.awt.Color(51, 51, 51));
        eventDate.setForeground(new java.awt.Color(255, 255, 255));
        eventDate.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jPanel1.add(eventDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, 680, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 819, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 999, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGoBackKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnGoBackKeyPressed
        func.goBack();
        this.setVisible(false);
    }//GEN-LAST:event_btnGoBackKeyPressed

    private void btnCreateEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateEventActionPerformed
        createEvent();
        func.goBack();
        this.setVisible(false);
    }//GEN-LAST:event_btnCreateEventActionPerformed

    private void btnCreateEventKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnCreateEventKeyPressed
        createEvent();
        func.goBack();
        this.setVisible(false);
    }//GEN-LAST:event_btnCreateEventKeyPressed

    private void btnGoBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoBackActionPerformed
        func.goBack();
        this.setVisible(false);        
    }//GEN-LAST:event_btnGoBackActionPerformed

    private void createEvent() {
        String username = Login.userLogged.getUsername();
        int id = CreateSportEvent.counter++;
        String title = txtTitle.getText();
        Date date = eventDate.getDate();
        String name1 = txtNameTeam1.getText();
        String name2 = txtNameTeam2.getText();
        int type = cbxSports.getSelectedIndex();
        Sports sportType = sportType(type);
        double amount = Double.parseDouble(txtMoneyAmount.getText());
        String desc = txtDescription.getText();
        SportEvent e = new SportEvent(id, title, desc, date, amount, name1, name2, sportType);
        System.out.println(e.toString());
        Event.events.add(e);
        addIdToList(username, e);
        JOptionPane.showMessageDialog(this, "Event created successfully!");
    }

    
    public void addIdToList(String username, Event e) {
        if(f.searchUser(username) instanceof Admin) {
            Admin user = (Admin)f.searchUser(username);
            user.eventIds.add(e);
        } else {
            ContentUser user = (ContentUser) f.searchUser(username);
            user.eventIds.add(e);
        } 
    }
    
    public Sports sportType(int type) {
        switch (type) {
            case 1: return Sports.FOOTBALL;
            case 2: return Sports.TENNIS;
            case 3: return Sports.RUGBY;
            case 4: return Sports.BASEBALL;
            default: return null;
        }
    }
    
    private final int time(int field) {
        if (field == 1) return 0;
        return field - 1;
    }
    
    private String isEmpty(String field, String message) {
        if (field.length() == 0) 
            JOptionPane.showMessageDialog(this, message);
        return field;
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
            java.util.logging.Logger.getLogger(CreateSportEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateSportEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateSportEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateSportEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateSportEvent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateEvent;
    private javax.swing.JButton btnGoBack;
    private javax.swing.JComboBox<String> cbxSports;
    private com.toedter.calendar.JDateChooser eventDate;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCode;
    private javax.swing.JTextArea txtDescription;
    private javax.swing.JTextField txtMoneyAmount;
    private javax.swing.JTextField txtNameTeam1;
    private javax.swing.JTextField txtNameTeam2;
    private javax.swing.JTextField txtTitle;
    // End of variables declaration//GEN-END:variables
}
