/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

/**
 *
 * @author Rojo
 */
public class KullaniciEkrani extends javax.swing.JFrame {

    /**
     * Creates new form KullaniciEkrani
     */
    public KullaniciEkrani() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        carbonLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        rcLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        adressLabel = new javax.swing.JLabel();
        gonderilecekAdressText = new javax.swing.JTextField();
        rcMiktarText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        gonderButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        kodText = new javax.swing.JTextField();
        geriDonusturButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        nesnelerTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(56, 246, 245));
        jPanel1.setMinimumSize(new java.awt.Dimension(730, 502));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 502, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(336, 0, -1, -1));

        carbonLabel.setText("00");
        jPanel1.add(carbonLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 60, 30));

        jLabel1.setText("Gönderilecek Adress:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 110, 30));

        rcLabel.setText("00");
        jPanel1.add(rcLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 60, 30));

        jLabel2.setText("RC");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, -1, 30));

        jLabel3.setText("MyAdress");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 60, 30));

        adressLabel.setText("*****");
        jPanel1.add(adressLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 250, 30));
        jPanel1.add(gonderilecekAdressText, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 180, 30));
        jPanel1.add(rcMiktarText, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 180, 30));

        jLabel4.setText("Carb");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, -1, 30));

        jLabel5.setText("Gönderilecek RC:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 110, 30));

        gonderButton.setText("Gönder");
        jPanel1.add(gonderButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, 140, 50));

        jLabel6.setText("Kodu Giriniz:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 110, 30));
        jPanel1.add(kodText, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, 180, 30));

        geriDonusturButton.setText("Geri Dönüştür");
        jPanel1.add(geriDonusturButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, 140, 50));

        nesnelerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nesne", "Nesne Kodu", "Carbon Değeri"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(nesnelerTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, 360, 350));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(KullaniciEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KullaniciEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KullaniciEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KullaniciEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KullaniciEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adressLabel;
    private javax.swing.JLabel carbonLabel;
    private javax.swing.JButton geriDonusturButton;
    private javax.swing.JButton gonderButton;
    private javax.swing.JTextField gonderilecekAdressText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField kodText;
    private javax.swing.JTable nesnelerTable;
    private javax.swing.JLabel rcLabel;
    private javax.swing.JTextField rcMiktarText;
    // End of variables declaration//GEN-END:variables
}
