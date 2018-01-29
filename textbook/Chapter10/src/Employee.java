/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public abstract class Employee {
    private final String firstName;
    private final String lastNAme;
    private String socialSecurityNumber;
    
    //constructor
    public Employee(String _firstName, String _lastName, String _socialSecurityNumber){
        this.firstName = _firstName;
        this.lastNAme = _lastName;
        this.socialSecurityNumber = _socialSecurityNumber;
    }
    
    //return first name
    public String getFirstName(){
        return this.firstName;
    }
    
    //return last name
    public String getLastName(){
        return this.lastNAme;
    }
    
    //return social security number
    public String getSocialSecurityNumber(){
        return this.socialSecurityNumber;
    }
    
    //return String representation of Employee object
    @Override
    public String toString(){
        return String.format("%s %s%nsocial security number: %s", this.getFirstName(),
                this.getLastName(), this.getSocialSecurityNumber());
    }
    
    //abstract method must be overridden by concrete subclasses
    public abstract double earnings(); //no implementation here
}
