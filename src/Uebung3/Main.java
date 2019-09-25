/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Uebung3;

import java.io.IOException;

/**
 *
 * @author matth
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        NumberTester numTester = new NumberTester("input.txt");
        
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
            return false;
        });
        
        numTester.setPrimeTester(number -> {
            
            
            
            return false;
        });
        
    }
    
}
