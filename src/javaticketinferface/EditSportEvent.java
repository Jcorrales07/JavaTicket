package javaticketinferface;

import javaticketinferface.SportEvent.Sports;
import javax.swing.JOptionPane;

/** @author Joe Corrales */
public class EditSportEvent extends javax.swing.JFrame {
    CreateEvent func = new CreateEvent();
    CreateSportEvent cse = new CreateSportEvent();
   
    public EditSportEvent() {
        initComponents();
        this.setTitle("Edit Sport Event");
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
        btnEditEvent = new javax.swing.JButton();
        btnGoBack = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtNameTeam1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtNameTeam2 = new javax.swing.JTextField();
        cbSport = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0));
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0));
        btnPlayers2 = new javax.swing.JButton();
        btnPlayers1 = new javax.swing.JButton();
        btnSearchId = new javax.swing.JButton();
        eventDate = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(42, 40, 40));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtDescription.setBackground(new java.awt.Color(102, 102, 102));
        txtDescription.setColumns(20);
        txtDescription.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        txtDescription.setForeground(new java.awt.Color(255, 255, 255));
        txtDescription.setRows(5);
        jScrollPane1.setViewportView(txtDescription);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 670, 680, 200));

        txtMoneyAmount.setBackground(new java.awt.Color(102, 102, 102));
        txtMoneyAmount.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        txtMoneyAmount.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtMoneyAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 580, 680, 50));

        txtTitle.setBackground(new java.awt.Color(102, 102, 102));
        txtTitle.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        txtTitle.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 680, 50));

        txtCode.setBackground(new java.awt.Color(102, 102, 102));
        txtCode.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        txtCode.setForeground(new java.awt.Color(255, 255, 255));
        txtCode.setToolTipText("");
        jPanel1.add(txtCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 320, 50));

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
        jLabel6.setText("Edit a Sport Event");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 100));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 23)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Amount: ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 540, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 23)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Event's Description: ");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 640, -1, -1));

        btnEditEvent.setBackground(new java.awt.Color(51, 51, 51));
        btnEditEvent.setFont(new java.awt.Font("Segoe UI", 0, 27)); // NOI18N
        btnEditEvent.setForeground(new java.awt.Color(255, 255, 255));
        btnEditEvent.setText("Edit Event");
        btnEditEvent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditEventMouseClicked(evt);
            }
        });
        btnEditEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditEventActionPerformed(evt);
            }
        });
        btnEditEvent.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnEditEventKeyPressed(evt);
            }
        });
        jPanel1.add(btnEditEvent, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 1020, 210, 50));

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
        jPanel1.add(btnGoBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 1020, 210, 50));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 23)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Name team 1");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 450, -1, -1));

        txtNameTeam1.setBackground(new java.awt.Color(102, 102, 102));
        txtNameTeam1.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        txtNameTeam1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtNameTeam1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 480, 210, 50));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 23)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Name team 2");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 450, -1, -1));

        txtNameTeam2.setBackground(new java.awt.Color(102, 102, 102));
        txtNameTeam2.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        txtNameTeam2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtNameTeam2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 480, 220, 50));

        cbSport.setBackground(new java.awt.Color(102, 102, 102));
        cbSport.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        cbSport.setForeground(new java.awt.Color(255, 255, 255));
        cbSport.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select an option", "1. Football", "2. Tennis", "3. Rugby", "4. Baseball" }));
        cbSport.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(cbSport, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 480, 210, 50));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 23)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Type of sport:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 450, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Please insert the date in numbers:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, -1, -1));
        jPanel1.add(filler1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 180, 70, -1));
        jPanel1.add(filler2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 960, -1, 60));

        btnPlayers2.setBackground(new java.awt.Color(51, 51, 51));
        btnPlayers2.setFont(new java.awt.Font("Segoe UI", 0, 34)); // NOI18N
        btnPlayers2.setForeground(new java.awt.Color(255, 255, 255));
        btnPlayers2.setText("Players: Team 2");
        btnPlayers2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlayers2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnPlayers2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 890, 330, 100));

        btnPlayers1.setBackground(new java.awt.Color(51, 51, 51));
        btnPlayers1.setFont(new java.awt.Font("Segoe UI", 0, 34)); // NOI18N
        btnPlayers1.setForeground(new java.awt.Color(255, 255, 255));
        btnPlayers1.setText("Players: Team 1 ");
        btnPlayers1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlayers1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnPlayers1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 890, 330, 100));

        btnSearchId.setBackground(new java.awt.Color(51, 51, 51));
        btnSearchId.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnSearchId.setForeground(new java.awt.Color(255, 255, 255));
        btnSearchId.setText("Search ID");
        btnSearchId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchIdActionPerformed(evt);
            }
        });
        btnSearchId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnSearchIdKeyPressed(evt);
            }
        });
        jPanel1.add(btnSearchId, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 160, 330, 50));

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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1102, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditEventActionPerformed
    }//GEN-LAST:event_btnEditEventActionPerformed

    private void btnEditEventKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnEditEventKeyPressed
        func.goBack();
        this.setVisible(false);
    }//GEN-LAST:event_btnEditEventKeyPressed

    private void btnGoBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoBackActionPerformed
        func.goBack();
        this.setVisible(false);
    }//GEN-LAST:event_btnGoBackActionPerformed

    private void btnGoBackKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnGoBackKeyPressed
        func.goBack();
        this.setVisible(false);
    }//GEN-LAST:event_btnGoBackKeyPressed

    private void btnSearchIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchIdActionPerformed
        int code = Integer.parseInt(txtCode.getText());
        putDetails(code);
    }//GEN-LAST:event_btnSearchIdActionPerformed

    private void btnPlayers1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayers1ActionPerformed
        int code = Integer.parseInt(txtCode.getText());
        if (searchId(code) != null) {
            int amount = Integer.parseInt(JOptionPane.showInputDialog("Insert the number of players: "));
            SportEvent e = (SportEvent) searchId(code);
            for (int i = 0; i < amount; i++) {
                String name = JOptionPane.showInputDialog("Name of Player #"+(i+1)+": ");
                e.getTplayers1().add(name);
            }
        }
    }//GEN-LAST:event_btnPlayers1ActionPerformed

    private void btnSearchIdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnSearchIdKeyPressed
        int code = Integer.parseInt(txtCode.getText());
        putDetails(code);
    }//GEN-LAST:event_btnSearchIdKeyPressed

    private void btnPlayers2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayers2ActionPerformed
        int code = Integer.parseInt(txtCode.getText());
        if (searchId(code) != null) {
            int amount = Integer.parseInt(JOptionPane.showInputDialog("Insert the number of players: "));
            SportEvent e = (SportEvent) searchId(code);
            for (int i = 0; i < amount; i++) {
                String name = JOptionPane.showInputDialog("Name of Player #"+(i+1)+": ");
                e.getTplayers2().add(name);
            }
        }
    }//GEN-LAST:event_btnPlayers2ActionPerformed

    private void btnEditEventMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditEventMouseClicked
        int code = Integer.parseInt(txtCode.getText());
        editEvent(code);
    }//GEN-LAST:event_btnEditEventMouseClicked
    
    public Event searchId(int code) {
        for (Event event : Event.events) {
            if(event.getId() == code && event instanceof SportEvent) { 
                return event;
            }
        }
        JOptionPane.showConfirmDialog(this, "Event not found");
        return null;
    }
    
    private void putDetails(int code) {
        if (searchId(code) != null) {
            SportEvent e = (SportEvent) searchId(code);
            txtTitle.setText(e.getTitle());
            eventDate.setDate(e.getDate());
            txtNameTeam1.setText(e.getTeam1());
            txtNameTeam2.setText(e.getTeam2());
            cbSport.setSelectedIndex(index(e.getSportType()));
            txtMoneyAmount.setText(String.valueOf(e.getRentAmount()));
            txtDescription.setText(e.getDescription());
        }
    }
    
    private int index(Sports sport) {
        switch(sport) {
            case FOOTBALL: return 1;
            case TENNIS: return 2;
            case RUGBY: return 3;
            case BASEBALL: return 4;
            default: return 0;
        }
    }
    
    private void editEvent(int code) {
        if (searchId(code) != null) {
            SportEvent e = (SportEvent) searchId(code);
            String title = txtTitle.getText();
            e.setTitle(title);
            e.setDate(eventDate.getDate());
            String team1 = txtNameTeam1.getText();
            e.setTeam1(team1);
            String team2 = txtNameTeam2.getText();
            e.setTeam2(team2);
            int type = cbSport.getSelectedIndex();
            Sports sportType = cse.sportType(type);
            e.setSportType(sportType);
            double money = Double.parseDouble(txtMoneyAmount.getText());
            e.setRentAmount(money);
            String desc = txtDescription.getText();
            e.setDescription(desc);
            JOptionPane.showMessageDialog(func, "Action completed");
        }
    }
    
    
    
//    private Event searchEventId(int id) {
//        for (Event event : Event.events)
//            if (event.getId() == id)
//                return event;
//        return null;
//    }
    
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
            java.util.logging.Logger.getLogger(EditSportEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditSportEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditSportEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditSportEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditSportEvent().setVisible(true);
            }      
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditEvent;
    private javax.swing.JButton btnGoBack;
    private javax.swing.JButton btnPlayers1;
    private javax.swing.JButton btnPlayers2;
    private javax.swing.JButton btnSearchId;
    private javax.swing.JComboBox<String> cbSport;
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
