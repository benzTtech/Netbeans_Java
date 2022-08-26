/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import javax.swing.JOptionPane;

public class tambah {
    Koneksi connect=new Koneksi();
    public void tambahPengguna(int ID, String hak, String nama, String password, String username, String status){
        try{
//            System.out.println(username+nama+hak+password+status);
            String sql="INSERT INTO `tbl_pengguna` (`id_pengguna`,`hak_akses`,`nama_lengkap`,`password`,`username`,`status`)"
                    + "VALUES('"+ID+"','"+hak+"','"+nama+"','"+password+"','"+username+"','"+status+"')";
            Connection con=(Connection)Koneksi.getConnection();
            PreparedStatement pst=(PreparedStatement)con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null,"Berhasil disimpan");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Gagal disimpan"+e.getMessage());
            
        }
        
    }
    public void tambahSupplier(int kode, String nama, String jenis, String npwp, String alamat, String telepon){
        try{
          String sql="INSERT INTO tbl_supplier(`KodeSupplier`,`nama_supplier`,`jenis_usaha`,`npwp`,`alamat`,`telepon`)VALUES('"+kode+"','"+nama
                  +"','"+jenis+"','"+npwp+"','"+alamat+"','"+telepon+"')";
          Connection con=(Connection) Koneksi.getConnection();
          PreparedStatement pst=(PreparedStatement) con.prepareStatement(sql);
          pst.execute();
          JOptionPane.showMessageDialog(null,"Berhasil Menyimpan");
        }catch(Exception e){
          JOptionPane.showMessageDialog(null,"Insert data gagal"+e.getMessage());
            
        }
    }
    public void tambahKategori(String idKategori, String KategoriBarang){
        try{
            String sql="INSERT INTO tbl_kategori(`idKategori`,`KategoriBarang`)VALUES('"+idKategori+"','"+KategoriBarang+"')";
            Connection con=(Connection)Koneksi.getConnection();
            PreparedStatement pst=(PreparedStatement)con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null,"Data Berhasil ditambah");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Gagal tambah kategori"+e.getMessage());
        }
    }
}