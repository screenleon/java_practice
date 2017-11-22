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
//the employee that sale the things and got the grosssale
public class CommissionEmployee extends Employee{
    private int grossSales;
    private double commissionRate;
    
    //construct commissionemployee and set association setting
    public CommissionEmployee(double _commissionRate, int _grossSales, int _bonusType){
        this.commissionRate = _commissionRate;
        this.grossSales = _grossSales;
        switch(_bonusType){
            case 1:
                this.bonus = new StaticBonus();
                break;
            case 2:
                this.bonus = new DynamicBonus();
                break;
        }
    }
    
    //get the employee earn money
    @Override
    public int getEarnings(){
        return (int)(commissionRate * grossSales);
    }
    
    //get the string from object with relevant information
    @Override
    public String toString(){
        NumberFormat numberFormat = NumberFormat.getNumberInstance(Locale.US);
        return String.format("commission rate: %s, gross sales: %s, calculated earnings: %s, bonus: %s",
                            numberFormat.format(this.commissionRate), numberFormat.format(this.grossSales),
                            numberFormat.format(this.getEarnings()), numberFormat.format(this.bonus.getBonus(this.getEarnings())));
    }
}
