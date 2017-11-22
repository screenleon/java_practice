/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ntou.cs.java2017.LienChen.hw3;

import java.security.SecureRandom;
import java.util.Scanner;
import java.util.ArrayList;


/**
 *
 * @author user
 */

//the clas which set the player and npc and fight
public class War {
    private Character npc;
    private Character player;
    private SecureRandom random;
    
    //construct war and initial the npc and player
    public War(){
        random = new SecureRandom();
        this.init();
    }
    
    //initial the npc and player, print it out
    private void init(){
        //random.nextInt(50) range from 0 ~ 49
        int playerHp = random.nextInt(50) + 150;
        ArrayList<ATK> playerEquipment = new ArrayList<ATK>();
        playerEquipment.add(new NormalWeapon(59, 20, 0));
        playerEquipment.add(new DoubleWeapon(59, 25, 0));
        playerEquipment.add(new PowerWeapon(59, 30, 0));
        playerEquipment.add(new Pet(99, 50));
        this.player = new Character(playerHp, playerEquipment);
        this.npc = new Character(1000 - playerHp);
        System.out.println("您的初始設定：");
        System.out.println(this.player.initString());
        System.out.println(this.npc.initString());
    }
    
    //fight each other
    public void battle(){
        Scanner scanner = new Scanner(System.in);
        while((player.getHp() > 0) && (npc.getHp() > 0)){
            int status = 0;
            System.out.print("請選擇: 1.攻擊 2.防禦 3.結束: ");
            status = scanner.nextInt();
            switch(status){
                case 1:
                    this.Attack();
                    break;
                case 2:
                    this.Defend();
                    break;
                case 3:
                    this.player.setHp(0);
                    this.npc.setHp(0);
                    break; 
            }   
        }
        if(this.player.getHp() == 0 && this.npc.getHp() == 0){
            System.out.println("End the game");
        }else if(this.player.getHp() == 0){
            System.out.println("玩家被擊倒了！");
        }else {
            System.out.println("NPC被擊倒了！");
        }
    }
    
    //if player select to attack npc
    public void Attack(){
        double playerDamage = 0;
        double npcDamage = 0;
        double playerLeftHp = this.player.getHp();
        double npcLeftHp = this.npc.getHp();
        playerDamage = this.player.attack();
        System.out.println("玩家攻擊對手 " + playerDamage + " 點!");
        System.out.println(this.player);
            
        npcLeftHp -= playerDamage;
        if(npcLeftHp <= 0){
            this.npc.setHp(npcLeftHp);
            return;
        }
        System.out.println("對手的血從 " + (int)this.npc.getHp() + "變成" + (int)npcLeftHp);
        this.npc.setHp(npcLeftHp);
        
        npcDamage = this.npc.attack();
        System.out.println("對手攻擊玩家 " + npcDamage + " 點!");
        System.out.println(this.npc);
        
        playerLeftHp -= npcDamage;
        if(playerLeftHp <= 0){
            this.player.setHp(playerLeftHp);
            return;
        }
        System.out.println("玩家的血從 " + (int)this.player.getHp() + "變成" + (int)playerLeftHp);
        this.player.setHp(playerLeftHp);
    }
    
    //if player select to defend npc
    public void Defend(){
        Boolean recover = this.random.nextBoolean();
        Boolean lossDamage = this.random.nextBoolean();
        double playerDamage = 0;
        double npcDamage = 0;
        double playerLeftHp = this.player.getHp();
        double npcLeftHp = this.npc.getHp();
        
        if(recover){
            npcDamage -= this.npc.attack();
            System.out.println("自我療癒了!");
            System.out.println("玩家攻擊對手 0 點!");
            System.out.println("對手的血從 " + (int)this.npc.getHp() + "變成" + (int)this.npc.getHp());
        }else{
            npcDamage += this.npc.attack();
            System.out.println("玩家攻擊對手 0 點!");
            System.out.println("對手的血從 " + (int)this.npc.getHp() + "變成" + (int)this.npc.getHp());
        }
        if(lossDamage)
            npcDamage /= 2;
        
        System.out.println("對手攻擊玩家 " + npcDamage + " 點!");
        System.out.println(this.npc);
        
        playerLeftHp -= npcDamage;
        if(playerLeftHp <= 0){
            this.player.setHp(playerLeftHp);
            return;
        }
        System.out.println("玩家的血從 " + (int)this.player.getHp() + "變成" + (int)playerLeftHp);
        this.player.setHp(playerLeftHp);
    }
}