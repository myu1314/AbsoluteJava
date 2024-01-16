package Ch04.Projects.fourPP01;

public class PrintCodeword {
    public String startingLetter;
    public int numberValue;
    
    public void writeOutput(){
        String alphabet[] = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        int startinLetterPos = 0;
        int valuePrintOut = numberValue;
        int alphabetCounter = 0; 
        for (int i = 0; i<=25; i++){
            if (alphabet[i] == startingLetter ){
                startinLetterPos = i;
            }

        }
        for (int i = 0; i <= 26; i++){
            if (valuePrintOut == 10){
                valuePrintOut = 0;
           }
           if (alphabet[i+startinLetterPos] == "Z"){
                alphabetCounter = -startinLetterPos;
           }
           System.out.println(alphabet[alphabetCounter+startinLetterPos] + (valuePrintOut));  
           valuePrintOut += 1;
           alphabetCounter += 1;  
        }
        
    }
}

