/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class PackageDataTest {
    public static void main(String[] args){
        PackageData packageData = new PackageData();
        
        System.out.printf("After instantiation:%n%s%n", packageData);
        
        packageData.number = 77;
        packageData.string = "Goodbye";
        
        System.out.printf("%nAfter changing values:%n%s%n", packageData);
    }
}

class PackageData{
    int number;
    String string;
    
    public PackageData(){
        this.number = 0;
        this.string = "Hello";
    }
    
    public String toString(){
        return String.format("number: %d; string: %s", this.number, this.string);
    }
}