/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Uebung3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author matth
 */
public class NumberTester {

    private NumberTest oddTester = null;
    private NumberTest primeTester = null;
    private NumberTest palindromeTester = null;
    
    private String fileName = "";
    
    public NumberTester(String fileName) throws IOException {
        this.fileName = fileName;
    }
    
    


    public void setOddEvenTester(NumberTest oddTester) {
        this.oddTester = oddTester;
    }

    public void setPrimeTester(NumberTest primeTester) {
        this.primeTester = primeTester;
    }

    public void setPalindromeTester(NumberTest palindromeTester) {
        this.palindromeTester = palindromeTester;
    }

    public void testFile() throws IOException {
        File file = new File(fileName);

        file.createNewFile();

        try (FileReader reader = new FileReader(fileName);
                BufferedReader br = new BufferedReader(reader)) {

            int numOfLines = Integer.valueOf(br.readLine().trim());

            for (int i = 0; i <= numOfLines - 1; i++) {
                
                String[] line = br.readLine().split(" ");
                
                
                int method = Integer.valueOf(line[0]);
                
                if(method == 1){
                    if(oddTester.testNumber(Integer.valueOf(line[1]))){
                        System.out.println(line[1] + ": EVEN");
                    }
                    else{
                        System.out.println(line[1] + ": ODD");
                    }
                    //System.out.println(line[1] + " ist ungerade: " + oddTester.testNumber(Integer.valueOf(line[1])));
                }
                if(method == 2){
                    if(primeTester.testNumber(Integer.valueOf(line[1]))){
                        System.out.println(line[1] + ": PRIME");
                    }
                    else{
                        System.out.println(line[1] + ": NO PRIME");
                    }
                    //System.out.println(line[1] + " ist eine Primzahl: " + primeTester.testNumber(Integer.valueOf(line[1])));
                }
                if(method == 3){
                    if(palindromeTester.testNumber(Integer.valueOf(line[1]))){
                        System.out.println(line[1] + ": PALINDROME");
                    }
                    else{
                        System.out.println(line[1] + ": NO PALINDROME");
                    }
                    //System.out.println(line[1] + " ist Palindrom: " + palindromeTester.testNumber(Integer.valueOf(line[1])));
                }
                
                
            }

        }
        catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}
