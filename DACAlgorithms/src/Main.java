import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        //Integer[] arr = {110,0};
        System.out.println(Integer.MIN_VALUE);
        int[] arr = {365,5161,17,1699,432,725,70};
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };

        //Sorting.mergeSort(arr,comparator);
        Sorting.lsdRadixSort(arr,4);
        for(int i=0;i<arr.length;i++)
            System.out.printf(arr[i]+" ");
        System.out.println();
    }

}