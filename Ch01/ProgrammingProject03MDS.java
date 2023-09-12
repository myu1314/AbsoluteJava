/*
    Author: Mark Yu
    Last Updated: 8/25/2023
    Description: Pig latin
  
  
*/
public class ProgrammingProject03MDS {
    public static void main(String[] args) throws Exception {
        String first = "MICHEAL";
        String last = "SIMON";

        first = first.substring(1,2).toUpperCase() +
                first.substring(2).toLowerCase() +
                first.substring(0,1).toLowerCase() +
                "ay";
        last = last.substring(1,2).toUpperCase() +
                last.substring(2).toLowerCase() +
                last.substring(0,1).toLowerCase() +
                "ay";

        System.out.println(first + " " + last);
    }
}

/*
 * ****************************OUTPUT**************************************
 * Altway Avitchsay
 */