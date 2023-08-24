
public class Ch01ProgrammingProject01 {
    public static void main(String[] args) {
        final double weightKGtoLbs = 2.2;
        final double timeMinToHour = 60;
        final double runningCPM = 10;
        final double basketballCPM = 8;
        final double sleepingCPM = 1;
        
        double weightInLB = 150;
        double minBasket = 30;
        double minRunning = 30;
        double hoursSleeping = 6;
        double TotalCalBasket;
        double TotalCalRun;
        double TotalCalSleep;
        double TotalCalorie;
        TotalCalBasket = (0.0175 * basketballCPM * weightInLB/weightKGtoLbs) * minBasket;
        TotalCalRun = (0.0175 * runningCPM * weightInLB/weightKGtoLbs) * minRunning;
        TotalCalSleep = (0.0175  *  sleepingCPM * weightInLB/weightKGtoLbs) * hoursSleeping *  timeMinToHour;
        TotalCalorie = TotalCalBasket + TotalCalRun + TotalCalSleep;
        System.out.println("The total amount of calories is " + TotalCalorie + ".");
            
    }
}