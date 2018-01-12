/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
import java.net.URL;
import javax.swing.JFrame;
import javax.sound.sampled.*;

/**
 *
 * @author Lien
 */
public class MonitorTest {
    public static void main(String[] args){
        MonitorUI application = new MonitorUI();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        application.setSize(400, 1000);
        application.setVisible(true);
        
        //add sound
        String soundURL = "maplestory.wav";
        try{
            //open an audio input stream
            //URL url = application.getClass().getClassLoader().getResource("maplestory.wav");
            //System.out.println(url);
            URL url = new File("./src/"+ soundURL).toURI().toURL();
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(url);
            //Get sound clip
            Clip clip = AudioSystem.getClip();
            //open audio clip amd load samples from the audio input stream
            clip.open(audioIn);
            //clip.start();
            clip.loop(Clip.LOOP_CONTINUOUSLY);   //repeat forever
        }catch(UnsupportedAudioFileException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }catch(LineUnavailableException e){
            e.printStackTrace();
        }
        
        //window only   open google in chrome
        /*
        try{
            Runtime.getRuntime().exec(new String[]{"cmd", "/c", "start chrome http://www.google.com"});
        }catch(Exception e){
            e.printStackTrace();
        }
*/
    }
}
