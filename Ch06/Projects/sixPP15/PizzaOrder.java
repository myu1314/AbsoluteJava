
public class PizzaOrder {
    public int numberOfPizzas;
    public Pizza pizza1;
    public Pizza pizza2;
    public Pizza pizza3;
    public Pizza[] pizzaOrder;
    public void setPizzaNumber(int userNumberOfPizzas){
        pizzaOrder = new Pizza[userNumberOfPizzas];
        numberOfPizzas = userNumberOfPizzas;
    }   
    public void addPizza(Pizza pizza){
        for(int i = 0; i <= numberOfPizzas; i++){
            if(pizzaOrder[i] == null){
                pizzaOrder[i] = pizza;
            }
            else{
                System.out.println("No more space in order");
            }
        }
        
    }
    public void setNumPizzas(int intialPizzaNum) {
        numberOfPizzas = intialPizzaNum;
    }
    public void setPizza(Pizza intialPizza, int spot) {
        pizzaOrder[spot-1] = intialPizza;
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
    public void display(){
        for(int i = 0; i < numberOfPizzas; i++){
            pizzaOrder[i].getDetails();
        }
    }
   }
