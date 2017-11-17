/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ntou.cs.java2017.LienChen.hw3;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author Lien
 */
public class EmployeeTest {
    
    public static void main(String[] args){
        Employee[] employee;
        List<Integer> workerType = new ArrayList<Integer>();
        List<Integer> price = new ArrayList<Integer>();
        List<Integer> bonusType = new ArrayList<Integer>();
        List<Integer> other = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        int temp = 0;
        
        System.out.println("---Earnings Calculation System:");
        System.out.println("1. Salaried Employee");
        System.out.println("2. Hourly Employee");
        System.out.println("3. Commission Employee");
        System.out.println("4. Piece Worker");
        System.out.print("Please input (1~4, -1 to end): ");
        temp = scanner.nextInt();
        while(temp!= -1){
            workerType.add(temp);
            switch(temp){
                case 1:
                    System.out.print("Please input weekly salary: ");
                    price.add(scanner.nextInt());
                    System.out.print("Please input working weeks: ");
                    other.add(scanner.nextInt());
                    break;
                case 2:
                    System.out.print("Please input wage: ");
                    price.add(scanner.nextInt());
                    System.out.print("Please input hours: ");
                    other.add(scanner.nextInt());
                    break;
                case 3:
                    System.out.print("Please input commission rate: ");
                    price.add(scanner.nextInt());
                    System.out.print("Please input gross sales: ");
                    other.add(scanner.nextInt());
                    break;
                case 4:
                    System.out.print("Please input wage: ");
                    price.add(scanner.nextInt());
                    System.out.print("Please input piece: ");
                    other.add(scanner.nextInt());
                    break;
            }
            System.out.print("Please input type of Bonus (1: static, 2: dynamic): ");
            bonusType.add(scanner.nextInt());
            System.out.println("---Earnings Calculation System:");
            System.out.println("1. Salaried Employee");
            System.out.println("2. Hourly Employee");
            System.out.println("3. Commission Employee");
            System.out.println("4. Piece Worker");
            System.out.print("Please input (1~4, -1 to end): ");
            temp = scanner.nextInt();
        }
        System.out.print("Input finished!");
        
        employee = new Employee[workerType.size()];
    }
}
