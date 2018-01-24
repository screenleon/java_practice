/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author user
 */
public class MyLine {
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private Color color;
    
    public MyLine(int _x1, int _y1, int _x2, int _y2, Color _color){
        this.x1 = _x1;
        this.y1 = _y1;
        this.x2 = _x2;
        this.y2 = _y2;
        this.color = _color;
    }
    
    public void draw(Graphics g){
        g.setColor(this.color);
        g.drawLine(this.x1, this.y1, this.x2, this.y2);
    }
}
