package test;
import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class hapus {
    Koneksi konek=new Koneksi();
    public void hapusDataPengguna (String id){
        try{
            String sql="DELETE FROM tbl_pengguna WHERE id_pengguna='"+id+"'";
                   Connection con=(Connection)Koneksi.getConnection();
                   PreparedStatement pst=(PreparedStatement)con.prepareStatement(sql);
                   pst.execute();
                   JOptionPane.showMessageDialog(null,"Data Berhasil Dihapus");
        }catch(Exception e){
                   JOptionPane.showMessageDialog(null,"Data Gagal Dihapus"+e.getMessage());            
        }
    }
    public void hapusDataSupplier (String kode){
       try{
           String sql="DELETE FROM tbl_supplier WHERE KodeSupplier='"+kode+"'";
           Connection con=(Connection)Koneksi.getConnection();
                   PreparedStatement pst=(PreparedStatement)con.prepareStatement(sql);
                   pst.execute();
                   JOptionPane.showMessageDialog(null,"Data Berhasil Dihapus");
       }catch(Exception e){
           JOptionPane.showMessageDialog(null,"Data Gagal dihapus"+e.getMessage());
       }
    }
    public void hapusDataKategori(String idKategori){
        try{
        String sqlKategori="DELETE FROM tbl_kategori WHERE idKategori='"+idKategori+"'";
        Connection con=(Connection)Koneksi.getConnection();
        PreparedStatement pst=(PreparedStatement)con.prepareStatement(sqlKategori);
        pst.execute();
        JOptionPane.showMessageDialog(null,"Data Berhasil dihapus");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Data Gagal dihapus"+e.getMessage());
        
    }
    }
}
