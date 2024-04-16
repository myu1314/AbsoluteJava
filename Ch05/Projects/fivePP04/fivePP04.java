package Ch05.Projects.fivePP04;
import java.util.Scanner;
public class fivePP04 {
    public static void main(String[] args) throws Exception {
        competition competition1 = new competition("Running", "Texas A&M", "ASU", 2023);
        competition competition2 = new competition("Basketball", "Bulls", "Wizards", 2024);
        Team ogTeam = new Team("home", "Micheal", "Larry", "Kobe", "Shaq", competition1, competition2);
        ogTeam.displayTeam();
        Team awayTeam = new Team("away", "John", "Adam", "Taylor", "Quinn", competition1, competition2);
        awayTeam.getCompetition1().setYear(2025);
        awayTeam.getCompetition1().setWinningTeam("home");
        System.out.println("\nOriginal Team:");
        ogTeam.displayTeam();
        System.out.println("\nCopied Team:");
        awayTeam.displayTeam();
    }
}