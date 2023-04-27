package kereta_api;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;

/**
 *
 * @author KYC
 */
public class pemesananTiket extends javax.swing.JFrame {
    
    public pemesananTiket() throws SQLException {
        initComponents();
        cmbAsal.removeAllItems();
        cmbTujuan.removeAllItems();
        txtHarga.setEditable(false);
        txtTotal.setEditable(false);    
        tampilAsal();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jDatePickerUtil1 = new org.jdatepicker.util.JDatePickerUtil();
        jDatePickerUtil2 = new org.jdatepicker.util.JDatePickerUtil();
        utilCalendarModel1 = new org.jdatepicker.impl.UtilCalendarModel();
        jDatePickerUtil3 = new org.jdatepicker.util.JDatePickerUtil();
        dateComponentFormatter1 = new org.jdatepicker.impl.DateComponentFormatter();
        jDateComponentFactory1 = new org.jdatepicker.JDateComponentFactory();
        utilCalendarModel2 = new org.jdatepicker.impl.UtilCalendarModel();
        utilDateModel1 = new org.jdatepicker.impl.UtilDateModel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cmbTujuan = new javax.swing.JComboBox<>();
        cmbAsal = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        txtTotal = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtJumlah = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtHarga = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btnPesan = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        lblKuota = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Menu Pemesanan Tiket");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 204, 0));
        jLabel3.setText("Tujuan :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 50, 20));

        cmbTujuan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbTujuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTujuanActionPerformed(evt);
            }
        });
        jPanel1.add(cmbTujuan, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, 130, -1));

        cmbAsal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbAsal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmbAsalMouseClicked(evt);
            }
        });
        cmbAsal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbAsalActionPerformed(evt);
            }
        });
        jPanel1.add(cmbAsal, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 130, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 204, 0));
        jLabel4.setText("Nama :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 40, 20));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 204, 0));
        jLabel6.setText("Kuota :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 50, 40, 20));

        txtNama.setBackground(new java.awt.Color(204, 204, 204));
        txtNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaActionPerformed(evt);
            }
        });
        txtNama.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNamaKeyPressed(evt);
            }
        });
        jPanel1.add(txtNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 130, -1));

        txtTotal.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, 130, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 204, 0));
        jLabel8.setText("Total Harga :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 80, 40));

        txtEmail.setBackground(new java.awt.Color(204, 204, 204));
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEmailKeyPressed(evt);
            }
        });
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 130, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 204, 0));
        jLabel10.setText("Email :");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 40, 20));

        txtJumlah.setBackground(new java.awt.Color(204, 204, 204));
        txtJumlah.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtJumlahKeyPressed(evt);
            }
        });
        jPanel1.add(txtJumlah, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 130, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 204, 0));
        jLabel11.setText("Jumlah :");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 50, 20));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 204, 0));
        jLabel9.setText("Harga : ");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 50, 20));

        txtHarga.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(txtHarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 130, -1));

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/back.png"))); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 250, -1, -1));

        btnPesan.setBackground(new java.awt.Color(204, 204, 204));
        btnPesan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/tambah.png"))); // NOI18N
        btnPesan.setText("Buat Pesanan");
        btnPesan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesanActionPerformed(evt);
            }
        });
        jPanel1.add(btnPesan, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 204, 0));
        jLabel12.setText("Asal : ");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 40, 20));

        lblKuota.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblKuota.setForeground(new java.awt.Color(51, 204, 0));
        jPanel1.add(lblKuota, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 50, 40, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/istockphoto-1287363955-170667a.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaActionPerformed

    private void cmbAsalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbAsalActionPerformed
        try {
            tampilTujuan();
        } catch (SQLException ex) {
            Logger.getLogger(pemesananTiket.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            cekKuota();
        } catch (SQLException ex) {
            Logger.getLogger(pemesananTiket.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cmbAsalActionPerformed

    private void cmbAsalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbAsalMouseClicked

    }//GEN-LAST:event_cmbAsalMouseClicked

    private void cmbTujuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTujuanActionPerformed
        try {
            cekKuota();
        } catch (SQLException ex) {
            Logger.getLogger(pemesananTiket.class.getName()).log(Level.SEVERE, null, ex);
        }      
    }//GEN-LAST:event_cmbTujuanActionPerformed

    private void btnPesanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesanActionPerformed
        String username = User.getInstance().getUsername();
        String asal = (String) cmbAsal.getSelectedItem();
        String tujuan = (String) cmbTujuan.getSelectedItem();
        String nama = txtNama.getText();
        String email = txtEmail.getText();
        String jumlah = txtJumlah.getText();
        String harga = txtHarga.getText();
        int total = (Integer.parseInt(txtTotal.getText()));
        
        if (nama.isEmpty() || email.isEmpty() || jumlah.isEmpty() || harga.isEmpty()){
            JOptionPane.showMessageDialog(this,"Form Belum Terisi Semua", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            try {
                Connection conn = koneksi.getConnection();
                String sql = "INSERT INTO tbl_pesanan (username, nama, email, asal, tujuan, jumlah_tiket, harga, total_harga, status_pembayaran) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
                PreparedStatement st = conn.prepareStatement(sql);
                st.setString(1, username);
                st.setString(2, nama);
                st.setString(3, email);
                st.setString(4, asal);
                st.setString(5, tujuan);
                st.setInt(6, Integer.parseInt(jumlah));
                st.setInt(7, Integer.parseInt(harga));
                st.setInt(8, total);
                st.setString(9, "Belum Dibayar");
                st.executeUpdate();
                JOptionPane.showMessageDialog(this,"Data berhasil disimpan", "Sukses", JOptionPane.INFORMATION_MESSAGE);
                int banyak = Integer.parseInt(txtJumlah.getText());
                String sql2 = "UPDATE tbl_kereta SET kuota = kuota - ? WHERE asal_kereta = ? and tujuan_kereta = ?";
                PreparedStatement st2 = conn.prepareStatement(sql2);
                st2.setInt(1, banyak);
                st2.setString(2, asal);
                st2.setString(3, tujuan);
                st2.executeUpdate();
                clear();
                cekKuota();
                
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this,"Terjadi kesalahan saat menyimpan data", "Error", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            }
            
        }
    }//GEN-LAST:event_btnPesanActionPerformed

    private void txtNamaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNamaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
        txtEmail.requestFocus();
        }
    }//GEN-LAST:event_txtNamaKeyPressed

    private void txtEmailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
        txtJumlah.requestFocus();
        }
    }//GEN-LAST:event_txtEmailKeyPressed

    private void txtJumlahKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtJumlahKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                batasKuota();
                if(!txtJumlah.getText().isEmpty()){
                    tampilHarga();
                    hitungJumlah();
                }
            } catch (SQLException ex) {
                Logger.getLogger(pemesananTiket.class.getName()).log(Level.SEVERE, null, ex);
            }           
        }
        
    }//GEN-LAST:event_txtJumlahKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        menuUser user = new menuUser();
        user.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    
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
            java.util.logging.Logger.getLogger(pemesananTiket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pemesananTiket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pemesananTiket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pemesananTiket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new pemesananTiket().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(pemesananTiket.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPesan;
    private javax.swing.JComboBox<String> cmbAsal;
    private javax.swing.JComboBox<String> cmbTujuan;
    private org.jdatepicker.impl.DateComponentFormatter dateComponentFormatter1;
    private javax.swing.JButton jButton1;
    private org.jdatepicker.JDateComponentFactory jDateComponentFactory1;
    private org.jdatepicker.util.JDatePickerUtil jDatePickerUtil1;
    private org.jdatepicker.util.JDatePickerUtil jDatePickerUtil2;
    private org.jdatepicker.util.JDatePickerUtil jDatePickerUtil3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblKuota;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtHarga;
    private javax.swing.JTextField txtJumlah;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtTotal;
    private org.jdatepicker.impl.UtilCalendarModel utilCalendarModel1;
    private org.jdatepicker.impl.UtilCalendarModel utilCalendarModel2;
    private org.jdatepicker.impl.UtilDateModel utilDateModel1;
    // End of variables declaration//GEN-END:variables
    private void tampilAsal() throws SQLException{
        String sql = "SELECT DISTINCT asal_kereta FROM tbl_kereta";
        Connection conn = koneksi.getConnection();
        Statement st = conn.createStatement();
        ResultSet res = st.executeQuery(sql);
        try {
            while (res.next()) {
                cmbAsal.addItem(res.getString("asal_kereta"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } 
    }
    
    private void tampilTujuan() throws SQLException{
        String sql = "SELECT DISTINCT tujuan_kereta FROM tbl_kereta where asal_kereta = '"+cmbAsal.getSelectedItem()+"'";
        Connection conn = koneksi.getConnection();
        Statement st = conn.createStatement();
        ResultSet res = st.executeQuery(sql);
        try {
            cmbTujuan.removeAllItems();
            while (res.next()) {
                cmbTujuan.addItem(res.getString("tujuan_kereta"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } 
    }
    
    private void tampilHarga() throws SQLException{
        String sql = "SELECT harga FROM tbl_kereta where asal_kereta = '"+cmbAsal.getSelectedItem()+"' and tujuan_kereta = '"+cmbTujuan.getSelectedItem()+"'";
        Connection conn = koneksi.getConnection();
        Statement st = conn.createStatement();
        ResultSet res = st.executeQuery(sql);
        try {
            if (res.next()) {
                int harga = res.getInt("harga");
                txtHarga.setText(String.valueOf(harga));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } 
    }
    
    private void hitungJumlah() throws SQLException{
        String sql = "SELECT harga FROM tbl_kereta where asal_kereta = '"+cmbAsal.getSelectedItem()+"' and tujuan_kereta = '"+cmbTujuan.getSelectedItem()+"'";
        Connection conn = koneksi.getConnection();
        Statement st = conn.createStatement();
        ResultSet res = st.executeQuery(sql);
        try {
            if (res.next()) {
                int harga = res.getInt("harga");
                int jumlah = Integer.parseInt(txtJumlah.getText());
                int total = harga * jumlah;
                txtTotal.setText(String.valueOf(total));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } 
    }
    
    private void clear(){
        txtNama.setText("");
        txtEmail.setText("");
        txtJumlah.setText("");
        txtHarga.setText("");
        txtTotal.setText("");
    }
    
    private void cekKuota() throws SQLException{
        String sql = "SELECT kuota FROM tbl_kereta where asal_kereta = '"+cmbAsal.getSelectedItem()+"' and tujuan_kereta = '"+cmbTujuan.getSelectedItem()+"'";
        Connection conn = koneksi.getConnection();
        Statement st = conn.createStatement();
        ResultSet res = st.executeQuery(sql);
        try {
            if (res.next()) {
                int kuota = res.getInt("kuota");
                lblKuota.setText(String.valueOf(kuota));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } 
    }
    
    private void batasKuota() throws SQLException{
        String sql = "SELECT kuota FROM tbl_kereta where asal_kereta = '"+cmbAsal.getSelectedItem()+"' and tujuan_kereta = '"+cmbTujuan.getSelectedItem()+"'";
        Connection conn = koneksi.getConnection();
        Statement st = conn.createStatement();
        ResultSet res = st.executeQuery(sql);
        
        int jumlah = (Integer.parseInt(txtJumlah.getText()));
        int kuota = 0;
        try {
            if (res.next()) {
                kuota = res.getInt("kuota");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } 
        if (jumlah > kuota){
             JOptionPane.showMessageDialog(this,"Kuota Tidak Cukup", "Error", JOptionPane.ERROR_MESSAGE);
             txtJumlah.setText("");
             txtHarga.setText("");
             txtTotal.setText("");
        }
    }
    
}
