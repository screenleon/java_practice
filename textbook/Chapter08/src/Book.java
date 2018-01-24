/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public enum Book {
    //declare constants of enum type
    JHTP("Java How to Program", "2015"),
    CHTP("C How to Program", "2013"),
    IW3HTP("Internet & World Wide Web How to Program", "2012"),
    CPPHTP("C++ How to Program", "2014"),
    VBHTP("Visual Basic How to Program", "2014"),
    CSHARPHTP("Visual C# How to Program", "2014");
    
    private final String title;
    private final String copyrightYear;
    
    Book(String _title, String _copyrightYear){
        this.title = _title;
        this.copyrightYear = _copyrightYear;
    }
    
    public String getTitle(){
        return this.title;
    }
    
    public String getCopyrightYear(){
        return this.copyrightYear;
    }
}
