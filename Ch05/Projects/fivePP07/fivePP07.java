package Ch05.Projects.fivePP07;
import java.util.Scanner;
public class fivePP07 {
    public static void main(String[] args) {
        NationalCall ncall1 = new NationalCall("650-930-9511", "415-912-9512", 10);
        NationalCall ncall2 = new NationalCall("6509309511", "415-912-9512", 50);
        internationalCall icall = new internationalCall("+(1)650-012-3946", "+(1)420-190-5912", 50);
        ncall1.displayDetails();
        ncall2.displayDetails();
        icall.displayDetails();
        
    }

}