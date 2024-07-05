
public class PizzaOrder {
    public int numberOfPizzas;
    public Pizza[] pizzaOrder;

    public void setPizzaNumber(int userNumberOfPizzas) {
        pizzaOrder = new Pizza[userNumberOfPizzas];
        numberOfPizzas = userNumberOfPizzas;
    }

    public void addPizza(Pizza pizza) {
        boolean addingSuc = false;
        for (int i = 0; i < numberOfPizzas; i++) {
            if (pizzaOrder[i] == null) {
                pizzaOrder[i] = pizza;
                addingSuc = true;
                System.out.println("Pizza added sucsessfully");
                break;
            } 
        }
        if(addingSuc == false){
            System.out.println("No more space in order");
        }

    }

    public void setPizza(Pizza intialPizza, int spot) {
        pizzaOrder[spot - 1] = intialPizza;
    }

    public int calcTotal() {
        int totalCost = 0;
        for (int i = 0; i < pizzaOrder.length; i++) {
            if (pizzaOrder[i] != null) {
                totalCost += pizzaOrder[i].calcPizzaCost();
            }
        }
        return totalCost;
    }

    public void display() {
        for (int i = 0; i < numberOfPizzas; i++) {
            pizzaOrder[i].getDetails();
        }
    }
}
