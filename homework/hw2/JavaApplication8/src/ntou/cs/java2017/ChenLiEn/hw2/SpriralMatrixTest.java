/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ntou.cs.java2017.ChenLiEn.hw2;
import java.util.Scanner;


/**
 *
 * @author user
 */
public class SpriralMatrixTest {
    public static void main(String[] args){
        int roundabout, rotation, length = 0;
        Scanner scanner = new Scanner(System.in);
    
        System.out.printf("請輸入順時針(1)或逆時針(2)?");
        rotation = scanner.nextInt();
        System.out.printf("\n請輸入內迴旋(1)或外迴旋(2)?");
        roundabout = scanner.nextInt();
        if(roundabout == 1){
            do{
                if(length != 0){
                    System.out.printf("\n邊長應為奇數，請重新輸入!\n");
                }
                System.out.printf("\n請輸入邊長(奇數且<100)?");
                length = scanner.nextInt();
            }while(length % 2 == 0);
        }else if(roundabout == 2){
            System.out.printf("\n請輸入邊長(<100)?");
            length = scanner.nextInt();
        }
        
        SpriralMatrix spriralMatrix = new SpriralMatrix(rotation, roundabout, length);
        spriralMatrix.showArray();
    }
    
    
}
