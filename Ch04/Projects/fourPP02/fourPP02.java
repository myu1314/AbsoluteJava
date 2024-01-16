package Ch04.Projects.fourPP02;

public class fourPP02 {
    public static void main(String[] args) throws Exception {
        clacAge date1;
        date1 = new clacAge();

        date1.setBirthdayDate("Janurary", 20, 2000);
        date1.setCurrentDate("Janurary", 1, 2020);
        date1.findBirthdayDifferenceExact();
        
       
    }
}