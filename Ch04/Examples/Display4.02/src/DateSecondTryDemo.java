public class DateSecondTryDemo {
    public static void main(String[] args) throws Exception {
        DateSecondTry date1, date2;
        date1 = new DateSecondry();
        date2 = new DateSecondTry();
        date1.month = "December";
        date1.day = 31;
        date1.year = 2012;
        System.out.println("date1:");
        date1.writeOutput();

        date2.month = "July";
        date2.day = 4;
        date2.year = 1776;
        System.out.println("date2:");
        date2.writeOutput();
    }
}
