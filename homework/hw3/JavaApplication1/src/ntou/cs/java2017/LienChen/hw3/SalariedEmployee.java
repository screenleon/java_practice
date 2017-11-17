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
public class SalariedEmployee extends Employee{
    private int weeks;
    private int weeklySalary;
    
    @Override
    public int getEarnings(){
        return this.weeklySalary * this.weeks;
    }
    
}
