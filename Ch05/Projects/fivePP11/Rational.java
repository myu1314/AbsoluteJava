package Ch05.Projects.fivePP11;

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

    public Rational add(Rational num1, Rational num2) {
        int num = num1.num * num2.den + num2.num * num1.den;
        int den = num1.den * num2.den;
        reduce();
        return new Rational(num, den);
    }

    public Rational subtract(Rational num1, Rational num2) {
        int num = num1.num * num2.den - num2.num * num1.den;
        int den = num1.den * num2.den;
        reduce();
        return new Rational(num, den);
    }

    public Rational multiply(Rational num1, Rational num2) {
        int num = num1.num * num2.num;
        int den = num1.den * num2.den;
        return new Rational(num, den);
    }

    public Rational divide(Rational num1, Rational num2) {
        if (num2.num == 0) {
            System.out.println("Cannot divide by zero");
        }
        int num = num1.num * num2.den;
        int den = num1.den * num2.num;
        return new Rational(num, den);
    }

    public void reduce() {
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


