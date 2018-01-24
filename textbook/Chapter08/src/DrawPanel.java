/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.Color;
import java.awt.Graphics;
import java.security.SecureRandom;
import javax.swing.JPanel;

/**
 *
 * @author user
 */
public class DrawPanel extends JPanel{
    private SecureRandom randomNumbers = new SecureRandom();
    private MyLine[] lines;
    
    public DrawPanel(){
        this.setBackground(Color.WHITE);
        
        lines = new MyLine[5 + this.randomNumbers.nextInt(5)];
        
        for(int count = 0; count < lines.length; count++){
            int x1 = this.randomNumbers.nextInt(300);
            int y1 = this.randomNumbers.nextInt(300);
            int x2 = this.randomNumbers.nextInt(300);
            int y2 = this.randomNumbers.nextInt(300);
            Color color = new Color(this.randomNumbers.nextInt(256),
                this.randomNumbers.nextInt(256), this.randomNumbers.nextInt(256));
            
            lines[count] = new MyLine(x1, y1, x2, y2, color);
        }
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        for(MyLine line : lines)
            line.draw(g);
    }
}
