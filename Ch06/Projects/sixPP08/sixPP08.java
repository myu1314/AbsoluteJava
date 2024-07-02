import java.util.Scanner;

public class sixPP08 {
    public static void main(String[] args) {
      int[] arrayToSort = {1,3,2,4,5,6,1,8,912039,120391,-111,123};
      int[] sortedArray = new int[arrayToSort.length];
      int holderValue;
      for(int i = 0; i < arrayToSort.length;i++){
        sortedArray[i] = arrayToSort[i];
      }
      while(arraySorted(sortedArray) == false){
        for(int i = 0; i < (sortedArray.length-1); i++){
            if(sortedArray[i] > sortedArray[i+1]){
                holderValue = sortedArray[i];
                sortedArray[i] = sortedArray[i+1];
                sortedArray[i+1] = holderValue;
            }
          }
      }
    System.out.print("Sorted Array: [");
      for(int i = 0; i < sortedArray.length - 1; i++){
        System.out.print(sortedArray[i] + ",");
      }
      System.out.print(sortedArray[sortedArray.length-1]);
      System.out.print("]");
    }
    public static boolean arraySorted(int[] arrayToSort){
        boolean result = true;
        for(int i = 0; i < arrayToSort.length; i++){
            for(int j = 0; j < i; j++){
                if(arrayToSort[j] > arrayToSort[i]){
                    result = false;
                    break;
                }
            }
        }
        return result;

    }
} 