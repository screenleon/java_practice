/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author Lien
 */
public class Shape2 {
    public static void main(String[] args){
        //execute application
        JFrame frame = new JFrame("Drawing 2D Shapes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Shape2JPanel shape2JPanel = new Shape2JPanel();
        frame.add(shape2JPanel);
        frame.setBackground(Color.WHITE);
        frame.setSize(315, 330);
        frame.setVisible(true);
    }
}
