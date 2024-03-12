import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;

public class fourPP14 {
    public static void main(String[] args) throws Exception {
        Scanner fileIn = null;
        String product1Name;
        String product2Name;
        String product3Name;
        String product4Name;
        String product5Name;
        int product1Average = 0;
        int product2Average = 0;
        int product3Average = 0;
        int product4Average = 0;
        int product5Average = 0;
        int product1NOR = 0;
        int product2NOR = 0;
        int product3NOR = 0;
        int product4NOR = 0;
        int product5NOR = 0;
        int numberOfReviews = 0;
        int numberToCheck;
        String line;
        String deliminters = ",";
        try {
            fileIn = new Scanner(new FileInputStream("Ch04\\rsc\\ch4_PP14.txt"));
            line = fileIn.nextLine();
            while (fileIn.hasNextLine()) {
                numberOfReviews += 1;
            }
            System.out.println(numberOfReviews);
            System.out.println("3");
            StringTokenizer wordFactory = new StringTokenizer(line, deliminters);
            product1Name = wordFactory.nextToken();
            product2Name = wordFactory.nextToken();
            product3Name = wordFactory.nextToken();
            product4Name = wordFactory.nextToken();
            product5Name = wordFactory.nextToken();
            for (int i = 0; i < numberOfReviews; i++) {
                line = fileIn.nextLine();
                wordFactory  = new StringTokenizer(line, deliminters);
                product1Average += convertNumber(wordFactory.nextToken());
                numberToCheck = convertNumber(wordFactory.nextToken());
                if (numberToCheck != 0){
                    product1NOR += 1;
                }
                
                product2Average += convertNumber(wordFactory.nextToken());
                numberToCheck = convertNumber(wordFactory.nextToken());
                if (numberToCheck != 0){
                    product2NOR += 1;
                }

                product3Average += convertNumber(wordFactory.nextToken());
                numberToCheck = convertNumber(wordFactory.nextToken());
                if (numberToCheck != 0){
                    product4NOR += 1;
                }
               
                product4Average += convertNumber(wordFactory.nextToken());
                numberToCheck = convertNumber(wordFactory.nextToken());
                if (numberToCheck != 0){
                    product4NOR += 1;
                }
             
                product5Average += convertNumber(wordFactory.nextToken());
                numberToCheck = convertNumber(wordFactory.nextToken());
                if (numberToCheck != 0){
                    product5NOR += 1;
                }
                product1Average = product1Average/product1NOR;
                product2Average = product2Average/product2NOR;
                product3Average = product3Average/product3NOR;
                product4Average = product4Average/product4NOR;
                product5Average = product5Average/product5NOR;
                System.out.println("The average for " + product1Name + " is " + product1Average);
                System.out.println("The average for " + product2Name + " is " + product2Average);
                System.out.println("The average for " + product3Name + " is " + product3Average);
                
            }

        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
        }

    }

    static int convertNumber(String number) {
        if (number == "1") {
            return 1;
        }
        if (number == "2") {
            return 2;
        }
        if (number == "3") {
            return 3;
        }
        if (number == "4") {
            return 4;
        }
        if (number == "5") {
            return 5;
        }
        if (number == "0") {
            return 0;
        }
        else{
            return -1;
        }
    }
}