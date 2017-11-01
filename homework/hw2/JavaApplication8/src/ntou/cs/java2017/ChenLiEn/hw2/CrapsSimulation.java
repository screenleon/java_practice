/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ntou.cs.java2017.ChenLiEn.hw2;
import java.security.SecureRandom;

/**
 *
 * @author user
 */
public class CrapsSimulation {
    private static final SecureRandom randomNumbers = new SecureRandom();
    private enum Status{ CONTINUE, WON, LOST, UNSTART };
    
    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;
    
    private int die1, die2, firstDieSum, sum, rollTime;
    private Status gameStatus;
    
    //initial CrapsSimulation
    public CrapsSimulation(){
        this.gameStatus = Status.UNSTART;
        this.die1 = 0;
        this.die2 = 0;
        this.sum = 0;
        this.rollTime = 0;
        this.firstDieSum = 0;
    }
    
    //start to roll dice
    public void startRoll(){
        this.rollDice();
    }
    
    //roll the dice
    public void rollDice(){
        this.rollTime++;
        this.die1 = 1 + randomNumbers.nextInt(6);
        this.die2 = 1 + randomNumbers.nextInt(6);
        this.sum = this.die1 + this.die2;
        this.judgeCard();
    }
    
    //distinguish the card win or loseor continue
    public void judgeCard(){
        if(this.firstDieSum != 0){
            if(this.sum == this.firstDieSum)
                this.gameStatus = Status.WON;
            else
                if(this.sum == SEVEN)
                    this.gameStatus = Status.LOST;
        }else{
            this.firstDieSum = this.sum;
            switch(this.sum){
            case SEVEN:
            case YO_LEVEN:
                this.gameStatus = Status.WON;
                break;
            case SNAKE_EYES:
            case TREY:
            case BOX_CARS:
                this.gameStatus = Status.LOST;
                break;
            default:
                this.gameStatus = Status.CONTINUE;
                break;
            }
        }
        if(this.gameStatus == Status.CONTINUE)
            this.rollDice();
        else return;
    }
    
    //restart the crap
    public void initialCrap(){
        this.gameStatus = Status.UNSTART;
        this.die1 = 0;
        this.die2 = 0;
        this.sum = 0;
        this.rollTime = 0;
        this.firstDieSum = 0;
    }
    
    //get the dice status
    public boolean getWinLost(){
        if(this.gameStatus == Status.WON)
            return true;
        else return false;
    }
    
    //get the roll time in class
    public int getRollTime(){
        return this.rollTime;
    }
}
