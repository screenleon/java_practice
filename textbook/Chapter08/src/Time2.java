/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Time2 {
    private int hour;
    private int minute;
    private int second;
    
    public Time2(){
        this(0, 0, 0);
    }
    
    public Time2(int _hour){
        this(_hour, 0, 0);
    }
    
    public Time2(int _hour, int _minute){
        this(_hour, _minute, 0);
    }
    
    public Time2(int _hour, int _minute, int _second){
        if(_hour < 0 || _hour >= 24)
            throw new IllegalArgumentException("hour must be 0 - 23");
        if(_minute < 0 || _minute >= 60)
            throw new IllegalArgumentException("minute must be 0 - 59");
        if(_second < 0 || _second >= 60)
            throw new IllegalArgumentException("second must be 0 - 59");
        
        this.hour = _hour;
        this.minute = _minute;
        this.second = _second;
    }
    
    public Time2(Time2 time){
        this(time.getHour(), time.getMinute(),time.getSecond());
    }
    
    public void setTime(int _hour, int _minute, int _second){
        if(_hour < 0 || _hour >= 24)
            throw new IllegalArgumentException("hour must be 0 - 23");
        if(_minute < 0 || _minute >= 60)
            throw new IllegalArgumentException("minute must be 0 - 59");
        if(_second < 0 || _second >= 60)
            throw new IllegalArgumentException("second must be 0 - 59");
        
        this.hour = _hour;
        this.minute = _minute;
        this.second = _second;
    }
    
    public void setHour(int _hour){
        if(_hour < 0 || _hour >= 24)
            throw new IllegalArgumentException("hour must be 0 - 23");
        
        this.hour = _hour;
    }
    
    public void setMinute(int _minute){
        if(_minute < 0 || _minute >= 60)
            throw new IllegalArgumentException("minute must be 0 - 59");
        
        this.minute = _minute;
    }
    
    public void setSecond(int _second){
        if(_second < 0 || _second >= 60)
            throw new IllegalArgumentException("second must be 0 - 59");
        
        this.second = _second;
    }
    
    public int getHour(){
        return this.hour;
    }
    
    public int getMinute(){
        return this.minute;
    }
    
    public int getSecond(){
        return this.second;
    }
    
    //convert to String in universal-time format (HH:MM:SS)
   public String toUniversalString(){
       return String.format("%02d:%02d:%02d", this.getHour(), this.getMinute(), this.getSecond());
   }
   
   //convert to String in standard_time format (H:MM:SS AM or PM)
   @Override
   public String toString(){
       return String.format("%2d:%02d:%02d %s", 
               ((this.getHour() == 0 || this.getHour() == 12) ? 12 : this.getHour() % 12),
               this.getMinute(), this.getSecond(), ((this.getHour() < 12) ? "AM" : "PM"));
   }
}
