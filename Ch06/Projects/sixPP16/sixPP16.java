
public class sixPP16 {
    public static void main(String[] args) throws Exception {
        
        Pizza pizza1 = new Pizza("large",1,0,1);// Code to create a large pizza, 1 cheese, 1 ham
        Pizza pizza2 = new Pizza("medium",2,2,0);// Code to create a medium pizza, 2 cheese, 2 pepperoni
        PizzaOrder order = new PizzaOrder(); // Code to create an order
        order.setPizzaNumber(2); // 2 pizzas in the order
        order.addPizza(pizza1); // Add first pizza
        order.setPizza(pizza2,2); // Set second pizza    
        double total = order.calcTotal(); // Should be 18+20 = 38
        System.out.println("The total price is: $" + total + ".");
        

       
    }
}