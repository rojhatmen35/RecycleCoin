package gui;

import database.IBilgiController;
import database.transactions.AdminHesapBilgileri;
import database.transactions.HesapBilgileri;
import database.transactions.KullaniciGiris;
import gui.ayarlar.ActionAyarlari;
import gui.ayarlar.ButonAyarlari;
import gui.ayarlar.Dialogs;
import gui.ayarlar.IDuzenleyici;
import gui.ayarlar.TextAyarlari;
import java.awt.Color;

public final class GirisEkrani extends javax.swing.JFrame implements IDuzenleyici, IBilgiController {

    private KullaniciGiris kullaniciGirisObject = null;
    private final String KIMLIK_TEXT_ORIGINAL = "T.C. No";
    private final String SIFRE_TEXT_ORIGINAL = "************";

    public GirisEkrani() {
        initComponents();
        getEdits();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        girisEkraniPaneli = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        kimlikText = new javax.swing.JTextField();
        sifreText = new javax.swing.JPasswordField();
        girisButon = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        basvurButon = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        girisEkraniPaneli.setBackground(new java.awt.Color(56, 246, 245));
        girisEkraniPaneli.setMinimumSize(new java.awt.Dimension(730, 502));
        girisEkraniPaneli.setPreferredSize(new java.awt.Dimension(730, 502));
        girisEkraniPaneli.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("GERİ DÖNÜŞÜM SİSTEMİNE HOŞGELDİNİZ");
        girisEkraniPaneli.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 50, 410, 50));

        kimlikText.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.default.focusedBackground"));
        kimlikText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        kimlikText.setForeground(new java.awt.Color(153, 153, 153));
        kimlikText.setVerifyInputWhenFocusTarget(false);
        kimlikText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                kimlikTextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                kimlikTextFocusLost(evt);
            }
        });
        girisEkraniPaneli.add(kimlikText, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 275, 50));

        sifreText.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.default.focusedBackground"));
        sifreText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        sifreText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                sifreTextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                sifreTextFocusLost(evt);
            }
        });
        girisEkraniPaneli.add(sifreText, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 275, 50));

        girisButon.setBackground(new java.awt.Color(102, 102, 102));
        girisButon.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        girisButon.setForeground(new java.awt.Color(242, 242, 242));
        girisButon.setText("Giriş");
        girisButon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        girisButon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                girisButonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                girisButonMouseExited(evt);
            }
        });
        girisButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                girisButonActionPerformed(evt);
            }
        });
        girisEkraniPaneli.add(girisButon, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, 131, 50));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Halen daha kayıtlı değil misiniz?");
        girisEkraniPaneli.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, -1, 50));

        basvurButon.setBackground(new java.awt.Color(102, 102, 102));
        basvurButon.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        basvurButon.setForeground(new java.awt.Color(242, 242, 242));
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
        girisEkraniPaneli.add(basvurButon, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 370, 131, 50));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Admin/Sorumlu Girişi");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        girisEkraniPaneli.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 440, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Şifrenizi mi unuttunuz?");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        girisEkraniPaneli.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(girisEkraniPaneli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(girisEkraniPaneli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void getEdits() {
        this.setLocationRelativeTo(null);
        girisEkraniPaneli.setFocusable(true);
        kimlikText.setText(KIMLIK_TEXT_ORIGINAL);
        sifreText.setText(SIFRE_TEXT_ORIGINAL);
        TextAyarlari.setOnlyNumber(kimlikText); //Sadece sayı girebilsin

    }

    @Override
    public boolean bilgilerGecerliMi() {
        return !(this.kimlikText.getText().equals(this.KIMLIK_TEXT_ORIGINAL)
                || String.valueOf(this.sifreText.getPassword()).equals(this.SIFRE_TEXT_ORIGINAL));

    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
        return HesapBilgileri.getInstance();
    }

    @Override
    public AdminHesapBilgileri getAdminHesapBilgileri() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    

    //KullaniciGiris sınıfının getter methodunu oluşturduk
    public KullaniciGiris getKullaniciGirisObject() {
        if (this.kullaniciGirisObject == null) {
            kullaniciGirisObject = new KullaniciGiris();
        }
        return kullaniciGirisObject;
    }


    private void kimlikTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_kimlikTextFocusGained
        TextAyarlari.setFocus(kimlikText, KIMLIK_TEXT_ORIGINAL);
    }//GEN-LAST:event_kimlikTextFocusGained

    private void kimlikTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_kimlikTextFocusLost
        TextAyarlari.lostFocus(kimlikText, KIMLIK_TEXT_ORIGINAL);
    }//GEN-LAST:event_kimlikTextFocusLost

    private void sifreTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sifreTextFocusGained
        TextAyarlari.setFocus(sifreText, SIFRE_TEXT_ORIGINAL);
    }//GEN-LAST:event_sifreTextFocusGained

    private void sifreTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sifreTextFocusLost
        TextAyarlari.lostFocus(sifreText, SIFRE_TEXT_ORIGINAL);
    }//GEN-LAST:event_sifreTextFocusLost

    private void girisButonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_girisButonMouseEntered
        ButonAyarlari.setBg(girisButon, Color.black);
    }//GEN-LAST:event_girisButonMouseEntered

    private void girisButonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_girisButonMouseExited
        ButonAyarlari.setOriginalBg(girisButon);
    }//GEN-LAST:event_girisButonMouseExited

    private void girisButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_girisButonActionPerformed
        if (this.bilgilerGecerliMi()) {
            String musteriKimlik = this.kimlikText.getText().trim();
            String sifre = String.valueOf(this.sifreText.getPassword());
            this.girisYap(musteriKimlik, sifre);

        } else {
            Dialogs.bosOlamazMesaj(this);
        }

    }//GEN-LAST:event_girisButonActionPerformed

    private void girisYap(String musteriKimlik, String sifre) {
        this.getKullaniciGirisObject().setMusteriKimlik(musteriKimlik);
        this.getKullaniciGirisObject().setSifre(sifre);

        if (getKullaniciGirisObject().girisBilgileriDogruMu()) {
            ActionAyarlari.setVisible(this, new KullaniciEkrani());
        } else {
            Dialogs.ozelMesaj(this, "Giriş bilgileri doğru değil...");
        }
    }


    private void basvurButonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_basvurButonMouseEntered
        ButonAyarlari.setBg(basvurButon, Color.BLUE);
    }//GEN-LAST:event_basvurButonMouseEntered

    private void basvurButonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_basvurButonMouseExited
        ButonAyarlari.setOriginalBg(basvurButon);
    }//GEN-LAST:event_basvurButonMouseExited

    private void basvurButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_basvurButonActionPerformed
        ActionAyarlari.setVisible(this, new BasvuruEkrani());
    }//GEN-LAST:event_basvurButonActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        ActionAyarlari.setVisible(this, new AdminGirisEkrani());

    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        SifreYenilemeEkrani sifreyenilemeekrani = new SifreYenilemeEkrani();
        ActionAyarlari.setVisible(this, sifreyenilemeekrani);
        sifreyenilemeekrani.getEskiSifreText().setEnabled(false);
    }//GEN-LAST:event_jLabel4MouseClicked

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
            java.util.logging.Logger.getLogger(GirisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GirisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GirisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GirisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GirisEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton basvurButon;
    private javax.swing.JButton girisButon;
    private javax.swing.JPanel girisEkraniPaneli;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField kimlikText;
    private javax.swing.JPasswordField sifreText;
    // End of variables declaration//GEN-END:variables
}
