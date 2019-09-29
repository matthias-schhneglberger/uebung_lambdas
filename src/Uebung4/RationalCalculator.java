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
interface Calculate {
    Number calculate(Number a, Number b);
}


public class RationalCalculator extends AbstractCalculator{
    Calculate add = (a, b) -> {Number num = new Number();
    num.setA(a.getA() + b.getA());
    num.setB(a.getB() + b.getB());
    return num;};
    
    Calculate subtract = (a, b) -> {Number num = new Number();
    num.setA(a.getA() - b.getA());
    num.setB(a.getB() - b.getB());
    return num;};

    Calculate multiply = (a, b) -> {Number num = new Number();
    num.setA(a.getA() * b.getA());
    num.setB(a.getB() * b.getB());
    return num;};
    
    Calculate divide = (a, b) -> {Number num = new Number();
    num.setA(a.getA() / b.getA());
    num.setB(a.getB() / b.getB());
    return num;};
    
    
    
    public RationalCalculator(CalculationOperation add, CalculationOperation subtract, CalculationOperation multiply, CalculationOperation divide) {
        super(add, subtract, multiply, divide);
    }

    @Override
    public Number add(Number a, Number b) {
        return add.calculate(a, b);
    }

    @Override
    public Number subtract(Number a, Number b) {
        return subtract(a, b);
    }

    @Override
    public Number multiply(Number a, Number b) {
        return multiply(a, b);
    }

    @Override
    public Number divide(Number a, Number b) {
        return divide.calculate(a, b);
    }
    
}
