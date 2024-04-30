package Ch05.Projects.fivePP08;

public class PizzaOrder {
    public int numberOfPizzas;
    public Pizza pizza1;
    public Pizza pizza2;
    public Pizza pizza3;

    public PizzaOrder(int initalNumberOfPizzas, Pizza intialPizza1,
            Pizza initalPizza2, Pizza intialPizza3) {
        pizza1 = intialPizza1;
        pizza2 = initalPizza2;
        pizza3 = intialPizza3;
        if ((initalNumberOfPizzas > 3) || (initalNumberOfPizzas < 1)) {
            System.out.println("Error: Can not process order. (Maximum of 3 pizzas per order and a minumum of 1)");
            System.exit(0);
        } else {
            numberOfPizzas = initalNumberOfPizzas;
        }
        pizza1 = new Pizza(intialPizza1.getSize(), intialPizza1.getNOCT(), intialPizza1.getNOPT(),
                intialPizza1.getNOHT());
        if (initalPizza2 != null)
            pizza2 = new Pizza(initalPizza2.getSize(), initalPizza2.getNOCT(), initalPizza2.getNOPT(),
                    initalPizza2.getNOHT());
        if (intialPizza3 != null)
            pizza3 = new Pizza(intialPizza3.getSize(), intialPizza3.getNOCT(), intialPizza3.getNOPT(),
                    intialPizza3.getNOHT());
    }

    public int getNumPizzas() {
        return numberOfPizzas;
    }

    public Pizza getPizza1() {
        return pizza1;
    }

    public Pizza getPizza2() {
        return pizza2;
    }

    public Pizza getPizza3() {
        return pizza3;
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

    public int calcTotal() {
        int totalCost = pizza1.calcPizzaCost();
        if (pizza2 != null) {
            totalCost += pizza2.calcPizzaCost();
        } else if (pizza3 != null) {
            totalCost += pizza3.calcPizzaCost();
        }
        return totalCost;
    }
    public PizzaOrder(PizzaOrder Order2) {
        this.numberOfPizzas = Order2.numberOfPizzas;
        this.pizza1 = new Pizza(Order2.pizza1.getSize(), Order2.pizza1.getNOCT(), Order2.pizza1.getNOPT(), Order2.pizza1.getNOHT());
        if (Order2.pizza2 != null)
            this.pizza2 = new Pizza(Order2.pizza2.getSize(), Order2.pizza2.getNOCT(), Order2.pizza2.getNOPT(), Order2.pizza2.getNOHT());
        if (Order2.pizza3 != null)
            this.pizza3 = new Pizza(Order2.pizza3.getSize(), Order2.pizza3.getNOCT(), Order2.pizza3.getNOPT(), Order2.pizza3.getNOHT());
    }
}

  