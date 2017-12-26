/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ntou.cs.java2017.ChenLiEn.hw4;

import java.util.Arrays;

/**
 *
 * @author user
 */
public class TemperatureBundle {
    private String location; // 地理區域名稱
    private String weekDates[]; // 本周日期
    private String dayTemps[]; // 本周白天氣溫
    private String nightTemps[]; // 本周晚上氣溫
    private String dayImages[]; //本週白天氣候圖示
    private String nightImages[]; //本週晚上氣候圖示
    public TemperatureBundle (String location, String[] weekDates,String[] dayTemps, String[] nightTemps, String dayImages[], String nightImages[]){
        this.location = location;
        this.weekDates = weekDates;
        this.dayTemps = dayTemps;
        this.nightTemps = nightTemps;
        this.dayImages = dayImages;
        this.nightImages = nightImages;
    }

    public String getLocation (){
        return location;
    }
    
    public String[] getWeekDates (){
        return weekDates;
    }

    public String[] getDayTemps (){
        return dayTemps;
    }

    public String[] getNightTemps (){
        return nightTemps;
    }
	
    public String[] getDayImages (){
        return dayImages;
    }
	
    public String[] getNightImages (){
        return nightImages;
    }
    
    @Override
    public String toString (){
        return "TemperatureBundle [location=" + location + ", weekDates="+ Arrays.toString(weekDates) + ", dayTemps="
	+ Arrays.toString(dayTemps) + ", nightTemps="+ Arrays.toString(nightTemps) + ", dayImages="
	+ Arrays.toString(dayImages) + ", nightImages="+ Arrays.toString(nightImages) + "]";
    }
}
