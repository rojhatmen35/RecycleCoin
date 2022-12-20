
package database.transactions;

import database.DbVeriMerkezi;
import database.IBilgiController;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class AdminHesapBilgileri extends DbVeriMerkezi implements IBilgiController {
    
    //Singleton   
    private static AdminHesapBilgileri adminHesapBilgileri = null;

    public static AdminHesapBilgileri getInstance() {       //Hesap bilgilerini döndüren method

        if (adminHesapBilgileri == null) {
            adminHesapBilgileri = new AdminHesapBilgileri();
        }
        return adminHesapBilgileri;
    }

    @Override
    public boolean bilgilerGecerliMi() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public AdminHesapBilgileri getAdminHesapBilgileri() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
    public void adminGirisYap(String musteriKimlik) {
        this.kullaniciyiAl(musteriKimlik);      
    }

    //Kullanıcı hesap bilgilerini alma işlemleri
    private void kullaniciyiAl(String musteriKimlik) {
        String query = "SELECT * FROM admin_giris"
                + " WHERE "             
                + "admin_adi = '" + musteriKimlik + "'";
        try {
            super.statement = super.connection.createStatement();
            ResultSet rs = statement.executeQuery(query); //Yazdığımız query i çalıştırır
            while (rs.next()) {//  sorguyu dolaşır ve bize bir değer dönülmüş ise
                super.adminAdi = rs.getNString("admin_adi"); //Veri tabanındaki kullanici_id sütunundaki veriyi VeriMerkezindeki kullaniciId değişkenine aktarır
                super.adminSifre = rs.getNString("sifre");
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(HesapBilgileri.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
}
