/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ntou.cs.java2017.chenlien;
import java.util.Scanner;

/**
 *
 * @author Li-En
 */
public class GasMeterTest {
    public static void main(String[] args){
        //variable to record the temporary mile, gallon, and mpg
        int _mile;
        int _gallon;
        double _mpg;
        
        //declare GasMeter type of variable to record the miles and gallons
        GasMeter gasMeter = new GasMeter();
        //declare the scanner to use
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter miles (-1 to quit): ");
        //read the number to set to the _mile
        _mile = scanner.nextInt();
        //if _mile equal to -1 mean not to run this loop
        while(_mile != -1){
            System.out.print("Enter gallons: ");
            //read the number to set to the _gallon
            _gallon =scanner.nextInt();
            //calculate the mpg from _mile and _gallon
            _mpg = _mile * 1.0 / _gallon;
            System.out.printf("MPG this tankful: %.2f\n", _mpg);
            //record the new information to gasMeter
            gasMeter.UpdateGasMeter(_mile, _gallon);
            System.out.printf("Total MPG: %.2f\n", gasMeter.TotalMPG());
            System.out.print("Enter miles (-1 to quit): ");
            //read the number to set to the _mile
            _mile = scanner.nextInt();
        }
        
    }
}
