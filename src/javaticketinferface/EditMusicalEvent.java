package javaticketinferface;

import javaticketinferface.MusicalEvent.Genre;
import javax.swing.JOptionPane;

public class EditMusicalEvent extends javax.swing.JFrame {
    EditEvent e = new EditEvent();
    CreateEvent func = new CreateEvent();
    CreateMusicalEvent cme = new CreateMusicalEvent();
    
    public EditMusicalEvent() {
        initComponents();
        this.setTitle("Edit Musical Event");
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
        cbGenre = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0));
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0));
        btnMusicTeam = new javax.swing.JButton();
        btnSearchID = new javax.swing.JButton();
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
        jLabel6.setText("Edit a Musical Event");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, -1, -1));

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
        jPanel1.add(btnEditEvent, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 980, 210, 50));

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
        jPanel1.add(btnGoBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 980, 210, 50));

        cbGenre.setBackground(new java.awt.Color(102, 102, 102));
        cbGenre.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        cbGenre.setForeground(new java.awt.Color(255, 255, 255));
        cbGenre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select an option", "1. Pop", "2. Rock", "3. Rap", "4. Classic", "5. Reggeaton", "6. Other" }));
        cbGenre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(cbGenre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 480, 680, 50));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 23)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Music Genre:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 450, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Please insert the date in numbers:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, -1, -1));
        jPanel1.add(filler1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 180, 70, -1));
        jPanel1.add(filler2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 960, -1, 60));

        btnMusicTeam.setBackground(new java.awt.Color(42, 40, 40));
        btnMusicTeam.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        btnMusicTeam.setForeground(new java.awt.Color(255, 255, 255));
        btnMusicTeam.setText("Equipment music team members");
        jPanel1.add(btnMusicTeam, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 890, 680, 60));

        btnSearchID.setBackground(new java.awt.Color(51, 51, 51));
        btnSearchID.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnSearchID.setForeground(new java.awt.Color(255, 255, 255));
        btnSearchID.setText("Search ID");
        btnSearchID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchIDActionPerformed(evt);
            }
        });
        jPanel1.add(btnSearchID, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 160, 330, 50));

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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1067, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditEventActionPerformed
        int code = Integer.parseInt(txtCode.getText());
        editEvent(code);
    }//GEN-LAST:event_btnEditEventActionPerformed

    private void btnEditEventKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnEditEventKeyPressed
        int code = Integer.parseInt(txtCode.getText());
        editEvent(code);
    }//GEN-LAST:event_btnEditEventKeyPressed

    private void btnGoBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoBackActionPerformed
        func.goBack();
        this.setVisible(false);
    }//GEN-LAST:event_btnGoBackActionPerformed

    private void btnGoBackKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnGoBackKeyPressed
        func.goBack();
        this.setVisible(false);
    }//GEN-LAST:event_btnGoBackKeyPressed

    private void btnSearchIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchIDActionPerformed
        int code = Integer.parseInt(txtCode.getText());
        putDetails(code);
    }//GEN-LAST:event_btnSearchIDActionPerformed
   
    //Non-Recursive
    public Event searchId(int code) {
        for (Event event : Event.events) {
            if(event.getId() == code && event instanceof MusicalEvent) { 
                return event;
            }
        }
        JOptionPane.showConfirmDialog(this, "Event not found");
        return null;
    }
    
    //Recursive
    public Event searchID(int code, int i) {
        Event event = Event.events.get(i);
        if(event.getId() == code && event instanceof MusicalEvent)
            return event;
        else searchID(code, i++);
        
        JOptionPane.showConfirmDialog(this, "Event not found");
        return null;
    }
    
    private void putDetails(int code) {
        if (searchId(code) != null) {
            MusicalEvent e = (MusicalEvent) searchId(code);
            txtTitle.setText(e.getTitle());
            eventDate.setDate(e.getDate());
            cbGenre.setSelectedIndex(index(e.getMusicGenre()));
            txtMoneyAmount.setText(String.valueOf(e.getRentAmount()));
            txtDescription.setText(e.getDescription());
            JOptionPane.showMessageDialog(this, "Now you can edit");
        }
    }
    
    private int index(Genre music) {
        switch(music) {
            case POP: return 1;
            case ROCK: return 2;
            case RAP: return 3;
            case CLASSIC: return 4;
            case REGGEATON: return 5;
            case OTHER: return 6;
            default: return 0;
        }
    }
    
    private void editEvent(int code) {
        if (searchId(code) != null) {
            MusicalEvent e = (MusicalEvent) searchId(code);
            String title = txtTitle.getText();
            e.setTitle(title);
            e.setDate(eventDate.getDate());
            int type = cbGenre.getSelectedIndex();
            Genre genreType = cme.musicType(type);
            e.setMusicGenre(genreType);
            double money = Double.parseDouble(txtMoneyAmount.getText());
            e.setRentAmount(money);
            String desc = txtDescription.getText();
            e.setDescription(desc);
            JOptionPane.showMessageDialog(func, "Action completed");
        }
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
            java.util.logging.Logger.getLogger(EditMusicalEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditMusicalEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditMusicalEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditMusicalEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditMusicalEvent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditEvent;
    private javax.swing.JButton btnGoBack;
    private javax.swing.JButton btnMusicTeam;
    private javax.swing.JButton btnSearchID;
    private javax.swing.JComboBox<String> cbGenre;
    private com.toedter.calendar.JDateChooser eventDate;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCode;
    private javax.swing.JTextArea txtDescription;
    private javax.swing.JTextField txtMoneyAmount;
    private javax.swing.JTextField txtTitle;
    // End of variables declaration//GEN-END:variables
}
