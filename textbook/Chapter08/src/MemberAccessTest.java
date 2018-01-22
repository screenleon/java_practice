/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class MemberAccessTest {
    public static void main(String[] args){
        //create and initialize Time1 object
        Time1 time = new Time1();
        
        //hour, minute and second are all private can not be access outside
        time.hour = 7;
        time.minute = 15;
        time.second = 30;
    }
}
