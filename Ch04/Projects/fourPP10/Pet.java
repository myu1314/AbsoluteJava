/**
 * 2 Class for basic pet records: name, age, and weight.
 * 3
 */
public class Pet {
    private String name;
    private int age; // in years
    private double weight; // in pounds
    private String typeOfPet; // cat or dog

    public String toString() {
        return ("Name: " + name + " Age: " + age + " years"
                + "\nWeight: " + weight + " pounds" + "Species: " + typeOfPet + ".");
    }

    public Pet(String initialName, int initialAge,
            double initialWeight, String initalTypeOfPet) {
        name = initialName;
        typeOfPet = initalTypeOfPet;
        if ((initialAge < 0) || (initialWeight < 0)) {
            System.out.println("Error: Negative age or weight.");
            System.exit(0);
        } else {
            age = initialAge;
            weight = initialWeight;
        }
    }

    public void set(String newName, int newAge, double newWeight,String initalTypeOfPet) {
        name = newName;
        typeOfPet = initalTypeOfPet;
        if ((newAge < 0) || (newWeight < 0)) {
            System.out.println("Error: Negative age or weight.");
            System.exit(0);
        } else {
            age = newAge;
            weight = newWeight;
        }
    }

    public Pet(String initialName) {
        name = initialName;
        age = 0;
        weight = 0;
    }

    public void setName(String newName) {
        name = newName;
    }

    public Pet(int initialAge) {
        name = "No name yet.";
        weight = 0;
        if (initialAge < 0) {
            System.out.println("Error: Negative age.");
            System.exit(0);
        } else
            age = initialAge;
    }

    public void setAge(int newAge) {
        if (newAge < 0) {
            System.out.println("Error: Negative age.");
            System.exit(0);
        } else
            age = newAge;
    }

    public Pet(double initialWeight) {
        name = "No name yet";
        age = 0;
        if (initialWeight < 0) {
            System.out.println("Error: Negative weight.");
            System.exit(0);
        } else
            weight = initialWeight;
    }

    public void setWeight(double newWeight) {
        if (newWeight < 0) {
            System.out.println("Error: Negative weight.");
            System.exit(0);
        } else
            weight = newWeight;
    }

    public Pet() {
        name = "No name yet.";
        age = 0;
        weight = 0;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public double acepromazine(){
        if (typeOfPet.equals("cat")){
            return (weight/2.2 * 0.002/10);
        }if (typeOfPet.equals("dog")){
            return (weight/2.2 * 0.03/10);
        }
        else{
            return 0;
        }
    }
    public double carprofen(){
        if (typeOfPet.equals("cat")){
            return (weight/2.2 * 0.25/12);
        }if (typeOfPet.equals("dog")){
            return (weight/2.2 * 0.5/12);
        }
        else{
            return 0;
        }
    }

}