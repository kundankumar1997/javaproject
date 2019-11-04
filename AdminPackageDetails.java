

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kundan Pandey
 */
public class AdminPackageDetails extends javax.swing.JFrame {
 
    /**
     * Creates new form AdminPackageDetails
     */
    public AdminPackageDetails() {
        initComponents();
        
       
       
        
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        add_package = new javax.swing.JButton();
        main_admin_button = new javax.swing.JButton();
        show_pacdetail_button = new javax.swing.JButton();
        frontAdmin_panel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        add_package.setText("Add Package");
        add_package.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_packageActionPerformed(evt);
            }
        });
        jPanel1.add(add_package, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 120, -1));

        main_admin_button.setText("Main Admin Panel");
        main_admin_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                main_admin_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(main_admin_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 120, -1));

        show_pacdetail_button.setText("Show Pack. Details");
        show_pacdetail_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show_pacdetail_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(show_pacdetail_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 120, -1));

        frontAdmin_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(frontAdmin_panel, javax.swing.GroupLayout.DEFAULT_SIZE, 628, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE)
            .addComponent(frontAdmin_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void main_admin_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_main_admin_buttonActionPerformed
        new AdminPage().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_main_admin_buttonActionPerformed

    private void show_pacdetail_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_show_pacdetail_buttonActionPerformed
      new ShowPackageDetails().setVisible(true);
     
    }//GEN-LAST:event_show_pacdetail_buttonActionPerformed

    private void add_packageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_packageActionPerformed
      new Addpackage().setVisible(true);
    }//GEN-LAST:event_add_packageActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_package;
    private javax.swing.JPanel frontAdmin_panel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton main_admin_button;
    private javax.swing.JButton show_pacdetail_button;
    // End of variables declaration//GEN-END:variables
}
