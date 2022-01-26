package binary_search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class BinarySearch {
    public static int find(int[] arr, int searchElement)  {
        int start = 0;
        int end = arr.length-1;
        int middle = 0;
        while (start <= end){
            middle = (start+end)/2;

            if (arr[middle] == searchElement) return middle;
            else if (arr[middle] > searchElement) end = middle-1;
            else if (arr[middle] < searchElement) start = middle+1;
        }
        return -1;
//        throw new Exception("Element not found");
    }

    public static void main(String[] args) {
        int [] arr = new int[]{1, 2, 3, 4, 5};
        //System.out.println(find(arr, 6));

    }

}
