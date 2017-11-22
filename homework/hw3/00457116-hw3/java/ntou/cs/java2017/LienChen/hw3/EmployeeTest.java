/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ntou.cs.java2017.LienChen.hw3;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;
/**
 *
 * @author Lien
 */

//the class to test employee
public class EmployeeTest {
    
    public static void main(String[] args){
        Employee[] employee;
        List<Integer> workerType = new ArrayList<Integer>();
        List<Integer> price = new ArrayList<Integer>();
        List<Integer> bonusType = new ArrayList<Integer>();
        List<Integer> other = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        int totalEarnings = 0;
        int totalBonus = 0;
        int tempScanner = 0;
        NumberFormat numberFormat = NumberFormat.getNumberInstance(Locale.US);
        
        System.out.println("---Earnings Calculation System:");
        System.out.println("1. Salaried Employee");
        System.out.println("2. Hourly Employee");
        System.out.println("3. Commission Employee");
        System.out.println("4. Piece Worker");
        System.out.print("Please input (1~4, -1 to end): ");
        tempScanner = scanner.nextInt();
        while(tempScanner!= -1){
            workerType.add(tempScanner);
            switch(tempScanner){
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
                    price.add((int)(scanner.nextDouble() * 100));
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
            tempScanner = scanner.nextInt();
        }
        System.out.print("Input finished!");
        
        employee = new Employee[workerType.size()];
        for(int _i = 0; _i < workerType.size(); _i++){
            switch(workerType.get(_i)){
                case 1:
                    employee[_i] = new SalariedEmployee(price.get(_i), other.get(_i), bonusType.get(_i));
                    break;
                case 2:
                    employee[_i] = new HourlyEmployee(price.get(_i), other.get(_i), bonusType.get(_i));
                    break;
                case 3:
                    employee[_i] = new CommissionEmployee(price.get(_i) * 0.01, other.get(_i), bonusType.get(_i));
                    break;
                case 4:
                    employee[_i] = new PieceWorker(price.get(_i), other.get(_i), bonusType.get(_i));
                    break;
            } 
        }
        
        System.out.println("--Result:");
        for(int _i = 0; _i < workerType.size(); _i++){
            System.out.printf("No. %d\n", _i + 1);
            switch(workerType.get(_i)){
                case 1:
                    System.out.println("Salaried Employee => " + employee[_i]);
                    break;
                case 2:
                    System.out.println("Hourly Employee => " + employee[_i]);
                    break;
                case 3:
                    System.out.println("Commission Employee => " + employee[_i]);
                    break;
                case 4:
                    System.out.println("Piece Worker => " + employee[_i]);
                    break;
            }
            totalEarnings += employee[_i].getEarnings();
            totalBonus += employee[_i].bonus.getBonus(employee[_i].getEarnings());
        }
        
        System.out.printf("\nTotal earnings: %s\n",numberFormat.format(totalEarnings));
        System.out.printf("Total bonus: %s\n",numberFormat.format(totalBonus));
    }
}
