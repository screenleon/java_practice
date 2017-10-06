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
        Employ employ1 = new Employ("Bob", "Jones", 34500.00);
        Employ employ2 = new Employ("Susan", "Baker", 37809.00);
        
        employ1.ShowData();
        employ2.ShowData();
        System.out.println("Increasing employee salaries by 10%");
        employ1.Salary_Increase(0.1d);
        employ2.Salary_Increase(0.1d);
        
        employ1.ShowData();
        employ2.ShowData();
    }
}
