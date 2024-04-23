package Ch05.Projects.fivePP0602;

public class Rational {
    private int num;
    private int den;

    public Rational(int intNum, int intDen) {
        num = intNum;
        den = intDen;
        reduce();
    }

    public Rational(int wholeNumber) {
        this(wholeNumber, 1);
    }

    public Rational() {
        this(0, 1);
    }

    public int getNumerator() {
        return num;
    }

    public void setNumerator(int numerator) {
        num = numerator;
        reduce();
    }

    public int getDenominator() {
        reduce();
        return den;
        
    }

    public void setDenominator(int denominator) {
        if (denominator == 0) {
            System.out.println("Denominator cannot be zero");
        }
        den = denominator;
        reduce();
    }

    public void add(Rational number1) {
        int numResult = num * number1.den + number1.num * den;
        int denResult = den * number1.den;
        num = numResult;
        den = denResult;
        reduce();
    }

    public void subtract(Rational number1) {
        int numResult = num * number1.den - number1.num * den;
        int denResult = den * number1.den;
        num = numResult;
        den = denResult;
        reduce();
    }

    public void multiply(Rational number1) {
        int numResult = num * number1.num;
        int denResult = den * number1.den;
        num = numResult;
        den = denResult;
        reduce();
    }

    public void divide(Rational number1) {
        if (number1.num == 0) {
            System.out.println("Cannot divide by zero");
        }
        int numResult = num * number1.den;
        int denResult = den * number1.num;
        num = numResult;
        den = denResult;
        reduce();
    }

    private void reduce() {
        int gcd = gcd(num,den);
        num = num/gcd;
        den = den/gcd;
    }

    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a);
    }

    public boolean equals(Rational num1) {
        if (num1.num == num && num1.den == den) {
            return true;
        }
        return false;
    }
    public String toString() {
        return (num + "/" + den);
    }

    
}