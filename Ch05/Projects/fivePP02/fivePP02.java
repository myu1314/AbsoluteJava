package Ch05.Projects.fivePP02;
import java.util.Scanner;
public class fivePP02 {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner (System.in);
        System.out.println("Enter a fraction:");
        int numerator = keyboard.nextInt();
        int denominator = keyboard.nextInt(); 
        Fractions fraction1 = new Fractions (numerator, denominator);
        while(true){
            System.out.println("Enter another fraction to compare:");
            String userI = keyboard.next();
            if (userI.equals( "quit")){
                break;
            }
            int otherNumerator = keyboard.nextInt();
            int otherDenomiator = keyboard.nextInt();
            Fractions fraction2 = new Fractions(otherNumerator, otherDenomiator);
            if(fraction1.equals(fraction2)){
                System.out.println("Fractions are identical.");
            } else{
                System.out.println("Fractions are not identical");
            }
        }
        keyboard.close();
    }
}