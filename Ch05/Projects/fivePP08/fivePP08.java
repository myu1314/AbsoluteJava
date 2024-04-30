package Ch05.Projects.fivePP08;
import java.util.Scanner;
public class fivePP08 {
    public static void main(String[] args) {
        Pizza pizza1 = new Pizza("large",1,0,1);// Code to create a large pizza, 1 cheese, 1 ham
        Pizza pizza2 = new Pizza("large",2,2,0);// Code to create a medium pizza, 2 cheese,
        // 2 pepperoni
        PizzaOrder order1 = new PizzaOrder();// Code to create an order
        order1.setNumPizzas(2); // 2 pizzas in the order
        order1.setPizza1(pizza1); // Set first pizza
        order1.setPizza2(pizza2); // Set second pizza
        double total = order1.calcTotal(); // Should be 18+22 = 40
        System.out.println(total); 
        PizzaOrder order2 = new PizzaOrder(order1); // Use copy
        // constructor
        order2.getPizza1().setNOCT(3); // Change toppings
        total = order2.calcTotal(); // Should be 22 + 22 = 44
        double origTotal = order1.calcTotal(); // Should still be 40
        System.out.println(total);
        System.out.println(origTotal);
}
}