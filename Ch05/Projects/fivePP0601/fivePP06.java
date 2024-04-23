package Ch05.Projects.fivePP0601;
import java.util.Scanner;
public class fivePP06 {
    public static void main(String[] args) {
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