/*
    Author: Mark Yu
    Last Updated: 9/5/2023
    Description: Calculates how much soda and coffee you can have without dying
  
  
*/
public class ProgrammingProject10 {
    public static int AMOUNT_TO_KILL = 1200;
    public static int COFFEE_AMOUNT = 16; 
    public static int COFFEE_COUNT = 160;
    public static int COLA_AMOUNT = 12;
    public static int COLA_COUNT = 34;
    public static void main(String[] args) throws Exception {
        int healthyAmountOfCoffeeDrinks = AMOUNT_TO_KILL/COFFEE_COUNT;
        int healthyAmountOfSodaDrinks = AMOUNT_TO_KILL/COLA_COUNT;
        System.out.println("You can have: " + healthyAmountOfCoffeeDrinks + " coffee drinks without dying.");
        System.out.println("You can have: " + healthyAmountOfSodaDrinks + " soda drinks without dying.");
    }
}
/*
 * ****************************OUTPUT**************************************
 * You can have: 7 coffee drinks without dying.
 * You can have: 35 soda drinks without dying.
 */