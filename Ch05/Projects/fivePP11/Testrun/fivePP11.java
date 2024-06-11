package Testrun;

import Finance.Money;
import MyMath.Rational;

public class fivePP11 {

    private int num;
    private int den;

    // money testing
    public static void main(String[] args) throws Exception {
        Money money1 = new Money(10, 50);
        Money money2 = new Money(5, 25);

        Money result = Money.add(money1, money2);
        System.out.println("+ result: " + result);

        result = Money.minus(money1, money2);
        System.out.println("- result: " + result);
        // rational testing
        Rational r1 = new Rational(1, 2);
        Rational r2 = new Rational(3, 4);

        System.out.println("Initial values:");
        System.out.println("Rational 1: " + r1);
        System.out.println("Rational 2: " + r2);

        Rational resultAdd = r1.add(r1, r2);
        System.out.println("\nAddition result: " + resultAdd);

        Rational resultSubtract = r1.subtract(r1, r2);
        System.out.println("Subtraction result: " + resultSubtract);

        Rational resultMultiply = r1.multiply(r1, r2);
        System.out.println("Multiplication result: " + resultMultiply);

        Rational resultDivide = r1.divide(r1, r2);
        System.out.println("Division result: " + resultDivide);
    }
}
