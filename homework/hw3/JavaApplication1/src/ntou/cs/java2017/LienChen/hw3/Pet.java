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
public class Pet implements ATK{
    private double maxOffense;
    private double minOffense;
    private double nowOffense;
    
    public Pet(double maxAttack, double minAttack){
        this.setOffense(maxAttack, minAttack);
        this.setNowOffense();
    }
    
    public void setOffense(double maxAttack, double minAttack){
        if(0 < maxAttack)
            this.maxOffense = maxAttack;
        else this.maxOffense = 0;
        if(0 < minAttack)
            this.minOffense = minAttack;
        else this.minOffense = 0;
    }
    
    public void setNowOffense(){
        SecureRandom random = new SecureRandom();
        int distanceOffense = (int)(this.maxOffense - this.minOffense + 1);
        this.nowOffense = random.nextInt(distanceOffense) + this.minOffense;
    }
    
    public double getNowOffense(){
        return this.nowOffense;
    }
    
    @Override
    public double attack(){
        this.setNowOffense();
        return this.getNowOffense();
    }
    
    @Override
    public String initString(){
        return "Pet攻擊力：" + (int)this.getNowOffense();
    }
    
    @Override
    public String toString(){
        return "[Pet造成 " + (int)this.getNowOffense() + " 點的傷害]";
    }
}
