public class sixPP09 {
  public static void main(String[] args) {
      PartiallyFilledArray array1 = new PartiallyFilledArray(5);
      for (int i = 0; i < 10; i++) {
          array1.add(i + 1);
          System.out.println("Added element: " + (i + 1));
          System.out.println("Current number of elements: " + array1.getNumberOfElements());
          System.out.println("Current max capacity: " + array1.getMaxCapacity());
      }

      for (int i = 0; i < array1.getNumberOfElements(); i++) {
          System.out.println("Element at index " + i + ": " + array1.getElement(i));
      }
  }
}