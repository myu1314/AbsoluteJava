package Ch04.Projects.fourPP07;

public class fourPP07 {
    public static void main(String[] args) throws Exception {
        
        Temperature temp = new Temperature(100,"C");
        Temperature temp2;
        temp= new Temperature(100,"C");
        temp2= new Temperature(100,"C");
        temp.convertToFarenheight();
        temp2.convertToFarenheight();
        temp.printDetails();
        temp.compareTo(3,"C");
        System.out.println(temp);
        System.out.println(temp2);
        temp.compareTo(temp2);
    }
}