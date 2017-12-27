/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ntou.cs.java2017.ChenLiEn.hw4;

import javax.swing.JFrame;

/**
 *
 * @author user
 */
 
//test the weatherViewer class in UI
public class WeatherViewerTest {
    public static void main(String[] args){
        WeatherViewer weatherViewer = new WeatherViewer();
        weatherViewer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        weatherViewer.setSize(700, 200);
        weatherViewer.setVisible(true);
    }
}
