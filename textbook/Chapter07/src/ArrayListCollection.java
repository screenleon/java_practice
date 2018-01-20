/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class ArrayListCollection {
    public static void main(String[] args){
        ArrayList<String> items = new ArrayList<String>();
        
        items.add("red");
        items.add(0, "yellow");
        
        System.out.printf("Display list contents with counter-controlled loop:");
        
        for(int i = 0; i < items.size(); i++){
            System.out.printf(" %s", items.get(i));
        }
        
        display(items, "%nDisplay list contents with enhanced for statement:");
        
        items.add("green");
        items.add("yellow");
        display(items, "List with two new elements:");
        
        items.remove("yellow");
        display(items, "Remove first instance of yellow:");
        
        items.remove(1);
        display(items, "Remove second list element (green):");
        
        System.out.printf("\"red\" is %sin the list%n", items.contains("red") ? "" : "not ");
        
        System.out.printf("Size: %s%n", items.size());
    }
    
    public static void display(ArrayList<String> items, String header){
        System.out.printf(header);
        
        for(String item : items){
            System.out.printf(" %s", item);
        }
        System.out.println();
    }
}
