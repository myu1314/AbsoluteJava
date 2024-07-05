
public class sixPP18 {
    public static void main(String[] args) throws Exception {
        
        BoxOfProduce box1 = new BoxOfProduce();// Code to create a large pizza, 1 cheese, 1 ham
        box1.printDetails();
        String fruitToAdd = "Tomato";
        System.out.println("====================");
        box1.addFruit(fruitToAdd);
        box1.printDetails();

       
    }
}