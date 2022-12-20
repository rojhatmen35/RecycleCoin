package gui;

import database.IBilgiController;
import database.transactions.AdminGiris;
import database.transactions.AdminHesapBilgileri;
import database.transactions.HesapBilgileri;
import database.transactions.KullaniciGiris;
import gui.ayarlar.ActionAyarlari;
import gui.ayarlar.ButonAyarlari;
import gui.ayarlar.Dialogs;
import gui.ayarlar.IDuzenleyici;
import gui.ayarlar.TextAyarlari;
import java.awt.Color;

public final class AdminGirisEkrani extends javax.swing.JFrame implements IDuzenleyici, IBilgiController {

    private AdminGiris adminGirisObject = null;
    private final String KIMLIK_TEXT_ORIGINAL = "Kullanici Adi";
    private final String SIFRE_TEXT_ORIGINAL = "************";

    public AdminGirisEkrani() {
        initComponents();
        getEdits();
    }

    @Override
    public void getEdits() {
        this.setLocationRelativeTo(null);
        adminGirisEkraniPaneli.setFocusable(true);
        kimlikText.setText(KIMLIK_TEXT_ORIGINAL);
        sifreText.setText(SIFRE_TEXT_ORIGINAL);
    }

    @Override
    public boolean bilgilerGecerliMi() {
        return !(this.kimlikText.getText().equals(this.KIMLIK_TEXT_ORIGINAL)
                || String.valueOf(this.sifreText.getPassword()).equals(this.SIFRE_TEXT_ORIGINAL));
    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public AdminHesapBilgileri getAdminHesapBilgileri() {
        return AdminHesapBilgileri.getInstance();
    }

    //KullaniciGiris sınıfının getter methodunu oluşturduk
    public AdminGiris getAdminGirisObject() {
        if (this.adminGirisObject == null) {
            adminGirisObject = new AdminGiris();
        }
        return adminGirisObject;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        adminGirisEkraniPaneli = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        kimlikText = new javax.swing.JTextField();
        sifreText = new javax.swing.JPasswordField();
        girisButon = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        adminGirisEkraniPaneli.setBackground(new java.awt.Color(56, 246, 245));
        adminGirisEkraniPaneli.setMinimumSize(new java.awt.Dimension(730, 502));
        adminGirisEkraniPaneli.setPreferredSize(new java.awt.Dimension(730, 502));
        adminGirisEkraniPaneli.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ADMİN/SORUMLU GİRİŞİNE HOŞGELDİNİZ");
        adminGirisEkraniPaneli.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 410, 50));

        kimlikText.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.default.focusedBackground"));
        kimlikText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        kimlikText.setForeground(new java.awt.Color(51, 51, 51));
        kimlikText.setVerifyInputWhenFocusTarget(false);
        kimlikText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                kimlikTextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                kimlikTextFocusLost(evt);
            }
        });
        adminGirisEkraniPaneli.add(kimlikText, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 275, 50));

        sifreText.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.default.focusedBackground"));
        sifreText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        sifreText.setForeground(new java.awt.Color(51, 51, 51));
        sifreText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                sifreTextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                sifreTextFocusLost(evt);
            }
        });
        adminGirisEkraniPaneli.add(sifreText, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 275, 50));

        girisButon.setBackground(new java.awt.Color(51, 51, 51));
        girisButon.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        girisButon.setForeground(new java.awt.Color(204, 204, 204));
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
        adminGirisEkraniPaneli.add(girisButon, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 360, 131, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/backIcon.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        adminGirisEkraniPaneli.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(adminGirisEkraniPaneli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(adminGirisEkraniPaneli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            String adminKimlik = this.kimlikText.getText().trim();
            String sifre = String.valueOf(this.sifreText.getPassword());
            this.girisYap(adminKimlik, sifre);

        } else {
            Dialogs.bosOlamazMesaj(this);
        }

    }//GEN-LAST:event_girisButonActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        ActionAyarlari.setVisible(this, new GirisEkrani());
    }//GEN-LAST:event_jLabel2MouseClicked

    private void girisYap(String adminKimlik, String sifre) {
        this.getAdminGirisObject().setAdminKimlik(adminKimlik);
        this.getAdminGirisObject().setAdminSifre(sifre);

        if (getAdminGirisObject().girisBilgileriDogruMu()) {
            ActionAyarlari.setVisible(this, new AdminGirisEkrani());
        } else {
            Dialogs.ozelMesaj(this, "Giriş bilgileri doğru değil...");
        }
    }

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
            java.util.logging.Logger.getLogger(AdminGirisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminGirisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminGirisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminGirisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminGirisEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel adminGirisEkraniPaneli;
    private javax.swing.JButton girisButon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField kimlikText;
    private javax.swing.JPasswordField sifreText;
    // End of variables declaration//GEN-END:variables
}
