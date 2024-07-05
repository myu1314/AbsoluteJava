
public class Pizza {
    private String size;
    private int numberOfCheeseToppings;
    private int numberOfPeperoniToppings;
    private int numberOfHamToppings;

    public String toString() {
        return ("Size: " + size + " Number of Cheese Toppings: " + numberOfCheeseToppings + " Number of Peperoni Toppings" + numberOfPeperoniToppings + " Number of Ham Toppings" + numberOfHamToppings +  ".");
    }

    public Pizza(String initalSize, int initialnumberOfCheeseToppings,
    int initialnumberOfPeperoniToppings, int initialnumberOfHamToppings) {
        size = initalSize;
        if ((initialnumberOfCheeseToppings < 0) || (initialnumberOfPeperoniToppings < 0) || (initialnumberOfHamToppings < 0)) {
            System.out.println("Error: Negative number of Toppings");
            System.exit(0);
        } else {
            numberOfCheeseToppings = initialnumberOfCheeseToppings;
            numberOfPeperoniToppings = initialnumberOfPeperoniToppings;
            numberOfHamToppings = initialnumberOfHamToppings;
        }
    }

    

    public Pizza(String initialName) {
        size = "small";
        numberOfCheeseToppings = 1;
        numberOfPeperoniToppings = 0;
        numberOfHamToppings = 0;
    }

    public void setSize(String initalSize) {
        size = initalSize;
    }
    public void setNOCT(int initialnumberOfCheeseToppings) {
        if (initialnumberOfCheeseToppings <= 0) {
            System.out.println("Error: Negative Cheese Toppings.");
            System.exit(0);
        } else
            numberOfCheeseToppings = initialnumberOfCheeseToppings;
    }

    

    public void setNOPT(int initialnumberOfPepperoniToppings) {
        if (initialnumberOfPepperoniToppings <= 0) {
            System.out.println("Error: Negative Pepperoni Toppings.");
            System.exit(0);
        } else
            numberOfPeperoniToppings = initialnumberOfPepperoniToppings;
    }
    public void setNOHT(int initialnumberOfHamToppings) {
        if (initialnumberOfHamToppings <= 0) {
            System.out.println("Error: Negative Ham Toppings.");
            System.exit(0);
        } else
            numberOfHamToppings = initialnumberOfHamToppings;
    }

    public String getSize() {
        return size;
    }

    public int getNOCT() {
        return numberOfCheeseToppings;
    }

    public int getNOPT() {
        return numberOfPeperoniToppings;
    }
    public int getNOHT() {
        return numberOfHamToppings;
    }

   public int calcPizzaCost(){
    if(size == "small"){
        return (10 + 2 * (numberOfCheeseToppings+numberOfHamToppings + numberOfPeperoniToppings));
    }
    else if(size == "medium"){
        return (12 + 2 * (numberOfCheeseToppings+numberOfHamToppings + numberOfPeperoniToppings));
    }
    else if(size == "large"){
        return (14 + 2 * (numberOfCheeseToppings+numberOfHamToppings + numberOfPeperoniToppings));
    }
    else{
        return 0;
    }
   }
   public String getDetails(){
    int cost = calcPizzaCost();
    return ("Cost: $" + cost + "\n" + "Number Of Cheese Tooppings: " +numberOfCheeseToppings + "\nNumber Of Pepperoni Tooppings: " +numberOfPeperoniToppings +"\nNumber Of Ham Tooppings: " +numberOfHamToppings);
   }

}