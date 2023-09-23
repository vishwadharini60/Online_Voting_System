
package javaapplication1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Homepage extends javax.swing.JFrame {
String state="";
    public Homepage() {
        
        initComponents();
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/votingsystem","root","Vishwa4746");
            String query3="SELECT state from voters where voter_id=?";
            PreparedStatement  s3=con.prepareStatement(query3);
            String voterid=Login.voter.getText();
            s3.setString(1, voterid);
            ResultSet rs3=s3.executeQuery();
            if(rs3.next())
            {
                state=rs3.getString(1);
            }
            
        }
        catch (ClassNotFoundException | SQLException ex) 
            {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
            catch(Exception e){
                System.out.println(e);
            }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        votebtn = new javax.swing.JButton();
        updatebtn = new javax.swing.JButton();
        deletebtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        votebtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        votebtn.setText("VOTE");
        votebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                votebtnActionPerformed(evt);
            }
        });
        getContentPane().add(votebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 140, 40));

        updatebtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        updatebtn.setText("UPDATE");
        updatebtn.setMaximumSize(new java.awt.Dimension(72, 27));
        updatebtn.setMinimumSize(new java.awt.Dimension(72, 27));
        updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtnActionPerformed(evt);
            }
        });
        getContentPane().add(updatebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 140, 40));

        deletebtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        deletebtn.setText("DELETE");
        deletebtn.setMaximumSize(new java.awt.Dimension(72, 27));
        deletebtn.setMinimumSize(new java.awt.Dimension(72, 27));
        deletebtn.setPreferredSize(new java.awt.Dimension(72, 27));
        deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtnActionPerformed(evt);
            }
        });
        getContentPane().add(deletebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, 140, 40));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("RESULT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 140, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/1641439798446.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtnActionPerformed
       
       try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/votingsystem","root","Vishwa4746");
                System.out.println("connection established");
                String query1="delete from voters where voter_id=? and password=?";
                PreparedStatement  s1=con.prepareStatement(query1);
                String voterid=JOptionPane.showInputDialog(null,"enter voterid" );
                String query2="select voter_id from voters where voter_id=?";
                PreparedStatement  s2=con.prepareStatement(query2);
                s2.setString(1, voterid);
                ResultSet rs=s2.executeQuery();
                
                if(rs.next())
                {
                   String password=JOptionPane.showInputDialog(null,"enter password" );
                   s1.setString(1, voterid);
                   s1.setString(2, password);
                   s1.executeUpdate();
                   JOptionPane.showMessageDialog(null,"Deletion Successful");
                   Login obj=new Login();
                   obj.show();
                   dispose();
                 }
                
                 else
                {
                 JOptionPane.showMessageDialog(null,"Invalid voterid");
              
                }
        
            } 
            
            
            catch (ClassNotFoundException | SQLException ex) 
            {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
            catch(Exception e){
                System.out.println(e);
            }
    }//GEN-LAST:event_deletebtnActionPerformed

    private void updatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtnActionPerformed
        Update jf3=new Update();
        jf3.show();
        dispose();
    }//GEN-LAST:event_updatebtnActionPerformed

    private void votebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_votebtnActionPerformed
        vote vt=new vote();
        vt.show();
        dispose();
        
    }//GEN-LAST:event_votebtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/votingsystem","root","Vishwa4746");
            
            
            String query2="select name from candidates where candidate_id in(SELECT candidate_id from election where place=? and result in(select max(result) from election where place=?))";
            PreparedStatement  s2=con.prepareStatement(query2);
            //String voterid=Login.voter.getText();
            s2.setString(1, state);
            s2.setString(2, state);
            ResultSet rs1=s2.executeQuery();
            if(rs1.next())
            {
                String result=rs1.getString(1);
                JOptionPane.showMessageDialog(null,""+result+" has the highest votes");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Homepage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Homepage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Homepage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deletebtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton updatebtn;
    private javax.swing.JButton votebtn;
    // End of variables declaration//GEN-END:variables
}
