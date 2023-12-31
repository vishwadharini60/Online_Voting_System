
package javaapplication1;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author vishwa
 */
public class Registration extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame1
     */
    public Registration() {
        initComponents();
        
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtextfield76 = new javax.swing.JLabel();
        firstname = new javax.swing.JTextField();
        lastname = new javax.swing.JTextField();
        dob = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        voter = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        phno = new javax.swing.JTextField();
        pin = new javax.swing.JTextField();
        citylist = new javax.swing.JComboBox<>();
        statelist = new javax.swing.JComboBox<>();
        submit = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        incorrectlabel = new javax.swing.JLabel();
        pass = new javax.swing.JPasswordField();
        cpass = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 153));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("FIRST NAME");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 80, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("VOTER ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 70, 28));

        jtextfield76.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jtextfield76.setForeground(new java.awt.Color(255, 255, 255));
        jtextfield76.setText("DOB");
        getContentPane().add(jtextfield76, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 170, 43, 26));

        firstname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstnameActionPerformed(evt);
            }
        });
        getContentPane().add(firstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 180, 30));

        lastname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastnameActionPerformed(evt);
            }
        });
        getContentPane().add(lastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 120, 180, 31));

        dob.setDateFormatString("dd-MM-yyyy");
        dob.setPreferredSize(new java.awt.Dimension(64, 22));
        getContentPane().add(dob, new org.netbeans.lib.awtextra.AbsoluteConstraints(498, 170, 180, 33));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(764, 274, 2, 34));
        getContentPane().add(voter, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 180, 28));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("PASSWORD");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 80, 28));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("CONFIRM PASSWORD");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 130, 23));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("CITY");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, 30, 32));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("STATE");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 270, 50, 31));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("LAST NAME");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, 90, 30));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("PHONE");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 210, 50, 40));
        getContentPane().add(phno, new org.netbeans.lib.awtextra.AbsoluteConstraints(498, 220, 180, 30));
        getContentPane().add(pin, new org.netbeans.lib.awtextra.AbsoluteConstraints(498, 313, 180, 30));

        citylist.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Bangalore", "Mysore", "Chennai", "Madurai", "Salem" }));
        citylist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                citylistActionPerformed(evt);
            }
        });
        getContentPane().add(citylist, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, 180, 30));

        statelist.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Karnataka", "Tamilnadu" }));
        statelist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statelistActionPerformed(evt);
            }
        });
        getContentPane().add(statelist, new org.netbeans.lib.awtextra.AbsoluteConstraints(498, 268, 180, 30));

        submit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        submit.setText("SUBMIT");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        getContentPane().add(submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 450, 100, 30));

        cancel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cancel.setText("CANCEL");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        getContentPane().add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 450, 110, 30));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("PINCODE");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(442, 318, 60, 20));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText(" REGISTRATION FORM");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, 280, 30));

        incorrectlabel.setBackground(new java.awt.Color(213, 170, 250));
        incorrectlabel.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(incorrectlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 248, 170, 10));
        getContentPane().add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 212, 180, 30));

        cpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpassActionPerformed(evt);
            }
        });
        cpass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cpassKeyReleased(evt);
            }
        });
        getContentPane().add(cpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 180, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/full2.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void firstnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstnameActionPerformed

    private void lastnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastnameActionPerformed

    private void cpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpassActionPerformed
        
            
    }//GEN-LAST:event_cpassActionPerformed

    private void cpassKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cpassKeyReleased
        String password=pass.getText();
        String cpassword=cpass.getText();
        
        if((password.equals(cpassword)))
                incorrectlabel.setText(null);
        else {
            incorrectlabel.setText("*Incorrect password");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_cpassKeyReleased

    private void citylistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_citylistActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_citylistActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        // TODO add your handling code here:
        Login lp=new Login();
        lp.show();
        dispose();
    }//GEN-LAST:event_cancelActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        // TODO add your handling code here:
     
         String fname=firstname.getText();
         if(fname.equals(""))
            JOptionPane.showMessageDialog(null,"Enter valid first name");
         
         String lname=lastname.getText();
         if(lname.equals(""))
            JOptionPane.showMessageDialog(null,"Enter valid last name");
         
         String voterid=voter.getText();
         if(voterid.equals(""))
            JOptionPane.showMessageDialog(null,"Enter valid votrid");
         
         Date datechooser=dob.getDate();
         String dob= new SimpleDateFormat("yyyy-MM-dd").format(datechooser);
         /*else if(dob=="")
             JOptionPane.showMessageDialog(null,"Enter valid date");*/
         
         String password=pass.getText();
         if(password.equals(""))
            JOptionPane.showMessageDialog(null,"Enter valid password");
         
         String phone=phno.getText();
         if(phone.equals(""))
             JOptionPane.showMessageDialog(null,"Enter valid phone number");
         
         if(statelist.getSelectedItem()=="")
             JOptionPane.showMessageDialog(null,"Enter valid state");
         
         if(citylist.getSelectedItem()=="")
             JOptionPane.showMessageDialog(null,"Enter valid city");
         
         String pincode=pin.getText();
         if(pincode.equals(""))
             JOptionPane.showMessageDialog(null,"Enter valid pincode");
      
          
          else {
              try{
                  
                  Class.forName("com.mysql.cj.jdbc.Driver");
                  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/votingsystem","root","Vishwa4746");
                  String query1="INSERT INTO voters values(?,?,?,?,?,?,?,?,?,?)";
                  PreparedStatement  s1=con.prepareStatement(query1);
                  s1.setString(1, voter.getText());
                  s1.setString(2,firstname.getText());
                  s1.setString(3, lastname.getText());
                  s1.setString(4, dob);
                  s1.setString(5, pass.getText());
                  s1.setString(6,phno.getText());
                  
                  statelist.setEditable(true);
                  String state=statelist.getSelectedItem().toString();
                  s1.setString(7, state);
                  
                  citylist.setEditable(true);
                  String city=citylist.getSelectedItem().toString();
                  s1.setString(8, city);
                  
                  s1.setString(9, pin.getText());
                  s1.setString(10,"0");
                  
       
                  s1.executeUpdate();
                  JOptionPane.showMessageDialog(null,"Insertion Successful");
                  Login jf=new Login();
                  jf.show();
                  dispose();
                  
                  
                  
              }
              
              
              catch (ClassNotFoundException ex)
              {
                  Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
              }
              catch (SQLException ex)
              {
                  Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
              }
              catch(Exception e)
              {
                  System.out.println(e);
              }
        }
        
        
            
               
        
    }//GEN-LAST:event_submitActionPerformed

    private void statelistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statelistActionPerformed
        // TODO add your handling code here:
         
    }//GEN-LAST:event_statelistActionPerformed

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
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel;
    private javax.swing.JComboBox<String> citylist;
    private javax.swing.JPasswordField cpass;
    private com.toedter.calendar.JDateChooser dob;
    private javax.swing.JTextField firstname;
    private javax.swing.JLabel incorrectlabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jtextfield76;
    private javax.swing.JTextField lastname;
    private javax.swing.JPasswordField pass;
    private javax.swing.JTextField phno;
    private javax.swing.JTextField pin;
    private javax.swing.JComboBox<String> statelist;
    private javax.swing.JButton submit;
    private javax.swing.JTextField voter;
    // End of variables declaration//GEN-END:variables
}
