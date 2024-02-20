package Ch04.Projects.fourPP09;

import java.util.Scanner;

public class animalSpecies{

    private String speciesName;
    private double population;
    private double growthRate;

    public animalSpecies()
    {
        speciesName = "homosapien";
        population = 1000;
        growthRate = 1.1; 
    }
    public animalSpecies(String spiecesNameChange, double populationChange, double growthRateChange) {
        setSpeciesName(spiecesNameChange);
        setPopulation(populationChange);
        setGrowthRate(growthRateChange);

    }
    public String toString(){
        return (speciesName + ' ' + population + + ' ' + growthRate);
    }
    public boolean equals(animalSpecies newSpecies){
        return (speciesName.equals(newSpecies.speciesName) && (newSpecies.population == population) && (newSpecies.growthRate == growthRate));
    }
    public void setSpeciesName(String speciesNameChange){
        speciesName = speciesNameChange;
    }
    public void setPopulation(double populationChange){
        population = populationChange;
    }
    public void setGrowthRate(double growthRateChange){
        growthRate = growthRateChange;
    }
    public String getSpeciesName(){
        return speciesName;
    }
    public double getPopulation(){
        return population;
    }
    public double getGrowthRate(){
        return growthRate;
    }
    public boolean endangered(){
        if (growthRate < 0){
            return true;
        }
        else{
            return false;
        }
    }

}