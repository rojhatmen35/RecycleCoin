package gui;

import gui.ayarlar.ActionAyarlari;
import gui.ayarlar.IDuzenleyici;
import gui.ayarlar.TextAyarlari;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

public final class SifreYenilemeEkrani extends javax.swing.JFrame implements IDuzenleyici {

    public SifreYenilemeEkrani() {
        initComponents();
        getEdits();
    }

    @Override
    public void getEdits() {
        this.setLocationRelativeTo(null);
        sifreYenilemePanel.setFocusable(true);
        TextAyarlari.setOnlyNumber(tcNoText); //Sadece sayı girebilsin
        TextAyarlari.setOnlyNumber(telNoText);
        TextAyarlari.setMaxLimit(telNoText, 11);
        TextAyarlari.setMaxLimit(tcNoText, 11);

    }
    
    public JPasswordField getEskiSifreText() {
        return eskiSifreText;
    }
    
    private boolean isEnabledEskiSifreText(){
    return this.getEskiSifreText().isEnabled();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sifreYenilemePanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tcNoText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        telNoText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        soruCevapText = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        yeniSifreTekrarText = new javax.swing.JPasswordField();
        eskiSifreText = new javax.swing.JPasswordField();
        yeniSifreText = new javax.swing.JPasswordField();
        sifreYenileButon = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        sifreYenilemePanel.setBackground(new java.awt.Color(56, 246, 245));
        sifreYenilemePanel.setMinimumSize(new java.awt.Dimension(730, 502));
        sifreYenilemePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel1.setText("Şifre Yenileme");
        sifreYenilemePanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 240, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("T.C. No:");
        sifreYenilemePanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 110, 30));

        tcNoText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        sifreYenilemePanel.add(tcNoText, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, 210, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Telefon No:");
        sifreYenilemePanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 110, 30));

        telNoText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        sifreYenilemePanel.add(telNoText, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, 210, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Güvenlik Sorusu Cevap:");
        sifreYenilemePanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 190, 30));

        soruCevapText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        sifreYenilemePanel.add(soruCevapText, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, 210, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Eski Şifre:");
        sifreYenilemePanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 110, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Yeni Şifre:");
        sifreYenilemePanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, 110, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Yeni Şifre Tekrar:");
        sifreYenilemePanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, 190, 30));

        yeniSifreTekrarText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        sifreYenilemePanel.add(yeniSifreTekrarText, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 380, 210, 30));

        eskiSifreText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        sifreYenilemePanel.add(eskiSifreText, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 280, 210, 30));

        yeniSifreText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        sifreYenilemePanel.add(yeniSifreText, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 330, 210, 30));

        sifreYenileButon.setBackground(new java.awt.Color(153, 153, 255));
        sifreYenileButon.setText("Şifreyi Yenile");
        sifreYenileButon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sifreYenileButon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sifreYenileButonMouseEntered(evt);
            }
        });
        sifreYenileButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sifreYenileButonActionPerformed(evt);
            }
        });
        sifreYenilemePanel.add(sifreYenileButon, new org.netbeans.lib.awtextra.AbsoluteConstraints(365, 430, 110, 40));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/backIcon.png"))); // NOI18N
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        sifreYenilemePanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sifreYenilemePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sifreYenilemePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sifreYenileButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sifreYenileButonActionPerformed
        JOptionPane.showMessageDialog(this, "Güncellendi");
        if (isEnabledEskiSifreText()) {
           // ActionAyarlari.setVisible(this, new hesapEkrani());

        } else {
            ActionAyarlari.setVisible(this, new GirisEkrani());
        }
    }//GEN-LAST:event_sifreYenileButonActionPerformed

    private void sifreYenileButonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sifreYenileButonMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_sifreYenileButonMouseEntered

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
       if(isEnabledEskiSifreText()){
       ActionAyarlari.setVisible(this, new AyarlarEkrani());
       
      }else{
      ActionAyarlari.setVisible(this, new GirisEkrani());
      }
    }//GEN-LAST:event_jLabel8MouseClicked

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
            java.util.logging.Logger.getLogger(SifreYenilemeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SifreYenilemeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SifreYenilemeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SifreYenilemeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SifreYenilemeEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField eskiSifreText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JButton sifreYenileButon;
    private javax.swing.JPanel sifreYenilemePanel;
    private javax.swing.JTextField soruCevapText;
    private javax.swing.JTextField tcNoText;
    private javax.swing.JTextField telNoText;
    private javax.swing.JPasswordField yeniSifreTekrarText;
    private javax.swing.JPasswordField yeniSifreText;
    // End of variables declaration//GEN-END:variables
}
