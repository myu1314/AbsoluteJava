package Ch05.Projects.fivePP07;
class NationalCall {
    private String sPN;
    private String dPN;
    private int durationCurentCall;
    private int durationAllCalls;
    private double cCallPrice;
    private double tPriceOfAllCalls;

    public NationalCall(String intSPN, String intDPN, int intDurationCurrentCall) {
        sPN = intSPN;
        dPN = intDPN;
        durationCurentCall = intDurationCurrentCall;
        durationAllCalls += intDurationCurrentCall;
        cCallPrice = calculateCallPrice(durationCurentCall);
        calculateDiscount();
        tPriceOfAllCalls += cCallPrice;
    }

    private double calculateCallPrice(int duration) {
        double price = 0; 
        if (duration <= 60){
            price = 0.20;
        }    
        else if (duration <= 120){
            price = 0.20;
        }  
        else if (duration > 120){
            price = 0.10;
        }
        return price;
         
        
    }
    public void calculateDiscount() {
        if (durationAllCalls > 600 && durationAllCalls <= 1200) {
            cCallPrice *= 0.95;
        } 
        else if (durationAllCalls > 1200) {
            cCallPrice *= 0.93;
        }
    }
    public void displayDetails() {
        System.out.println("National Call Details:");
        System.out.println("Source Phone Number: " + sPN);
        System.out.println("Destination Phone Number: " + dPN);
        System.out.println("Total Duration of Current Call: " + durationCurentCall);
        System.out.println("Total Duration of All Calls: " + durationAllCalls);
        System.out.println("Current Call Price: $" + cCallPrice);
        System.out.println("Total Price of All Calls: $" + tPriceOfAllCalls);
    }
}