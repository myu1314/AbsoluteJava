class Student extends Person {
    private int studentId;
    private String course;
    private String teacherName;

    public Student(String firstName, String lastName, int studentId, String course, String teacherName) {
        super(firstName, lastName);
        this.studentId = studentId;
        this.course = course;
        this.teacherName = teacherName;
    }

    // Method to display student details
    @Override
    public void displayDetails() {
        super.displayDetails(); // Call to parent's displayDetails method
        System.out.println("Student Details:");
        System.out.println("Student ID: " + studentId);
        System.out.println("Course: " + course);
        System.out.println("Teacher: " + teacherName);
    }
}
