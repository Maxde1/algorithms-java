package selection_sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SelectionSort {
    private static Integer findMinElement(List<Integer> list){
        int minElement = list.get(0);
        int minElementIndex = 0;
        for (int i = 0; i < list.size(); i++) {
            if (minElement > list.get(i)) {
                minElement = list.get(i);
                minElementIndex = i;
            }
        }
        return minElementIndex;
    }



    private static Integer findMaxElement(List<Integer> list){
        int maxElement = list.get(0);
        int maxElementIndex= 0;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) > maxElement){
                maxElement = list.get(i);
                maxElementIndex = i;
            }
        }
        return maxElementIndex;
    }
    public static List<Integer> selectionSort(ArrayList<Integer> list){
        List<Integer> mainList = new ArrayList<>(list);
        List<Integer> sortedList = new ArrayList<>();
        int biggerElement;
        for (int i = 0; i < list.size(); i++) {
            biggerElement = findMinElement(mainList);
            sortedList.add(mainList.get(biggerElement));
            mainList.remove(biggerElement);

        }
        return sortedList;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        // Test 1
        System.out.println(selectionSort(new ArrayList<>(Arrays.asList(123, 124,124153, 34324, 1, 4, 9))));
        //System.out.println(findMaxElement(arr));
    }

}
