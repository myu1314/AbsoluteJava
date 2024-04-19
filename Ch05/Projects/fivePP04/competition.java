package Ch05.Projects.fivePP04;

public class Competition{
    public String name;
    public String winningteam;
    public String secondPlace;
    public int year;
    
    public Competition(String intName, String intWinningteam, String intSecondPlace, int intYear){
        name = intName;
        winningteam = intWinningteam;
        secondPlace = intSecondPlace;
        year = intYear;
    } 
    public String getName() {
        return name;
    }

    public String getNameOfWinner() {
        return winningteam;
    }

    public String getNameOfRunnerUp() {
        return secondPlace;
    }

    public int getYear() {
        return year;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWinningTeam(String IntWinningteam) {
        winningteam = IntWinningteam;
    }

    public void setNameOfRunnerUp(String intSecondPlace) {
        this.secondPlace = intSecondPlace;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public void displayCompetition() {
        System.out.println("Name: " + name);
        System.out.println("Winner: " + winningteam);
        System.out.println("Second Plce: " + secondPlace);
        System.out.println("Year: " + year);
    }

}

