package Ch05.Projects.fivePP04;

public class Team{
    public String nameTeam;
    public String name1;
    public String name2;
    public String name3;
    public String name4;
    public competition competiton1;
    public competition competition2;
    public Team(String intNameTeam, String intName1, String intName2, String intName3, String intName4,
                competition intCompetition1, competition intCompetition2) {
        nameTeam = intNameTeam;
        name1 = intName1;
        name2 = intName2;
        name3 = intName3;
        name4 = intName4;
        competiton1 = intCompetition1;
        competition2 = intCompetition2;
    }
    public String getNameTeam() {
        return nameTeam;
    }

    public String getName1() {
        return name1;
    }

    public String getName2() {
        return name2;
    }

    public String getName3() {
        return name3;
    }

    public String getName4() {
        return name4;
    }

    public competition getCompetition1() {
        return competiton1;
    }

    public competition getCompetition2() {
        return competition2;
    }
    public void displayTeam() {
        System.out.println("Team: " + nameTeam);
        System.out.println("Team Members:");
        System.out.println("- " + name1);
        System.out.println("- " + name2);
        System.out.println("- " + name3);
        System.out.println("- " + name4);
        System.out.println("Competition 1:");
        competiton1.displayCompetition();
        System.out.println("Competition 2:");
        competition2.displayCompetition();
    }

}

