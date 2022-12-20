
package database.transactions;

import database.DbConnection;
import database.IBilgiController;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class KullaniciGiris extends DbConnection implements IBilgiController {

    private String musteriKimlik = null;
    private String sifre = null;
    

    public boolean girisBilgileriDogruMu() {
        if (this.bilgilerGecerliMi()) {
            if (this.girisBasariliMi()) {
                this.getHesapBilgileri().girisYap(musteriKimlik);
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }

    }

    @Override
    public boolean bilgilerGecerliMi() {
        return !(this.musteriKimlik == null || this.sifre == null);
    }

    private boolean girisBasariliMi() {
        String query = "SELECT tc_no,ogrenci_no,sifre FROM kullanicilar"
                + " WHERE "
                + "(tc_no = '" + this.musteriKimlik + "'"
                + " OR "
                + "ogrenci_no = '" + this.musteriKimlik + "')"
                + " AND "
                + "sifre = '" + this.sifre + "'";
        try {
            super.statement = super.connection.createStatement();
            ResultSet rs = statement.executeQuery(query); //Yazdığımız query i çalıştırır
            while (rs.next()) {//  sorguyu dolaşır ve bize bir değer dönülmüş ise
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(KullaniciGiris.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
        return HesapBilgileri.getInstance();
    }

    @Override
    public AdminHesapBilgileri getAdminHesapBilgileri() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    

    public String getMusteriKimlik() {
        return musteriKimlik;
    }

    public void setMusteriKimlik(String musteriKimlik) {
        this.musteriKimlik = musteriKimlik;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

}
