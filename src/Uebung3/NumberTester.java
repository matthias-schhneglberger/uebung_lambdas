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
    
    public NumberTester(String fileName) throws IOException {
        File file = new File(fileName);

        file.createNewFile();

        try (FileReader reader = new FileReader(fileName);
                BufferedReader br = new BufferedReader(reader)) {

            int numOfLines = Integer.valueOf(br.readLine().trim());

            for (int i = 0; i <= numOfLines - 1; i++) {

                System.out.println(br.readLine());
                String[] line = br.readLine().split(" ");
                
                if(line[0].equals(1)){
                    System.out.println(line[1] + "ist gerade: " + oddTester.testNumber(Integer.valueOf(line[1])));
                }
                else if(line[0].equals(2)){
                    System.out.println(line[1] + "ist eine Primzahl: " + primeTester.testNumber(Integer.valueOf(line[1])));
                }
                else if(line[0].equals(3)){
                    System.out.println(line[1] + "ist palindrome: " + palindromeTester.testNumber(Integer.valueOf(line[1])));
                }
                
                
                oddTester.testNumber(5);
            }

        }
        catch (IOException e) {
            System.out.println(e.toString());
        }
    }


    public void setOddEvenTester(NumberTest oddTester) {
        this.oddTester = oddTester;
    }

    public void setPrimeTester(NumberTest primeTester) {
        this.primeTester = primeTester;
    }

    public void setPalindromeTester(NumberTest primeTreser) {
        this.primeTester = primeTreser;
    }

    public void testFile() {
    }
}
