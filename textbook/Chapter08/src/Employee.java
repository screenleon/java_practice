/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Employee {
    private static int count = 0;  //number of employees created
    private String firstName;
    private String lastName;
    
    public Employee(String _firstName, String _lastName){
        this.firstName = _firstName;
        this.lastName = _lastName;
        
        ++count;
        System.out.printf("Employee constructor: %s %s; count = %d%n", this.firstName,
                this.lastName, count);
    }
    
    public String getFirstName(){
        return this.firstName;
    }
    
    public String getLastName(){
        return this.lastName;
    }
    
    public static int getCount(){
        return count;
    }
}
