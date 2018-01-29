/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class SalariedEmployee extends Employee{
    private double weeklySalary;
    
    //constructor
    public SalariedEmployee(String _firstName, String _lastName, String _socialSecurityNumber,
            double _weeklySalary){
        super(_firstName, _lastName, _socialSecurityNumber);
        
        if(_weeklySalary < 0.0)
            throw new IllegalArgumentException("Weekly salary must be >= 0.0");
        
        this.weeklySalary = _weeklySalary;
    }
    
    //set salary
    public void setWeeklySalary(double _weeklySalary){
        if(_weeklySalary < 0.0)
            throw new IllegalArgumentException("Weekly salary must be >= 0.0");
        
        this.weeklySalary = _weeklySalary;
    }
    
    //return salary
    public double getWeeklySalary(){
        return this.weeklySalary;
    }
    
    //calculate earnings; override abstract method earnings in employee
    @Override
    public double earnings(){
        return this.getWeeklySalary();
    }
    
    //return String representation of SalariedEmployee object
    @Override
    public String toString(){
        return String.format("salaried employee: %s%n%s: $%,.2f", super.toString(),
                "weekly salary", this.getWeeklySalary());
    }
}
