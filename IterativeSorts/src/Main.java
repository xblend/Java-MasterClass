import java.util.Comparator;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = {5,4,3,2,1,10,9,8,7,6,};
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };
        Sorting.selectionSort(arr,comparator);
        for(int i=0;i<arr.length;i++)
            System.out.printf(arr[i]+" ");
        System.out.println();
    }
}