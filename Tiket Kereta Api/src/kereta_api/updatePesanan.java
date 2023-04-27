package kereta_api;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;

public class updatePesanan extends javax.swing.JFrame {

    public updatePesanan() throws SQLException {
        initComponents();
        cmbAsal.removeAllItems();
        cmbTujuan.removeAllItems();
        tampilAsal();
        readData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cmbTujuan = new javax.swing.JComboBox<>();
        cmbAsal = new javax.swing.JComboBox<>();
        txtStatus = new javax.swing.JTextField();
        txtUser = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtJumlah = new javax.swing.JTextField();
        txtHarga = new javax.swing.JTextField();
        txtTotal = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Update Pesanan");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, -1, -1));

        jLabel3.setText("Email                    :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        jLabel4.setText("Asal                      :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        jLabel5.setText("Username            :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        jLabel6.setText("Jumlah Tiket       :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        jLabel7.setText("Harga Satuan      :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        jLabel8.setText("Harga Total         :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        jLabel9.setText("Tujuan             :");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, -1, -1));

        jLabel10.setText("Status Pembayaran       :");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 240, -1, -1));

        jLabel11.setText("Nama                   :");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        cmbTujuan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbTujuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTujuanActionPerformed(evt);
            }
        });
        jPanel1.add(cmbTujuan, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, 150, -1));

        cmbAsal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbAsal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbAsalActionPerformed(evt);
            }
        });
        jPanel1.add(cmbAsal, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 150, -1));
        jPanel1.add(txtStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 240, 150, -1));
        jPanel1.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 150, -1));
        jPanel1.add(txtNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 150, -1));
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 150, -1));
        jPanel1.add(txtJumlah, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 150, -1));
        jPanel1.add(txtHarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 150, -1));
        jPanel1.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 150, -1));

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/cancel.png"))); // NOI18N
        jButton1.setText("Batal");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 290, -1, -1));

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/confirm.png"))); // NOI18N
        jButton2.setText("Konfirmasi");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/background.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void cmbAsalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbAsalActionPerformed
        try {
            tampilTujuan();
        } catch (SQLException ex) {
            Logger.getLogger(updatePesanan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cmbAsalActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        managePesanan pesan = new managePesanan();
        pesan.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cmbTujuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTujuanActionPerformed
        
    }//GEN-LAST:event_cmbTujuanActionPerformed

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String ID = id.getInstance().getID();
    try {
        Connection conn = koneksi.getConnection();
        PreparedStatement ps = conn.prepareStatement("UPDATE tbl_pesanan SET nama=?, username=?, email=?, asal=?, tujuan=?, jumlah_tiket=?, harga=?, total_harga=?, status_pembayaran=? WHERE id_pesanan=?");
        ps.setString(1, txtNama.getText());
        ps.setString(2, txtUser.getText());
        ps.setString(3, txtEmail.getText());
        ps.setString(4, cmbAsal.getSelectedItem().toString());
        ps.setString(5, cmbTujuan.getSelectedItem().toString());
        ps.setString(6, txtJumlah.getText());
        ps.setString(7, txtHarga.getText());
        ps.setString(8, txtTotal.getText());
        ps.setString(9, txtStatus.getText());
        ps.setString(10, ID);
        int rowsUpdated = ps.executeUpdate();
        if (rowsUpdated > 0) {
            JOptionPane.showMessageDialog(this, "Data berhasil diupdate.");
            managePesanan pesan = new managePesanan();
            pesan.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Data gagal diupdate.");
        }
    } catch (SQLException ex) {
        System.out.println(ex.getMessage());
        JOptionPane.showMessageDialog(this, "Gagal mengupdate data.");
    }
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new updatePesanan().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(updatePesanan.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbAsal;
    private javax.swing.JComboBox<String> cmbTujuan;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtHarga;
    private javax.swing.JTextField txtJumlah;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtStatus;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtUser;
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
    
    private void readData(){
        String ID = id.getInstance().getID();
        try {
            Connection conn = koneksi.getConnection();
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM tbl_pesanan WHERE id_pesanan = ?");
            ps.setString(1, ID);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                txtNama.setText(rs.getString("nama"));
                txtUser.setText(rs.getString("username"));
                txtEmail.setText(rs.getString("email"));
                cmbAsal.setSelectedItem(rs.getString("asal"));
                cmbTujuan.setSelectedItem(rs.getString("tujuan"));
                txtJumlah.setText(rs.getString("jumlah_tiket"));
                txtHarga.setText(rs.getString("harga"));
                txtTotal.setText(rs.getString("total_harga"));
                txtStatus.setText(rs.getString("status_pembayaran"));
            } else {
                JOptionPane.showMessageDialog(this, "Data tidak ditemukan.");
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(this, "Failed to retrieve data.");
        }
    }
    
}
