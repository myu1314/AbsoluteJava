package Ch04.Projects.fourPP01;

public class PrintCodeword {
    public String startingLetter;
    public int numberValue;
    
    public void writeOutput(){
        String alphabet[] = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        int startinLetterPos = 0;
        int valuePrintOut = 0;
        int timesDeleted = 0;
        for (int i = 0; i<=25; i++){
            if (alphabet[i] == startingLetter ){
                startinLetterPos = i;
            }
        }
        for (int num = numberValue; num <= 26; num++){
            valuePrintOut = num;
            if (startinLetterPos > 9){
                timesDeleted += 1;
                valuePrintOut -= (9 * timesDeleted);
            }
            System.out.println(alphabet[valuePrintOut] + valuePrintOut);
            
        }
    }
}

