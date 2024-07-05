
public class PizzaOrder {
    private int numberOfPizzas;
    public Pizza pizza1;
    public Pizza pizza2;
    public Pizza pizza3;



    public PizzaOrder(int initalNumberOfPizzas, Pizza intialPizza1,
    Pizza initalPizza2,Pizza intialPizza3) {
        pizza1 = intialPizza1;
        pizza2 = initalPizza2;
        pizza3 = intialPizza3;
        if ((numberOfPizzas <= 3) || (numberOfPizzas <= 1)) {
            System.out.println("Error: Can not process order. (Maximum of 3 pizzas per order and a minumum of 1)");
            System.exit(0);
        } else {
            numberOfPizzas = initalNumberOfPizzas;
        }
    }

    

    public PizzaOrder() {
        numberOfPizzas = 1;
        Pizza intialPizza1 = new Pizza("small", 1, 0, 0);
        pizza1 = intialPizza1;
        
    }
    public void setNumPizzas(int intialPizzaNum) {
        numberOfPizzas = intialPizzaNum;
    }
    public void setPizza1(Pizza intialPizza1) {
        pizza1 = intialPizza1;
    }
    public void setPizza2(Pizza intialPizza2) {
        pizza2 = intialPizza2;
    }
    public void setPizza3(Pizza intialPizza3) {
        pizza3 = intialPizza3;
    }
    public int calcTotal(){
        int totalCost = pizza1.calcPizzaCost();
        if(pizza2 != null){
            totalCost += pizza2.calcPizzaCost();
        }
        else if(pizza3 != null){
            totalCost += pizza3.calcPizzaCost();
        }
        return totalCost;
       }
   }
