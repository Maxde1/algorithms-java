package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class QuickSort {
    //This cool thing,heheehehe
    public static ArrayList<Integer> quickSort(ArrayList<Integer> arr){
        if (arr.size()< 2){
            return arr;
        }
        ArrayList<Integer> pivot = new ArrayList<>(Arrays.asList(arr.get(0)));
        ArrayList<Integer> less = arr.stream()
                .filter(x -> x < pivot.get(0))
                .collect(Collectors.toCollection(ArrayList::new));
        ArrayList<Integer> bigger = arr.stream()
                .filter(x -> x > pivot.get(0))
                .collect(Collectors.toCollection(ArrayList::new));
        return new ArrayList<Integer>(Stream.of(quickSort(less), pivot, quickSort(bigger))
                .flatMap(x -> x.stream())
                .collect(Collectors.toList()));
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(234, 325,1213, 1241255,11, 56));
        System.out.println(quickSort(arr));
    }
}
