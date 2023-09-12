/*
    Author: Mark Yu
    Last Updated: 9/4/2023
    Description: Changes seconds into days, hours, minutes, and reamaining seconds. 
  
  
*/
public class ProgrammingProject07 {
    public static void main(String[] args) throws Exception {
        final int SECONDS = 50391;
        int days = SECONDS/(24 * 60 * 60);
        int remaningSeconds = SECONDS%(24*60*60);
        int hours = remaningSeconds/(60 * 60);
        remaningSeconds = SECONDS%(60*60);
        int minutes = remaningSeconds/60;
        remaningSeconds= SECONDS%60;
        int seconds = remaningSeconds;
        System.out.println(SECONDS + " seconds is equivalent to " + days + " days, " + hours + " hours, " + minutes + " minutes, " + "and "
        + seconds + " seconds.");
    }
}
/*
 * ****************************OUTPUT**************************************
 * 50391 seconds is equivalent to 0 days, 13 hours, 59 minutes, and 51 seconds.
 */