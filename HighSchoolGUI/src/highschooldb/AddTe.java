package highschooldb;
import java.sql.*;

public class AddTe extends javax.swing.JFrame {

    public AddTe() {
        initComponents();
        myconnection();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jLabel = new javax.swing.JLabel();
        NewSubmit = new javax.swing.JButton();
        EndButton = new javax.swing.JButton();
        jDialog2 = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        NewSubmit2 = new javax.swing.JButton();
        EndButton2 = new javax.swing.JButton();
        SCancel = new javax.swing.JButton();
        Label = new javax.swing.JLabel();
        jLabelCode = new javax.swing.JLabel();
        jLabelAge = new javax.swing.JLabel();
        jLabelName = new javax.swing.JLabel();
        jLabelExp = new javax.swing.JLabel();
        jLabelSurname = new javax.swing.JLabel();
        SSubmit = new javax.swing.JButton();
        codeTe = new javax.swing.JTextField();
        nameTe = new javax.swing.JTextField();
        surnameTe = new javax.swing.JTextField();
        ageTe = new javax.swing.JTextField();
        expTe = new javax.swing.JTextField();
        jLabelHeadTe = new javax.swing.JLabel();
        headTe = new javax.swing.JTextField();

        jLabel.setText("Η εγγραφή καταχωρήθηκε.");

        NewSubmit.setText("Νέα καταχώρηση");
        NewSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewSubmitActionPerformed(evt);
            }
        });

        EndButton.setText("Τέλος");
        EndButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EndButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog1Layout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialog1Layout.createSequentialGroup()
                        .addComponent(NewSubmit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EndButton))
                    .addGroup(jDialog1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(61, 61, 61))
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EndButton)
                    .addComponent(NewSubmit))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        jLabel1.setText("Η εγγραφή δεν καταχωρήθηκε.");

        NewSubmit2.setText("Νέα καταχώρηση");
        NewSubmit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewSubmit2ActionPerformed(evt);
            }
        });

        EndButton2.setText("Τέλος");
        EndButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EndButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog2Layout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addGroup(jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog2Layout.createSequentialGroup()
                        .addComponent(NewSubmit2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EndButton2)
                        .addGap(61, 61, 61))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(79, 79, 79))))
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog2Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EndButton2)
                    .addComponent(NewSubmit2))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        SCancel.setText("Άκυρο");
        SCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SCancelActionPerformed(evt);
            }
        });

        Label.setText("ΦΟΡΜΑ ΕΙΣΑΓΩΓΗΣ ΔΕΔΟΜΕΝΩΝ");

        jLabelCode.setText("Κωδικός Καθηγητή:");

        jLabelAge.setText("Ηλικία Καθηγητή:");

        jLabelName.setText("Όνομα Καθηγητή:");

        jLabelExp.setText("Χρόνια προϋπηρεσίας:");

        jLabelSurname.setText("Επώνυμο Καθηγητή:");

        SSubmit.setText("Καταχώρηση");
        SSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SSubmitActionPerformed(evt);
            }
        });

        codeTe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codeTeActionPerformed(evt);
            }
        });

        jLabelHeadTe.setText("Διευθυντής (true/false):");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(SSubmit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SCancel))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabelSurname, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(jLabelCode, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(surnameTe))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelAge, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelExp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ageTe)
                            .addComponent(expTe, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(Label))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelHeadTe, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(headTe))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabelName, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(codeTe)
                            .addComponent(nameTe, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Label)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCode)
                    .addComponent(codeTe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameTe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelSurname)
                    .addComponent(surnameTe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelAge)
                    .addComponent(ageTe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelExp)
                    .addComponent(expTe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(headTe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelHeadTe))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SSubmit)
                    .addComponent(SCancel))
                .addGap(45, 45, 45))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NewSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewSubmitActionPerformed
        codeTe.setText("");
        nameTe.setText("");
        surnameTe.setText("");
        ageTe.setText("");
        expTe.setText("");
        headTe.setText("");
        jDialog1.setVisible(false);
    }//GEN-LAST:event_NewSubmitActionPerformed

    private void EndButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EndButtonActionPerformed
        codeTe.setText("");
        nameTe.setText("");
        surnameTe.setText("");
        ageTe.setText("");
        expTe.setText("");
        headTe.setText("");
        try {
            insTe.close();
            dbConnection.close();
        } catch(SQLException ex) {
            System.out.println("\n -- SQL Exception --- \n");
            while(ex != null) {
                System.out.println("Message: " + ex.getMessage());
                ex = ex.getNextException();
            }
        }
        System.exit(0);
    }//GEN-LAST:event_EndButtonActionPerformed

    private void SCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SCancelActionPerformed
        codeTe.setText("");
        nameTe.setText("");
        surnameTe.setText("");
        ageTe.setText("");
        expTe.setText("");
        headTe.setText("");
        try {
            insTe.close();
            dbConnection.close();
        } catch(SQLException ex) {
            System.out.println("\n -- SQL Exception --- \n");
            while(ex != null) {
                System.out.println("Message: " + ex.getMessage());
                ex = ex.getNextException();
            }
        }
        System.exit(0);
    }//GEN-LAST:event_SCancelActionPerformed

    private void SSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SSubmitActionPerformed
        int vcode = Integer.valueOf(codeTe.getText());
        String vname = nameTe.getText();
        String vsurname = surnameTe.getText();
        int vage = Integer.valueOf(ageTe.getText());
        int vexp = Integer.valueOf(expTe.getText());
        boolean vheadTe = Boolean.valueOf(headTe.getText());
        if(vname.length() == 0 || vsurname.length() == 0){
                flag = true;
        }
        try {
            insTe.setInt(1, vcode);
            insTe.setString(2, vname);
            insTe.setString(3, vsurname);
            insTe.setInt(4, vage);
            insTe.setInt(5, vexp);
            insTe.setBoolean(6, vheadTe);
        if(flag==true){
            jDialog2.setVisible(true);
            jDialog2.setSize(300, 200);
        }
        else{
            insTe.executeUpdate();
            jDialog1.setVisible(true);
            jDialog1.setSize(300, 200); 
        }
        } catch(SQLException ex) {
            System.out.println("\n -- SQL Exception --- \n");
            while(ex != null) {
                System.out.println("Message: " + ex.getMessage());
                ex = ex.getNextException();
            }
        }
        
    }//GEN-LAST:event_SSubmitActionPerformed

    private void codeTeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codeTeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codeTeActionPerformed

    private void NewSubmit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewSubmit2ActionPerformed
        codeTe.setText("");
        nameTe.setText("");
        surnameTe.setText("");
        ageTe.setText("");
        expTe.setText("");
        headTe.setText("");
        jDialog2.setVisible(false);
    }//GEN-LAST:event_NewSubmit2ActionPerformed

    private void EndButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EndButton2ActionPerformed
        try {
            insTe.close();
            dbConnection.close();
        } catch(SQLException ex) {
            System.out.println("\n -- SQL Exception --- \n");
            while(ex != null) {
                System.out.println("Message: " + ex.getMessage());
                ex = ex.getNextException();
            }
        }
        System.exit(0);
    }//GEN-LAST:event_EndButton2ActionPerformed

        void myconnection () {
            try {
                Class.forName (driverClassName);
            } catch (ClassNotFoundException ex) {
            }
        try {    
        dbConnection = DriverManager.getConnection (url, username, passwd);
        String insertString = "{call addTe(?,?,?,?,?,?)}";
	insTe = dbConnection.prepareCall(insertString);
        } catch(SQLException ex) {
            System.out.println("\n -- SQL Exception --- \n");
            while(ex != null) {
		System.out.println("Message: " + ex.getMessage());
		ex = ex.getNextException();
            }
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
            java.util.logging.Logger.getLogger(AddTe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddTe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddTe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddTe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddTe().setVisible(true);
            }
        });
    }

    static String     driverClassName = "oracle.jdbc.OracleDriver" ;
    static String     url = "" ; //path, username and password for database login
    static Connection dbConnection = null;
    static String     username = ""; 
    static String     passwd = "";
    static boolean flag = false;
    static CallableStatement  insTe = null;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EndButton;
    private javax.swing.JButton EndButton2;
    private javax.swing.JLabel Label;
    private javax.swing.JButton NewSubmit;
    private javax.swing.JButton NewSubmit2;
    private javax.swing.JButton SCancel;
    private javax.swing.JButton SSubmit;
    private javax.swing.JTextField ageTe;
    private javax.swing.JTextField codeTe;
    private javax.swing.JTextField expTe;
    private javax.swing.JTextField headTe;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JLabel jLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelAge;
    private javax.swing.JLabel jLabelCode;
    private javax.swing.JLabel jLabelExp;
    private javax.swing.JLabel jLabelHeadTe;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelSurname;
    private javax.swing.JTextField nameTe;
    private javax.swing.JTextField surnameTe;
    // End of variables declaration//GEN-END:variables
}
