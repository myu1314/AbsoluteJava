package Ch05.Projects.fivePP0602;
import java.util.Scanner;
public class fivePP06 {
    public static void main(String[] args) {
        Rational r1 = new Rational(1, 2);
        Rational r2 = new Rational(3, 4);

        System.out.println("Initial values:");
        System.out.println("Rational 1: " + r1);
        System.out.println("Rational 2: " + r2);

        r1.add(r2);
        System.out.println("\nAddition result: " + r1);

        r1 = new Rational(1, 2); // Reset r1 for subtraction test
        r1.subtract(r2);
        System.out.println("Subtraction result: " + r1);

        r1 = new Rational(1, 2); // Reset r1 for multiplication test
        r1.multiply(r2);
        System.out.println("Multiplication result: " + r1);

        r1 = new Rational(1, 2); // Reset r1 for division test
        r1.divide(r2);
        System.out.println("Division result: " + r1);
    }

}