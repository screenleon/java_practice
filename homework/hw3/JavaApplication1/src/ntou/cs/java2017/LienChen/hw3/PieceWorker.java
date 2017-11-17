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
public class PieceWorker extends Employee{
    private int wage;
    private int pieces;
    
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
    
    @Override
    public int getEarnings(){
        return wage * pieces;
    }
    
    @Override
    public String toString(){
        NumberFormat numberFormat = NumberFormat.getNumberInstance(Locale.US);
        return String.format("wage: %s, piece: %s, calculated earnings: %s, bonus: %s",
                            numberFormat.format(this.wage), numberFormat.format(this.pieces),
                            numberFormat.format(this.getEarnings()), this.bonus.getBonus(this.getEarnings()));
    }
    
}
