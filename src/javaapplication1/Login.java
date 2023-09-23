
package javaapplication1;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        Color col=new Color(213, 170, 250);
        getContentPane().setBackground(col);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        voter = new javax.swing.JTextField();
        pass = new javax.swing.JPasswordField();
        cancel = new javax.swing.JButton();
        login = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        signup = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        jLabel4.setBackground(java.awt.Color.cyan);
        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 204, 204));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("VOTER ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 180, 80, 50));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("PASSWORD");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 260, 100, 39));

        voter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voterActionPerformed(evt);
            }
        });
        getContentPane().add(voter, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 190, 182, 34));

        pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passActionPerformed(evt);
            }
        });
        getContentPane().add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 260, 182, 38));

        cancel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cancel.setText("CANCEL");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        getContentPane().add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 360, 110, 37));

        login.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        login.setText("LOGIN");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        getContentPane().add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 360, 116, 37));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("New user? Create a new account");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 440, 190, 20));

        signup.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        signup.setText("SIGN UP");
        signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupActionPerformed(evt);
            }
        });
        getContentPane().add(signup, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 470, 120, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/half4.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        // TODO add your handling code here:
        dispose();
        
    }//GEN-LAST:event_cancelActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
    
        String voterid=voter.getText();
        String password=pass.getText();
   
        if(voterid.equals(""))
            JOptionPane.showMessageDialog(null,"Enter valid voter ID");
         
        else if(password.equals(""))
            JOptionPane.showMessageDialog(null,"Enter valid password");
        
        else
        {
            try{
               
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/votingsystem","root","Vishwa4746");
                String query1="select voter_id,password from voters where voter_id=? and password=?";
                PreparedStatement  s1=con.prepareStatement(query1);
                s1.setString(1, voterid);
                s1.setString(2, password);
                ResultSet rs=s1.executeQuery();
                
                if(rs.next())
                {
                   Homepage jf1=new Homepage();
                   jf1.show();
                   dispose();
                 }
                
                 else
                {
                 JOptionPane.showMessageDialog(null,"Inncorrect password or username");
                  voter.setText(null);
                  pass.setText(null);
                }
            } 
            
            
            catch (ClassNotFoundException ex) 
            {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
            catch (SQLException ex) 
            {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
            catch(Exception e){
                System.out.println(e);
            }
            
        }    
            
    }//GEN-LAST:event_loginActionPerformed

    private void signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupActionPerformed
        Registration jf1=new Registration();
        jf1.show();
        dispose();
    }//GEN-LAST:event_signupActionPerformed

    private void voterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_voterActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    public static javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton login;
    private javax.swing.JPasswordField pass;
    private javax.swing.JButton signup;
    public static javax.swing.JTextField voter;
    // End of variables declaration//GEN-END:variables
}
