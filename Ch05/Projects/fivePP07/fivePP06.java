package Ch05.Projects.fivePP07;
import java.util.Scanner;
public class fivePP06 {
    public static void main(String[] args) {
        NationalCall ncall1 = new NationalCall("6509309511", "4159129512", 10);
        NationalCall ncall2 = new NationalCall("6509309511", "4159129512", 50);
        internationalCall icall = new internationalCall("+(1)16500123946", "+(1)4201905912", 50);
        ncall1.displayDetails();
        ncall2.displayDetails();
        icall.displayDetails();
        
    }

}