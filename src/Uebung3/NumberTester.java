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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author matth
 */
public class NumberTester {

    private NumberTest oddTester = null;
    private NumberTest primeTest = null;
    private NumberTest palindromeTest = null;
    
    public NumberTester(String fileName) throws IOException {
        File file = new File(fileName);

        file.createNewFile();

        try (FileReader reader = new FileReader(fileName);
                BufferedReader br = new BufferedReader(reader)) {

            int numOfLines = Integer.valueOf(br.readLine().trim());

            for (int i = 0; i <= numOfLines - 1; i++) {

                System.out.println(br.readLine());
                String[] line = br.readLine().split(" ");

            }

        }
        catch (IOException e) {
            System.out.println(e.toString());
        }
    }

    public static void main(String[] args) throws IOException {
        NumberTester numTester = new NumberTester("input_uebung3.txt");
    }

    public void setOddEvenTester(NumberTest oddTester) {
        this.oddTester = oddTester;
    }

    public void setPrimeTester(NumberTest primeTreser) {
    }

    public void setPalindromeTester(NumberTest primeTreser) {
    }

    public void testFile() {
    }

//    @Override
//    public boolean testNumber(int Number) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

}
