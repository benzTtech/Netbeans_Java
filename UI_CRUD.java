package test;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class UI_CRUD extends javax.swing.JFrame {

    
    public UI_CRUD() {
        initComponents();
        table();
    }
    
    void cari(){
        DefaultTableModel tbl=new DefaultTableModel();
        tbl.addColumn("NIM");
        tbl.addColumn("Nama");
        tbl.addColumn("Jenis Kelamin");
        tbl.addColumn("Alamat");
        try{
            String sql="SELECT*FROM tbl_crud WHERE id_nim like '%"+tCari.getText()+"%'";
            Connection con=(Connection)Koneksi.getConnection();
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(sql);
            while(rs.next()){
                tbl.addRow(new Object[]{
                rs.getString("id_nim"),
                rs.getString("nama"),
                rs.getString("jenis_kelamin"),
                rs.getString("alamat")
                });
                TblHasil.setModel(tbl);
            }
        }catch(Exception e){
            
        }
    }
    void hapus(){
        tNim.setText("");
        tNama.setText("");
        txAlamat.setText("");
    }
    public void table(){
        DefaultTableModel tbl=new DefaultTableModel();
        tbl.addColumn("NIM");
        tbl.addColumn("Nama");
        tbl.addColumn("Jenis Kelamin");
        tbl.addColumn("Alamat");
        try{
            Statement st=(Statement)Koneksi.getConnection().createStatement();
            ResultSet rs=st.executeQuery("SELECT * FROM tbl_crud");
            
            while(rs.next()){
                tbl.addRow(new Object[]{
                rs.getString("id_nim"),
                rs.getString("nama"),
                rs.getString("jenis_kelamin"),
                rs.getString("alamat"),
                });
                TblHasil.setModel(tbl);
            }
            JOptionPane.showMessageDialog(null,"Koneksi Berhasil");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Koneksi Gagal"+e.getMessage());
            
        }
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tNim = new javax.swing.JTextField();
        tNama = new javax.swing.JTextField();
        rdLaki = new javax.swing.JRadioButton();
        rdPr = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txAlamat = new javax.swing.JTextArea();
        btnTampil = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnTambah = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TblHasil = new javax.swing.JTable();
        tCari = new javax.swing.JTextField();
        btnCari = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("CRUD DATA MAHASISWA");

        jLabel2.setText("NIM");

        jLabel3.setText("Nama ");

        jLabel4.setText("Jenis Kelamin");

        jLabel5.setText("Alamat");

        rdLaki.setText("Laki-Laki");

        rdPr.setText("Perempuan");

        txAlamat.setColumns(20);
        txAlamat.setRows(5);
        jScrollPane1.setViewportView(txAlamat);

        btnTampil.setText("Refresh");
        btnTampil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTampilMouseClicked(evt);
            }
        });

        btnHapus.setText("Hapus");
        btnHapus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHapusMouseClicked(evt);
            }
        });

        btnEdit.setText("Edit");
        btnEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditMouseClicked(evt);
            }
        });

        btnTambah.setText("Tambah");
        btnTambah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTambahMouseClicked(evt);
            }
        });

        TblHasil.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "NIM", "Nama", "Jenis Kelamin", "Alamat"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TblHasil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TblHasilMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TblHasil);

        btnCari.setText("Cari");
        btnCari.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCariMouseClicked(evt);
            }
        });

        btnReset.setText("Reset");
        btnReset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnResetMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnCari)
                                        .addGap(18, 18, 18)
                                        .addComponent(tCari, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnReset))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnTampil)
                                        .addGap(23, 23, 23)
                                        .addComponent(btnEdit)
                                        .addGap(20, 20, 20)
                                        .addComponent(btnTambah)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnHapus))))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(75, 75, 75)
                                    .addComponent(tNim))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(27, 27, 27)
                                            .addComponent(rdLaki)
                                            .addGap(18, 18, 18)
                                            .addComponent(rdPr)
                                            .addGap(191, 191, 191))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(tNama, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(0, 195, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(73, 73, 73)))
                .addGap(180, 180, 180))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tNim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(rdLaki)
                    .addComponent(rdPr))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnHapus)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnTampil)
                        .addComponent(btnEdit)
                        .addComponent(btnTambah)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCari)
                    .addComponent(btnReset))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );

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
    //Tambah Data
    private void btnTambahMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTambahMouseClicked
        // TODO add your handling code here:
        String data=null;
        if(rdLaki.isSelected()){
            data="Laki-Laki";
        }else if(rdPr.isSelected()){
            data="Perempuan";
        }
        try{
            String sql="INSERT INTO tbl_crud VALUES ("
                    + "'"+tNim.getText()
                    +"','"+tNama.getText()
                    +"','"+data+"','"+txAlamat.getText()+"')";
          Connection con=(Connection) Koneksi.getConnection();
          PreparedStatement pst=(PreparedStatement) con.prepareStatement(sql);
          pst.execute();
          JOptionPane.showMessageDialog(null,"Berhasil Menyimpan");
        }catch(Exception e){
          JOptionPane.showMessageDialog(null,"Gagal Menyimpan"+e.getMessage());
            
        }
    }//GEN-LAST:event_btnTambahMouseClicked
    //Tampil
    private void btnTampilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTampilMouseClicked
        try{
            String sql="SELECT * FROM tbl_crud WHERE id_nim ='"+tNim.getText()+"'";
            Connection con=(Connection)Koneksi.getConnection();
            PreparedStatement pst=(PreparedStatement)con.prepareStatement(sql);
            pst.execute();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error"+e.getMessage());
        }
        table();
    }//GEN-LAST:event_btnTampilMouseClicked
    //EDIT
    private void btnEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditMouseClicked
       String data=null;
       if(rdLaki.isSelected()){
           data="Laki-laki";
       }else if(rdPr.isSelected()){
           data="Perempuan";
       }
       try{
           String sql="UPDATE tbl_crud SET id_nim='"+tNim.getText()
                   +"',nama='"+tNama.getText()
                   +"',jenis_kelamin='"+data+"',alamat='"+txAlamat.getText()+"' WHERE id_nim='"+tNim.getText()+"'";
            Connection con=(Connection)Koneksi.getConnection();
            PreparedStatement pst=(PreparedStatement)con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null,"EDIT BERHASIL");
       }catch(Exception e){
           JOptionPane.showMessageDialog(null,"Gagal Edit"+e.getMessage());
       }
       table();
    }//GEN-LAST:event_btnEditMouseClicked

    private void TblHasilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TblHasilMouseClicked
        // TODO add your handling code here:
        int baris=TblHasil.rowAtPoint(evt.getPoint());
        String nim = TblHasil.getValueAt(baris,0).toString();
        tNim.setText(nim);
        String nama = TblHasil.getValueAt(baris,1).toString();
        tNama.setText(nama);
        String alamat = TblHasil.getValueAt(baris,3).toString();
        txAlamat.setText(alamat);
    }//GEN-LAST:event_TblHasilMouseClicked
    //hapus
    private void btnHapusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHapusMouseClicked
        // TODO add your handling code here:
        try{
            String sql="DELETE FROM tbl_crud WHERE id_nim='"+tNim.getText()+"'";
                   Connection con=(Connection)Koneksi.getConnection();
                   PreparedStatement pst=(PreparedStatement)con.prepareStatement(sql);
                   pst.execute();
                   JOptionPane.showMessageDialog(null,"Data Berhasil Dihapus");
        }catch(Exception e){
                   JOptionPane.showMessageDialog(null,"Data Gagal Dihapus"+e.getMessage());
            
        }
    }//GEN-LAST:event_btnHapusMouseClicked
    //cari
    private void btnCariMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCariMouseClicked
        // TODO add your handling code here:
        cari();
        
    }//GEN-LAST:event_btnCariMouseClicked
    //reset
    private void btnResetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnResetMouseClicked
        // TODO add your handling code here:
        hapus();
    }//GEN-LAST:event_btnResetMouseClicked

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
            java.util.logging.Logger.getLogger(UI_CRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI_CRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI_CRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI_CRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI_CRUD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TblHasil;
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnTambah;
    private javax.swing.JButton btnTampil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton rdLaki;
    private javax.swing.JRadioButton rdPr;
    private javax.swing.JTextField tCari;
    private javax.swing.JTextField tNama;
    private javax.swing.JTextField tNim;
    private javax.swing.JTextArea txAlamat;
    // End of variables declaration//GEN-END:variables
}
