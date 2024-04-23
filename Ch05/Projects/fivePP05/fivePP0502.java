package Ch05.Projects.fivePP05;
import java.util.Scanner;
public class fivePP0502{
    public static void main(String[] args) {
        Money money1 = new Money(10, 50);
        Money money2 = new Money(5, 25);

        money1.add(money2);
        System.out.println("+: " + money1);

        money1.minus(money2);
        System.out.println("-   : " + money1);
    }

}