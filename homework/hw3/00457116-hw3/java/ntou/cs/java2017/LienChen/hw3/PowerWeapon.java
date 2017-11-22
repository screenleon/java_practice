/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ntou.cs.java2017.LienChen.hw3;

/**
 *
 * @author user
 */

//the subclass of weapon
public class PowerWeapon extends Weapon{
    private double nowOffense;
    
    //construct powerweapon with no range attack and defense
    public PowerWeapon(double _offense, double _defense){
        super(_offense, _defense);
        this.setNowOffense(super.getOffense());
    }
    
    //construct powerweapon with range attack and defense
    public PowerWeapon(double _maxOffense, double _minOffense, double _defense){
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
        this.setNowOffense(super.getOffense() * 1.2);
        return oldOffense;
    }
    
    //get the string of the initial weapon's infomation
    @Override
    public String initString(){
        return "強力武器攻擊力：" + (int)this.getNowOffense();
    }
    
    //get the string that weapon's now damage
    @Override
    public String toString(){
        return "[PowerWeapon造成 " + (int)this.getNowOffense() + " 點的傷害]";
    }
}
