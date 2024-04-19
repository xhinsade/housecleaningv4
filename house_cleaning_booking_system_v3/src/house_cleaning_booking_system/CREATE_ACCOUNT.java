package house_cleaning_booking_system;


public class CREATE_ACCOUNT extends javax.swing.JFrame {

   
    public CREATE_ACCOUNT() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        ca_txtfullname = new javax.swing.JLabel();
        ca_txtusername = new javax.swing.JLabel();
        ca_txtpassword = new javax.swing.JLabel();
        ca_fullname = new javax.swing.JTextField();
        ca_username = new javax.swing.JTextField();
        ca_paasword = new javax.swing.JPasswordField();
        ca_createbutton = new javax.swing.JButton();
        ca_backbutton = new javax.swing.JButton();
        ca_txtemail = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        ca_txtemail1 = new javax.swing.JLabel();
        ca_phonenumber = new javax.swing.JTextField();
        ca_txtemail2 = new javax.swing.JLabel();
        ca_birthdate = new javax.swing.JTextField();
        ca_txtaddress = new javax.swing.JLabel();
        ca_address = new javax.swing.JPasswordField();
        ca_txtemail3 = new javax.swing.JLabel();
        ca_age = new javax.swing.JTextField();
        background = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CREATE ACCOUNT");
        jLabel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3), "HOUSE CLEANING BOOKING SYSTEM", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Serif", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 780, 100));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ca_txtfullname.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        ca_txtfullname.setForeground(new java.awt.Color(255, 255, 255));
        ca_txtfullname.setText("FULLNAME:");
        jPanel1.add(ca_txtfullname, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        ca_txtusername.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        ca_txtusername.setForeground(new java.awt.Color(255, 255, 255));
        ca_txtusername.setText("USERNAME:");
        jPanel1.add(ca_txtusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        ca_txtpassword.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        ca_txtpassword.setForeground(new java.awt.Color(255, 255, 255));
        ca_txtpassword.setText("PASSWORD:");
        jPanel1.add(ca_txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));
        jPanel1.add(ca_fullname, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 219, -1));
        jPanel1.add(ca_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 218, -1));
        jPanel1.add(ca_paasword, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 218, -1));

        ca_createbutton.setBackground(new java.awt.Color(255, 255, 255));
        ca_createbutton.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        ca_createbutton.setForeground(new java.awt.Color(51, 51, 51));
        ca_createbutton.setText("CREATE");
        ca_createbutton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ca_createbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ca_createbuttonActionPerformed(evt);
            }
        });
        jPanel1.add(ca_createbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 105, 30));

        ca_backbutton.setBackground(new java.awt.Color(255, 255, 255));
        ca_backbutton.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        ca_backbutton.setForeground(new java.awt.Color(51, 51, 51));
        ca_backbutton.setText("BACK");
        ca_backbutton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ca_backbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ca_backbuttonActionPerformed(evt);
            }
        });
        jPanel1.add(ca_backbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 270, 115, 30));

        ca_txtemail.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        ca_txtemail.setForeground(new java.awt.Color(255, 255, 255));
        ca_txtemail.setText("EMAIL:");
        jPanel1.add(ca_txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, 73, -1));
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, 183, -1));

        ca_txtemail1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        ca_txtemail1.setForeground(new java.awt.Color(255, 255, 255));
        ca_txtemail1.setText("PHONE NO:");
        jPanel1.add(ca_txtemail1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, 73, -1));
        jPanel1.add(ca_phonenumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, 183, -1));

        ca_txtemail2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        ca_txtemail2.setForeground(new java.awt.Color(255, 255, 255));
        ca_txtemail2.setText("AGE:");
        jPanel1.add(ca_txtemail2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, 73, -1));
        jPanel1.add(ca_birthdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, 183, -1));

        ca_txtaddress.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        ca_txtaddress.setForeground(new java.awt.Color(255, 255, 255));
        ca_txtaddress.setText("ADDRESS:");
        jPanel1.add(ca_txtaddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 186, -1, -1));
        jPanel1.add(ca_address, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 218, -1));

        ca_txtemail3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        ca_txtemail3.setForeground(new java.awt.Color(255, 255, 255));
        ca_txtemail3.setText("BIRTHDATE:");
        jPanel1.add(ca_txtemail3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, -1, -1));
        jPanel1.add(ca_age, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, 183, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 670, 320));

        background.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        background.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        jPanel2.setBackground(new java.awt.Color(204, 0, 51));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 120));

        jPanel3.setBackground(new java.awt.Color(255, 102, 102));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 800, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ca_createbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ca_createbuttonActionPerformed
       HomePage1 home = new HomePage1();
        home.setVisible(true);
    }//GEN-LAST:event_ca_createbuttonActionPerformed

    private void ca_backbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ca_backbuttonActionPerformed
       Login login = new Login();
       login.setVisible(true);
       
    }//GEN-LAST:event_ca_backbuttonActionPerformed

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
            java.util.logging.Logger.getLogger(CREATE_ACCOUNT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CREATE_ACCOUNT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CREATE_ACCOUNT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CREATE_ACCOUNT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CREATE_ACCOUNT().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JPasswordField ca_address;
    private javax.swing.JTextField ca_age;
    private javax.swing.JButton ca_backbutton;
    private javax.swing.JTextField ca_birthdate;
    private javax.swing.JButton ca_createbutton;
    private javax.swing.JTextField ca_fullname;
    private javax.swing.JPasswordField ca_paasword;
    private javax.swing.JTextField ca_phonenumber;
    private javax.swing.JLabel ca_txtaddress;
    private javax.swing.JLabel ca_txtemail;
    private javax.swing.JLabel ca_txtemail1;
    private javax.swing.JLabel ca_txtemail2;
    private javax.swing.JLabel ca_txtemail3;
    private javax.swing.JLabel ca_txtfullname;
    private javax.swing.JLabel ca_txtpassword;
    private javax.swing.JLabel ca_txtusername;
    private javax.swing.JTextField ca_username;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
