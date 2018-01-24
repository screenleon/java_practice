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
    private String firstName;
    private String lastName;
    private Date birthDate;
    private Date hireDate;
    
    public Employee(String _firstName, String _lastName, Date _birthDate, Date _hireDate){
        this.firstName = _firstName;
        this.lastName = _lastName;
        this.birthDate = _birthDate;
        this.hireDate = _hireDate;
    }
    
    @Override
    public String toString(){
        return String.format("%s, %s Hired: %s  BirthDay: %s", this.lastName,
                this.firstName, this.hireDate, this.birthDate);
    }
}
