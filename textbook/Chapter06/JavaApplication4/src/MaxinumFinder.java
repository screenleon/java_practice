/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author Lien
 */
public class MaxinumFinder {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter three floating-point values separated by spaces: ");
        
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();
        
        double result = maxinum(number1, number2, number3);
        
        System.out.println("Maxinum is " + result);
    }
    
    public static double maxinum(double x, double y, double z){
        double maxinumValue = x;
        
        if(y > maxinumValue)
            maxinumValue = y;
        
        if(z > maxinumValue)
            maxinumValue = z;
        
        return maxinumValue;
    }
}
