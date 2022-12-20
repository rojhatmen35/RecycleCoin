
package database;


public class DbVeriMerkezi extends DbConnection {
    //Ogrenci verileri
    protected int kullaniciId=0;
    protected String adSoyad,telNo,tcNo,ogrenciNo;
    
    //Admin Verileri
    protected String adminAdi,adminSifre;

    //Soruların verileri;
    protected int sinifDuzeyi,uniteNo,konuNo,soruNo,kodNo,sigma;
    protected String dersinAdi,uniteAdi,konuAdi,cevap,soru;

    
    
    public String getSoru() {
        return soru;
    }

    public void setSoru(String soru) {
        this.soru = soru;
    }

    public String getCevap() {
        return cevap;
    }

    public void setCevap(String cevap) {
        this.cevap = cevap;
    }

    
    public String getAdminSifre() {
        return adminSifre;
    }

    public void setAdminSifre(String adminSifre) {
        this.adminSifre = adminSifre;
    }

    public int getSinifDuzeyi() {
        return sinifDuzeyi;
    }

    public void setSinifDuzeyi(int sinifDuzeyi) {
        this.sinifDuzeyi = sinifDuzeyi;
    }

    public int getUniteNo() {
        return uniteNo;
    }

    public void setUniteNo(int uniteNo) {
        this.uniteNo = uniteNo;
    }

    public int getKonuNo() {
        return konuNo;
    }

    public void setKonuNo(int konuNo) {
        this.konuNo = konuNo;
    }

    public int getSoruNo() {
        return soruNo;
    }

    public void setSoruNo(int soruNo) {
        this.soruNo = soruNo;
    }

    public int getKodNo() {
        return kodNo;
    }

    public void setKodNo(int kodNo) {
        this.kodNo = kodNo;
    }

    public int getSigma() {
        return sigma;
    }

    public void setSigma(int sigma) {
        this.sigma = sigma;
    }

    public String getDersinAdi() {
        return dersinAdi;
    }

    public void setDersinAdi(String dersinAdi) {
        this.dersinAdi = dersinAdi;
    }

    public String getUniteAdi() {
        return uniteAdi;
    }

    public void setUniteAdi(String uniteAdi) {
        this.uniteAdi = uniteAdi;
    }

    public String getKonuAdi() {
        return konuAdi;
    }

    public void setKonuAdi(String konuAdi) {
        this.konuAdi = konuAdi;
    }
    
    
    
    public String getAdminAdi() {
        return adminAdi;
    }

    public void setAdminAdi(String adminAdi) {
        this.adminAdi = adminAdi;
    }
    

    public int getKullaniciId() {
        return kullaniciId;
    }

    public void setKullaniciId(int kullaniciId) {
        this.kullaniciId = kullaniciId;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public String getTelNo() {
        return telNo;
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }

    public String getOgrenciNo() {
        return ogrenciNo;
    }

    public void setOgrenciNo(String ogrenciNo) {
        this.ogrenciNo = ogrenciNo;
    }

    public String getTcNo() {
        return tcNo;
    }

    public void setTcNo(String tcNo) {
        this.tcNo = tcNo;
    }

  
}
