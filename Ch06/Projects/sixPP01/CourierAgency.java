import java.util.Scanner;

public class CourierAgency{
    public double[] parcelWeight;
    public boolean[] withinCity;
    public String category;
    public CourierAgency(){
        parcelWeight = new double[5];
        withinCity = new boolean[5];
    }
    public void inputParcelDetail(){
        Scanner keyboard = new Scanner(System.in);
        for(int i = 0; i<5; i++){
            System.out.println("Weight of parcel " + (i+1) + " in kg:");
            parcelWeight[i] = keyboard.nextDouble();

            System.out.println("Is the parcel " + (i+1) + " within the city?");
            withinCity[i] = keyboard.nextBoolean();
        }
        keyboard.close();
    }
    public void calculateCosts(){
        for(int i = 0; i< 5; i++){
            double weightCost = parcelWeight[i] * 2;
            double deliveryCost = 0;
            if (withinCity[i] == true){
                deliveryCost = 20;
            }
            else if(withinCity[i] == false){
                deliveryCost = 40;
            }
            double totalCost = weightCost + deliveryCost;
            System.out.println("Total cost for parcel " + (i + 1) + ": $" + totalCost);
        }
    }
    
}

