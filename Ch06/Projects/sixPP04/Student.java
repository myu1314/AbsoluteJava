public class Student {
  private String studentName;
  private int studentID;
  private int[] marks;


  public Student(String studentName, int studentID, int[] marks) {
      this.studentName = studentName;
      this.studentID = studentID;
      this.marks = marks;
  }


  public void validateMarks() {
      int[] validMarks = new int[marks.length];
      int validCount = 0;

      for (int mark : marks) {
          if (mark >= 0 && mark <= 100) {
              validMarks[validCount] = mark;
              validCount++;
          }
      }


      for (int i = 0; i < marks.length; i++) {
          if (i < validCount) {
              marks[i] = validMarks[i];
          } else {
              marks[i] = -1; 
          }
      }
  }


  public void printStudentDetails() {
      System.out.println("Student Name: " + studentName);
      System.out.println("Student ID: " + studentID);
      System.out.print("Marks: ");
      for (int mark : marks) {
          if (mark != -1) {
              System.out.print(mark + " ");
          } else {
              System.out.print("N/A ");
          }
      }
      System.out.println();
  }
}