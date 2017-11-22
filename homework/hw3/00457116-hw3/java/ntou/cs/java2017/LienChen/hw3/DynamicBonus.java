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

//the bonus of dynamic bonus
public class DynamicBonus implements Bonus{
    
    //get the bonus prize which same as 0.1 multiply salary
    @Override
    public int getBonus(int salary){
        return (int)(salary * 0.1);
    }
    
}
