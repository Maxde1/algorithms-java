package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Factorial {
    public static int findFactorial(int n){
        if (n < 1) return 1;
        return n*findFactorial(n-1);
    }
    // Function that sum all number in array using recursion instead loop
    public static int sum(ArrayList<Integer> arr){
        if (arr.isEmpty()) return 0;
        int current = arr.get(0);
        arr.remove(0);
        return current+sum(arr);
    }
    public static int sizeOfList(ArrayList<Integer> arr){
        if (arr.isEmpty()) return 0;
        arr.remove(0);
        return 1+sizeOfList(arr);
    }
//    public static int max(ArrayList<Integer> arr){
//        if (arr.isEmpty()) return 0;
//    }

    //binary search use recursive instead loop
    public static int recursiveBinarySearch(int[] arr, int min, int max, int searchElement) throws Exception {
        if (min > max) throw new Exception("Not found");
        int midde = (min+max)/2;
        if (arr[midde] == searchElement) return midde;
        else if (arr[midde] < searchElement) return recursiveBinarySearch(arr, midde+1, max, searchElement);
        else return recursiveBinarySearch(arr, min, midde-1, searchElement);
    }

    public static void main(String[] args) {
        //System.out.println(findFactorial(5));
        //System.out.println(sum(new ArrayList<>(Arrays.asList(1, 2,3))));
        int[] arr = {1, 2, 3, 4, 5};
        try {
            System.out.println(recursiveBinarySearch(arr, 0, arr.length-1, 1));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
