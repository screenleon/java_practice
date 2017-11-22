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

//the subclass of employee which is a hourlyemployee
public class HourlyEmployee extends Employee{
    private int hours;
    private int hourlySalary;
    
    //construct hourlyemployee with it works hours and its hour salary and its bonustype
    public HourlyEmployee(int _hourSalary, int _hours, int _bonusType){
        this.hourlySalary = _hourSalary;
        this.hours = _hours;
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
        int standardHour = 40;
        if(this.hours > 40)
            return (int)(this.hourlySalary * standardHour + this.hourlySalary * 1.5 * (this.hours - standardHour));
        else 
            return this.hourlySalary * this.hours;
    }
    
    //get the string from object with relevant information
    @Override
    public String toString(){
        NumberFormat numberFormat = NumberFormat.getNumberInstance(Locale.US);
        return String.format("hourly salary: %s, hours: %s, calculated earnings: %s, bonus: %s",
                            numberFormat.format(this.hourlySalary), numberFormat.format(this.hours),
                            numberFormat.format(this.getEarnings()), numberFormat.format(this.bonus.getBonus(this.getEarnings())));
    }
}
