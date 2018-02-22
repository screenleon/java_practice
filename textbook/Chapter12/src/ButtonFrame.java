/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

/**
 *
 * @author user
 */
public class ButtonFrame extends JFrame{
    private final JButton plainButton;
    private final JButton fancyButton;
    
    public ButtonFrame(){
        super("Testing Buttons");
        setLayout(new FlowLayout());
        
        plainButton = new JButton("Plain Button");
        this.add(this.plainButton);
        
        Icon bug1 = new ImageIcon(this.getClass().getResource("bug1.png"));
        Icon bug2 = new ImageIcon(this.getClass().getResource("bug2.png"));
        fancyButton = new JButton("Fancy Button", bug1);
        fancyButton.setHorizontalTextPosition(SwingConstants.LEFT);
        fancyButton.setRolloverIcon(bug2);
        this.add(this.fancyButton);
        
        ButtonHandler handler = new ButtonHandler();
        this.fancyButton.addActionListener(handler);
        this.plainButton.addActionListener(handler);
    }
    
    private class ButtonHandler implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent event){
            System.out.println(event.getActionCommand());
            JOptionPane.showMessageDialog(ButtonFrame.this, String.format("You pressed: %s",
                    event.getActionCommand()));
        }
    }
}
