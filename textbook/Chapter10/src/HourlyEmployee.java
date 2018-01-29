/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class HourlyEmployee extends Employee{
    private double wage;
    private double hours;
    
    //constructor
    public HourlyEmployee(String _firstName, String _lastName, String _socialSecurityNumber,
            double _wage, double _hours){
        super(_firstName, _lastName, _socialSecurityNumber);
        
        if(_wage < 0.0)
            throw new IllegalArgumentException("Hourly wage must be >= 0.0");
        
        if(_hours < 0.0)
            throw new IllegalArgumentException("Hours worked must be >= 0.0 and <= 168.0");
        
        this.wage = _wage;
        this.hours = _hours;
    }
    
    public void setWage(double _wage){
        if(_wage < 0.0)
            throw new IllegalArgumentException("Hourly wage must be >= 0.0");
        
        this.wage = _wage;
    }
    
    public double getWage(){
        return this.wage;
    }
    
    public void setHours(double _hours){
        if(_hours < 0.0)
            throw new IllegalArgumentException("Hours worked must be >= 0.0 and <= 168.0");
        
        this.hours = _hours;
    }
    
    public double getHours(){
        return this.hours;
    }
    
    @Override
    public double earnings(){
        if(this.getHours() <= 40)
            return this.getWage() * this.getHours();
        else return 40 * this.getWage() + (this.getHours() - 40) * this.getWage() * 1.5;
    }
    
    @Override
    public String toString(){
        return String.format("hourly employee: %s%n%s: $%,.2f; %s: %,.2f", super.toString(),
                "hourly wage", this.getWage(), "hours worked", this.getHours());
    }
}
