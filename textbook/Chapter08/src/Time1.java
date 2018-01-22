/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Time1 {
   private int hour;   // 0 - 23
   private int minute; // 0 - 59
   private int second; // 0 - 59
   
   //set a new time value using univeral time; throw on
   //exception if the hour, minute, second is invalid
   public void setTime(int _hour, int _minute, int _second){
       //if validate hour, minute and second
       if(_hour < 0 || _hour >= 24 || _minute < 0 || _minute >= 60 ||
               _second < 0 || _second >= 60){
           throw new IllegalArgumentException("hour, minute and/or second was "
                   + "out of range");
       }
       
       this.hour = _hour;
       this.minute = _minute;
       this.second = _second;
   }
   
   //convert to String in universal-time format (HH:MM:SS)
   public String toUniversalString(){
       return String.format("%02d:%02d:%02d", this.hour, this.minute, this.second);
   }
   
   //convert to String in standard_time format (H:MM:SS AM or PM)
   @Override
   public String toString(){
       return String.format("%02d:%02d:%02d %s", 
               ((this.hour == 0 || this.hour == 12) ? 12 : this.hour % 12),
               this.minute, this.second, ((this.hour < 12) ? "AM" : "PM"));
   }
}
