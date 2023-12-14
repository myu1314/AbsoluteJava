public class DateFirstTry {
    public String month;
    public int day;
    public int year;
    
    public void writeOutput(){
        System.out.println(month + " " + day + ", " + year);
    }

    public void writeOutput(int f){
        System.out.printf("%s %d, %d",month,day,year);
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getDay() {
        return day;
    }
}
