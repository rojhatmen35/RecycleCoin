package database.transactions;

import database.DbConnection;
import database.IBilgiController;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AdminGiris extends DbConnection implements IBilgiController {

    private String adminKimlik = null;
    private String adminSifre = null;

    public boolean girisBilgileriDogruMu() {
        if (this.bilgilerGecerliMi()) {
            if (this.girisBasariliMi()) {
                this.getAdminHesapBilgileri().adminGirisYap(adminKimlik);
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
        return !(this.adminKimlik == null || this.adminSifre == null);
    }

    private boolean girisBasariliMi() {
        String query = "SELECT admin_adi,sifre FROM admin_giris"
                + " WHERE "
                + "admin_adi = '" + this.adminKimlik + "'"
                + " AND "
                + "sifre = '" + this.adminSifre + "'";
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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public AdminHesapBilgileri getAdminHesapBilgileri() {
        return AdminHesapBilgileri.getInstance();
    }

    public String getAdminKimlik() {
        return adminKimlik;
    }

    public void setAdminKimlik(String adminKimlik) {
        this.adminKimlik = adminKimlik;
    }

    public String getAdminSifre() {
        return adminSifre;
    }

    public void setAdminSifre(String adminSifre) {
        this.adminSifre = adminSifre;
    }

}
