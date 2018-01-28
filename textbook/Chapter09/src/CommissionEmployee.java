/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class CommissionEmployee extends Object{
    protected final String firstName;
    protected final String lastName;
    protected final String socialSecurityNumber;
    protected double grossSales;
    protected double commissionRate;
    
    public CommissionEmployee(String _firstName, String _lastName, String _socialSecurityNumber,
            double _grossSales, double _commissionRate){
        if(_grossSales < 0.0)
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
        
        if(_commissionRate <= 0.0 || _commissionRate >= 1.0)
            throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
        
        this.firstName = _firstName;
        this.lastName = _lastName;
        this.socialSecurityNumber = _socialSecurityNumber;
        this.grossSales = _grossSales;
        this.commissionRate = _commissionRate;
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
    
    public double earnings(){
        return this.commissionRate * this.grossSales;
    }
    
    @Override
    public String toString(){
        return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %,2f", "commission employee",
                this.firstName, this.lastName, "social security number", this.socialSecurityNumber,
                "gross sales", this.grossSales, "commission rate", commissionRate);
    }
}
