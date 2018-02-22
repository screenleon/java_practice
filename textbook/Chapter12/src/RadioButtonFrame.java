/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

/**
 *
 * @author Lien
 */
public class RadioButtonFrame extends JFrame{
    private final JTextField textField;
    private final Font plainFont;
    private final Font boldFont;
    private final Font italicFont;
    private final Font bolfItalicFont;
    private final JRadioButton plainJRadioButton;
    private final JRadioButton boldJRadioButton;
    private final JRadioButton italicJRadioButton;
    private final JRadioButton boldItalicJRadioButton;
    private final ButtonGroup radioGroup;
    
    public RadioButtonFrame(){
        super("RadioButton Test");
        setLayout(new FlowLayout());
        
        textField = new JTextField("Watch the font style change");
        this.add(this.textField);
        
        this.plainJRadioButton = new JRadioButton("Plain", true);
        this.boldJRadioButton = new JRadioButton("Bold", false);
        this.italicJRadioButton = new JRadioButton("Italic", false);
        this.boldItalicJRadioButton = new JRadioButton("Bold/Italic", false);
        this.add(this.plainJRadioButton);
        this.add(this.boldJRadioButton);
        this.add(this.italicJRadioButton);
        this.add(this.boldItalicJRadioButton);
        
        this.radioGroup = new ButtonGroup();
        this.radioGroup.add(this.plainJRadioButton);
        this.radioGroup.add(this.boldJRadioButton);
        this.radioGroup.add(this.italicJRadioButton);
        this.radioGroup.add(this.boldItalicJRadioButton);
        
        this.plainFont = new Font("Serif", Font.PLAIN, 14);
        this.boldFont = new Font("Serif", Font.BOLD, 14);
        this.italicFont = new Font("Serif", Font.ITALIC, 14);
        this.bolfItalicFont = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
        this.textField.setFont(plainFont);
        
        this.plainJRadioButton.addItemListener(new RadioButtonHandler(this.plainFont));
        this.boldJRadioButton.addItemListener(new RadioButtonHandler(this.boldFont));
        this.italicJRadioButton.addItemListener(new RadioButtonHandler(this.italicFont));
        this.boldItalicJRadioButton.addItemListener(new RadioButtonHandler(this.bolfItalicFont));
    }
    
    private class RadioButtonHandler implements ItemListener{
        private Font font;
        
        public RadioButtonHandler(Font f){
            this.font = f;
        }
        
        @Override
        public void itemStateChanged(ItemEvent event){
            textField.setFont(font);
        }
    }
}
