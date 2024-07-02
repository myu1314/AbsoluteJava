import java.util.Arrays;

public class sixPP05 {
    public static void main(String[] args) {
        int[] array1 = {-22, -22, -22, -22, -22, -22, -22, -22, -1, -1, 1, 1, 1, 1, 1};
        int[] array2 = {1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, -22, 4, 4};

        int[] mergedArray = new int[array1.length + array2.length];
        for(int i = 0; i <= array1.length - 1; i++){
          mergedArray[i] = array1[i];
        }
        for(int i = 0; i <= array2.length - 1; i++){
          mergedArray[array1.length + i] = array2[i];
        }

        Arrays.sort(mergedArray);

        System.out.println("Sorted merged array: " + Arrays.toString(mergedArray));

        // Find unique elements and their counts
        int[] uniqueElements = new int[mergedArray.length];
        int[] counts = new int[mergedArray.length];
        int uniqueCount = 0;

        uniqueElements[0] = mergedArray[0];
        counts[0] = 1;
        uniqueCount = 1;

        for (int i = 1; i < mergedArray.length; i++) {
            if (mergedArray[i] == uniqueElements[uniqueCount - 1]) {
                counts[uniqueCount - 1]++;
            } else {
                uniqueElements[uniqueCount] = mergedArray[i];
                counts[uniqueCount] = 1;
                uniqueCount++;
            }
        }

        // Output the results
        System.out.println("N Count");
        for (int i = 0; i < uniqueCount; i++) {
            System.out.println(uniqueElements[i] + " " + counts[i]);
        }
    }
}