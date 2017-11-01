/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ntou.cs.java2017.ChenLiEn.hw2;

/**
 *
 * @author user
 */
public class UNOCard {
    
    public enum UNOType{ NUMBER, SKIP, DRAW2 };
    public enum ColorType{ BLUE, GREEN, RED, YELLOW };
    private int number;
    public static final int INVALID = -1;
    private UNOType unoType;
    private ColorType colorType;
    
    //initial the Card to set the type
    public UNOCard(UNOType _unoType, ColorType _colorType, int _number){
        if(_number <= 9 && _number >= -1){
            this.number = _number;
        }
        this.unoType = _unoType;
        this.colorType = _colorType;
    }
    
    //get the card type and transfer to string
    public String toString(){
        String output="";
        output += String.format("%s", colorType) + "  ";
        if(unoType == UNOType.NUMBER)
            output += String.format("%d", number) + " ";
        else output += String.format("%s", unoType) + "  ";
        return output;
    }
}
