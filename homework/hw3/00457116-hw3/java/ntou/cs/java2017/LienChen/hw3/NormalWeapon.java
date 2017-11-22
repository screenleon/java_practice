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

//the subclass of weapon that can hit the normal damage
public class NormalWeapon extends Weapon{
    private double nowOffense = 0;
    
    //construct normalweapon with no range attack and defense
    public NormalWeapon(double _offense, double _defense) {
        super(_offense, _defense);
        this.setNowOffense(super.getOffense());
    }
    
    //construct normal weapon with range attack and defense
    public NormalWeapon(double _maxOffense, double _minOffense, double _defense) {
        super(_maxOffense, _minOffense, _defense);
        this.setNowOffense(super.getOffense());
    }
    
    //record the current attack
    public void setNowOffense(double offense){
        this.nowOffense = offense;
    }
    
    //get the current attack
    public double getNowOffense(){
        return this.nowOffense;
    }
    
    //get the attack damage and set next offense
    @Override
    public double attack(){
        double oldOffense = this.nowOffense;
        this.nowOffense = super.getOffense();
        return oldOffense;
    }
    
    //get the string of the initial weapon's infomation
    @Override
    public String initString(){
        return "一般武器攻擊力：" + (int)this.getNowOffense();
    }
    
    //get the string that weapon's now damage
    @Override
    public String toString(){
        return "[NormalWeapon造成 " + (int)this.getNowOffense() + " 點的傷害]";
    }
}
