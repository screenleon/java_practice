/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author user
 */
public class ColorJPanel extends JPanel{
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        this.setBackground(Color.WHITE);
        
        g.setColor(new Color(255, 0, 0));
        g.fillRect(15, 25, 100, 20);
        g.drawString("Current RGB: " + g.getColor(), 125, 40);
        
        g.setColor(new Color(0.50f, 0.75f, 0.0f));
        g.fillRect(15, 50, 100, 20);
        g.drawString("Current RGB: " + g.getColor(), 125, 65);
        
        g.setColor(Color.BLUE);
        g.fillRect(15, 75, 100, 20);
        g.drawString("Current RGB: " + g.getColor(), 125, 90);
        
        Color color = Color.MAGENTA;
        g.setColor(color);
        g.fillRect(15, 100, 100, 20);
        g.drawString("RGB values: " + color.getRed() + ", " +
                color.getGreen() + ", " + color.getBlue(), 125, 115);
    }
}
