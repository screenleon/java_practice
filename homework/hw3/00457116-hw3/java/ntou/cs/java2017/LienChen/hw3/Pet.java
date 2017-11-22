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

//the pet class use ATK
public class Pet implements ATK{
    private double maxOffense;
    private double minOffense;
    private double nowOffense;
    
    //construct Pet with range attack and set the current attack
    public Pet(double maxAttack, double minAttack){
        this.setOffense(maxAttack, minAttack);
        this.setNowOffense();
    }
    
    //set the attack's upper limit and lower limit
    public void setOffense(double maxAttack, double minAttack){
        if(0 < maxAttack)
            this.maxOffense = maxAttack;
        else this.maxOffense = 0;
        if(0 < minAttack)
            this.minOffense = minAttack;
        else this.minOffense = 0;
    }
    
    //random a current offense and set it
    public void setNowOffense(){
        SecureRandom random = new SecureRandom();
        int distanceOffense = (int)(this.maxOffense - this.minOffense + 1);
        this.nowOffense = random.nextInt(distanceOffense) + this.minOffense;
    }
    
    //get the current offense
    public double getNowOffense(){
        return this.nowOffense;
    }
    
    //get the current offense and set the next offense into the now offense
    @Override
    public double attack(){
        double oldOffense = this.getNowOffense();
        this.setNowOffense();
        return oldOffense;
    }
    
    //get the string of the initial weapon's infomation
    @Override
    public String initString(){
        return "Pet攻擊力：" + (int)this.getNowOffense();
    }
    
    //get the string that weapon's now damage
    @Override
    public String toString(){
        return "[Pet造成 " + (int)this.getNowOffense() + " 點的傷害]";
    }
}
