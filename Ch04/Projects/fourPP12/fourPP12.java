
public class fourPP12 {
    public static void main(String[] args) throws Exception {
        
        Person pizza1 = new Person("large",1,0,1);// Code to create a large pizza, 1 cheese, 1 ham
        Person pizza2 = new Person("medium",2,2,0);// Code to create a medium pizza, 2 cheese, 2 pepperoni
        PizzaOrder order = new PizzaOrder(); // Code to create an order
        order.setNumPizzas(2); // 2 pizzas in the order
        order.setPizza1(pizza1); // Set first pizza
        order.setPizza2(pizza2); // Set second pizza    
        double total = order.calcTotal(); // Should be 18+20 = 38
        System.out.println("The total price is: $" + total + ".");
        

       
    }
}