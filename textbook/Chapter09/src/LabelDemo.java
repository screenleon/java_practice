/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JFrame;

/**
 *
 * @author user
 */
public class LabelDemo {
    public static void main(String[] args){
        JLabel northLabel = new JLabel("North");
        //get picture source from project folder not class folder
        ImageIcon labelIcon = new ImageIcon("GUItip.gif");
        
        JLabel centerLabel = new JLabel(labelIcon);
        
        JLabel southLabel = new JLabel(labelIcon);
        
        southLabel.setText("South");
        
        JFrame application = new JFrame();
        
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        application.add(northLabel, BorderLayout.NORTH);
        application.add(centerLabel, BorderLayout.CENTER);
        application.add(southLabel, BorderLayout.SOUTH);
        
        application.setSize(300, 300);
        application.setVisible(true);
    }
}
