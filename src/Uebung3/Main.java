/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Uebung3;

import java.io.IOException;
import java.util.stream.IntStream;

/**
 *
 * @author matth
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
//        int number1 = 475571;
//        
//        String forward = String.valueOf(number1);
//            
//        StringBuilder reverser = new StringBuilder(); 
//        reverser.append(forward);
//
//        String reverse = reverser.reverse().toString();
//        
//        System.out.println(forward + " " + reverse);
            
            
            
        NumberTester numTester = new NumberTester("input_uebung3.txt");
        
        
        
        numTester.setOddEvenTester(number -> {
            return number % 2 != 0;
        });
        
        
        
        
        numTester.setPalindromeTester(number -> {
            String forward = String.valueOf(number);
            
            StringBuilder reverser = new StringBuilder(); 
            reverser.append(forward);
            
            String reverse = reverser.reverse().toString();
            
            if(forward.equals(reverse)){
                return true;
            }
            else{
                return false;
            }
            
        });
        
        
        
        
        numTester.setPrimeTester(number -> { // https://www.baeldung.com/java-prime-numbers
            
            return number > 2
            && IntStream.rangeClosed(2, (int) Math.sqrt(number))
            .noneMatch(n -> (number % n == 0));
            
        });
        
        
        
        
        
        numTester.testFile();
        
    }
    
}
