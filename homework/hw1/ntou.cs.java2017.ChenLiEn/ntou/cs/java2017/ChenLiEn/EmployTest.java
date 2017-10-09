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
public class EmployTest {
    public static void main(String[] args){
        //set the information to employ1
        Employ employ1 = new Employ("Bob", "Jones", 34500.00);
        //set the information to employ2
        Employ employ2 = new Employ("Susan", "Baker", 37809.00);
        
        //print the employs' information
        employ1.ShowData();
        employ2.ShowData();
        
        //print to know "it will raise the salary"
        System.out.println("Increasing employee salaries by 10%");
        
        //increase employs' salary
        employ1.SalaryIncrease(0.1d);
        employ2.SalaryIncrease(0.1d);
        
        //print each employs' information
        employ1.ShowData();
        employ2.ShowData();
    }
}
