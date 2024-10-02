import java.util.*;

public class Quicksort {
    static void qs(List<Integer> arr, int l, int h) {
        if (l < h) 
        {
            int PI = partition(arr, l, h);
            qs(arr, l, PI - 1);
            qs(arr, PI + 1, h);
        }
    }
    static int partition(List<Integer> arr, int l, int h)
    {
        int pivot=arr.get(l);
        int i=l;
        int j=h;
        while (i<j) {
            while (arr.get(i)<=pivot && i<=h) {
                i++;
            }
            while (arr.get(j)>=pivot && j>=l) {
                j--;
            }
            if (i<j) {
                int temp = arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j, temp);
            }
        }
        int temp = arr.get(l);
        arr.set(l, arr.get(j));
        arr.set(j, temp);
        return j;
    }
}
