
package gui.ayarlar;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Dialogs {
    
    public static void bosOlamazMesaj(JFrame jFrame){
    JOptionPane.showMessageDialog(jFrame, "Tüm alanlar dolu olmalıdır..");
    
    }
    
    public static void ozelMesaj(JFrame jFrame,String mesaj){
    JOptionPane.showMessageDialog(jFrame, mesaj);
    
    }
}
