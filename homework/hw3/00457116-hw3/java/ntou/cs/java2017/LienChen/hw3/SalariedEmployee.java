/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ntou.cs.java2017.LienChen.hw3;

import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author user
 */

//the employee that works each weeks and gets money each week
public class SalariedEmployee extends Employee{
    private int weeks;
    private int weeklySalary;
    
    //construct salariedemployee and set association setting
    public SalariedEmployee(int _weeklySalary, int _weeks, int _bonusType){
        this.weeklySalary = _weeklySalary;
        this.weeks = _weeks;
        switch(_bonusType){
            case 1:
                this.bonus = new StaticBonus();
                break;
            case 2:
                this.bonus = new DynamicBonus();
                break;
        }
    }
    
    //get the salary of this employee
    @Override
    public int getEarnings(){
        return this.weeklySalary * this.weeks;
    }
    
    //get the string from object with relevant information
    @Override
    public String toString(){
        NumberFormat numberFormat = NumberFormat.getNumberInstance(Locale.US);
        return String.format("weekly salary: %s, working weeks: %s, calculated earnings: %s, bonus: %s",
                            numberFormat.format(this.weeklySalary), numberFormat.format(this.weeks),
                            numberFormat.format(this.getEarnings()), numberFormat.format(this.bonus.getBonus(this.getEarnings())));
    }
}
