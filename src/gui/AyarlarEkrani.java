package gui;

import gui.ayarlar.ActionAyarlari;
import gui.ayarlar.IDuzenleyici;
import gui.ayarlar.TextAyarlari;
import javax.swing.JOptionPane;

public class AyarlarEkrani extends javax.swing.JFrame implements IDuzenleyici {

    public AyarlarEkrani() {
        initComponents();
        getEdits();
    }

    @Override
    public void getEdits() {
        this.setLocationRelativeTo(null);//Ekranı ortalar
        ayarlarEkraniPanel.setFocusable(true);//Panele focuslanır
        TextAyarlari.setOnlyNumber(telNoText);
        // TextAyarlari.setOnlyNumber(sifreText);
        TextAyarlari.setMaxLimit(telNoText, 11);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ayarlarEkraniPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        telNoText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        sifreText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        telUpdateIcon = new javax.swing.JLabel();
        sifreUpdateIcon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ayarlarEkraniPanel.setBackground(new java.awt.Color(56, 246, 245));
        ayarlarEkraniPanel.setMinimumSize(new java.awt.Dimension(730, 502));
        ayarlarEkraniPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 51, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Telefon Numaranız:");
        ayarlarEkraniPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 220, 40));

        telNoText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        telNoText.setEnabled(false);
        ayarlarEkraniPanel.add(telNoText, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, 210, 30));

        jLabel2.setFont(new java.awt.Font("Cascadia Mono", 1, 22)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 51, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Şifreniz:");
        ayarlarEkraniPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 170, 30));

        sifreText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        sifreText.setText("************");
        sifreText.setEnabled(false);
        ayarlarEkraniPanel.add(sifreText, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, 210, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/backIcon.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        ayarlarEkraniPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        telUpdateIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/updateIcon.png"))); // NOI18N
        telUpdateIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        telUpdateIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                telUpdateIconMouseClicked(evt);
            }
        });
        ayarlarEkraniPanel.add(telUpdateIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 150, -1, -1));

        sifreUpdateIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/updateIcon.png"))); // NOI18N
        sifreUpdateIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sifreUpdateIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sifreUpdateIconMouseClicked(evt);
            }
        });
        ayarlarEkraniPanel.add(sifreUpdateIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 230, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ayarlarEkraniPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ayarlarEkraniPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
      //  ActionAyarlari.setVisible(this, new SinavEkrani());
    }//GEN-LAST:event_jLabel3MouseClicked

    private void sifreUpdateIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sifreUpdateIconMouseClicked
        ActionAyarlari.setVisible(this, new SifreYenilemeEkrani());
    }//GEN-LAST:event_sifreUpdateIconMouseClicked

    private int clickCounter = 0;
    private void telUpdateIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_telUpdateIconMouseClicked
        if (this.clickCounter == 0) {
            telNoText.setEnabled(true);
            clickCounter++;
        } else {
            telNoText.setEditable(false);
            JOptionPane.showMessageDialog(this, "Telefon numarası güncellendi.");
            clickCounter = 0;
        }
    }//GEN-LAST:event_telUpdateIconMouseClicked

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
            java.util.logging.Logger.getLogger(AyarlarEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AyarlarEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AyarlarEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AyarlarEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AyarlarEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ayarlarEkraniPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField sifreText;
    private javax.swing.JLabel sifreUpdateIcon;
    private javax.swing.JTextField telNoText;
    private javax.swing.JLabel telUpdateIcon;
    // End of variables declaration//GEN-END:variables
}
