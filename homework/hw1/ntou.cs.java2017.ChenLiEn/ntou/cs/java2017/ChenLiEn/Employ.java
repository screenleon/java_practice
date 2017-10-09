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
public class Employ {
    //set person's firstname, secondname, and its salary
    private String firstName;
    private String sencondName;
    private double monthlySalary;
    
    //set person name and salary
    public Employ(String _fname, String _sname, double _salary){
        this.firstName = _fname;
        this.sencondName = _sname;
        // salary can't be < 0
        if(_salary < 0)this.monthlySalary = 0.0;
        else this.monthlySalary = _salary;
    }
    
    //raise salary
    public void SalaryIncrease(double _rate){
        this.monthlySalary *= (1 + _rate);
        return;
    }
    
    //print person's information
    public void ShowData(){
        System.out.printf("%s %s; Yearly Salary: %.2f%n", this.firstName, this.sencondName, this.monthlySalary);
    }
    
    //set the first name
    public void SetFirstName(String _name){
        this.firstName = _name;
    }
    
    //set the second name
    public void SetSecondName(String _name){
        this.sencondName = _name;
    }
    
    //get private firstname 
    public String GetFirstName(){
        return this.firstName;
    }
    
    //get private secondname
    public String GetSencondName(){
        return this.sencondName;
    }
}
