/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

/**
 *
 * @author user
 */
public class EmployeeTest {
    public static void main(String[] args){
        Employee employee1 = new Employee("Bob", "Jones", 34500.00);
        Employee employee2 = new Employee("Susan", "Baker", 37809.00);
        
        employee1.ShowData();
        employee2.ShowData();
        System.out.println("Increasing employee salaries by 10%");
        employee1.Salary_Increase(0.1d);
        employee2.Salary_Increase(0.1d);
        
        employee1.ShowData();
        employee2.ShowData();
    }
}
