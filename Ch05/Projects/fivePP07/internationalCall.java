package Ch05.Projects.fivePP07;
class internationalCall {
    private String sPN;
    private String dPN;
    private int durationCurentCall;
    private int durationAllCalls;
    private double cCallPrice;
    private double tPriceOfAllCalls;

    public internationalCall(String intSPN, String intDPN, int intDurationCurentCall) {
        sPN = intSPN;
        dPN = intDPN;
        durationCurentCall = intDurationCurentCall;
        durationAllCalls += intDurationCurentCall;
        cCallPrice = calculateCallPrice(durationCurentCall);
        calculateDiscount();
        tPriceOfAllCalls += cCallPrice;
    }

    private double calculateCallPrice(int duration) {
        double price = 0; 
        if (duration <= 60){
            price = 0.60;
        }    
        else if (duration <= 120){
            price = 0.40;
        }  
        else if (duration > 120){
            price = 0.20;
        }
        return price;
    }
    public void calculateDiscount() {
        if (durationAllCalls > 600 && durationAllCalls <= 1200) {
            cCallPrice = cCallPrice * 0.92;
        } 
        else if (durationAllCalls > 1200) {
            cCallPrice = cCallPrice * 0.90;
        }
    }
    public void displayDetails() {
        System.out.println("International Call Details:");
        System.out.println("Source Phone Number: " + sPN);
        System.out.println("Destination Phone Number: " + dPN);
        System.out.println("Total Duration of Current Call (in seconds): " + durationCurentCall);
        System.out.println("Total Duration of All Calls (in seconds): " + durationAllCalls);
        System.out.println("Current Call Price: $" + cCallPrice);
        System.out.println("Total Price of All Calls: $" + tPriceOfAllCalls);
    }
}



