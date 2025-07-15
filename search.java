import java.util.*;
public class search {

    public static int runBinarySearchRecursively(int[] sortedArray, int key, int low, int high) {
    int middle = low  + ((high - low) / 2);
        
    if (high < low) {
        return -1;
    }

    if (key == sortedArray[middle]) {
        return middle;
    } else if (key < sortedArray[middle]) {
        return runBinarySearchRecursively(
          sortedArray, key, low, middle - 1);
    } else {
        return runBinarySearchRecursively(
          sortedArray, key, middle + 1, high);
    }
    }

    public static void main(String args[])
    {
        

        int sortedArray[] = { 2, 3, 4, 10, 40 };
        int high = sortedArray.length;
        int key = 10;
        int low =0;
        System.out.println( runBinarySearchRecursively(sortedArray,key, low, high));
      
    
}
}
