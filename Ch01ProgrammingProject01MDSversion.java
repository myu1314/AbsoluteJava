
public class Ch01ProgrammingProject01MDSversion {
    public static void main(String[] args) {
        final double WEIGHT_KG_TO_LBS = 2.2;
        final double timeMinToHour = 60;
        final double runningMET = 10;
        final double basketballMET = 8;
        final double sleepingMET = 1;
        final double calMetConvert = 0.0175;
        
        double weightInLB = 150;
        double minBasket = 30;
        double minRunning = 30;
        double hoursSleeping = 6;
        double totalCalorie;
        // totalCalBasket = (calMetConvert * basketballMET * weightInLB/WEIGHT_KG_TO_LBS) * minBasket;
        // totalCalRun = (calMetConvert * runningMET * weightInLB/WEIGHT_KG_TO_LBS) * minRunning;
        // totalCalSleep = (calMetConvert  *  sleepingMET * weightInLB/WEIGHT_KG_TO_LBS) * hoursSleeping *  timeMinToHour;
        totalCalorie = calMetConvert * weightInLB/WEIGHT_KG_TO_LBS * (basketballMET*minBasket + runningMET*minRunning + sleepingMET*hoursSleeping*timeMinToHour);
        System.out.println("The total amount of calories burned is " + totalCalorie + ".");
            
    }
}