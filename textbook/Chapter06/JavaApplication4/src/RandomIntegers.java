/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.security.SecureRandom;

/**
 *
 * @author Lien
 */
public class RandomIntegers {
    public static void main(String[] args){
        SecureRandom randomNumbers = new SecureRandom();
        
        for(int counter = 1; counter <= 20; counter++){
            int face = 1 + randomNumbers.nextInt(6);
            
            System.out.printf("%d  ", face);
            
            if(counter % 5 == 0)
                System.out.println();
        }
    }
}
