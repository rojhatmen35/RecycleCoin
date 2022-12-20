
package gui.ayarlar;

import java.awt.Color;
import javax.swing.JButton;

/*  Buton
arkaplan rengi ayarları
*/
public class ButonAyarlari {
    private static Color originalBgColor;
    public static void setBg(JButton button,Color Bgcolor){
    originalBgColor=button.getBackground();
    button.setBackground(Bgcolor);
    }
    
    public static void setOriginalBg(JButton button){
    button.setBackground(originalBgColor);
    
    }
    
    public static void butonVisible(JButton button,boolean deger){
    button.setVisible(deger);
    
    }
}