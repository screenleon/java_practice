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
public class NormalWeapon extends Weapon{
    private double nowOffense = 0;
    
    public NormalWeapon(double _offense, double _defense) {
        super(_offense, _defense);
        this.setNowOffense(super.getOffense());
    }
    
    public NormalWeapon(double _maxOffense, double _minOffense, double _defense) {
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
        this.nowOffense = super.getOffense();
        return this.getNowOffense();
    }
    
    @Override
    public String toString(){
        return "一般武器攻擊力：" + (int)this.getNowOffense();
    }
}
