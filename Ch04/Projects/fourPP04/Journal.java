package Ch04.Projects.fourPP04;

import java.util.Scanner;

public class Journal {  
    private String author;
    private String title;
    private int date;

    public Journal() {
        this("", 20, 1);
    }

    public Vehicle(int tankSize,
            int fuelInTank,
            int initEfficeny) {
        setVariables(tankSize, fuelInTank, initEfficeny);

    }

    public void setVariables(int tankSize, int fuelInTank, int initEfficeny) {
        setTankSize(tankSize);
        // if (tankSize < 0) {
        //     System.out.println("The tankSize is set to negative number. It has been switched to postive. ");
        //     tankSize *= -1;
        // }
        // tankSize = tankSize;
        fuelInTank = fuelInTank;
        initEfficeny = initEfficeny;
    }
    private void setTankSize(int tankSize) {
        // if 
        this.tankSize = tankSize;
    }

    public void setFuelInTank(int fuelInTank) {
        // if check if the value is good, if not do something
        this.fuelInTank = fuelInTank;
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

    public int driveTo() {
        int distance = fuelInTank * initEfficeny;
        return distance;
    }

}
