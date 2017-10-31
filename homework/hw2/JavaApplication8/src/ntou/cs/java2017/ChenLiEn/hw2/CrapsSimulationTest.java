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
public class CrapsSimulationTest {
    
    public static void main(String[] args){
        int roundMax = 1000, winRound = 0, lostRound = 0;
        double winRate = 0.0, roundLength = 0.0;
        int[][] round = new int[22][2];
        CrapsSimulation craps = new CrapsSimulation();
        
        for(int _i = 0, rollTime = 0; _i < roundMax; _i++){
            craps.startRoll();
            rollTime = craps.getRollTime();
            if(craps.getWinLost()){
                if(rollTime >= 21)
                    round[21][0]++;
                else round[rollTime][0]++;
                winRound++;
            }else{
                if(rollTime >= 21)
                    round[21][1]++;
                else round[rollTime][1]++;
                lostRound++;
            }
            craps.initialCrap();
        }
        for(int _i = 1; _i < 22; _i++){
            if(_i > 20){
                System.out.printf("%d games won and %d games lost on rolls after the 20th roll\n", round[_i][0], round[_i][1]);
            }else{
                System.out.printf("%d games won and %d games lost on rolls #%d\n", round[_i][0], round[_i][1], _i);
            }
        }
        
        winRate = winRound * 1.0 / 10;
        for(int _i = 1; _i < 22; _i++)
            roundLength = roundLength + (round[_i][0] + round[_i][1]) * _i;
        System.out.printf("The chances of winning are %d / 1000 = %2.2f%%\n", winRound, winRate);
        System.out.printf("The average game length is %.2f rolls.\n", roundLength /1000);
    }

}
