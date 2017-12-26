/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ntou.cs.java2017.ChenLiEn.hw4;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import javax.imageio.ImageIO;

/**
 *
 * @author user
 */
public class WeatherViewer extends JFrame{
    TemperatureFetcher tempTemperatureFetcher = new TemperatureFetcher();
    private final GridLayout gridLayout;
    private final JLabel citySelectLabel;
    private final JComboBox citySelectComboBox;
    private final JLabel dateSelectLabel;
    private final JComboBox dateSelectComboBox;
    private final JLabel dayTempLabel;
    private final JLabel nightTempLabel;
    private final int maxComboBoxDisplay = 3;
    private String citySelect;
    private int dateSelect;
    private TemperatureBundle temperatureBundle;
    private String[] cityString = {"基隆市", "臺北市", "新北市", "桃園市"};
    private String[] dateString;
    private JLabel dayTemp;
    private JLabel nightTemp;
    private JPanel dayPanel;
    private JLabel dayImageLabel;
    private JPanel nightPanel;
    private JLabel nightImageLabel;
    
    public WeatherViewer(){
        super("Weather Viewer");
        this.gridLayout = new GridLayout(4, 2);
        this.setLayout(gridLayout);
        
        this.citySelectLabel = new JLabel("請選擇城市：");
        this.add(this.citySelectLabel);
        
        this.citySelectComboBox = new JComboBox(cityString);
        this.citySelectComboBox.setMaximumRowCount(maxComboBoxDisplay);
        this.citySelectComboBox.addItemListener(
                new ItemListener(){
                    @Override
                    public void itemStateChanged(ItemEvent event){
                        if(event.getStateChange() == ItemEvent.SELECTED){
                            citySelect = String.valueOf(citySelectComboBox.getSelectedItem());
                            temperatureBundle = tempTemperatureFetcher.run(citySelect);
                        }
                    }
                }
        );
        this.add( this.citySelectComboBox);
        
        
        temperatureBundle = tempTemperatureFetcher.run(cityString[0]);
        dateString = temperatureBundle.getWeekDates();
        
        
        this.dateSelectLabel = new JLabel("請選擇日期：");
        this.add(this.dateSelectLabel);
        
        this.dateSelectComboBox = new JComboBox(dateString);
        this.dateSelectComboBox.setMaximumRowCount(maxComboBoxDisplay);
        this.dateSelectComboBox.addItemListener(
                new ItemListener(){
                    @Override
                    public void itemStateChanged(ItemEvent event){
                        if(event.getStateChange() == ItemEvent.SELECTED){
                            try{
                                BufferedImage img;
                                dateSelect = dateSelectComboBox.getSelectedIndex();
                                String[] dayImages = temperatureBundle.getDayImages();
                                String[] dayTemps = temperatureBundle.getDayTemps();
                            
                                URL dayURL = new URL(dayImages[dateSelect]);
                                img = ImageIO.read(dayURL);

                                dayTemp.setText(dayTemps[dateSelect]);
                                dayImageLabel.setIcon(new ImageIcon(img));
                                
                                String[] nightImages = temperatureBundle.getNightImages();
                                String[] nightTemps = temperatureBundle.getNightTemps();
                                
                                URL nightURL = new URL(nightImages[dateSelect]);
                                img = ImageIO.read(nightURL);
                                
                                nightTemp.setText(nightTemps[dateSelect]);
                                nightImageLabel.setIcon(new ImageIcon(img));
                            }catch (MalformedURLException e) {
                                e.printStackTrace();
                            } catch (IOException e) {
                                 e.printStackTrace();
                            } 
                        }
                    }
                }
        );
        this.add(this.dateSelectComboBox);
        
        this.dayTempLabel = new JLabel("白天氣溫：");
        this.add(this.dayTempLabel);
        
        this.dayPanel = new JPanel(new BorderLayout());
        this.dayImageLabel = new JLabel();
        this.dayTemp  = new JLabel("N/A");
        this.dayPanel.add(this.dayTemp, BorderLayout.WEST);
        this.dayPanel.add(this.dayImageLabel, BorderLayout.EAST);
        this.add(this.dayPanel);
        
        this.nightTempLabel = new JLabel("晚上氣溫：");
        this.add(this.nightTempLabel);
        
        this.nightPanel = new JPanel(new BorderLayout());
        this.nightImageLabel = new JLabel();
        this.nightTemp = new JLabel("N/A");
        this.nightPanel.add(this.nightTemp, BorderLayout.WEST);
        this.nightPanel.add(this.nightImageLabel, BorderLayout.EAST);
        this.add(this.nightPanel);
    }
}
