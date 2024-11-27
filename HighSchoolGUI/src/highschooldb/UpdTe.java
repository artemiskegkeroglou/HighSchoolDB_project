package highschooldb;
import java.sql.*;
public class UpdTe extends javax.swing.JFrame {

    public UpdTe() {
        initComponents();
        myconnection();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog2 = new javax.swing.JDialog();
        jLabel2 = new javax.swing.JLabel();
        newUpdate = new javax.swing.JButton();
        EndButton1 = new javax.swing.JButton();
        jDialog3 = new javax.swing.JDialog();
        jLabel3 = new javax.swing.JLabel();
        NewSubmit2 = new javax.swing.JButton();
        EndButton2 = new javax.swing.JButton();
        jLabelSurname = new javax.swing.JLabel();
        SSubmit = new javax.swing.JButton();
        codeTe = new javax.swing.JTextField();
        nameTe = new javax.swing.JTextField();
        surnameTe = new javax.swing.JTextField();
        SCancel = new javax.swing.JButton();
        ageTe = new javax.swing.JTextField();
        Label = new javax.swing.JLabel();
        expTe = new javax.swing.JTextField();
        jLabelCode = new javax.swing.JLabel();
        jLabelHeadTe = new javax.swing.JLabel();
        jLabelAge = new javax.swing.JLabel();
        headTe = new javax.swing.JTextField();
        jLabelName = new javax.swing.JLabel();
        jLabelExp = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jLabel2.setText("Η ενημέρωση καταχωρήθηκε.");

        newUpdate.setText("Νέα ενημέρωση");
        newUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newUpdateActionPerformed(evt);
            }
        });

        EndButton1.setText("Τέλος");
        EndButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EndButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog2Layout.createSequentialGroup()
                .addContainerGap(73, Short.MAX_VALUE)
                .addGroup(jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog2Layout.createSequentialGroup()
                        .addComponent(newUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EndButton1)
                        .addGap(61, 61, 61))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(81, 81, 81))))
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog2Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EndButton1)
                    .addComponent(newUpdate))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        jLabel3.setText("Η ενημέρωση δεν καταχωρήθηκε.");

        NewSubmit2.setText("Νέα ενημέρωση");
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

        javax.swing.GroupLayout jDialog3Layout = new javax.swing.GroupLayout(jDialog3.getContentPane());
        jDialog3.getContentPane().setLayout(jDialog3Layout);
        jDialog3Layout.setHorizontalGroup(
            jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog3Layout.createSequentialGroup()
                .addContainerGap(73, Short.MAX_VALUE)
                .addGroup(jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jDialog3Layout.createSequentialGroup()
                        .addComponent(NewSubmit2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EndButton2)))
                .addGap(61, 61, 61))
        );
        jDialog3Layout.setVerticalGroup(
            jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog3Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EndButton2)
                    .addComponent(NewSubmit2))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        SCancel.setText("Άκυρο");
        SCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SCancelActionPerformed(evt);
            }
        });

        ageTe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageTeActionPerformed(evt);
            }
        });

        Label.setText("ΦΟΡΜΑ ΕΥΡΕΣΗΣ-ΕΝΗΜΕΡΩΣΗΣ ΔΕΔΟΜΕΝΩΝ");

        jLabelCode.setText("Κωδικός Καθηγητή:");

        jLabelHeadTe.setText("Διευθυντής (true/false):");

        jLabelAge.setText("Ηλικία Καθηγητή:");

        jLabelName.setText("Όνομα Καθηγητή:");

        jLabelExp.setText("Χρόνια προϋπηρεσίας:");

        jLabel1.setText("ΕΝΗΜΕΡΩΣΗ ΣΤΟΙΧΕΙΩΝ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(Label))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabelHeadTe, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(headTe, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabelAge, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabelExp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(178, 178, 178))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(1, 1, 1)
                                    .addComponent(jLabelName, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabelSurname, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                                    .addGap(271, 271, 271)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(nameTe, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(SSubmit)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(SCancel))
                                    .addComponent(jLabelCode, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(149, 149, 149)
                                        .addComponent(codeTe, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(surnameTe, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ageTe, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(expTe, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(jLabel1)))
                .addContainerGap(18, Short.MAX_VALUE))
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
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameTe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(surnameTe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSurname))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAge)
                    .addComponent(ageTe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelExp)
                    .addComponent(expTe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelHeadTe)
                    .addComponent(headTe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SSubmit)
                    .addComponent(SCancel))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            updTe.setInt(6, vcode);
            updTe.setString(1, vname);
            updTe.setString(2, vsurname);
            updTe.setInt(3, vage);
            updTe.setInt(4, vexp);
            updTe.setBoolean(5, vheadTe);
            if(flag==true){
                jDialog3.setVisible(true);
                jDialog3.setSize(300, 200);
            }
            else{
                updTe.executeUpdate();
                jDialog2.setVisible(true);
                jDialog2.setSize(300, 200); 
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

    private void SCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SCancelActionPerformed
        codeTe.setText("");
        nameTe.setText("");
        surnameTe.setText("");
        ageTe.setText("");
        expTe.setText("");
        headTe.setText("");
        try {
            updTe.close();
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

    private void ageTeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageTeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageTeActionPerformed

    private void newUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newUpdateActionPerformed
        codeTe.setText("");
        nameTe.setText("");
        surnameTe.setText("");
        ageTe.setText("");
        expTe.setText("");
        headTe.setText("");
        jDialog2.setVisible(false);
    }//GEN-LAST:event_newUpdateActionPerformed

    private void EndButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EndButton1ActionPerformed
        try {
            updTe.close();
            dbConnection.close();
        } catch(SQLException ex) {
            System.out.println("\n -- SQL Exception --- \n");
            while(ex != null) {
                System.out.println("Message: " + ex.getMessage());
                ex = ex.getNextException();
            }
        }
        System.exit(0);
    }//GEN-LAST:event_EndButton1ActionPerformed

    private void NewSubmit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewSubmit2ActionPerformed
        codeTe.setText("");
        nameTe.setText("");
        surnameTe.setText("");
        ageTe.setText("");
        expTe.setText("");
        headTe.setText("");
        jDialog3.setVisible(false);
    }//GEN-LAST:event_NewSubmit2ActionPerformed

    private void EndButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EndButton2ActionPerformed
        try {
            updTe.close();
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
        String updateString = "{call updTe(?,?,?,?,?,?)}";
	updTe = dbConnection.prepareCall(updateString);
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
            java.util.logging.Logger.getLogger(UpdTe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdTe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdTe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdTe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdTe().setVisible(true);
            }
        });
    }
    static String     driverClassName = "oracle.jdbc.OracleDriver" ;
    static String     url = "" ; //path, username and password for database login
    static Connection dbConnection = null;
    static String     username = ""; 
    static String     passwd = "";
    static boolean flag = false;
    static CallableStatement  updTe = null;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EndButton1;
    private javax.swing.JButton EndButton2;
    private javax.swing.JLabel Label;
    private javax.swing.JButton NewSubmit2;
    private javax.swing.JButton SCancel;
    private javax.swing.JButton SSubmit;
    private javax.swing.JTextField ageTe;
    private javax.swing.JTextField codeTe;
    private javax.swing.JTextField expTe;
    private javax.swing.JTextField headTe;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JDialog jDialog3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelAge;
    private javax.swing.JLabel jLabelCode;
    private javax.swing.JLabel jLabelExp;
    private javax.swing.JLabel jLabelHeadTe;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelSurname;
    private javax.swing.JTextField nameTe;
    private javax.swing.JButton newUpdate;
    private javax.swing.JTextField surnameTe;
    // End of variables declaration//GEN-END:variables
}
