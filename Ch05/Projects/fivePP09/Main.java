package Ch05.Projects.fivePP09;

public class Main {
    public static void main(String[] args) {
        // Create birth and death dates
        Date birthDate = new Date(10, 5, 1990);
        Date deathDate = new Date(1, 1, 2091);

        // Create a Person object
        Person person1 = new Person("John Doe", birthDate, deathDate);

        // Test toString() method
        System.out.println("Person 1: " + person1);

        // Test equals() method
        Person person2 = new Person("Jane Doe", birthDate, deathDate);
        System.out.println("Are person1 and person2 equal? " + person1.equals(person2));

        // Test setting birth and death dates
        Date newBirthDate = new Date(1, 1, 1995);
        person1.setBirthDate(newBirthDate);
        System.out.println("Updated birth date of person1: " + person1.getBirthDate());

        Date newDeathDate = new Date(12, 31, 2105);
        person1.setDeathDate(newDeathDate);
        System.out.println("Updated death date of person1: " + person1.getDeathDate());
    }
}