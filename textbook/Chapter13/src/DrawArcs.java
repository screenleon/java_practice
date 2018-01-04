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
public class DrawArcs {
    public static void main(String[] args){
        JFrame frame = new JFrame("Drawing Arcs");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        ArcsJPanel arcsJPanel = new ArcsJPanel();
        frame.add(arcsJPanel);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}
