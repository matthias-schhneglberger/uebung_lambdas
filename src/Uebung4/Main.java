/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Uebung4;

import java.util.Scanner;

/**
 *
 * @author matth
 */
public class Main {

    private static RationalCalculator rationalCalc = null;
    private static VectorCalculator vectorCalc = null;
    private static ComplexCalculator complexCalc = null;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        console.useDelimiter("\n");
        
        setupComplexCalc();
        setupRationalCalc();
        setupVectorCalc();
        
        System.out.println("Choose Calculator:");
        System.out.println("1 .. Relational Calculator");
        System.out.println("2 .. Vector Calculator");
        System.out.println("3 .. Complex Calculator");
        System.out.println("4 .. Exit");
        int rechner = console.nextInt();
        
        if(rechner == 4){
            System.exit(0);
        }
        
        enterNums(rechner, console);
    }
    
    public static void enterNums(int rechner, Scanner console){
        Number num1 = new Number();
        Number num2 = new Number();
        
        System.out.println("---------------------");
        
        System.out.println("Enter number x a");
        num1.setA(console.nextDouble());
        System.out.println("Enter number x b");
        num1.setB(console.nextDouble());
        System.out.println("Enter number y a");
        num2.setA(console.nextDouble());
        System.out.println("Enter number y b");
        num2.setB(console.nextDouble());
        
        System.out.println("---------------------");
        
        System.out.println("1 .. add");
        System.out.println("2 .. subtract");
        System.out.println("3 .. multiply");
        System.out.println("4 .. divide");
        System.out.println("5 .. enter numbers again");
        
        int function = console.nextInt();
        Number rueckgabe = null;
        
        switch(rechner){
            case 1:
                
                switch(function){
                    case 1:
                        rueckgabe = rationalCalc.add(num1, num2);
                        break;
                        
                    case 2:
                        rueckgabe = rationalCalc.subtract(num1, num2);
                        break;
                        
                    case 3:
                        rueckgabe = rationalCalc.multiply(num1, num2);
                        break;
                        
                    case 4:
                        rueckgabe = rationalCalc.divide(num1, num2);
                        break;
                        
                    case 5:
                        enterNums(rechner, console);
                        break;
                }
                
                break;
            case 2:
                
                switch(function){
                    case 1:
                        rueckgabe = vectorCalc.add(num1, num2);
                        break;
                        
                    case 2:
                        rueckgabe = vectorCalc.subtract(num1, num2);
                        break;
                        
                    case 3:
                        rueckgabe = vectorCalc.multiply(num1, num2);
                        break;
                        
                    case 4:
                        rueckgabe = vectorCalc.divide(num1, num2);
                        break;
                        
                    case 5:
                        enterNums(rechner, console);
                        break;
                }
                
                break;
            case 3:
                
                switch(function){
                    case 1:
                        rueckgabe = complexCalc.add(num1, num2);
                        break;
                        
                    case 2:
                        rueckgabe = complexCalc.subtract(num1, num2);
                        break;
                        
                    case 3:
                        rueckgabe = complexCalc.multiply(num1, num2);
                        break;
                        
                    case 4:
                        rueckgabe = complexCalc.divide(num1, num2);
                        break;
                        
                    case 5:
                        enterNums(rechner, console);
                        break;
                }
                
                break;
        }
        
        
        System.out.println(rueckgabe.getA());
        System.out.println(rueckgabe.getB());
    }
    
    
    
    
    
    
    
    
    
    private static void setupRationalCalc(){
        CalculationOperation add = (a, b) -> {Number num = new Number();
        num.setA((a.getA() + b.getB()) * (b.getA() * a.getB())); //https://www.programmieraufgaben.ch/aufgabe/brueche-addieren/gza2hx9f
        num.setB(a.getB() * b.getB());
        return num;};

        CalculationOperation subtract = (a, b) -> {Number num = new Number();
        num.setA((a.getA()*b.getB()) - (b.getA()*a.getB()));
        num.setB(a.getB() * b.getB());
        return num;};

        CalculationOperation multiply = (a, b) -> {Number num = new Number();
        num.setA(a.getA() * b.getA());
        num.setB(a.getB() * b.getB());
        return num;};

        CalculationOperation divide = (a, b) -> {Number num = new Number();
        Number kehrwert = new Number();
        kehrwert.setA(b.getB());
        kehrwert.setB(b.getA());
        
        return multiply.calc(a, kehrwert);
        };
        
        rationalCalc = new RationalCalculator(add, subtract, multiply, divide);
    }
    private static void setupVectorCalc(){
        CalculationOperation add = (a, b) -> {Number num = new Number();
        num.setA(a.getA() + a.getB());
        num.setB(b.getA() + b.getB());
        return num;};

        CalculationOperation subtract = (a, b) -> {Number num = new Number();
        num.setA(a.getA() - a.getB());
        num.setB(b.getA() - b.getB());
        return num;};

        CalculationOperation multiply = (a, b) -> {Number num = new Number();
        num.setA(a.getA() * a.getB());
        num.setB(b.getA() * b.getB());
        return num;};

        CalculationOperation divide = (a, b) -> {Number num = new Number();
        num.setA(a.getA() / a.getB());
        num.setB(b.getA() / b.getB());
        return num;};
        
        vectorCalc = new VectorCalculator(add, subtract, multiply, divide);
    }
    private static void setupComplexCalc(){
        CalculationOperation add = (a, b) -> {Number num = new Number();
        num.setA(a.getA() + b.getA());
        num.setB(a.getB() + b.getB());
        return num;};

        CalculationOperation subtract = (a, b) -> {Number num = new Number();
        num.setA(a.getA() - b.getA());
        num.setB(a.getB() - b.getB());
        return num;};

        CalculationOperation multiply = (a, b) -> {Number num = new Number();
        num.setA(a.getA() * b.getA());
        num.setB(a.getB() * b.getB());
        return num;};

        CalculationOperation divide = (a, b) -> {Number num = new Number();
        num.setA(a.getA() / b.getA());
        num.setB(a.getB() / b.getB());
        return num;};
        
        complexCalc = new ComplexCalculator(add, subtract, multiply, divide);
    }
}
