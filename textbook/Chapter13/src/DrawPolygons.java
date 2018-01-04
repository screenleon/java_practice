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
public class DrawPolygons {
    public static void main(String[] args){
        JFrame frame = new JFrame("Drawing Polygons");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        PolygonsJPanel polygonsJPanel = new PolygonsJPanel();
        frame.add(polygonsJPanel);
        frame.setSize(280, 270);
        frame.setVisible(true);
    }
}
