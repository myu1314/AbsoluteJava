/*
    Author: Mark Yu
    Last Updated: 8/25/2023
    Description: Pig latin
  
  
*/
public class onePP03 {
    public static void main(String[] args) throws Exception {
        String first = "walt";
        String last = "savitch";

        first = first.substring(1,2).toUpperCase() +
                first.substring(2) +
                first.substring(0,1) +
                "ay";
        last = last.substring(1,2).toUpperCase() +
                last.substring(2) +
                last.substring(0,1) +
                "ay";

        System.out.println(first + " " + last);
    }
}

/*
 * ****************************OUTPUT**************************************
 * Altway Avitchsay
 */