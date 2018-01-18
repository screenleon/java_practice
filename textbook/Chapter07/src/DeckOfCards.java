/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.security.SecureRandom;

/**
 *
 * @author user
 */
public class DeckOfCards {
    private Card[] deck;
    private int currentCard;
    private static final int NUMBER_OF_CARDS = 52;
    private static final SecureRandom  randomNumbers = new SecureRandom();
    
    public DeckOfCards(){
        String[] faces = {"Ace", "Deuce", "Three", "Four", "Five", "Six", "Seven",
            "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
        String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades"};
        
        deck = new Card[NUMBER_OF_CARDS];
        this.currentCard = 0;
        
        for(int counter = 0; counter < deck.length; counter++){
            deck[counter] = new Card(faces[counter % 13], suits[counter / 13]);
        }
    }
    
    public void shuffle(){
        this.currentCard = 0;
        
        for(int first = 0; first < deck.length; first++){
            int second = randomNumbers.nextInt(NUMBER_OF_CARDS);
            
            Card temp = deck[first];
            deck[first] = deck[second];
            deck[second] = temp;
        }
    }
    
    public Card dealCard(){
        if(currentCard < deck.length){
            return deck[currentCard++];
        }else
            return null;
    }
}
