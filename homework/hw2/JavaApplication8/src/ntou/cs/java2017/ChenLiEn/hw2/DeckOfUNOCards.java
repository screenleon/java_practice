/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ntou.cs.java2017.ChenLiEn.hw2;
import java.security.SecureRandom;
import ntou.cs.java2017.ChenLiEn.hw2.UNOCard.UNOType;
import ntou.cs.java2017.ChenLiEn.hw2.UNOCard.ColorType;

/**
 *
 * @author user
 */
public class DeckOfUNOCards {
    private UNOCard[] deck;
    private int currentCard;
    private static final int COLOR_NUMBER_OF_CARD = 12;
    private static final int NUMBER_OF_CARD = 48;
    private static final SecureRandom randomNumbers = new SecureRandom();
    
    public DeckOfUNOCards(){
        ColorType colorType = null;
        deck = new UNOCard[NUMBER_OF_CARD];
        this.currentCard = 0;
        for(int _i = 0; _i < deck.length; _i++){
            int _j = 0;
            _j = _i % COLOR_NUMBER_OF_CARD;
            switch(_j){
                case 0:
                    colorType = ColorType.BLUE;
                    break;
                case 1:
                    colorType = ColorType.GREEN;
                    break;
                case 2:
                    colorType = ColorType.RED;
                    break;
                case 3:
                    colorType = ColorType.YELLOW;
                    break;
            }
            if(_i % COLOR_NUMBER_OF_CARD == 10)
                deck[_i] = new UNOCard(UNOType.SKIP, colorType, -1);
            else if(_i % COLOR_NUMBER_OF_CARD == 11){
                deck[_i] = new UNOCard(UNOType.DRAW2, colorType, -1);
            }else
                deck[_i] = new UNOCard(UNOType.NUMBER, colorType, _i % COLOR_NUMBER_OF_CARD);
        }
    }
}
