/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class UsingException {
    public static void main(String[] args){
        try{
            throwException();
        }catch(Exception exception){
            System.err.println("Exception handled in main");
        }
        
        doesNotThrowException();
    }
    
    public static void throwException() throws Exception{
        try{
            System.out.println("Method throw Exception");
            throw new Exception();
        }catch(Exception exception){
            System.err.println("Exception handled in method throw Exception");
            throw exception;
        }finally{
            System.err.println("Finally executed in throwException");
        }
    }
    
    public static void doesNotThrowException(){
        try{
            System.out.println("Method doesNotThrowException");
        }catch(Exception exception){
            System.err.println(exception);
        }finally{
            System.err.println("Finally executed in doesNotThrowException");
        }
        
        System.out.println("End of method doesNotThrowException");
    }
}
