/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ntou.cs.java2017.chenlien;

/**
 *
 * @author Li-En
 */
public class Twelve {
    //set 2 sequence variables
    private int sequence1;
    private int sequence2;
    
    public Twelve(){
         //initialization sequence variables
        this.sequence1 = 0;
        this.sequence2 = 0;
    }
    
    //print the case of sequence1 and check it will run or not
    public boolean GetSequence1(){
        //when call this function add 1 to sequence1
        this.sequence1 += 1;
        //set the sequence2 same to sequence1
        this.UpdateSequence2();
        //print the case of sequence1
        switch(this.sequence1){
            case 1:
                System.out.println("On the first day of Christmas\n" +
"my true love sent to me:");
                break;
            case 2:
                System.out.println("On the second day of Christmas\n" +
"my true love sent to me:");
                break;
            case 3:
                System.out.println("On the third day of Christmas\n" +
"my true love sent to me:");
                break;
            case 4:
                System.out.println("On the fourth day of Christmas\n" +
"my true love sent to me:");
                break;
            case 5:
                System.out.println("On the fifth day of Christmas\n" +
"my true love sent to me:");
                break;
            case 6:
                System.out.println("On the sixth day of Christmas\n" +
"my true love sent to me:");
                break;
            case 7:
                System.out.println("On the seventh day of Christmas\n" +
"my true love sent to me:");
                break;
            case 8:
                System.out.println("On the eighth day of Christmas\n" +
"my true love sent to me:");
                break;
            case 9:
                System.out.println("On the ninth day of Christmas\n" +
"my true love sent to me:");
                break;
            case 10:
                System.out.println("On the tenth day of Christmas\n" +
"my true love sent to me:");
                break;
            case 11:
                System.out.println("On the eleventh day of Christmas\n" +
"my true love sent to me:");
                break;
            case 12:
                System.out.println("On the twelfth day of Christmas\n" +
"my true love sent to me:");
                break;
            default:
                break;
        }
        //know the function need to call again or not
        if(this.sequence1 > 12)
            return false;
        else return true;
    }
    
    //set the sequence2 same to sequence1
    public void UpdateSequence2(){
        
        //set the sequence2 same to sequence1
        this.sequence2 = this.sequence1;
    }
    
    //print the case of sequence2 and check it will run or not
    public boolean GetSequence2(){
        //print the case of sequence2
        switch(this.sequence2){
            case 1:
                if(this.sequence1 != 1){
                    System.out.println("and a Partridge in a Pear Tree");
                }else{
                    System.out.println("A Partridge in a Pear Tree");
                }
                break;
            case 2:
                System.out.println("Two Turtle Doves");
                break;
            case 3:
                System.out.println("Three French Hens");
                break;
            case 4:
                System.out.println("Four Calling Birds");
                break;
            case 5:
                System.out.println("Five Golden Rings");
                break;
            case 6:
                System.out.println("Six Geese a Laying");
                break;
            case 7:
                System.out.println("Seven Swans a Swimming");
                break;
            case 8:
                System.out.println("Eight Maids a Milking");
                break;
            case 9:
                System.out.println("Nine Ladies Dancing");
                break;
            case 10:
                System.out.println("Ten Lords a Leaping");
                break;
            case 11:
                System.out.println("Eleven Pipers Piping");
                break;
            case 12:
                System.out.println("Twelve Drummers Drumming");
            default:
                break;
        }
        //when print the case of sequence2, count down the sequence2
        this.sequence2 -= 1;
        //if sequenec2 > 0 then run else stop
        if(this.sequence2 > 0){
            return true;
        }else return false;
    }
}
