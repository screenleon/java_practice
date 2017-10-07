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
        int _mile;
        int _gallon;
        double _mpg;
        GasMeter gasmeter = new GasMeter();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter miles (-1 to quit): ");
        _mile = scanner.nextInt();
        while(_mile != -1){
            System.out.print("Enter gallons: ");
            _gallon =scanner.nextInt();
            _mpg = _mile * 1.0 / _gallon;
            System.out.printf("MPG this tankful: %.2f\n", _mpg);
            gasmeter.UpdateGasMeter(_mile, _gallon);
            System.out.printf("Total MPG: %.2f\n", gasmeter.TotalMPG());
            System.out.print("Enter miles (-1 to quit): ");
            _mile = scanner.nextInt();
        }
        
    }
}
