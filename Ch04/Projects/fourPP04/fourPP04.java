package Ch04.Projects.fourPP04;

public class fourPP04 {
    public static void main(String[] args) throws Exception {
        
        Journal journal1;
        DateFirstTry date;
        date = new DateFirstTry();
        date.month = "December";
        date.day = 31;
        date.year = 2012;

        journal1 = new Journal("Shakespeare", "Macbeth", date);
        journal1.displayDetails();
        System.out.println(journal1.getSubmissionPaper());
       
    }
}