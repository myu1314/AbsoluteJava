package Ch04.Projects.fourPP05;

import java.util.Scanner;

public class WordCount {  
    private int wordCount;
    private String word;

    public WordCount(int wordCount,
            String word) {
        setVariables(wordCount,word);

    }

    public void setVariables(int wordCount1, String word1) {
        wordCount = wordCount1;
        word = word1;
    }
    public int getWordCount() {
        return wordCount;
    }


    public void aDetection() {
        String letter = (word.substring(0,1)).toLowerCase();
        
        if (letter.equals("a")){
            if(wordCount > 0){
                wordCount-=1;
            }
        }
    }
    public void set0() {
        wordCount = 0;
    }
}
