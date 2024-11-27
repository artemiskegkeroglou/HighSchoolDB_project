package highschooldb;
import java.sql.*;
public class AddSt extends javax.swing.JFrame {
    public AddSt() {
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
        codeSt = new javax.swing.JTextField();
        nameSt = new javax.swing.JTextField();
        surnameSt = new javax.swing.JTextField();
        SCancel = new javax.swing.JButton();
        Label = new javax.swing.JLabel();
        jLabelCode = new javax.swing.JLabel();
        jLabelClass = new javax.swing.JLabel();
        jLabelName = new javax.swing.JLabel();
        jLabelAge = new javax.swing.JLabel();
        jLabelSurname = new javax.swing.JLabel();
        classSt = new javax.swing.JTextField();
        SSubmit = new javax.swing.JButton();
        ageSt = new javax.swing.JTextField();

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

        codeSt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codeStActionPerformed(evt);
            }
        });

        nameSt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameStActionPerformed(evt);
            }
        });

        surnameSt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                surnameStActionPerformed(evt);
            }
        });

        SCancel.setText("Άκυρο");
        SCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SCancelActionPerformed(evt);
            }
        });

        Label.setText("ΦΟΡΜΑ ΕΙΣΑΓΩΓΗΣ ΔΕΔΟΜΕΝΩΝ");

        jLabelCode.setText("Κωδικός Μαθητή:");

        jLabelClass.setText("Τάξη Μαθητή:");

        jLabelName.setText("Όνομα Μαθητή:");

        jLabelAge.setText("Ηλικία Μαθητή:");

        jLabelSurname.setText("Επώνυμο Μαθητή:");

        classSt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classStActionPerformed(evt);
            }
        });

        SSubmit.setText("Καταχώρηση");
        SSubmit.setToolTipText("");
        SSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SSubmitActionPerformed(evt);
            }
        });

        ageSt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageStActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(Label))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(SSubmit)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SCancel))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabelAge, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ageSt, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabelClass, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(classSt, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelName, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelCode))
                                .addComponent(jLabelSurname))
                            .addGap(36, 36, 36)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(codeSt, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(nameSt, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(surnameSt, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelCode, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(codeSt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelName)
                    .addComponent(nameSt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSurname)
                    .addComponent(surnameSt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelClass)
                    .addComponent(classSt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAge)
                    .addComponent(ageSt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SCancel)
                    .addComponent(SSubmit))
                .addContainerGap(74, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SSubmitActionPerformed
        int vcode = Integer.valueOf(codeSt.getText());
        String vname = nameSt.getText();
        String vsurname = surnameSt.getText();
        String vclass = classSt.getText();
        int vage = Integer.valueOf(ageSt.getText());
        if(vname.length() == 0 || vsurname.length() == 0 || vclass.length() == 0){
                flag = true;
        }
        try {
            stmt.setInt(1, vcode);
            stmt.setString(2, vname);
            stmt.setString(3, vsurname);
            stmt.setString(4, vclass);
            stmt.setInt(5, vage);
        if(flag==true){
            jDialog2.setVisible(true);
            jDialog2.setSize(300, 200);
        }
        else{
            stmt.executeUpdate();
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

    private void SCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SCancelActionPerformed
        codeSt.setText("");
        nameSt.setText("");
        surnameSt.setText("");
        classSt.setText("");
        ageSt.setText("");
        try {
            stmt.close();
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

    private void surnameStActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_surnameStActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_surnameStActionPerformed

    private void nameStActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameStActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameStActionPerformed

    private void ageStActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageStActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageStActionPerformed

    private void codeStActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codeStActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codeStActionPerformed

    private void classStActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classStActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_classStActionPerformed

    private void NewSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewSubmitActionPerformed
        codeSt.setText("");
        nameSt.setText("");
        surnameSt.setText("");
        classSt.setText("");
        ageSt.setText("");
        jDialog1.setVisible(false);
    }//GEN-LAST:event_NewSubmitActionPerformed

    private void EndButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EndButtonActionPerformed
        try {
            stmt.close();
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
        codeSt.setText("");
        nameSt.setText("");
        surnameSt.setText("");
        classSt.setText("");
        ageSt.setText("");
        jDialog2.setVisible(false);
    }//GEN-LAST:event_NewSubmit2ActionPerformed

    private void EndButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EndButton2ActionPerformed
        try {
            stmt.close();
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
        String insertStudents = "{call addSt(?, ?, ?, ?, ?)}";
        stmt = dbConnection.prepareCall(insertStudents);
        } catch(SQLException ex) {
            System.out.println("\n -- SQL Exception --- \n");
            while(ex != null) {
		System.out.println("Message: " + ex.getMessage());
		ex = ex.getNextException();
            }
        }
       }
    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddSt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddSt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddSt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddSt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddSt().setVisible(true);
            }
        });
    }
    
    static String     driverClassName = "oracle.jdbc.OracleDriver" ;
    static String     url = "" ; //path, username and password for database login
    static Connection dbConnection = null;
    static String     username = ""; 
    static String     passwd = "";
    static boolean flag = false;
    static CallableStatement stmt = null;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EndButton;
    private javax.swing.JButton EndButton2;
    private javax.swing.JLabel Label;
    private javax.swing.JButton NewSubmit;
    private javax.swing.JButton NewSubmit2;
    private javax.swing.JButton SCancel;
    private javax.swing.JButton SSubmit;
    private javax.swing.JTextField ageSt;
    private javax.swing.JTextField classSt;
    private javax.swing.JTextField codeSt;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JLabel jLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelAge;
    private javax.swing.JLabel jLabelClass;
    private javax.swing.JLabel jLabelCode;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelSurname;
    private javax.swing.JTextField nameSt;
    private javax.swing.JTextField surnameSt;
    // End of variables declaration//GEN-END:variables
}
