package Ch05.Projects.fivePP03;
import java.util.Scanner;
public class fivePP03 {
    public static void main(String[] args) throws Exception {
        Container container1 = new Container(10);
        Container container2 = new Container(5);

        container1.full();
        container1.displayQuantity();

        container1.transfer(container2, 10);
        container1.displayQuantity();
        container2.displayQuantity();

        container2.transfer(container1, 3);
        container1.displayQuantity();
        container2.displayQuantity();
    
    }
}