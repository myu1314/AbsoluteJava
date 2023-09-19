/*
    Author: Mark Yu
    Last Updated: 8/28/2023
    Description: Changes hate to love
  
  
*/
public class onePP05 {
    public static void main(String[] args) throws Exception {
        String text = "I hate you.";
        System.out.println("The line of text to be changed is:\n" + text);
        int index = text.indexOf("hate", 0);
        System.out.println("I have rephrased that line to read:\n"+text.substring(0, index) + "love" + text.substring(index+4));
    }
}
/*
 * ****************************OUTPUT**************************************
 * The line of text to be changed is:
*  I hate you.
*  I have rephrased that line to read:
*  I love you.
 */