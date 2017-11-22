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
//the bonus of static bonus
public class StaticBonus implements Bonus{
    
    //get the bonus prize  which is 10000
    @Override
    public int getBonus(int salary){
        return 10000;
    }
}
