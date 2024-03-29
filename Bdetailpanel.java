
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;


public class Bdetailpanel extends javax.swing.JPanel {
  Connection conn = null;
    public Bdetailpanel() {
        initComponents();
          conn = Databaseconnectivity.connectDatabase();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        customer_name = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        phone_num = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        p_amount = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        loc_name = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        checkin_lebel = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        dob_label = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        bookingid_label = new javax.swing.JTextField();
        submit_button = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Customer  Details");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(247, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(238, 238, 238))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 615, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Customer Name");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));
        add(customer_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 110, 25));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Phone No");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, -1, -1));
        add(phone_num, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 100, 24));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Package Amount");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));
        add(p_amount, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 207, 100, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Location");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, -1, -1));
        add(loc_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 90, 20));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Facilities taken");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Check In Date");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, -1, 20));
        add(checkin_lebel, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 90, 108, 25));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Date Of Booking");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, -1, -1));
        add(dob_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 130, 110, 30));

        jButton1.setText("Log Out");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 330, 85, 32));

        jScrollPane2.setViewportView(jList2);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 200, 130, 120));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Booking Id");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 80, 20));
        add(bookingid_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 80, -1));

        submit_button.setText("SUBMIT");
        submit_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit_buttonActionPerformed(evt);
            }
        });
        add(submit_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JOptionPane.showConfirmDialog(null, "Do you want to log Out");
        System.exit(1);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void submit_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submit_buttonActionPerformed
       String bookingid=bookingid_label.getText();
       if(bookingid_label.equals(""))
       {
           JOptionPane.showMessageDialog(null, "please enter your booking id");
           return;
       }
       try{
           int b_id=Integer.parseInt(bookingid);
           String sql="select * from customer where booking_id="+b_id;
           PreparedStatement st=conn.prepareStatement(sql);
            ResultSet rs=st.executeQuery();
             while(rs.next())
             {
                 String cus_name=rs.getString("customer_name");
                 customer_name.setText(cus_name);
                 String p_no=rs.getString("phone_no");
                 phone_num.setText(p_no);
                 int amount=rs.getInt("price");
                 p_amount.setText(Integer.toString(amount));
                 String location=rs.getString("location_name");
                 loc_name.setText(location);
                 Date ck=rs.getDate("checkinDate");
                  DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
                  String date=df.format(ck);
                  checkin_lebel.setText(date);
                  Date db=rs.getDate("dob");
                  String dateofbook=df.format(db);
                  dob_label.setText(dateofbook);
                  String facilitylist=rs.getString("feature");
                   DefaultListModel listModel = new DefaultListModel();
                   for(String l:facilitylist.split(","))
                   {
                       listModel.addElement(l);
                   }
                   jList2.setModel(listModel);
                  
                  
             }
           
       }catch(Exception e)
       {
           JOptionPane.showMessageDialog(null, e);
       }
       
    }//GEN-LAST:event_submit_buttonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bookingid_label;
    private javax.swing.JLabel checkin_lebel;
    private javax.swing.JLabel customer_name;
    private javax.swing.JLabel dob_label;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JList<String> jList2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel loc_name;
    private javax.swing.JLabel p_amount;
    private javax.swing.JLabel phone_num;
    private javax.swing.JButton submit_button;
    // End of variables declaration//GEN-END:variables
}
