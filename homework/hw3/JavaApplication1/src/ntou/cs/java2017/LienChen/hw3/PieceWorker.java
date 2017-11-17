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
public class PieceWorker extends Employee{
    private int wage;
    private int pieces;
    
    @Override
    public int getEarnings(){
        return wage * pieces;
    }
    
}
