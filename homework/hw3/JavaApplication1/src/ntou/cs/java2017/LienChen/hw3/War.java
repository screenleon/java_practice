/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ntou.cs.java2017.LienChen.hw3;

import java.security.SecureRandom;
import java.util.Scanner;
import java.util.ArrayList;
import ntou.cs.java2017.LienChen.hw3.Character.CharacterStatus;


/**
 *
 * @author user
 */
public class War {
    private Character npc;
    private Character player;
    private SecureRandom random;
    
    public War(){
        random = new SecureRandom();
        this.init();
    }
    
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
        System.out.println(this.player);
    }
    
    public void battle(){
        Scanner scanner = new Scanner(System.in);
        while((player.getHp() > 0) && (npc.getHp() > 0)){
            System.out.print("請選擇: 1.攻擊 2.防禦 3.結束: ");
            scanner.nextInt();
        }
    }
}