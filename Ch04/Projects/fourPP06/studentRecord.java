package Ch04.Projects.fourPP06;

import java.util.Scanner;

public class studentRecord {
    private int grade1quiz;
    private int grade2quiz;
    private int grade3quiz;
    private int gradeMidterm;
    private int gradeFinal;
    private double finalGrade;
    private String letterGrade;

    public studentRecord(int grade1quiz, int grade2quiz, int grade3quiz, int gradeMidterm, int gradeFinal,
            double finalGrade, String letterGrade) {
        setVariables(grade1quiz,grade2quiz,grade3quiz,gradeMidterm,gradeFinal, finalGrade,letterGrade);

    }

    public void setVariables(int grade1quizInput,int grade2quizInput,int grade3quizInput,int gradeMidtermInput,int gradeFinalInput, double finalGradeInput, String letterGradeInput) {
        grade1quiz = grade1quizInput;
        grade2quiz = grade2quizInput;
        grade3quiz = grade3quizInput;
        gradeMidterm = gradeMidtermInput;
        gradeFinal = gradeFinalInput;
        finalGrade = finalGradeInput;
        letterGrade = letterGradeInput;
    }

    public String convertToLetter() {
        if (finalGrade >= 90){
            letterGrade = "A";
        }
        else if((finalGrade < 90) && (finalGrade >= 80)){
            letterGrade = "B";
        }
        else if((finalGrade < 80) && (finalGrade >= 70)){
            letterGrade = "C";
        }
        else if((finalGrade < 70) && (finalGrade >= 60)){
            letterGrade = "D";
        }
        else if(finalGrade < 60){
            letterGrade = "F";
        }
        return letterGrade;
    }

    public double calculateFinalGrade() {
        double finalGradeQuiz = (grade1quiz + grade2quiz + grade3quiz) * 0.25;
        double finalGradeMidterm = gradeMidterm * 0.35;
        double finalGradeFinal = gradeFinal * 0.45;
        double points = (finalGradeFinal + finalGradeMidterm + finalGradeQuiz);
        finalGrade = (finalGradeFinal + finalGradeMidterm + finalGradeQuiz)/(7.5 + 35 + 45) * 100;
        return points;
    }

    public void printStudentRecord() {
        double totalPoints = calculateFinalGrade();
        String letter = convertToLetter();

        
        double totalPointsQuiz = 10;
        System.out.println("Your Report:");
        System.out.println("===========================================================");
        System.out.printf("%-30s%-10s|%-10s\n","Exersise","Score","Total Possible");
        System.out.printf("%-30s%-10d|%-10.0f \n","Quiz 1:",grade1quiz,10.0);
        System.out.printf("%-30s%-10d|%-10.0f \n","Quiz 2:",grade2quiz,10.0);
        System.out.printf("%-30s%-10d|%-10.0f \n","Quiz 3:",grade3quiz,10.0);
        System.out.printf("%-30s%-10d|%-10.0f \n","Midterm:",gradeMidterm,100.0);
        System.out.printf("%-30s%-10d|%-10.0f \n","Final:",gradeFinal,100.0);
        System.out.printf("%-30s%-10.0f|%-10.0f\n","Total:", totalPoints, 87.5);
        System.out.printf("Your total is %.2f out of %.2f, or %.2f%% and your letter grade is an %s.\n",totalPoints,87.5,finalGrade,letter);
    }
}
