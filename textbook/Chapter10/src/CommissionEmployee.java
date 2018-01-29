/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class CommissionEmployee extends Employee{
    private double grossSales;
    private double commissionRate;
    
    public CommissionEmployee(String _firstName, String _lastName, String _socialSecurityNumber,
            double _grossSales, double _commissionRate){
        super(_firstName, _lastName, _socialSecurityNumber);
        
        if(_grossSales < 0.0)
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
        
        if(_commissionRate <= 0.0 || _commissionRate >= 1.0)
            throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
        
        this.grossSales = _grossSales;
        this.commissionRate = _commissionRate;
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
    
    @Override
    public double earnings(){
        return this.commissionRate * this.grossSales;
    }
    
    @Override
    public String toString(){
        return String.format("%s: %s%n%s: $%,.2f; %s: %.2f", "commission employee",
                super.toString(), "gross sales", this.grossSales, "commission rate",
                commissionRate);
    }
}
