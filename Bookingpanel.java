
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Kundan Pandey
 */
public class Bookingpanel extends javax.swing.JPanel {

    String facility = "";
    Connection conn = null;
    Date date1, date2;
    LocalDate date = LocalDate.now();
    String cid = null;

    /**
     * Creates new form Bookingpanel
     */
    public Bookingpanel() {
        initComponents();
        date();
        facility();
        fac_list.removeAll();
        checkinDate();
        fillBooking();
        num_days();
        totalAmount();
        selectedLoc();
        conn = Databaseconnectivity.connectDatabase();
    }

    public void date() {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String s = date.format(formatter);
        dob_label.setText(s);

    }

    public void facility() {
        DefaultListModel listModel = new DefaultListModel();
        for (int i = 0; i < PackageFac.feature.size(); i++) {
            listModel.addElement(PackageFac.feature.get(i));
        }
        fac_list.setModel(listModel);

    }
    public void BookingId()
    {
        try{
            String sql="select booking_id from customer where c_id="+PackageFac.customer_id;
            PreparedStatement st=conn.prepareStatement(sql);
            ResultSet rs=st.executeQuery();
            while(rs.next())
            {
                int bookingid=rs.getInt("booking_id");
                JOptionPane.showMessageDialog(null,"your booking id is:"+bookingid);
            }
            
        }catch(Exception e)
        {
            
        }
    }

    public void checkinDate() {
        String date = null;
        try {
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            date = df.format(checkin_jDateChooser.getDate());

        } catch (Exception ex) {

        }
        System.out.println("date " + date);
    }

    public void fillBooking() {
        bpac_type_label.setText(PackageFac.Pac_type);
    }

    public void num_days() {
        num_of_days.setText(Integer.toString(PackageFac.no_days));
    }

    public void totalAmount() {
        total_amount.setText(Integer.toString(PackageFac.total_amount));
    }

