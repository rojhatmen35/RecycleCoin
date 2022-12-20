
package database.transactions;

import database.DbConnection;
import database.IBilgiController;
import gui.ayarlar.TextAyarlari;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class KullaniciBasvuru extends DbConnection implements IBilgiController {

    //Başvuru bilgileri
    private String adSoyad = null, tcNo = null, telNo = null, guvenlikSorusu = null, guvenlikCevap = null;

    //Sistem tarafından oluşturulan veriler
    private String ogrenciNo = null, sifre = null;

    public boolean basvuruOnaylandiMi() {
        if (this.bilgilerGecerliMi()) {
            if (this.tcNoTablodaVarMi()) {
                return false;
            } else {
                this.basvuruyuOnayla();
                return true;
            }

        } else {
            return false;
        }

    }

    //Tabloda aynı tc numaralı var mı kontrol ediyor
    private boolean tcNoTablodaVarMi() {
        String query = "SELECT tc_no FROM kullanicilar WHERE tc_no='" + this.tcNo + "'";
        try {
            super.statement = super.connection.createStatement();
            ResultSet rs = statement.executeQuery(query); //Yazdığımız query i çalıştırır
            while (rs.next()) {//  sorguyu dolaşır ve bize bir değer dönülmüş ise
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(KullaniciBasvuru.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;

    }

    private void basvuruyuOnayla() {
        String query = "INSERT INTO kullanicilar (ogrenci_no,sifre,"
                + "ad_soyad,tc_no,tel_no,guvenlik_sorusu,guvenlik_cevap)"
                + " VALUES("
                + "'" + this.ogrenciNo + "',"
                + "'" + this.sifre + "',"
                + "'" + this.adSoyad + "',"
                + "'" + this.tcNo + "',"
                + "'" + this.telNo + "',"
                + "'" + this.guvenlikSorusu + "',"
                + "'" + this.guvenlikCevap + "'"
                + ")";

        try {
            super.statement = super.connection.createStatement();
            statement.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(KullaniciBasvuru.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public boolean musteriNoTablodaVarMi() {
        String query = "SELECT ogrenci_no FROM kullanicilar WHERE ogrenci_no='" + this.ogrenciNo + "'";
        try {
            super.statement = super.connection.createStatement();
            ResultSet rs = statement.executeQuery(query); //Yazdığımız query i çalıştırır
            while (rs.next()) {//  sorguyu dolaşır ve bize bir değer dönülmüş ise
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(KullaniciBasvuru.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    //implement edilen interfacenin override edilmiş methodları
    @Override
    public boolean bilgilerGecerliMi() {
        return !(this.adSoyad == null
                || this.tcNo == null
                || this.telNo == null
                || this.guvenlikSorusu == null
                || this.guvenlikCevap == null
                || this.ogrenciNo == null
                || this.sifre == null
                || TextAyarlari.uzunlukSundanKucukMu(11, this.tcNo)
                || TextAyarlari.uzunlukSundanKucukMu(11, this.telNo));

    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public AdminHesapBilgileri getAdminHesapBilgileri() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    

    //Gettter and Setterlar
    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public String getTcNo() {
        return tcNo;
    }

    public void setTcNo(String tcNo) {
        this.tcNo = tcNo;
    }

    public String getTelNo() {
        return telNo;
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }

    public String getGuvenlikSorusu() {
        return guvenlikSorusu;
    }

    public void setGuvenlikSorusu(String guvenlikSorusu) {
        this.guvenlikSorusu = guvenlikSorusu;
    }

    public String getGuvenlikCevap() {
        return guvenlikCevap;
    }

    public void setGuvenlikCevap(String guvenlikCevap) {
        this.guvenlikCevap = guvenlikCevap;
    }

    public String getOgrenciNo() {
        return ogrenciNo;
    }

    public void setOgrenciNo(String ogrenciNo) {
        this.ogrenciNo = ogrenciNo;
    }

    
    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

}
