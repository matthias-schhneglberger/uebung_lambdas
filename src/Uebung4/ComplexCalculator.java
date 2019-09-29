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
public class ComplexCalculator extends AbstractCalculator{
    
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
    
    

    public ComplexCalculator(CalculationOperation add, CalculationOperation subtract, CalculationOperation multiply, CalculationOperation divide) {
        super(add, subtract, multiply, divide);
    }

    @Override
    public Number add(Number a, Number b) {
        return add.calc(a, b);
    }

    @Override
    public Number subtract(Number a, Number b) {
        return subtract.calc(a, b);
    }

    @Override
    public Number multiply(Number a, Number b) {
        return multiply.calc(a, b);
    }

    @Override
    public Number divide(Number a, Number b) {
        return divide.calc(a, b);
    }
}
