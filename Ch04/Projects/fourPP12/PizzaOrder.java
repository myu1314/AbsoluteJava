
public class PizzaOrder {
    private int numberOfPizzas;
    public Person pizza1;
    public Person pizza2;
    public Person pizza3;



    public PizzaOrder(int initalNumberOfPizzas, Person intialPizza1,
    Person initalPizza2,Person intialPizza3) {
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
        Person intialPizza1 = new Person("small", 1, 0, 0);
        pizza1 = intialPizza1;
        
    }
    public void setNumPizzas(int intialPizzaNum) {
        numberOfPizzas = intialPizzaNum;
    }
    public void setPizza1(Person intialPizza1) {
        pizza1 = intialPizza1;
    }
    public void setPizza2(Person intialPizza2) {
        pizza2 = intialPizza2;
    }
    public void setPizza3(Person intialPizza3) {
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
