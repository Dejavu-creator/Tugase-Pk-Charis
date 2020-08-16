/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Uas_Database;


import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class Update {

    Koneksi konek = new Koneksi();

    public void update(String nama,String kelas, int nilai, int rangking) {

        try {
            konek.koneksi();
            Statement statement = konek.con.createStatement();

// data akan diambil lewat nama textField.getText
            String sql_kelas = "update daftaranggota set kelas ='" + kelas + "' where nama= '" + nama + "'";
            String sql_nilai = "update daftaranggota set nilai ='" + nilai + "' where nama= '" + nama + "'";

            String sql_rangking = "update daftaranggota set rangking ='" + rangking + "' where nama= '" + nama + "'";
            
            statement.executeUpdate(sql_kelas);
            statement.executeUpdate(sql_nilai);
            statement.executeUpdate(sql_rangking);
            statement.close();

//// kemudian data yang disisipkan akan saya tampilkan lewat textArea 
//                menampilkan.setText(mah_nim.getText() + "\n" + mah_nama.getText() + "\n" + mah_alamat.getText() + "\n" + mah_fak_id.getText() + "\n" + jenis);
            JOptionPane.showMessageDialog(null, "Berhasil Diubah");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}
