package gui;

import database.IBilgiController;
import database.transactions.AdminHesapBilgileri;
import database.transactions.HesapBilgileri;
import database.transactions.KullaniciBasvuru;
import gui.ayarlar.ActionAyarlari;
import gui.ayarlar.ButonAyarlari;
import gui.ayarlar.Dialogs;
import gui.ayarlar.IDuzenleyici;
import gui.ayarlar.TextAyarlari;
import java.awt.Color;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public final class BasvuruEkrani extends javax.swing.JFrame implements IDuzenleyici, IBilgiController {

    private KullaniciBasvuru kullaniciBasvuruObject = null;

    public BasvuruEkrani() {
        initComponents();
        getEdits();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        basvuruEkraniPaneli = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        adText = new javax.swing.JTextField();
        tcNoText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        telNoText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        soruComboBox = new javax.swing.JComboBox<>();
        guvenlikCevapText = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        basvurButon = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        soyadText = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        sifreText = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        kullaniciAdiText = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        basvuruEkraniPaneli.setBackground(new java.awt.Color(56, 246, 245));
        basvuruEkraniPaneli.setMinimumSize(new java.awt.Dimension(730, 502));
        basvuruEkraniPaneli.setPreferredSize(new java.awt.Dimension(730, 502));
        basvuruEkraniPaneli.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Ad:");
        basvuruEkraniPaneli.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 120, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Kişisel Bilgiler");
        basvuruEkraniPaneli.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 200, 40));

        adText.setBackground(new java.awt.Color(204, 204, 204));
        adText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        basvuruEkraniPaneli.add(adText, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 200, 40));

        tcNoText.setBackground(new java.awt.Color(204, 204, 204));
        tcNoText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        basvuruEkraniPaneli.add(tcNoText, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 200, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("T.C. No:");
        basvuruEkraniPaneli.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 90, 40));

        telNoText.setBackground(new java.awt.Color(204, 204, 204));
        telNoText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        basvuruEkraniPaneli.add(telNoText, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 200, 40));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Güvenlik Sorusu:");
        basvuruEkraniPaneli.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 200, 40));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Güvenlik Sorusu");
        basvuruEkraniPaneli.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 200, 40));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Telefon No:");
        basvuruEkraniPaneli.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 100, 40));

        soruComboBox.setBackground(new java.awt.Color(204, 204, 204));
        soruComboBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        soruComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Evcil Hayvanınızın İsmi?", "En Sevdiğiniz Nesne_", "İlkokul Öğretmeninizin Adı Soyadı?", "Yaşamak İstediğiniz Yer?", "Ya da Rastgele Cümle Girin" }));
        basvuruEkraniPaneli.add(soruComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, 310, 40));

        guvenlikCevapText.setBackground(new java.awt.Color(204, 204, 204));
        guvenlikCevapText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        basvuruEkraniPaneli.add(guvenlikCevapText, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 400, 313, 40));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Cevap:");
        basvuruEkraniPaneli.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 200, 40));

        basvurButon.setBackground(new java.awt.Color(0, 102, 102));
        basvurButon.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        basvurButon.setForeground(new java.awt.Color(204, 204, 204));
        basvurButon.setText("Başvur");
        basvurButon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        basvurButon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                basvurButonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                basvurButonMouseExited(evt);
            }
        });
        basvurButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                basvurButonActionPerformed(evt);
            }
        });
        basvuruEkraniPaneli.add(basvurButon, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 450, 125, 38));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/backIcon.png"))); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        basvuruEkraniPaneli.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        soyadText.setBackground(new java.awt.Color(204, 204, 204));
        soyadText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        basvuruEkraniPaneli.add(soyadText, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, 200, 40));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Soyad:");
        basvuruEkraniPaneli.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, 110, 40));

        sifreText.setBackground(new java.awt.Color(204, 204, 204));
        sifreText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        basvuruEkraniPaneli.add(sifreText, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 220, 200, 40));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Şifre:");
        basvuruEkraniPaneli.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, 110, 40));

        kullaniciAdiText.setBackground(new java.awt.Color(204, 204, 204));
        kullaniciAdiText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        basvuruEkraniPaneli.add(kullaniciAdiText, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 150, 200, 40));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Kullanıcı Adı:");
        basvuruEkraniPaneli.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, 110, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(basvuruEkraniPaneli, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(basvuruEkraniPaneli, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void basvurButonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_basvurButonMouseEntered
        ButonAyarlari.setBg(basvurButon, Color.black);
    }//GEN-LAST:event_basvurButonMouseEntered

    private void basvurButonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_basvurButonMouseExited
        ButonAyarlari.setOriginalBg(basvurButon);
    }//GEN-LAST:event_basvurButonMouseExited

    private void basvurButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_basvurButonActionPerformed
        if (this.bilgilerGecerliMi()) {//Bilgiler geçerli ise
            this.basvuruyuGerceklestir();

        } else {
            Dialogs.bosOlamazMesaj(this);
        }
    }//GEN-LAST:event_basvurButonActionPerformed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        ActionAyarlari.setVisible(this, new GirisEkrani());
    }//GEN-LAST:event_jLabel8MouseClicked

    @Override
    public void getEdits() {
        this.setLocationRelativeTo(null);//Ekranı ortalar
        basvuruEkraniPaneli.setFocusable(true);//Panele focuslanır
        TextAyarlari.setOnlyAlphabetic(adText);
        TextAyarlari.setOnlyAlphabetic(soyadText);
        TextAyarlari.setOnlyNumber(tcNoText);
        TextAyarlari.setOnlyNumber(telNoText);
        TextAyarlari.setOnlyAlphabeticAndDigit(kullaniciAdiText);
        TextAyarlari.setMaxLimit(tcNoText, 11);
        TextAyarlari.setMaxLimit(telNoText, 11);

    }

    @Override
    public AdminHesapBilgileri getAdminHesapBilgileri() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public KullaniciBasvuru getKullaniciBasvuruObject() {
        if (this.kullaniciBasvuruObject == null) {
            kullaniciBasvuruObject = new KullaniciBasvuru();
        }
        return kullaniciBasvuruObject;
    }

    private void basvuruyuGerceklestir() {
        //Kişisel Bilgiler
        this.getKullaniciBasvuruObject().setAdSoyad(this.adText.getText().trim());
        this.getKullaniciBasvuruObject().setTcNo(this.tcNoText.getText().trim());
        this.getKullaniciBasvuruObject().setTelNo(this.telNoText.getText().trim());

        //Güvenlik Bilgileri
        this.getKullaniciBasvuruObject().setGuvenlikSorusu(String.valueOf(this.soruComboBox.getSelectedItem()));
        this.getKullaniciBasvuruObject().setGuvenlikCevap(this.guvenlikCevapText.getText().trim());

        //Sistem tarafından verilecek bilgiler
     //   this.getKullaniciBasvuruObject().setOgrenciNo(this.randomOgrenciNo());
     //   this.getKullaniciBasvuruObject().setSifre(this.randomSifre());

        if (this.getKullaniciBasvuruObject().basvuruOnaylandiMi()) {
            Dialogs.ozelMesaj(this, "Başvurunuz kabul edilmiştir..\n"
                    + "Ogrenci Numaranız:" + this.getKullaniciBasvuruObject().getOgrenciNo() + "\nŞifreniz:" + this.getKullaniciBasvuruObject().getSifre());
            ActionAyarlari.setVisible(this, new GirisEkrani());
        } else {
            Dialogs.ozelMesaj(this, "Başvurunuz kabul edilmemiştir..\nLütfen bilgileri kontrol ediniz");
        }

    }

    private String getHashSHA256() throws UnsupportedEncodingException, NoSuchAlgorithmException{
        String input = "";

    // Compute the SHA-256 hash of the input
    MessageDigest digest = MessageDigest.getInstance("SHA-256");
    byte[] hash = digest.digest(input.getBytes("UTF-8"));

    // Convert the hash to a hexadecimal string
    StringBuilder hexString = new StringBuilder();
    for (byte b : hash) {
      String hex = Integer.toHexString(0xff & b);
      if (hex.length() == 1) hexString.append('0');
      hexString.append(hex);
    }
        
        
    return hexString.toString();
    }
    private String randomOgrenciNo() {
        String ogrenciNo;
        do {
            ogrenciNo = String.valueOf(1000000 + (int) (Math.random() * 9000000));
        } while (this.getKullaniciBasvuruObject().musteriNoTablodaVarMi());
        return ogrenciNo;
    }

    private String randomSifre() {
        String sifre;
        sifre = String.valueOf(1000 + (int) (Math.random() * 9000));
        return sifre;
    }

    @Override
    public boolean bilgilerGecerliMi() {
        return TextAyarlari.textAlanlariDolumu(basvuruEkraniPaneli);
    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
        return HesapBilgileri.getInstance();
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BasvuruEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adText;
    private javax.swing.JButton basvurButon;
    private javax.swing.JPanel basvuruEkraniPaneli;
    private javax.swing.JTextField guvenlikCevapText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField kullaniciAdiText;
    private javax.swing.JTextField sifreText;
    private javax.swing.JComboBox<String> soruComboBox;
    private javax.swing.JTextField soyadText;
    private javax.swing.JTextField tcNoText;
    private javax.swing.JTextField telNoText;
    // End of variables declaration//GEN-END:variables
}
