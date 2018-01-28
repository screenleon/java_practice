/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class BasePlusCommissionEmployee {
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;
    private double grossSales;
    private double commissionRate;
    private double baseSalary;
    
    public BasePlusCommissionEmployee(String _firstName, String _lastName,
            String _socialSecurityNumber, double _grossSales, double _commissionRate,
            double _baseSalary){
        if(_grossSales < 0.0)
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
        
        if(_commissionRate <= 0.0 || _commissionRate >= 1.0)
            throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
        
        if(_baseSalary < 0.0)
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        
        this.firstName = _firstName;
        this.lastName = _lastName;
        this.socialSecurityNumber = _socialSecurityNumber;
        this.grossSales = _grossSales;
        this.commissionRate = _commissionRate;
        this.baseSalary = _baseSalary;
    }
    
    public String getFirstName(){
        return this.firstName;
    }
    
    public String getLastName(){
        return this.lastName;
    }
    
    public String getSocialSecurityNumber(){
        return this.socialSecurityNumber;
    }
    
    public void setGrossSales(double _grossSales){
        if(_grossSales < 0.0)
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
        
        this.grossSales = _grossSales;
    }
    
    public double getGrossSales(){
        return this.grossSales;
    }
    
    public void setCommissionRate(double _commissionRate){
        if(_commissionRate <= 0.0 || _commissionRate >= 1.0)
            throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
        
        this.commissionRate = _commissionRate;
    }
    
    public double getCommissionRate(){
        return this.commissionRate;
    }
    
    public void setBaseSalary(double _baseSalary){
        if(_baseSalary < 0.0)
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        
        this.baseSalary = _baseSalary;
    }
    
    public double getBaseSalary(){
        return this.baseSalary;
    }
    
    public double earnings(){
        return this.baseSalary + (this.commissionRate * this.grossSales);
    }
    
    @Override
    public String toString(){
        return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n%s: %.2f",
                "basse-salaried commission employee", this.firstName, this.lastName,
                "social security number", this.socialSecurityNumber, "gross sales",
                this.grossSales, "commission rate", this.commissionRate,
                "base salary", this.baseSalary);
    }
}
