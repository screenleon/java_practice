/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ntou.cs.java2017.LienChen.hw3;

import java.util.Locale;

/**
 *
 * @author Lien
 */

//the test of complex
public class ComplexTest {
    public static void main(String[] args){
        Complex complex1 = new Complex(1.1F, 2.2F);
        Complex complex2 = new Complex(3.3F, 4.4F);
        
        System.out.println("a = " + complex1);
        System.out.println("Conjugates of a = " + complex1);
        System.out.printf("Absolute value of a = %.2f\n", complex1.getAbsComplex());
        
        System.out.println("b = " + complex2);
        System.out.println("Conjugates of b = " + complex2);
        System.out.printf("Absolute value of b = %.2f\n", complex2.getAbsComplex());
        
        System.out.println("a + b = " + complex1.addComplex(complex2));
        System.out.println("a - b = " + complex1.subComplex(complex2));
        System.out.println("a * b = " + complex1.multiComplex(complex2));
        System.out.println("a / b = " + complex1.divComplex(complex2));
        
    }
}
