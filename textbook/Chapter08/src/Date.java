/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Date {
    private int month;    // 1 - 12
    private int day;      // 1 - 31 based on month
    private int year;
    
    private static final int[] daysPerMonth = {
        0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
    };
    
    public Date(int _month, int _day, int _year){
        //check if month in range
        if(_month < 0 || _month > 12)
            throw new IllegalArgumentException("month (" + _month + ") must be 1-12");
        
        //check if month in range
        if(_day < 0 || (day > daysPerMonth[_month] && !(_month == 2 && _day == 29)))
            throw new IllegalArgumentException("day (" + _month + 
                    ") out-of-range for the specified month and year");
        
        if(_month == 2 && _day == 29 && !(_year % 400 == 0 || (_year % 4 == 0 && _year % 100 != 0)))
            throw new IllegalArgumentException("year (" + _year + 
                    ") out-of-range for the specified month and year");
        
        this.month = _month;
        this.day = _day;
        this.year = _year;
        
        System.out.printf("Date object constructor for date %s%n", this);
    }
    
    @Override
    public String toString(){
        return String.format("%d/%d/%d", this.month, this.day, this.year);
    }
}
