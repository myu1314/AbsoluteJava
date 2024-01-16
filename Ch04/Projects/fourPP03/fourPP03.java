package Ch04.Projects.fourPP03;

public class fourPP03 {
    public static void main(String[] args) throws Exception {
        Vehicle car;
        car = new Vehicle();

        car.setVariables(100, 0, 20);
        car.distanceLeft();
        car.addPetrol();
        car.getFuelInTank();
        car.getInitEfficeny();
        System.out.println("Init Efficeny: " + car.getInitEfficeny());
        System.out.println("FuelInTank: " + car.getFuelInTank());
        System.out.println("Tank Size: " + car.getTankSize());
        
       
    }
}