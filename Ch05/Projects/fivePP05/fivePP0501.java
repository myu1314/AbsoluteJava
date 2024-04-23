package Ch05.Projects.fivePP05;
import java.util.Scanner;
public class fivePP0501 {
    public static void main(String[] args) {
        Money money1 = new Money(10, 50);
        Money money2 = new Money(5, 25);

        Money result = Money.add(money1, money2);
        System.out.println("+ result: " + result);

        result = Money.minus(money1, money2);
        System.out.println("- result: " + result);
    }

}