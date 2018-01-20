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
public class DrawRainbow extends JPanel{
    private final static Color VIOLET = new Color(128, 0, 128);
    private final static Color INDIGO = new Color(75, 0, 130);
    
    private Color[] colors = 
    { Color.WHITE, Color.WHITE, VIOLET, INDIGO, Color.BLUE, Color.GREEN,
        Color.YELLOW, Color.ORANGE, Color.RED };
    
    public DrawRainbow(){
        this.setBackground(Color.WHITE);
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        int radius = 20;
        
        int centerX = this.getWidth() / 2;
        int centerY = this.getHeight() - 10;
        
        for(int counter =  colors.length; counter > 0; counter--){
            g.setColor(colors[counter - 1]);
            g.fillArc(centerX - counter * radius, centerY - counter * radius,
                    counter * radius * 2, counter * radius * 2, 0, 180);
            g.setColor(Color.BLACK);
            g.drawLine(centerX - counter * radius, centerY - counter * radius,
                    centerX - counter * radius, centerY - counter * radius);
        }
    }
}
