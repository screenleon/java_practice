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
public class PowerWeapon extends Weapon{
    private double nowOffense;
    
    public PowerWeapon(double _offense, double _defense){
        super(_offense, _defense);
        this.setNowOffense(super.getOffense());
    }
    
    public PowerWeapon(double _maxOffense, double _minOffense, double _defense){
        super(_maxOffense, _minOffense, _defense);
        this.setNowOffense(super.getOffense());

    }
    
    public void setNowOffense(double offense){
        this.nowOffense = offense;
    }
    
    public double getNowOffense(){
        return this.nowOffense;
    }
    
    @Override
    public double attack(){
        this.setNowOffense(super.getOffense() * 2);
        return this.getNowOffense();
    }
    
    @Override
    public String toString(){
        return "強力武器攻擊力：" + (int)this.getNowOffense();
    }
}
