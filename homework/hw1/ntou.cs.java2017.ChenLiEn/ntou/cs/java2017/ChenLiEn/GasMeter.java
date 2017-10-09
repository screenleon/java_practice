/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ntou.cs.java2017.chenlien;

/**
 *
 * @author Li-En
 */
public class GasMeter {
    // record the total gallons and miles
    private int gallons;
    private int miles;
    
    //initialize the gallons and miles
    public GasMeter(){
        this.gallons = 0;
        this.miles = 0;
    }
    
    //record the new mile and gallon and add to the old one
    public void UpdateGasMeter(int _mile, int _gallon){
        this.gallons += _gallon;
        this.miles += _mile;
    }
    
    //get the total mpg from miles and gallons
    public double TotalMPG(){
        return this.miles * 1.0 / this.gallons;
    }
}
