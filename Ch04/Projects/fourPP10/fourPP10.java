package Ch04.Projects.fourPP10;

public class fourPP10 {
    public static void main(String[] args) throws Exception {
        
        Pet dog = new Pet("Boba", 2, 11.1, "dog");
        System.out.println("The approprite amount of acepromazine is: " + dog.acepromazine());
        System.out.println("The approprite amount of carpofen is: " + dog.carprofen());
        

       
    }
}