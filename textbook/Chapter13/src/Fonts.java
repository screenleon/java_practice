/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.JFrame;

/**
 *
 * @author Lien
 */
public class Fonts {
    public static void main(String[] args){
        JFrame frame = new JFrame("Using fonts");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        FontJPanel fontJPanel = new FontJPanel();
        frame.add(fontJPanel);
        frame.setSize(420, 150);
        frame.setVisible(true);
    }
}
