package problem4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//An example solution
public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Double> mergedArray = mergeLists(arrayToList(nums1), arrayToList(nums2));
        Collections.sort(mergedArray);
        if (mergedArray.size() % 2 == 0) {
            return (mergedArray.get(mergedArray.size()/2) + mergedArray.get(mergedArray.size()/2 - 1 ))/2;
        }
        return mergedArray.get((int) Math.ceil(mergedArray.size()/2));
    }


    private static List<Double> arrayToList(int[] array) {
        List<Double> list = new ArrayList<>();
        for (double element : array) {
            list.add(element);
        }
        return list;
    }

    private static List<Double> mergeLists(List<Double> list1, List<Double> list2) {
        List<Double> mergedList = new ArrayList<>(list1);
        mergedList.addAll(list2);
        return mergedList;
    }
}
