import java.util.Scanner;
public class fivePP11 {
    public static void main(String[] args) throws Exception {
        boolean shouldContinue = true;
        Scanner keyboard = new Scanner(System.in);
        String response;
        boolean continueEditing = true;
        int numOfBoxes = 0;
        while (shouldContinue == true) {
            System.out.println("Would you like to create a box of produce? (y/n)");
            response = keyboard.nextLine();
            if (response.equalsIgnoreCase("n")) {
                shouldContinue = false;
            } else if (response.equalsIgnoreCase("y")) {
                BoxOfProduce box = new BoxOfProduce();
                System.out.println("Currently this is the contents of your box:");
                box.displayResults();

                numOfBoxes += 1;
                while (continueEditing == true) {
                    System.out.println("Would you like to edit it? (y/n)");
                    String editResponse = keyboard.nextLine();
                    if (editResponse.equalsIgnoreCase("y")) {
                        System.out.println("Which one would you like to edit? (1/2/3)");
                        int responseEditNum = keyboard.nextInt();
                        System.out.println("What fruit would you like to switch item " + responseEditNum
                                + " to? (Broccoli,Tomato,Kiwi,Kale,Tomatillo)");
                        response = keyboard.nextLine();
                        response = keyboard.nextLine();
                        if (responseEditNum == 1) {
                            box.setFruit1(response);
                        }
                        if (responseEditNum == 2) {
                            box.setFruit2(response);
                        }
                        if (responseEditNum == 3) {
                            box.setFruit3(response);
                        }

                        System.out.println("Your new box:");
                        box.displayResults();
                    }

                    else if (editResponse.equalsIgnoreCase("n")) {
                        continueEditing = false;

                    }
                }
                box.checkForFliers();
                if (box.containsRecipeFlyer == true) {
                    System.out.println("Your finalized box:");
                    box.displayResults();
                    System.out.println("Here is a free salsa recipe:");
                }
            continueEditing = true;
            } else {
                System.out.println("Invalid Input");
            }
        }

    }
}