package pack1;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.DefaultListModel;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * STDelUI.java
 *
 * Created on May 12, 2010, 2:36:32 PM
 */

/**
 *
 * @author xp_system
 */
public class STDelUI extends javax.swing.JFrame {

    /** Creates new form MembDelUI */
    public STDelUI() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator2 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        cmdExit1 = new javax.swing.JButton();
        cmdDelete = new javax.swing.JButton();
        sttp = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        zcode = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        stst = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        stc = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        stvd = new javax.swing.JTextField();
        stid = new javax.swing.JTextField();
        stb = new javax.swing.JTextField();
        stg = new javax.swing.JTextField();
        stl = new javax.swing.JTextField();
        stf = new javax.swing.JTextField();
        stag = new javax.swing.JTextField();
        stad = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        stnic = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Deletion Form");
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        jLabel6.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Select a Student");

        jList1.setModel(new DefaultListModel());
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        cmdExit1.setText("Exit");
        cmdExit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdExit1ActionPerformed(evt);
            }
        });

        cmdDelete.setText("Delete");
        cmdDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdDeleteActionPerformed(evt);
            }
        });

        sttp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sttpActionPerformed(evt);
            }
        });

        jLabel12.setText("zip code");

        jLabel13.setText("state");

        jLabel14.setText("city");

        stc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stcActionPerformed(evt);
            }
        });

        jLabel15.setText("view date");

        stid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stidActionPerformed(evt);
            }
        });

        stag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stagActionPerformed(evt);
            }
        });

        stad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stadActionPerformed(evt);
            }
        });

        jLabel9.setText("Nic");

        jLabel1.setText("Student ID");

        jLabel3.setText("Birth Date");

        jLabel4.setText("Gender");

        jLabel5.setText("Last Name");

        jLabel10.setText("First Name");

        jLabel7.setText("Age");

        jLabel8.setText("Address");

        jLabel11.setText("Telephone Number");

        jButton1.setText("Back to manage student");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(170, 170, 170)
                                .addComponent(cmdDelete)
                                .addGap(105, 105, 105)
                                .addComponent(cmdExit1)
                                .addGap(90, 90, 90)
                                .addComponent(jButton1))
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel10)
                                        .addComponent(jLabel5))
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel15))
                                .addGap(103, 103, 103)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(stvd, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(stc, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(stst, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(zcode, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(stid)
                                    .addComponent(stb, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(stg, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(stl, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(stf, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(stag, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(stad, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(stnic, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sttp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 761, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 555, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmdDelete)
                            .addComponent(cmdExit1)
                            .addComponent(jButton1))
                        .addGap(11, 11, 11))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(stid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(stb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(stg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(stl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(stf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(stag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(stst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(stad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(stnic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(zcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(sttp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(stc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(stvd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   

        Statement stmt = null;
         Statement s2 = null;
         Statement s3 = null;
         Statement s4 = null;
            ResultSet rs = null;
            ResultSet rs1 = null;
               ResultSet rs2 = null;
               ResultSet rs3 = null;
            String SQL = "SELECT * FROM student";
             String SQL1 = "SELECT * FROM contacts";
              String SQL2 = "SELECT * FROM statecode";
              String SQL3 = "SELECT * FROM views";
    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        // getSelectedValue() method extracts the current cursor location value into a variable
         String stid2 = (String) jList1.getSelectedValue();
        // Extract the first 4 characters as Member No into a variable
        String stid1 =stid2.trim().substring(0, 8);
        String vzcode1= stid2.trim().substring( stid2.trim().length() - 5);
        String query = "SELECT * FROM student WHERE ST_ID = '" + (stid1) + "';";
        String query2 = "SELECT * FROM contacts WHERE ST_ID = '" + (stid1) + "';";
         String query3 = "SELECT * FROM statecode WHERE Z_CODE = '" + (vzcode1) + "';";
        try {
                 String userName = "Sa";//username of DB
            String password = "suba12345";//password of DB
            String url = "jdbc:sqlserver://localhost:1433;databaseName=stdacc";
                Connection con = DriverManager.getConnection(url,userName, password);
            // Create SQL statement and execute query.
            stmt = con.createStatement();
       
            s2 = con.createStatement();
               s3 = con.createStatement();
            rs = stmt.executeQuery(query);
            rs1 = s2.executeQuery(query2);
             rs2 = s3.executeQuery(query3);  

            if (rs.next()) {

               String vstid = rs.getString("ST_ID");
                String vstb = rs.getString("B_DATE");
                String vstg = rs.getString("GENDER");
                String vstl = rs.getString("LN");
                String vstf = rs.getString("FN");
                String vstag = rs.getString("AGE");
                String vstnic = rs.getString("NIC");
                String vzcode = rs.getString("Z_CODE");
                String vstvd = rs.getString("VIEW_DATE");
                 
                // Displaying the contents in respective text boxes.
               
                stid.setText(vstid);
                stg.setText(vstg);
                stb.setText(vstb);
                stag.setText(vstag);
                stl.setText(vstl);
                stf.setText(vstf);
                
                zcode.setText(vzcode);
                stnic.setText(vstnic);
              
                stvd.setText(vstvd);
                
            } else {
                JOptionPane.showMessageDialog(null, "Record does not found in student table");
            }
            
            if (rs1.next()) {
            String vtp = rs1.getString("TP");
             sttp.setText(vtp);}
            else{JOptionPane.showMessageDialog(null, "Record does not found in contact table");}
              if (rs2.next()) {
            String vstst = rs2.getString("STATE");
             String vstc = rs2.getString("CITY");
             String vstad = rs2.getString("ADDRESS");
             stst.setText(vstst);
                stc.setText(vstc);
                stad.setText(vstad);
            }else {
                JOptionPane.showMessageDialog(null, "Record does not found in contacts table");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
}//GEN-LAST:event_jList1MouseClicked

    private void cmdExit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdExit1ActionPerformed
        this.setVisible(false);
        //new MainUI().setVisible(true);
}//GEN-LAST:event_cmdExit1ActionPerformed

    private void cmdDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdDeleteActionPerformed
        try {
              String userName = "Sa";//username of DB
            String password = "suba12345";//password of DB
            String url = "jdbc:sqlserver://localhost:1433;databaseName=stdacc";
                Connection con = DriverManager.getConnection(url,userName, password);
             s4 = con.createStatement();
            rs3 = s4.executeQuery(SQL3);
             stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);
            s2 = con.createStatement();
            rs1 = s2.executeQuery(SQL1);
            s3 = con.createStatement();
            
            rs2 = s3.executeQuery(SQL2);
              s4 = con.createStatement();
            rs3 = s4.executeQuery(SQL3);
            String vstid = stid.getText().trim();
             String vzcode = zcode.getText().trim();
            // Steps to confirm deletion
            int opt = JOptionPane.showConfirmDialog(null, "Are you sure to delete this record ?");
            if (opt == JOptionPane.YES_OPTION) {
                    try {    
                    String strSQL3 = "Delete from views where ST_ID = '" +(vstid)+"';";
                    int rowsEffected4 = s4.executeUpdate(strSQL3);

                    if (rowsEffected4 == 0)
                        JOptionPane.showMessageDialog(this, "Record does not exists");
                    else {
                        JOptionPane.showMessageDialog(this,"Record Deleted");
                        // Text boxes cleared
                       
                    }
                
                 stvd.setText("");
                
              
           
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Unable to delete");
                }
           
                try {
                    
                    String strSQL = "Delete from student where ST_ID = '" +(vstid)+"';";
                    int rowsEffected = stmt.executeUpdate(strSQL);

                    if (rowsEffected == 0)
                        JOptionPane.showMessageDialog(this, "Record does not exists");
                    else {
                        JOptionPane.showMessageDialog(this,"Record Deleted");
                        // Text boxes cleared
                       
                    }
                 stid.setText(vstid);
                stg.setText("");
                stb.setText("");
                stag.setText("");
                stl.setText("");
                stf.setText("");
                
                zcode.setText("");
                stnic.setText("");
              
                stvd.setText("");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Unable to delete");
                }
           
                
                try {
                    
                    String strSQL1 = "Delete from contacts where ST_ID = '" +(vstid)+"';";
                    int rowsEffected1 = s2.executeUpdate(strSQL1);

                    if (rowsEffected1 == 0)
                        JOptionPane.showMessageDialog(this, "Record does not exists");
                    else {
                        JOptionPane.showMessageDialog(this,"Record Deleted");
                        // Text boxes cleared
                       
                    }
                
                sttp.setText("");
                
              
           
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Unable to delete");
                }
           
                
                try {
                    
                        
                    
                    String strSQL2 = "Delete from statecode where Z_CODE = '" +(vzcode)+"';";
                    int rowsEffected2 = s3.executeUpdate(strSQL2);

                    if (rowsEffected2 == 0)
                        JOptionPane.showMessageDialog(this, "Record does not exists");
                    else {
                        JOptionPane.showMessageDialog(this,"Record Deleted");
                        // Text boxes cleared
                       
                    }
               stst.setText("");
                stc.setText("");
                stad.setText("");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Unable to delete");
                }
           
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
}//GEN-LAST:event_cmdDeleteActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        DefaultListModel dModel = (DefaultListModel) jList1.getModel();
        // Method to add elements into jList1 control
        dModel.clear();
        try {
            String userName = "Sa";//username of DB
            String password = "suba12345";//password of DB
            String url = "jdbc:sqlserver://localhost:1433;databaseName=stdacc";
            Connection con = DriverManager.getConnection(url,userName, password);
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);
            while (rs.next()) {
                String stid = rs.getString("ST_ID");
                String SName = rs.getString("LN");
                   String vzcode = rs.getString("Z_CODE");
                // To make the Member no. as 4 digit because we will extract 4 digit from list value
		// in mouse click event.

                if (stid.length() < 4)
                {
                    int x = stid.length();
                    int nl = 4 - x;
                    while (nl > 0){
                        stid = stid + " ";
                        nl--;
                    }
                }
                dModel.addElement(stid + "- " + SName+ "- " +vzcode );
            }
            jList1.setModel(dModel);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,e.getMessage());
            e.printStackTrace();
        }
    }//GEN-LAST:event_formWindowGainedFocus

    private void sttpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sttpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sttpActionPerformed

    private void stcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stcActionPerformed

    private void stidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stidActionPerformed

    private void stagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stagActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stagActionPerformed

    private void stadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stadActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new AddStudent().setVisible(true);

        this.dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new STDelUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdDelete;
    private javax.swing.JButton cmdExit1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField stad;
    private javax.swing.JTextField stag;
    private javax.swing.JTextField stb;
    private javax.swing.JTextField stc;
    private javax.swing.JTextField stf;
    private javax.swing.JTextField stg;
    private javax.swing.JTextField stid;
    private javax.swing.JTextField stl;
    private javax.swing.JTextField stnic;
    private javax.swing.JTextField stst;
    private javax.swing.JTextField sttp;
    private javax.swing.JTextField stvd;
    private javax.swing.JTextField zcode;
    // End of variables declaration//GEN-END:variables

}