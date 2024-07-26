class Teacher extends Person {
    private String subjectName;
    private double salary;

    public Teacher(String firstName, String lastName, String subjectName, double salary) {
        super(firstName, lastName);
        this.subjectName = subjectName;
        this.salary = salary;
    }

    // Method to display teacher details
    @Override
    public void displayDetails() {
        super.displayDetails(); // Call to parent's displayDetails method
        System.out.println("Teacher Details:");
        System.out.println("Subject: " + subjectName);
        System.out.println("Salary: $" + salary);
    }
}
