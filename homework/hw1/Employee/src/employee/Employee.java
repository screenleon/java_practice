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
public class Employee {
    private String firstname;
    private String sencondname;
    private double monthlysalary;
    
    public Employee(String _fname, String _sname, double _salary){
        this.firstname = _fname;
        this.sencondname = _sname;
        if(_salary > 0)this.monthlysalary = _salary;
        else this.monthlysalary = 0.0;
    }
    
    public void Salary_Increase(double _rate){
        this.monthlysalary *= (1 + _rate);
        return;
    }
    
    public void ShowData(){
        System.out.printf("%s %s; Yearly Salary: %.2f%n", this.firstname, this.sencondname, this.monthlysalary);
    }
    
    public void SetFirstName(String _name){
        this.firstname = _name;
    }
    
    public void SetSecondName(String _name){
        this.sencondname = _name;
    }
    
    public String GetFirstName(){
        return this.firstname;
    }
    
    public String GetSencondName(){
        return this.sencondname;
    }
}
