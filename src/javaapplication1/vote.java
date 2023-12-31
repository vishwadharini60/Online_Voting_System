/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vishwa
 */
public class vote extends javax.swing.JFrame {

    /**
     * Creates new form vote
     */
     String state;
    public vote() {
        initComponents();
       
        try{
               
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/votingsystem","root","Vishwa4746");
                String query1="select state from voters where voter_id=?";
                PreparedStatement  s1=con.prepareStatement(query1);
                String voterid=Login.voter.getText();
                s1.setString(1, voterid);       //4brnwr3
                ResultSet rs=s1.executeQuery();
                if(rs.next())
                {
                    state=rs.getString(1);
                    String query2="select distinct(candidate_id),name,party from candidates c,voters v where v.state=? and c.region=v.state";
                    PreparedStatement  s2=con.prepareStatement(query2);
                    s2.setString(1, state);
                    ResultSet rs1=s2.executeQuery();
                    while(rs1.next())
                    {
                        String cid=rs1.getString(1);
                        String cname=rs1.getString(2);
                        String cparty=rs1.getString(3);
                  
                        String tbdata[]={cid,cname,cparty};
                        DefaultTableModel tbmodel=(DefaultTableModel)table.getModel();
                        tbmodel.addRow(tbdata);
                        
                        
                    }
                    
                }
                
                 else
                {
                 JOptionPane.showMessageDialog(null,"no candidates");
                 
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CANDIDATE ID", "NAME", "PARTY"
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 490, 430));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CANDIDATE LIST");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, 220, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/full2.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        // TODO add your handling code here:
        int selectedrow=table.getSelectedRow();
        DefaultTableModel tbmodel=(DefaultTableModel)table.getModel();
        String selcid=tbmodel.getValueAt(selectedrow,0).toString();
        String selname=tbmodel.getValueAt(selectedrow, 1).toString();
        int response=JOptionPane.showConfirmDialog(null,"vote for "+selname+" ?","message",JOptionPane.YES_NO_OPTION);
        if(response==JOptionPane.YES_OPTION)
        {
            
            try{
                
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/votingsystem","root","Vishwa4746");
                String query4="select flag from voters where voter_id=?";
                PreparedStatement s4=con.prepareStatement(query4);
                String voterid=Login.voter.getText();
                s4.setString(1, voterid);
                ResultSet rs4=s4.executeQuery();
                if(rs4.next())
                {
                    int flag=rs4.getInt(1);
                    if(flag==1)
                    {
                       JOptionPane.showMessageDialog(null,"Cannot vote again"); 
                    }
                    else
                    {
                        String query3="update voters set flag=1 where voter_id=?";
                        PreparedStatement  s3=con.prepareStatement(query3);
                        s3.setString(1, voterid);
                        s3.executeUpdate();
                        JOptionPane.showMessageDialog(null,"vote casted successfully");
                        //update in election table here
                        
                        String query5="update election set result=result+1 where candidate_id=?";
                        PreparedStatement  s5=con.prepareStatement(query5);
                        s5.setString(1, selcid);
                        s5.executeUpdate();
                      
                        
                        
                    }
                    
                }
                
                
                
                
                
            }
        catch (SQLException ex){
            Logger.getLogger(Update.class.getName()).log(Level.SEVERE, null, ex);
        } 
        catch (ClassNotFoundException ex){
            Logger.getLogger(Update.class.getName()).log(Level.SEVERE, null, ex);
        } 
            
            Homepage hp1=new Homepage();
            hp1.show();
            dispose();
        }
        else{
            
            JOptionPane.showMessageDialog(null,"vote not casted");
        }
        
        
    }//GEN-LAST:event_tableMouseClicked

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
            java.util.logging.Logger.getLogger(vote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vote().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
