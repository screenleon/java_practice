/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ntou.cs.java2017.chenlien;

/**
 *
 * @author Li-En
 */
public class TwelveTest {
    public static void main(String[] args){
        Twelve twelve = new Twelve();
        for(;twelve.GetSequence1();){
            //if GetSequence return true then run return false then stop
            for(;twelve.GetSequence2();){
                //if GetSequence return true then run return false then stop
            }
        }
    }
}
