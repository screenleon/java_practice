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
//a interface about bonus prize
public interface Bonus {
     //method that all class implement need to override
    //get the prize from object
    public abstract int getBonus(int salary);
}
