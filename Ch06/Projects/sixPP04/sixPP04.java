public class sixPP04{
  public static void main(String[] args) {
    int[] marks = {10, -15, 25, 102, 30};
    Student student = new Student("Boba Yu", 88888, marks);
  
    System.out.println("Before validation:");
    student.printStudentDetails();
  
    student.validateMarks();
  
    System.out.println("After validation:");
    student.printStudentDetails();
  }
}
