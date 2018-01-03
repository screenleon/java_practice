/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JColorChooser;
import javax.swing.JPanel;

/**
 *
 * @author user
 */
public class ShowColors2JFrame extends JFrame{
    private final JButton changeColorButton;
    private Color color = Color.LIGHT_GRAY;
    private final JPanel colorJPanel;
    
    public ShowColors2JFrame(){
        super("Using JColorChooser");
        
        this.colorJPanel = new JPanel();
        this.colorJPanel.setBackground(color);
        
        this.changeColorButton = new JButton("Change Color");
        this.changeColorButton.addActionListener(
            new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent ae) {
                    color = JColorChooser.showDialog(ShowColors2JFrame.this, "Choose a color", color);
                    
                    if(color == null){
                        color = Color.LIGHT_GRAY;
                    }
                    
                    colorJPanel.setBackground(color);
                }
            }
        );
        
        this.add(colorJPanel, BorderLayout.CENTER);
        this.add(this.changeColorButton, BorderLayout.SOUTH);
        
        setSize(400, 130);
        this.setVisible(true);
    }
}
