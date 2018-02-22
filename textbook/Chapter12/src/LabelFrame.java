/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author user
 */
public class LabelFrame extends JFrame{
    private final JLabel label1;
    private final JLabel label2;
    private final JLabel label3;
    
    public LabelFrame(){
        super("Testing JLabel");
        setLayout(new FlowLayout());
        
        label1 = new JLabel("Label with text");
        label1.setToolTipText("This is label1");
        this.add(this.label1);
        
        Icon bug = new ImageIcon(this.getClass().getResource("bug1.png"));
        label2 = new JLabel("Label with text and icon", bug, SwingConstants.LEFT);
        label2.setToolTipText("This is label2");
        this.add(this.label2);
        
        label3 = new JLabel();
        label3.setText("Label with icon and text at bottom");
        label3.setIcon(bug);
        label3.setHorizontalTextPosition(SwingConstants.CENTER);
        label3.setVerticalTextPosition(SwingConstants.BOTTOM);
        label3.setToolTipText("This is label3");
        this.add(this.label3);
    }
}
