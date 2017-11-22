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

//a abstruct class about employee that can and several types of employee in subclass 
public abstract class Employee {
    protected Bonus bonus;
    
    //get the employee salary
    public abstract int getEarnings();
    
    //get the string which is about employee
    public abstract String toString();
}
