import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class BoxOfProduce {
    public String fruit1;
    public String fruit2;
    public String fruit3;
    public int maximumSize = 3;
    private String fruitArray[] = new String[maximumSize];

    public String toString() {
        return ("Fruit 1 " + fruitArray[0] + " Fruit 2 " + fruitArray[1] + " Fruit 3 " + fruitArray[2]);
    }

    public BoxOfProduce() {
        fruitArray[0] = randomize();
        fruitArray[1] = randomize();
        fruitArray[2] = randomize();
    }

    public BoxOfProduce(String fruit1initial) {
        if (checkIfIn(fruit1initial)) {
            fruitArray[0] = fruit1initial;
        } else {
            fruitArray[0] = randomize();
        }
        fruitArray[1] = randomize();
        fruitArray[2] = randomize();
    }

    public BoxOfProduce(String fruit1initial, String fruit2initial) {

        if (checkIfIn(fruit1initial)) {
            fruitArray[0] = fruit1initial;
        } else {
            fruitArray[0] = randomize();
        }
        if (checkIfIn(fruit2initial)) {
            fruitArray[1] = fruit2initial;
        } else {
            fruitArray[1] = randomize();
        }
        fruitArray[2] = randomize();
    }

    public BoxOfProduce(String fruit1initial, String fruit2inital,
            String fruit3inital) {
        if (checkIfIn(fruit1initial)) {
            fruitArray[0] = fruit1initial;
        } else {
            fruitArray[0] = randomize();
        }
        if (checkIfIn(fruit2inital)) {
            fruitArray[1] = fruit2inital;
        } else {
            fruitArray[1] = randomize();
        }
        if (checkIfIn(fruit3inital)) {
            fruitArray[2] = fruit3inital;
        } else {
            fruitArray[2] = randomize();
        }
    }

    public void setFruit(String fruit, int spot) {
        if (checkIfIn(fruit)) {
            fruitArray[spot - 1] = fruit;
        } else
            System.out.println("Variable Unrecognized");
    }

    public String getFruit(int spot) {
        return fruitArray[spot - 1];
    }

    public String randomize() {
        Scanner fileIn = null;
        Random randomGenerator = new Random();
        int choice;
        int placeToAdd = 0;
        String[] fruits = new String[5];
        try {
            fileIn = new Scanner(new FileInputStream("Ch04\\rsc\\ch4_PP13.txt"));

            while (fileIn.hasNextLine()) {
                fruits[placeToAdd] = fileIn.nextLine();
                placeToAdd += 1;
            }

        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
        }
        randomGenerator = new Random(System.currentTimeMillis());
        choice = randomGenerator.nextInt(5);
        return fruits[choice];

    }

    public void randomizeFood() {
        fruitArray[0] = randomize();
        fruitArray[1] = randomize();
        fruitArray[2] = randomize();
    }

    public void addFruit(String fruitToAdd) {
        if (checkIfIn(fruitToAdd)) {
            maximumSize += 1;
            String[] newArray = new String[maximumSize];
            for (int i = 0; i < newArray.length; i++) {
                newArray[i] = fruitArray[i];
            }
            fruitArray = newArray;
            fruitArray[fruitArray.length - 1] = fruitToAdd; 
        }
        
    }

    public boolean checkIfIn(String fruitName) {
        try {
            Scanner fileIn = null;
            fileIn = new Scanner(new FileInputStream("Ch04\\rsc\\ch4_PP13.txt"));
            String stringToCheck;
            boolean result = false;
            for (int i = 0; i < 5; i++) {
                stringToCheck = fileIn.nextLine();
                if (fruitName == stringToCheck) {
                    result = true;
                }
            }
            return result;

        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
            return false;

        }

    }

}