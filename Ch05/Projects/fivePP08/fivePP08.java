package Ch05.Projects.fivePP08;
import java.util.Scanner;
public class fivePP08 {
    public static void main(String[] args) {
        Pizza pizza1 = new Pizza("large", 2, 1, 3);
        Pizza pizza2 = new Pizza("medium", 1, 2, 1);
        Pizza pizza3 = new Pizza("small", 2, 3, 1);

        PizzaOrder order1 = new PizzaOrder(3, pizza1, pizza2, pizza3);

        PizzaOrder order2 = new PizzaOrder(order1);

        order2.getPizza1().setNOCT(3); 

        System.out.println("Order 1:");
        System.out.println("Number of Pizzas: " + order1.getNumPizzas());
        System.out.println("Pizza 1: " + order1.getPizza1().getDetails());
        System.out.println("Pizza 2: " + order1.getPizza2().getDetails());
        System.out.println("Pizza 3: " + order1.getPizza3().getDetails());
        System.out.println("Total Cost: $" + order1.calcTotal());

        System.out.println();

        System.out.println("Order 2:");
        System.out.println("Number of Pizzas: " + order2.getNumPizzas());
        System.out.println("Pizza 1: " + order2.getPizza1().getDetails());
        System.out.println("Pizza 2: " + order2.getPizza2().getDetails());
        System.out.println("Pizza 3: " + order2.getPizza3().getDetails());
        System.out.println("Total Cost: $" + order2.calcTotal());

}
}