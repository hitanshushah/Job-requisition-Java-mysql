
package jobrequisition;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class Jobapplication extends javax.swing.JFrame {

    /**
     * Creates new form Jobapplication
     */
    public Jobapplication() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        lname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        e_id = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        dob = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        gencom = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        adr = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        con = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        q_det = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        skls = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        exp = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        des = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        com = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("Job Application:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 125, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("First Name:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 171, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Last Name:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 213, -1, -1));

        fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnameActionPerformed(evt);
            }
        });
        getContentPane().add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 170, 645, -1));

        lname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnameActionPerformed(evt);
            }
        });
        getContentPane().add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 212, 639, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Email-id:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 257, -1, -1));

        e_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                e_idActionPerformed(evt);
            }
        });
        getContentPane().add(e_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 256, 639, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Date Of Birth:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 301, -1, -1));
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(352, 300, 131, -1));

        dob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dobActionPerformed(evt);
            }
        });
        getContentPane().add(dob, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 300, 203, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Gender:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 300, -1, -1));

        gencom.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        gencom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other", " " }));
        gencom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gencomActionPerformed(evt);
            }
        });
        getContentPane().add(gencom, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 300, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Address:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 343, -1, -1));

        adr.setColumns(20);
        adr.setRows(5);
        jScrollPane1.setViewportView(adr);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 343, 639, 37));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Contact No:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 397, -1, -1));
        getContentPane().add(con, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 396, 639, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("Qualification Details:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 441, 195, -1));

        q_det.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q_detActionPerformed(evt);
            }
        });
        getContentPane().add(q_det, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 440, 581, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("Skills:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 476, -1, -1));

        skls.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sklsActionPerformed(evt);
            }
        });
        getContentPane().add(skls, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 475, 643, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setText("Experience:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 511, -1, -1));

        exp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                expActionPerformed(evt);
            }
        });
        getContentPane().add(exp, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 510, 644, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setText("Designation Applied for:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 553, -1, -1));
        getContentPane().add(des, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 552, 543, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setText("Comments/Queries:");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 587, -1, -1));

        com.setColumns(20);
        com.setRows(5);
        jScrollPane2.setViewportView(com);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 587, 543, 49));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Apply");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(348, 652, -1, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("Click For Interview Details");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 703, 655, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lnameActionPerformed

    private void e_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_e_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_e_idActionPerformed

    private void dobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dobActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dobActionPerformed

    private void gencomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gencomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gencomActionPerformed

    private void q_detActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q_detActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_q_detActionPerformed

    private void sklsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sklsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sklsActionPerformed

    private void expActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_expActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_expActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        setVisible(false);
        Interviewdetails id = new Interviewdetails();
        id.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //JDBC Connections
        try
        {
                  Class.forName("oracle.jdbc.driver.OracleDriver");
                  Connection c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521","system","123");
                  
                  PreparedStatement ps = c.prepareStatement("insert into application values(?,?,?,?,?,?,?,?,?,?,?,?)");
                  String tfname,tlname,te_id,tdob,tgencom,tadr,tq_det,tskls,texp,tdes,tcom,tcon;
                  tfname = fname.getText();
                  tlname = lname.getText();
                  te_id = e_id.getText();
                  tdob = dob.getText();
                  tcon = con.getText();
                  tgencom = gencom.getSelectedItem().toString();
                  tadr = adr.getText();
                  tq_det = q_det.getText();
                  tskls = skls.getText();
                  texp = exp.getText();
                  tdes = des.getText();
                  tcom = com.getText();
                  ps.setString(1,tfname);//FIRST NAME
                  ps.setString(2,tlname);
                  ps.setString(3,te_id);//EMAIL
                  ps.setString(4,tdob);//PASSWORD
                  ps.setString(5,tgencom);//PHONENO
                  ps.setString(6,tadr);//STATE
                  ps.setString(7,tcon);//COUNTRY
                  ps.setString(8,tq_det);
                  ps.setString(9,tskls);
                  ps.setString(10,texp);
                  ps.setString(11,tdes);
                  ps.setString(12,tcom);
                  ResultSet rs = ps.executeQuery();
                  JOptionPane.showMessageDialog(this, "You application is succesful!");
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void fnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnameActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jobapplication().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea adr;
    private javax.swing.JTextArea com;
    private javax.swing.JTextField con;
    private javax.swing.JTextField des;
    private javax.swing.JTextField dob;
    private javax.swing.JTextField e_id;
    private javax.swing.JTextField exp;
    private javax.swing.JTextField fname;
    private javax.swing.JComboBox<String> gencom;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField lname;
    private javax.swing.JTextField q_det;
    private javax.swing.JTextField skls;
    // End of variables declaration//GEN-END:variables
}
