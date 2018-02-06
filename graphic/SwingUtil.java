package graphic;

import core.Dictionary;
import java.util.Random;
import javax.swing.UIManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author darkness
 */
public class SwingUtil {
    static Dictionary dict = Dictionary.getInstance();
    static Random randomMachine = new Random();
    static final java.awt.Color highlight = new java.awt.Color(78, 112, 208);
    static final java.awt.Color nonHighlight = new java.awt.Color(56, 60, 75);
    static final java.awt.Color background = java.awt.Color.WHITE;
    static final javax.swing.plaf.FontUIResource defaultFont = new javax.swing.plaf.FontUIResource("monospaced", 0, 14);
    static final String rightAnsStr = "Congratulations! Right answer";
    static final String wrongAnsStr = "     Sorry! Wrong answer     ";
    
    public static void setUIFont(javax.swing.plaf.FontUIResource f){
        java.util.Enumeration keys = UIManager.getDefaults().keys();
        while (keys.hasMoreElements()) {
            Object key = keys.nextElement();
            Object value = UIManager.get (key);
            if (value instanceof javax.swing.plaf.FontUIResource)
                UIManager.put(key, f);
        }
    }
    
    public static void buttonClick(java.awt.event.MouseEvent evt) {                             
        javax.swing.JButton source = (javax.swing.JButton)evt.getSource();
        source.setBackground(highlight);
    }
    
    public static void buttonRelease(java.awt.event.MouseEvent evt) {                               
        javax.swing.JButton source = (javax.swing.JButton)evt.getSource();
        source.setBackground(background);
    }
}
