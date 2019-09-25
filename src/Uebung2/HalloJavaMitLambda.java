/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Uebung2;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author matth
 */
public class HalloJavaMitLambda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Test", "Hallo", "tEsT");

       for(String s : list){
           System.out.println(s + ", ");
       }
       
       System.out.println("####");
       
       list.forEach((String s) -> System.out.println(s));
       
       
       
    }
    
    
}
