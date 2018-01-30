/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Invoice implements Payable{
    private final String partNumber;
    private final String partDescription;
    private int quantity;
    private double pricePerItem;
    
    //constructor
    public Invoice(String _partNumber, String _partDescription, int _quantity,
            double _pricePerItem){
        if(_quantity < 0)
            throw new IllegalArgumentException("Quantity must be >= 0");
        
        if(_pricePerItem < 0.0)
            throw new IllegalArgumentException("Price per item must be >= 0");
        
        this.quantity = _quantity;
        this.pricePerItem = _pricePerItem;
        this.partDescription = _partDescription;
        this.partNumber = _partNumber;
    }
    
    //get part number
    public String getPartNumber(){
        return this.partNumber;
    }
    
    //get part description
    public String getPartDescription(){
        return this.partDescription;
    }
    
    //set quantity
    public void setQuantity(int _quantity){
        if(_quantity < 0)
            throw new IllegalArgumentException("Quantity must be >= 0");
        
        this.quantity = _quantity;
    }
    
    //get quantity
    public int getQuantity(){
        return this.quantity;
    }
    
    //set price per item
    public void setPricePerItem(double _pricePerItem){
        if(_pricePerItem < 0.0)
            throw new IllegalArgumentException("Price per item must be >= 0");
        
        this.pricePerItem = _pricePerItem;
    }
    
    //get price per item
    public double getPricePerItem(){
        return this.pricePerItem;
    }
    
    @Override
    public double getPaymentAmount(){
        return this.getQuantity() * this.getPricePerItem();
    }
    
    @Override
    public String toString(){
        return String.format("%s: %n%s: %s (%s) %n%s: %d %n%s: $%,.2f", "invoice",
                "part number", this.getPartNumber(), this.getPartDescription(),
                "quantity", this.getQuantity(), "price per item", this.getPricePerItem());
                
    }
}
