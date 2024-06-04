import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class BoxOfProduce {
    private String fruit1;
    private String fruit2;
    private String fruit3;
    public static int recipeFlyersRemaning = 5;
    public boolean containsTomatillos;
    public boolean containsRecipeFlyer;
    public String toString() {
        return ("Fruit 1 " + fruit1 + " Fruit 2 " + fruit2 + " Fruit 3 " + fruit3);
    }
    public void displayResults(){
        System.out.println("Fruit 1: " + fruit1);
        System.out.println("Fruit 2: " + fruit2);
        System.out.println("Fruit 3: " + fruit3);
    }

    public BoxOfProduce() {
        fruit1 = randomize();
        fruit2 = randomize();
        fruit3 = randomize();
    }

    public BoxOfProduce(String fruit1initial) {
        if (checkIfIn(fruit1initial)) {
            fruit1 = fruit1initial;
        } else {
            fruit1 = randomize();
        }
        fruit2 = randomize();
        fruit3 = randomize();
    }

    public BoxOfProduce(String fruit1initial, String fruit2initial) {

        if (checkIfIn(fruit1initial)) {
            fruit1 = fruit1initial;
        } else {
            fruit1 = randomize();
        }
        if (checkIfIn(fruit2initial)) {
            fruit2 = fruit2initial;
        } else {
            fruit2 = randomize();
        }
        fruit3 = randomize();
    }

    public BoxOfProduce(String fruit1initial, String fruit2inital,
            String fruit3inital) {
        if (checkIfIn(fruit1initial)) {
            fruit1 = fruit1initial;
        } else {
            fruit1 = randomize();
        }
        if (checkIfIn(fruit2inital)) {
            fruit2 = fruit2inital;
        } else {
            fruit2 = randomize();
        }
        if (checkIfIn(fruit3inital)) {
            fruit3 = fruit3inital;
        } else {
            fruit3 = randomize();
        }
       
    }

    public void setFruit1(String fruit1inital) {
        if (checkIfIn(fruit1inital)) {
            fruit1 = fruit1inital;
        } else
            System.out.println("Variable Unrecognized");
    }

    public void setFruit2(String fruit2inital) {
        if (checkIfIn(fruit2inital)) {
            fruit2 = fruit2inital;
        } else
            System.out.println("Variable Unrecognized");
    }

    public void setFruit3(String fruit3inital) {
        if (checkIfIn(fruit3inital)) {
            fruit3 = fruit3inital;
        } else
            System.out.println("Variable Unrecognized");
    }

    public String getFruit1() {
        return fruit1;
    }

    public String getFruit2() {
        return fruit2;
    }

    public String getFruit3() {
        return fruit3;
    }
    public Boolean getContainsFlier() {
        return containsRecipeFlyer;
    }


    public String randomize() {
        Scanner fileIn = null;
        Random randomGenerator = new Random();
        int choice;
        int placeToAdd = 0;
        String[] fruits = new String[5];
        try {
            fileIn = new Scanner(new FileInputStream("Programming\\Java\\AbsoluteJava\\Ch05\\Projects\\fivePP10\\ch4_PP13.txt"));

            while (fileIn.hasNextLine()) {
                fruits[placeToAdd] = fileIn.nextLine();
                placeToAdd +=1;
            }

        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
        }
        randomGenerator = new Random(System.nanoTime());
        choice = randomGenerator.nextInt(5);
        return fruits[choice];

    }

    public void randomizeFood() {
        fruit1 = randomize();
        fruit2 = randomize();
        fruit3 = randomize();
    }

    public boolean checkIfIn(String fruitName) {
        try {
            Scanner fileIn = null;
            fileIn = new Scanner(new FileInputStream("Ch04\\rsc\\ch4_PP13.txt"));
            String stringToCheck = "";
            boolean result = false;
            for (int i = 0; i < 5; i++) {
                stringToCheck = fileIn.nextLine();
                if (fruitName.equalsIgnoreCase(stringToCheck)) {
                    result = true;
                    break;
                }
            }
            
            return result;

        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
            return false;

        }

    }
    public boolean checkForTomatilles(){
        if(fruit1.equals("Tomatillo")||fruit2.equals("Tomatillo")||fruit3.equals("Tomatillo")){
            return true;
        }
        else{
            return false;
        }
    }
    public void checkForFliers(){
        if(checkForTomatilles() && recipeFlyersRemaning > 0){
            containsRecipeFlyer = true;
            recipeFlyersRemaning-=1;
        }
    }

}