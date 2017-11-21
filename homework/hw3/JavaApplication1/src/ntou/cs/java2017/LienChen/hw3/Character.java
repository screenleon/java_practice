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
    public static int DEFAULT_HP = 200;
    public static int MAX_HP = 999;
    public static int DEFAULT_ATK = 50;
    public enum CharacterStatus {
        ATTACK, DEFEND, END
    }
    
    private CharacterStatus characterStatus = CharacterStatus.END;
    private double hp;
    private ArrayList<ATK> equipment = new ArrayList<ATK>(); 
    
    public Character(){
        this.setHp(DEFAULT_HP);
        this.equipment.add(new NormalWeapon(DEFAULT_ATK, 0));
    }
    
    public Character(double _hp){
        this.setHp(_hp);
        this.equipment.add(new NormalWeapon(DEFAULT_ATK, 0));
    }
    
    public Character (double _hp, ArrayList<ATK> _equipment){
	this.setHp(_hp);
	this.setEquipMent(_equipment);
    }
    
    public void setHp(double _hp){
        if((_hp > 0) && (_hp < MAX_HP)){
            this.hp = _hp;
        }
        else this.hp = 0;
    }
    
    public double getHp(){
        return this.hp;
    }
    
    public ArrayList<ATK> getEquipment(){
        return this.equipment;
    }
    
    public void setEquipMent(ArrayList<ATK> _equipment){
        this.equipment = _equipment;
    }
    
    public void setStatus(int inputStatus){
        switch(inputStatus){
            case 1:
                this.characterStatus = CharacterStatus.ATTACK;
                break;
            case 2:
                this.characterStatus = CharacterStatus.DEFEND;
                break;
            case 3:
                this.characterStatus = CharacterStatus.END;
                break;
        }
    }
    
    public CharacterStatus getStatus(){
        return this.characterStatus;
    }
    
    public double attack(){
        double damage = 0.0;
        for(int i = 0;i < this.equipment.size(); i++){
            damage += this.equipment.get(i).attack();
        }
        return damage;
    }
    
    public String initString(){
        String tempString = "玩家HP：" + (int)this.getHp() + "，配戴";
        for(int i = 0; i < this.equipment.size(); i++){
            tempString += this.equipment.get(i).initString();
            if(i < this.equipment.size() - 1)
                tempString += "、";
        }
        return tempString;
    }
    
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
