/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Uebung4;

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
        setupComplexCalc();
        setupRationalCalc();
        setupVectorCalc();
        
        System.out.println("Choose Calculator:");
        System.out.println("1 .. Relational Calculator");
        System.out.println("2 .. Vector Calculator");
        System.out.println("3 .. Complex Calculator");
        System.out.println("4 .. Exit");

    }
    
    
    
    
    
    
    
    
    
    private static void setupRationalCalc(){
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