    public void selectedLoc() {
        loc_selected.setText(PackageFac.location_name);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        customer_name_txtbox = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        c_age_label = new javax.swing.JTextField();
        book_button = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        loc_selected = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        p_no = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        c_address = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        num_of_days = new javax.swing.JLabel();
        bpac_type_label = new javax.swing.JLabel();
        total_amount = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        dob_label = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        fac_list = new javax.swing.JList<>();
        checkin_jDateChooser = new com.toedter.calendar.JDateChooser();
        male_radiobutton = new javax.swing.JRadioButton();
        female_radiobutton = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(748, 489));
        setPreferredSize(new java.awt.Dimension(748, 489));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Customer details");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(269, 269, 269)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(274, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Customer Name");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 155, -1, -1));
        add(customer_name_txtbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 153, 144, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Age");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 204, 42, 20));
        add(c_age_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 204, 47, -1));

        book_button.setText("Confirm Booking");
        book_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                book_buttonActionPerformed(evt);
            }
        });
        add(book_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 370, -1, 42));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Total Amount with facilities");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, -1, 20));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Type");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 37, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("Selected Location");
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 74, -1, -1));
        add(loc_selected, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 73, 93, 22));

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setText("Phone No");
        add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, -1));
        add(p_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 144, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Address");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("checkin date");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, -1, 20));
        add(c_address, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 180, 130, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("No. of days");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 114, -1, -1));

        num_of_days.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(num_of_days, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 113, 46, 22));
        add(bpac_type_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 40, 90, 20));

        total_amount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(total_amount, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 50, 120, 22));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Date Of Booking");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, -1, -1));

        dob_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(dob_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, 130, 22));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("facilities ");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 270, -1, -1));

        jScrollPane1.setViewportView(fac_list);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 230, 120, -1));
        add(checkin_jDateChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, 130, -1));

        buttonGroup2.add(male_radiobutton);
        male_radiobutton.setText("Male");
        male_radiobutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                male_radiobuttonActionPerformed(evt);
            }
        });
        add(male_radiobutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, -1, -1));

        buttonGroup2.add(female_radiobutton);
        female_radiobutton.setText("Female");
        female_radiobutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                female_radiobuttonActionPerformed(evt);
            }
        });
        add(female_radiobutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Gender");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 70, 20));
    }// </editor-fold>//GEN-END:initComponents

    private void male_radiobuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_male_radiobuttonActionPerformed
        male_radiobutton.setActionCommand("Male");
    }//GEN-LAST:event_male_radiobuttonActionPerformed

    private void book_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_book_buttonActionPerformed
        String pac_type = bpac_type_label.getText();
        String loc = loc_selected.getText();
        int num_days = Integer.parseInt(num_of_days.getText());
        String c_name = customer_name_txtbox.getText();
        String c_age = c_age_label.getText();
        String gender = buttonGroup2.getSelection().getActionCommand();
        String ph_num = p_no.getText();
        String Amount = total_amount.getText();
        String dob = dob_label.getText();
        checkin_jDateChooser.setDateFormatString("dd/MM/yyyy");
        String checkin = checkin_jDateChooser.getDateFormatString();
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
        String cid = sdf.format(checkin_jDateChooser.getDate());
       
        String address = c_address.getText();
        for (int c = 0; c < PackageFac.feature.size(); c++) {
            facility = facility + PackageFac.feature.get(c) + ",";
        }
        facility = facility.replaceAll(",$", "");
        String cus_facility = facility;
        if (pac_type.equals("")) {
            JOptionPane.showMessageDialog(null, " please select package Type from package");
            return;
        }
        if (loc.equals("")) {
            JOptionPane.showMessageDialog(null, " please select location name Type from location Page");
            return;
        }
        if (c_name.equals("")) {
            JOptionPane.showMessageDialog(null, "Enter customer Name");
            return;
        }
        if (gender.equals("")) {
            JOptionPane.showMessageDialog(null, "select Gender");
            return;
        }
        if (Amount.equals("")) {
            JOptionPane.showMessageDialog(null, "select Package Amount");
            return;
        }
        if (checkin.equals("")) {
            JOptionPane.showMessageDialog(null, "select checkIn date");
            return;
        }
        if (address.equals("")) {
            JOptionPane.showMessageDialog(null, "please Enter your address");
            return;
        }
        try {
            String sql = "insert into customer(customer_name,phone_no,num_days,customer_add,price,feature,c_id,location_name,pac_type,Gender,dob,checkinDate) values(?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, c_name);
            st.setString(2, ph_num);
            st.setInt(3, num_days);
            st.setString(4, address);
            st.setString(5, Amount);
            st.setString(6, cus_facility);
            st.setInt(7, PackageFac.customer_id);
            st.setString(8, loc);
            st.setString(9, pac_type);
            st.setString(10, gender);
            st.setString(11, date.toString());
            st.setString(12, cid);
            st.executeUpdate();
            JOptionPane.showMessageDialog(null, "booked Successfully");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        BookingId();

    }//GEN-LAST:event_book_buttonActionPerformed

    private void female_radiobuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_female_radiobuttonActionPerformed
        female_radiobutton.setActionCommand("Female");
    }//GEN-LAST:event_female_radiobuttonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton book_button;
    private javax.swing.JLabel bpac_type_label;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JTextField c_address;
    private javax.swing.JTextField c_age_label;
    private com.toedter.calendar.JDateChooser checkin_jDateChooser;
    private javax.swing.JTextField customer_name_txtbox;
    private javax.swing.JLabel dob_label;
    private javax.swing.JList<String> fac_list;
    private javax.swing.JRadioButton female_radiobutton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel loc_selected;
    private javax.swing.JRadioButton male_radiobutton;
    private javax.swing.JLabel num_of_days;
    private javax.swing.JTextField p_no;
    private javax.swing.JLabel total_amount;
    // End of variables declaration//GEN-END:variables
}
