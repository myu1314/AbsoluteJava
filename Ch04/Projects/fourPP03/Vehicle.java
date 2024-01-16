package Ch04.Projects.fourPP03;

public class Vehicle {
    public int tankSize;
    public int fuelInTank = 0;
    public int initEfficeny;
    public Vehicle(){
        tankSize = 100;
        fuelInTank = 0;
        initEfficeny = 10;
    }
    public void setVariables(int tankSize, int fuelInTank, int initEfficeny) {
        tankSize = tankSize;
        fuelInTank = fuelInTank;
        initEfficeny = initEfficeny;
    }
    public int getTankSize() {
        return tankSize;
    }
    public int getFuelInTank() {
        return fuelInTank;
    }
    public int getInitEfficeny() {
        return initEfficeny;
    }

    public void addPetrol() {
        int addPetrol = tankSize - fuelInTank;
        System.out.println("Adding " + addPetrol + " gallons of petrol");
        fuelInTank = tankSize;
    }
    public void distanceLeft(){
        int distance = fuelInTank * initEfficeny;
    }

    
}
