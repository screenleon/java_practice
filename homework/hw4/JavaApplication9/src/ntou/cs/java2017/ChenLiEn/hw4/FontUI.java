/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ntou.cs.java2017.ChenLiEn.hw4;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author user
 */
public class FontUI extends JFrame{
    private final JButton fontDecreaseButton;
    private final JButton fontIncreaseButton;
    private final JTextField textField;
    private final Container container;
    private final JPanel buttonPanel;
    private int fontSize = 50;
    private final JScrollPane textScrollPane;
    
    public FontUI(){
        super("Font Test");
        
        //layout1 = new FlowLayout();
        this.buttonPanel = new JPanel();
        this.buttonPanel.setLayout(new GridLayout(1, 2));
        container = getContentPane();
        //this.setLayout(layout1);
        //a field that can input text and provide scrollbar
        this.textField = new JTextField();
        textField.setFont(new Font("Courier", Font.BOLD,fontSize));
        this.textScrollPane = new JScrollPane(this.textField, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, 
                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        this.add(this.textScrollPane);
        //add button that can smaller text
        this.fontDecreaseButton = new JButton("Decrease font size");
        this.buttonPanel.add(this.fontDecreaseButton);
        this.fontDecreaseButton.addActionListener(
            new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    if(fontSize <= 8){
                        JOptionPane.showMessageDialog(null, "No, it cannot be smaller!", 
                                "Warning", JOptionPane.PLAIN_MESSAGE);
                    }else{
                        fontSize -= 2;
                        textField.setFont(new Font("Courier", Font.BOLD,fontSize));
                    }
                }
            }
        );
        //add button that can bigger text
        this.fontIncreaseButton = new JButton("Increase font size");
        this.buttonPanel.add(this.fontIncreaseButton);
        this.fontIncreaseButton.addActionListener(
            new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    if(fontSize >= 160){
                        JOptionPane.showMessageDialog(null, "No, it cannot be larger!", 
                                "Warning", JOptionPane.PLAIN_MESSAGE);
                    }else{
                        fontSize += 2;
                        textField.setFont(new Font("Courier", Font.BOLD,fontSize));
                    }
                }
            }
        );
        //add button panel into layout
        this.add(this.buttonPanel, BorderLayout.NORTH);
        
    }
}
