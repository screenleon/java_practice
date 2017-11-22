/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ntou.cs.java2017.LienChen.hw3;

import java.security.SecureRandom;

/**
 *
 * @author user
 */

//the weapon class implement ATK
public abstract class Weapon implements ATK{
    private SecureRandom random = new SecureRandom();
    public static double MAX_VALUE = 255; 
    private double maxOffense;
    private double minOffense;
    private double offense = 0;
    private double defense;
    
    ////construct weapon with no range attack and defense
    public Weapon(double _offense, double _defense){
        this.setOffense(_offense);
        this.setDefense(_defense);
    }
    
    //construct weapon with range attack and defense
    public Weapon(double _maxOffense, double _minOffense, double _defense){
        this.setOffense(_maxOffense, _minOffense);
        this.setDefense(_defense);
    }
    
    //if attack do not have range and set attack
    public void setOffense(double _offense){
        if((0 < _offense) && (_offense < MAX_VALUE)){
            this.offense = _offense;
        }
        else
            this.offense = 0;
    }
    
    //if attack has range then set the up limit and down limit
    public void setOffense(double _maxOffense, double _minOffense){
        if((0 < _maxOffense) && (_maxOffense < MAX_VALUE)){
            this.maxOffense = _maxOffense;
        }
        else
            this.maxOffense = 0;
        if((0 < _minOffense) && (_minOffense < MAX_VALUE)){
            this.minOffense = _minOffense;
        }
        else
            this.minOffense = 0;
    }
    
    //get the offense from range attack or default attack
    public double getOffense(){
        if(this.offense  > 0)
            return this.offense;
        else{
            int dOffense = (int)this.maxOffense - (int)this.minOffense + 1;
            int randomNumber = random.nextInt(dOffense);
            return randomNumber + this.minOffense;
        }
    }
    
    //set defense and check the defense > 9 or defense < max value
    public void setDefense(double _defense){
        if((0 < _defense) && (_defense < MAX_VALUE))
            this.defense = _defense;
        else
            this.defense = 0;
    }
    
    //get the defense of object
    public double getDefense(){
        return this.defense;
    }
    
    //get the string of the initial weapon's infomation
    @Override
    public String initString(){
        return "配戴武器攻擊力：" + this.offense;
    }
    
    //get the string that weapon's now damage
    @Override
    public String toString(){
        return "Weapon [offense=" + this.offense + ", defense=" + this.defense + "]";
    }
}
