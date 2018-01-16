/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class InitArray {
    public static void main(String[] args){
        int[] array = new int[10];
        //%n will auto change to nextline in window will be \r\n 
        //in linux will be \n
        System.out.printf("%s%8s%n", "Index", "Value");
        
        for(int counter = 0; counter < array.length; counter++){
            System.out.printf("%5d%8d%n", counter, array[counter]);
        }
    }
}
