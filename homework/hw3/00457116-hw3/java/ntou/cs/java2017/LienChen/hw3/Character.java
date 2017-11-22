/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ntou.cs.java2017.LienChen.hw3;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class Character {
    //set the default hp, default atk, max hp
    public static int DEFAULT_HP = 200;
    public static int MAX_HP = 999;
    public static int DEFAULT_ATK = 50;
    
    private double hp;
    private ArrayList<ATK> equipment = new ArrayList<ATK>(); 
    
    //construct character with default hp and default weapon
    public Character(){
        this.setHp(DEFAULT_HP);
        this.equipment.add(new NormalWeapon(DEFAULT_ATK, 0));
    }
    
    //construct character with hp and default weapon
    public Character(double _hp){
        this.setHp(_hp);
        this.equipment.add(new NormalWeapon(DEFAULT_ATK, 0));
    }
    
    //construct character with hp and weapons in arraylist<ATK>
    public Character (double _hp, ArrayList<ATK> _equipment){
	this.setHp(_hp);
	this.setEquipMent(_equipment);
    }
    
    //set the hp from outside and check the hp > 0 and hp < default hp
    public void setHp(double _hp){
        if((_hp > 0) && (_hp < MAX_HP)){
            this.hp = _hp;
        }
        else this.hp = 0;
    }
    
    //get the hp from this object
    public double getHp(){
        return this.hp;
    }
    
    //get the arraylist<ATK> from the object
    public ArrayList<ATK> getEquipment(){
        return this.equipment;
    }
    
    //set the equipment from other weapons which type is arraylist<ATK>
    public void setEquipMent(ArrayList<ATK> _equipment){
        this.equipment = _equipment;
    }
    
    //get the total damage from equipment's weapons or pet
    public double attack(){
        double damage = 0.0;
        for(int i = 0;i < this.equipment.size(); i++){
            damage += this.equipment.get(i).attack();
        }
        return damage;
    }
    
    //get the string which initial character need to print
    public String initString(){
        String tempString = "玩家HP：" + (int)this.getHp() + "，配戴";
        for(int i = 0; i < this.equipment.size(); i++){
            tempString += this.equipment.get(i).initString();
            if(i < this.equipment.size() - 1)
                tempString += "、";
        }
        return tempString;
    }
    
    //get the string which the equipment's damage and type
    public String toString(){
        String tempString = null;
        if(!this.equipment.isEmpty()){
            tempString = this.equipment.get(0).toString();
            for(int i = 1; i < this.equipment.size(); i++){
                tempString += this.equipment.get(i);
            }
        }
        return tempString;
    }
}
