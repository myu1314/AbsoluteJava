package Ch04.Projects.fourPP08;

import java.util.Scanner;

public class Date {
    private int degrees;
    private String symbol;

    public Date() {
        degrees = 0;
        symbol = "C";
    }
    public Date(int degreesInput) {
        degrees = degreesInput;
        symbol = "C";
    }
    public Date(String symbolInput) {
        degrees = 0;
        symbol = symbolInput;
    }
    public Date(int degreesInput, String symbolInput) {
        setVariables(degreesInput, symbolInput);
    }

    public void setVariables(int degreesInput,String symbolInput) {
        degrees = degreesInput;
        symbol = symbolInput;
    }
    public void convertToCelsuis() {
        degrees = 5 * (degrees-32)/9;
        symbol = "C";
    }
    public void convertToFarenheight() {
        degrees = (9 * degrees)/5 + 32;
        symbol = "F";
    }
    public int convertToCelsuis(int degrees1) {
        int degreesMath = 5 * (degrees-32)/9;
        return degreesMath;
    }
    public int convertToFarenheight(int degrees2) {
        int degreesMath = (9 * degrees)/5 + 32;
        return degreesMath;
    }
    public void printDetails(){
        System.out.println("The temperature are: " + degrees + symbol + ".");
    }
    public void setScale(String symbolInput){
        symbol = symbolInput;
    }
    public void setDegrees(int degreesInput){
        degrees = degreesInput;
    }
    public void compareTo(int degreesToCompare, String symbolToCompare){
        int newDegreesToCompare = 0;
        if(symbol == "C"){
            if(symbolToCompare == "F"){
                newDegreesToCompare = convertToFarenheight(degreesToCompare);
            }
        }
        if(symbol == "F"){
            if(symbolToCompare == "C"){
                newDegreesToCompare = convertToFarenheight(degreesToCompare);
            }
        }
        if (newDegreesToCompare > degrees){
            System.out.println(degreesToCompare + symbolToCompare + " is greater than " + degrees + symbol + ".");
        }
        else if(newDegreesToCompare == degrees){
            System.out.println(degreesToCompare + symbolToCompare + " is equal than " + degrees + symbol + ".");
        }
        else if(newDegreesToCompare < degrees){
            System.out.println(degreesToCompare + symbolToCompare + " is less than " + degrees + symbol + ".");
        }
    }

   
}
