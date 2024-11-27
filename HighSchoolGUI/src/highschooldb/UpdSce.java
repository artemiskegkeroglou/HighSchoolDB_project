package highschooldb;
import java.sql.*;
public class UpdSce extends javax.swing.JFrame {

    public UpdSce() {
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
        codeC = new javax.swing.JTextField();
        codeTe = new javax.swing.JTextField();
        codeClass = new javax.swing.JTextField();
        jLabelCode = new javax.swing.JLabel();
        date = new javax.swing.JTextField();
        jLabelDate = new javax.swing.JLabel();
        nameClass = new javax.swing.JTextField();
        jLabelCodeTe = new javax.swing.JLabel();
        jLabelclassRoomName = new javax.swing.JLabel();
        jLabelclassId = new javax.swing.JLabel();
        SSubmit = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jLabel.setText("Η ενημέρωση καταχωρήθηκε.");

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

        jLabel1.setText("Η ενημέρωση δεν καταχωρήθηκε.");

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

        Label.setText("ΦΟΡΜΑ ΕΥΡΕΣΗΣ-ΕΝΗΜΕΡΩΣΗΣ ΔΕΔΟΜΕΝΩΝ");

        codeC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codeCActionPerformed(evt);
            }
        });

        jLabelCode.setText("Κωδικός Μαθήματος:");

        jLabelDate.setText("Ημερομηνία και ώρα: (πχ 'Monday 08:00:00')");

        jLabelCodeTe.setText("Κωδικός Καθηγητή:");

        jLabelclassRoomName.setText("Όνομα Τάξης:");

        jLabelclassId.setText("Κωδικός Αίθουσας:");

        SSubmit.setText("Καταχώρηση");
        SSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SSubmitActionPerformed(evt);
            }
        });

        jLabel2.setText("ΕΝΗΜΕΡΩΣΗ ΣΤΟΙΧΕΙΩΝ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Label)
                        .addGap(73, 73, 73))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(SSubmit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(SCancel))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelCodeTe, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(codeTe))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelclassRoomName, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nameClass, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelDate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(date, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelclassId, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(codeClass))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(113, 113, 113)
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelCode, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(codeC)))))
                .addGap(42, 42, 42))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Label, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCodeTe)
                    .addComponent(codeTe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDate)
                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabelCode))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(codeC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelclassId)
                    .addComponent(codeClass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelclassRoomName)
                    .addComponent(nameClass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SSubmit)
                    .addComponent(SCancel))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SCancelActionPerformed
        codeC.setText("");
        codeTe.setText("");
        codeClass.setText("");
        date.setText("");
        nameClass.setText("");
        try {
            updSce.close();
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

    private void codeCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codeCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codeCActionPerformed

    private void SSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SSubmitActionPerformed
        int vcode = Integer.valueOf(codeC.getText());
        int vcode2 = Integer.valueOf(codeTe.getText());
        int vcode3 = Integer.valueOf(codeClass.getText());
        String vdate = date.getText();
        String vclassName = nameClass.getText();
        if(vdate.length() == 0 || vclassName.length() == 0){
            flag = true;
        }
        try {
            updSce.setInt(1, vcode);
            updSce.setInt(4, vcode2);
            updSce.setInt(2, vcode3);
            updSce.setString(5, vdate);
            updSce.setString(3, vclassName);
            if(flag==true){
                jDialog2.setVisible(true);
                jDialog2.setSize(300, 200);
            }
            else{
                updSce.executeUpdate();
                jDialog1.setVisible(true);
                jDialog1.setSize(300, 200);
            }
        } catch(SQLException ex) {
            flag = true;
            System.out.println("\n -- SQL Exception --- \n");
            while(ex != null) {
                System.out.println("Message: " + ex.getMessage());
                ex = ex.getNextException();
            }
        }
        
    }//GEN-LAST:event_SSubmitActionPerformed

    private void NewSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewSubmitActionPerformed
        codeC.setText("");
        codeTe.setText("");
        codeClass.setText("");
        date.setText("");
        nameClass.setText("");
        jDialog1.setVisible(false);
    }//GEN-LAST:event_NewSubmitActionPerformed

    private void EndButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EndButtonActionPerformed
        codeC.setText("");
        codeTe.setText("");
        codeClass.setText("");
        date.setText("");
        nameClass.setText("");
        try {
            updSce.close();
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

    private void NewSubmit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewSubmit2ActionPerformed
        codeC.setText("");
        codeTe.setText("");
        codeClass.setText("");
        date.setText("");
        nameClass.setText("");
        jDialog2.setVisible(false);
    }//GEN-LAST:event_NewSubmit2ActionPerformed

    private void EndButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EndButton2ActionPerformed
        codeC.setText("");
        codeTe.setText("");
        codeClass.setText("");
        date.setText("");
        nameClass.setText("");
        try {
            updSce.close();
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
        String insertString = "{call updSce(?,?,?,?,?)}";
	updSce = dbConnection.prepareCall(insertString);
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
            java.util.logging.Logger.getLogger(UpdSce.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdSce.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdSce.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdSce.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdSce().setVisible(true);
            }
        });
    }
    static String     driverClassName = "oracle.jdbc.OracleDriver" ;
    static String     url = "" ; //path, username and password for database login
    static Connection dbConnection = null;
    static String     username = ""; 
    static String     passwd = "";
    static boolean flag = false;
    static CallableStatement  updSce  = null;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EndButton;
    private javax.swing.JButton EndButton2;
    private javax.swing.JLabel Label;
    private javax.swing.JButton NewSubmit;
    private javax.swing.JButton NewSubmit2;
    private javax.swing.JButton SCancel;
    private javax.swing.JButton SSubmit;
    private javax.swing.JTextField codeC;
    private javax.swing.JTextField codeClass;
    private javax.swing.JTextField codeTe;
    private javax.swing.JTextField date;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JLabel jLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelCode;
    private javax.swing.JLabel jLabelCodeTe;
    private javax.swing.JLabel jLabelDate;
    private javax.swing.JLabel jLabelclassId;
    private javax.swing.JLabel jLabelclassRoomName;
    private javax.swing.JTextField nameClass;
    // End of variables declaration//GEN-END:variables
}