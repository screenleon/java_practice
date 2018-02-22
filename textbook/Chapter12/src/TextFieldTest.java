/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.JFrame;

/**
 *
 * @author user
 */
public class TextFieldTest {
    public static void main(String[] args){
        TextFieldFrame textFieldFrame = new TextFieldFrame();
        textFieldFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        textFieldFrame.setSize(350, 100);
        textFieldFrame.setVisible(true);
    }
}
