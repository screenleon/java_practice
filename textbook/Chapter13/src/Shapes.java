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
public class Shapes {
    public static void main(String[] args){
        JFrame frame = new JFrame("Drawing 2D shapes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        ShapesJPanel shapesJPanel = new ShapesJPanel();
        
        frame.add(shapesJPanel);
        frame.setSize(425, 200);
        frame.setVisible(true);
    }
}
