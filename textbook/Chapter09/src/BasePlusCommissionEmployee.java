/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class BasePlusCommissionEmployee extends CommissionEmployee{
    private double baseSalary;
    
    public BasePlusCommissionEmployee(String _firstName, String _lastName,
            String _socialSecurityNumber, double _grossSales, double _commissionRate,
            double _baseSalary){
        super(_firstName, _lastName, _socialSecurityNumber, _grossSales, _commissionRate);
        
        if(_baseSalary < 0.0)
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        
        this.baseSalary = _baseSalary;
    }
    
    public void setBaseSalary(double _baseSalary){
        if(_baseSalary < 0.0)
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        
        this.baseSalary = _baseSalary;
    }
    
    public double getBaseSalary(){
        return this.baseSalary;
    }
    
    @Override
    public double earnings(){
        return this.baseSalary + (commissionRate * grossSales);
    }
    
    @Override
    public String toString(){
        return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n%s: %.2f",
                "basse-salaried commission employee", firstName, lastName,
                "social security number", socialSecurityNumber, "gross sales",
                grossSales, "commission rate", commissionRate,
                "base salary", this.baseSalary);
    }
}
