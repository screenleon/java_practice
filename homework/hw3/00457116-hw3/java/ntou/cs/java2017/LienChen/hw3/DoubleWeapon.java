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

//the subclass of weapon
public class DoubleWeapon extends Weapon{
    //5 times with 1 time double atk
    private static int doubleRate = 5;
    
    private double nowOffense;
    
    //construct doubleweapon with no range attack and defense
    public DoubleWeapon(double _offense, double _defense){
        super(_offense, _defense);
        this.setNowOffense(super.getOffense());
    }
    
    //construct doubleweapon with range attack and defense
    public DoubleWeapon(double _maxOffense, double _minOffense, double _defense){
        super(_maxOffense, _minOffense, _defense);
        this.setNowOffense(super.getOffense());
    }
    
    //set the current offense
    public void setNowOffense(double offense){
        this.nowOffense = offense;
    }
    
    //get the current offense
    public double getNowOffense(){
        return this.nowOffense;
    }
    
    //get the current offense and set the next offense into the now offense
    @Override
    public double attack(){
        double oldOffense = this.nowOffense;
        SecureRandom random = new SecureRandom();
        switch(random.nextInt(doubleRate) + 1){
            case 5:
                this.setNowOffense(super.getOffense() * 2);
                break;
            default:
                this.setNowOffense(super.getOffense());
                break;
        }
        return oldOffense;
    }
    
    //get the string of the initial weapon's infomation
    @Override
    public String initString(){
        return "加倍武器攻擊力：" + (int)this.getNowOffense();
    }
    
    //get the string that weapon's now damage
    @Override
    public String toString(){
        return "[DoubleWeapon造成 " + (int)this.getNowOffense() + " 點的傷害]";
    }
}
