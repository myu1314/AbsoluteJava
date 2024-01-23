package Ch04.Projects.fourPP04;

import java.sql.Date;
import java.util.Scanner;

public class Journal {  
    private String author;
    private String title;
    private DateFirstTry date;

    public Journal(String author,
            String title,
            DateFirstTry date) {
        setVariables(author, title, date);

    }

    public void setVariables(String author1, String title1, DateFirstTry date) {
        setDate(date);
        author = author1;
        title = title1;
    }
    private void setDate(DateFirstTry date) {
        this.date = date;
    }


    public String getSubmissionPaper() {
        String word;
        String result = "";
        String[] array = title.split(" ");
        for (String wordToChange: array){
            word = (wordToChange.substring(0, 1)).toUpperCase() + (wordToChange.substring(1, wordToChange.length()));
            result += word;
            result += " ";
        }
        return result;

    }

    public void displayDetails() {
        System.out.println("The date "  + title + " was published was");
        date.writeOutput();
    }
}
