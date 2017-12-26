/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ntou.cs.java2017.ChenLiEn.hw4;

import java.awt.*;
import javax.swing.*;
import java.awt.Event.*;

/**
 *
 * @author user
 */
public class WeatherViewer extends JFrame{
    private final GridLayout gridLayout;
    private final JPanel dayTemperaturePanel;
    private final JPanel nightTemperaturePane;
    private final JComboBox citySelectComboBox;
    private final JComboBox dateSelectComboBox;
    private final int maxComboBoxDisplay = 3;
    
    public WeatherViewer(){
        this.gridLayout = new GridLayout(2, 4);
        this.setLayout(gridLayout);
        
        String[] cityString = {"基隆市", "台北市", "新北市", "桃園市"};
        this.citySelectComboBox = new JComboBox(cityString);
        this.citySelectComboBox.setMaximumRowCount(maxComboBoxDisplay);
        
        this.dateSelectComboBox = new JComboBox();
        
        this.dayTemperaturePanel = new JPanel();
        
        this.nightTemperaturePane = new JPanel();
        
        
    }
}
