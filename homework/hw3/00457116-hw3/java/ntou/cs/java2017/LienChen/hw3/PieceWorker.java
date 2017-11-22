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

//the employee that make wage and each wage get money
public class PieceWorker extends Employee{
    private int wage;
    private int pieces;
    
    
     //construct pieceworker and set association setting
    public PieceWorker(int _wage, int _pieces, int _bonusType){
        this.wage = _wage;
        this.pieces = _pieces;
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
        return wage * pieces;
    }
    
    //get the string from object with relevant information
    @Override
    public String toString(){
        NumberFormat numberFormat = NumberFormat.getNumberInstance(Locale.US);
        return String.format("wage: %s, piece: %s, calculated earnings: %s, bonus: %s",
                            numberFormat.format(this.wage), numberFormat.format(this.pieces),
                            numberFormat.format(this.getEarnings()), numberFormat.format(this.bonus.getBonus(this.getEarnings())));
    }
    
}
