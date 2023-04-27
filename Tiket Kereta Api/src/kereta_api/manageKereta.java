/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package kereta_api;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;

/**
 *
 * @author KYC
 */
public class manageKereta extends javax.swing.JFrame {
    DefaultTableModel model;
    
    public manageKereta() {
        initComponents();
        txtID.setVisible(false);
        clear();
        String []judul = {"ID","Nama Kereta","Asal","Tujuan","Kuota","Harga"};
        model = new DefaultTableModel(judul,0);
        tableKereta.setModel(model);
        btnEdit.setEnabled(false);
        btnHapus.setEnabled(false);
        tampilData();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtAsal = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        btnTambah = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtTujuan = new javax.swing.JTextField();
        txtKuota = new javax.swing.JTextField();
        txtHarga = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableKereta = new javax.swing.JTable();
        txtID = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Manajemen Kereta");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));
        jPanel1.add(txtAsal, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 140, -1));

        btnBack.setBackground(new java.awt.Color(204, 204, 204));
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/back.png"))); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 290, 100, 40));

        btnTambah.setBackground(new java.awt.Color(204, 204, 204));
        btnTambah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/tambah.png"))); // NOI18N
        btnTambah.setText("Tambah");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });
        jPanel1.add(btnTambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 120, 40));

        btnEdit.setBackground(new java.awt.Color(204, 204, 204));
        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/edit.png"))); // NOI18N
        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        jPanel1.add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 100, 40));

        btnHapus.setBackground(new java.awt.Color(204, 204, 204));
        btnHapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/hapus.png"))); // NOI18N
        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });
        jPanel1.add(btnHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, 110, 40));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel6.setText("Tujuan  : ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel8.setText("Nama Kereta :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel9.setText("Kuota :");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel10.setText("Harga :");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel11.setText("Asal :");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, -1));
        jPanel1.add(txtTujuan, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 140, -1));
        jPanel1.add(txtKuota, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 140, -1));
        jPanel1.add(txtHarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 140, -1));

        txtNama.setBackground(new java.awt.Color(255, 255, 255));
        txtNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaActionPerformed(evt);
            }
        });
        jPanel1.add(txtNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 140, -1));

        tableKereta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableKereta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableKeretaMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tableKeretaMouseExited(evt);
            }
        });
        jScrollPane2.setViewportView(tableKereta);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 350, 270));

        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });
        jPanel1.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 140, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/background.png"))); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 630, 350));

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

    private void txtNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaActionPerformed
        
    }//GEN-LAST:event_txtNamaActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
    String nama = txtNama.getText();
    String asal = txtAsal.getText();
    String tujuan = txtTujuan.getText();
    String kuotaStr = txtKuota.getText();
    String hargaStr = txtHarga.getText();
        
    if (nama.isEmpty() || asal.isEmpty() || tujuan.isEmpty() || kuotaStr.isEmpty() || hargaStr.isEmpty()){
        JOptionPane.showMessageDialog(this,"Form Belum Terisi Semua", "Error", JOptionPane.ERROR_MESSAGE);
    } else {
        try {
            int kuota = Integer.parseInt(kuotaStr);
            int harga = Integer.parseInt(hargaStr);
            try (Connection conn = koneksi.getConnection();
                 PreparedStatement stmt = conn.prepareStatement("SELECT * FROM tbl_kereta WHERE nama_kereta = ?");
                 PreparedStatement stmt2 = conn.prepareStatement("SELECT * FROM tbl_kereta WHERE asal_kereta = ? AND tujuan_kereta = ?");
                 PreparedStatement stmt3 = conn.prepareStatement("INSERT INTO tbl_kereta (nama_kereta, asal_kereta, tujuan_kereta, kuota, harga) VALUES (?, ?, ?, ?, ?)")) {
                stmt.setString(1, nama);
                ResultSet rs = stmt.executeQuery();
                if (rs.next()) {
                    JOptionPane.showMessageDialog(this, "Nama Kereta Sudah Dipakai");
                } else {
                    stmt2.setString(1, asal);
                    stmt2.setString(2, tujuan);
                    ResultSet res = stmt2.executeQuery();
                    if (res.next()) {
                        JOptionPane.showMessageDialog(this, "Asal Dan Tujuan Kereta Sudah Ada");
                    } else {
                        stmt3.setString(1, nama);
                        stmt3.setString(2, asal);
                        stmt3.setString(3, tujuan);
                        stmt3.setInt(4, kuota);
                        stmt3.setDouble(5, harga);
                        stmt3.executeUpdate();
                        JOptionPane.showMessageDialog(this, "Penambahan Berhasil!");
                        clear();
                        tampilData();
                    }
                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Kuota dan Harga harus berupa angka.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(this, "Registration failed.");
        }
    }
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        mainAdmin admin = new mainAdmin();
        admin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void tableKeretaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableKeretaMouseClicked
        btnEdit.setEnabled(true);
        btnHapus.setEnabled(true);
        btnTambah.setEnabled(false);
        int i = tableKereta.getSelectedRow();
        if(i>-1){
        txtID.setText(model.getValueAt(i,0).toString());
        txtNama.setText(model.getValueAt(i, 1).toString());
        txtAsal.setText(model.getValueAt(i,2).toString());
        txtTujuan.setText(model.getValueAt(i,3).toString());
        txtKuota.setText(model.getValueAt(i,4).toString());
        txtHarga.setText(model.getValueAt(i,5).toString());
        }
    }//GEN-LAST:event_tableKeretaMouseClicked

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        String nama = txtNama.getText();
        String asal = txtAsal.getText();
        String tujuan = txtTujuan.getText();
        String kuota = txtKuota.getText();
        String harga = txtHarga.getText();
        try {           
            String sql = "UPDATE  tbl_kereta set nama_kereta ='"+nama+"',asal_kereta='"+asal+"',tujuan_kereta ='"+tujuan+"',kuota ='"+kuota+"',harga ='"+harga+"' WHERE id_kereta='"+txtID.getText()+"'";
            Connection conn = koneksi.getConnection();
            Statement st = conn.createStatement();
            st.execute(sql);
            JOptionPane.showMessageDialog(null,"Edit Data Berhasil"); 
            clear();
            tampilData();
        } catch (Exception e) {
           JOptionPane.showMessageDialog(null,"Edit Data Gagal");
        }  
    }//GEN-LAST:event_btnEditActionPerformed

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed

    }//GEN-LAST:event_txtIDActionPerformed

    private void tableKeretaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableKeretaMouseExited

    }//GEN-LAST:event_tableKeretaMouseExited

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        clear();
        txtID.setText("");
        btnTambah.setEnabled(true);
        btnEdit.setEnabled(false);
        btnHapus.setEnabled(false);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        try {
            int pilih = JOptionPane.showConfirmDialog(this,"Apakah Anda Yakin Ingin Menghapus ","DELETE",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
            if (pilih==JOptionPane.YES_OPTION){
                String sql = "DELETE FROM tbl_kereta WHERE id_kereta='"+txtID.getText()+"'";
                Connection conn = koneksi.getConnection();
                Statement st = conn.createStatement();
                st.execute(sql);
                JOptionPane.showMessageDialog(null,"Hapus Data Berhasil");
                tampilData();
            }else{
            JOptionPane.showMessageDialog(null,"Hapus Data Di Batalkan");
        }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Hapus Data Gagal");

        }
    }//GEN-LAST:event_btnHapusActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new manageKereta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnTambah;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tableKereta;
    private javax.swing.JTextField txtAsal;
    private javax.swing.JTextField txtHarga;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtKuota;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtTujuan;
    // End of variables declaration//GEN-END:variables
    private void clear(){
        txtNama.setText("");
        txtAsal.setText("");
        txtTujuan.setText("");
        txtKuota.setText("");
        txtHarga.setText("");
    }
    
    private void tampilData(){
    int row = tableKereta.getRowCount();
    for (int i=0; i<row; i++){
    model.removeRow(0);}

    try {
            String sql = "SELECT * FROM tbl_kereta";
            Connection conn = koneksi.getConnection();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                String data [] = {rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6)};
                model.addRow(data);
            
            
            }
             } catch (Exception e) {
            
            System.out.println("Ambil Data Gagal");
        }
    }
    
    
}
