/*
    Author: Mark Yu
    Last Updated: 9/26/2023
    Description: Ideal Body Weight
  
  
*/
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class twoPP13 {
    public static int MIN_HEIGHT = 5;
    public static int MIN_WEIGHT = 110; 
    public static int POUNDS_PER_INCH = 5;
    public static int CONVERSION_FT_TO_IN = 12;
    public static void main(String[] args) throws Exception {
        Scanner fileIn = null;
        try
        {
            fileIn = new Scanner(new FileInputStream("Ch02\\rsc\\ch2_PP13.txt"));;
            String name1 = fileIn.nextLine();
            int name1feet = fileIn.nextInt(); 
            int name1inch = fileIn.nextInt();
            int name1weight =  ((name1feet * CONVERSION_FT_TO_IN + name1inch) - MIN_HEIGHT * CONVERSION_FT_TO_IN) * POUNDS_PER_INCH + MIN_WEIGHT; 

            fileIn.nextLine();
            String name2 = fileIn.nextLine();
            int name2feet = fileIn.nextInt();
            int name2inch = fileIn.nextInt();
            int name2weight =  ((name2feet * CONVERSION_FT_TO_IN + name2inch) - MIN_HEIGHT * CONVERSION_FT_TO_IN) * POUNDS_PER_INCH + MIN_WEIGHT; 
            
            fileIn.nextLine();
            String name3 = fileIn.nextLine();
            int name3feet = fileIn.nextInt();
            int name3inch = fileIn.nextInt();
            int name3weight =  ((name3feet * CONVERSION_FT_TO_IN + name3inch) - MIN_HEIGHT * CONVERSION_FT_TO_IN) * POUNDS_PER_INCH + MIN_WEIGHT; 
            System.out.println(name1 + "'s ideal body weight is " + name1weight);
            System.out.println(name2 + "'s ideal body weight is " + name2weight);
            System.out.println(name3 + "'s ideal body weight is " + name3weight);
        }  
        
        catch(FileNotFoundException e)
        {
            System.out.println("File Not Found");  
            
        }
    }
}