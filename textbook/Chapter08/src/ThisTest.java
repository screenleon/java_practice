/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class ThisTest {
    public static void main(String[] args){
        SimpleTime time = new SimpleTime(15, 30, 19);
        System.out.println(time.buildString());
    }
}

//class SimpleTime demonstrates the "this" reference
class SimpleTime{
    private int hour;      //0 - 23
    private int minute;    //0 - 59
    private int second;    //0 - 59
    
    //if the constructor uses parameter names identical to 
    //instance variable names the "this" reference is required
    //to distinguish between the names
    public SimpleTime(int _hour, int _minute, int _second){
        this.hour = _hour;
        this.minute = _minute;
        this.second = _second;
    }
    
    //use explicit and implicit "this" to call toUniversalString
    public String buildString(){
        return String.format("%24s: %s%n%24s: %s", "this.toUniversalString()",
                this.toUniversalString(), "toUniversakString()",
                toUniversalString());
    }
    
    //convert to String in universal-time format(HH:MM:SS)
    public String toUniversalString(){
        return String.format("%02d:%02d:%02d", this.hour, this.minute, this.second);
    }
}
