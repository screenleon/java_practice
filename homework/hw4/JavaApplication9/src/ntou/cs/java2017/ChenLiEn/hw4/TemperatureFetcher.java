/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ntou.cs.java2017.ChenLiEn.hw4;

import java.io.*;
import java.net.*;

/**
 *
 * @author user
 */
public class TemperatureFetcher {
    String weatherURL = "http://www.cwb.gov.tw/V7/forecast/week/week.htm";
    public TemperatureFetcher(){
        try{
            URL url = new URL(this.weatherURL);
            URLConnection conn = url.openConnection();
            InputStream is = conn.getInputStream();
        }catch(Exception e){
            
        }
        
    }
}
