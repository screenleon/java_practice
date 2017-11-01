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
public class UNOCardsTest {
    public static void main(String[] args){
        UNOCard[][] player = new UNOCard[4][4];
        int[] playerCurrentCard = new int[4];
        int PLAYERHANDCARD = 4;
        int PLAYERNUMBER = 4;
		int NUMBER_OF_CARD = 48;
        System.out.println("未洗牌:");
        DeckOfUNOCards myDeck = new DeckOfUNOCards();
        
        System.out.printf("\n\n洗牌後:\n");
        myDeck.shuffle();
        for (int _i = 0;_i < 48; _i++){
            System.out.printf("%-10s\n", myDeck.dealCard().toString());
        }
        
        System.out.printf("\n\n發牌後:\n");
        myDeck.shuffle();
        for (int _i = 0;_i < PLAYERHANDCARD * PLAYERNUMBER; _i++){
            switch(_i  % PLAYERNUMBER){
                case 0:
                    player[0][playerCurrentCard[0]++] = myDeck.dealCard();
                    break;
                case 1:
                    player[1][playerCurrentCard[1]++] = myDeck.dealCard();
                    break;
                case 2:
                    player[2][playerCurrentCard[2]++] = myDeck.dealCard();
                    break;
                case 3:
                    player[3][playerCurrentCard[3]++] = myDeck.dealCard();
                    break;
            }
        }
		
		for (int _i = 0;_i < PLAYERNUMBER; _i++){
			switch(_i){
				case 0:
				    System.out.println("First Player:");
					break;
				case 1:
				    System.out.println("Second Player:");
					break;
				case 2:
				    System.out.println("Third Player:");
					break;
				case 3:
				    System.out.println("Fourth Player:");
					break;
			}
            for(int _j = 0; _j < PLAYERHANDCARD; _j++){
				System.out.printf("%-10s\n", player[_i][_j].toString());
			}
        }
		
		System.out.println("Remaining Cards:");
		for (int _i = PLAYERHANDCARD * PLAYERNUMBER;_i < NUMBER_OF_CARD; _i++){
			System.out.printf("%-10s\n", myDeck.dealCard().toString());
        }
        
    }
    
    
    
}
