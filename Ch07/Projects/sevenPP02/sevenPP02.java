public class sevenPP01 {
    public static void main(String[] args) {
        // Creating student objects
        Student student1 = new Student("John", "Doe", 12345, "Computer Science", "Mr. Smith");
        Student student2 = new Student("Jane", "Smith", 54321, "Mathematics", "Ms. Johnson");

        // Creating teacher objects
        Teacher teacher1 = new Teacher("Mr.", "Brown", "Physics", 60000);
        Teacher teacher2 = new Teacher("Dr.", "White", "Biology", 75000);

        // Display details for students
        student1.displayDetails();
        System.out.println(); // Blank line for separation
        student2.displayDetails();
        System.out.println(); // Blank line for separation

        // Display details for teachers
        teacher1.displayDetails();
        System.out.println(); // Blank line for separation
        teacher2.displayDetails();
    }
}
