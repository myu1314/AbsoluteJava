package Ch04.Projects.fourPP05;

public class fourPP05 {
    public static void main(String[] args) throws Exception {
        
        WordCount word;
        word = new WordCount(10,"awesome");
        word.aDetection();
        System.out.println("Current word count:" + word.getWordCount());
        word.set0();
        System.out.println("Current word count:" + word.getWordCount());

       
    }
}