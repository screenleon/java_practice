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
public class HourlyEmployee extends Employee{
    private int hours;
    private int hourlySalary;
    
    @Override
    public int getEarnings(){
        int standardHour = 40;
        if(this.hours > 40)
            return (int)(this.hourlySalary * standardHour + this.hourlySalary * 1.5 * (this.hours - standardHour));
        else 
            return this.hourlySalary * this.hours;
    }
}
