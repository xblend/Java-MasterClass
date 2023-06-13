import java.util.*;

/**
 * Your implementation of various divide & conquer sorting algorithms.
 */

public class Sorting {

    /**
     * Implement merge sort.
     *
     * It should be:
     * out-of-place
     * stable
     * not adaptive
     *
     * Have a worst case running time of: O(n log n)
     * And a best case running time of: O(n log n)
     *
     * You can create more arrays to run merge sort, but at the end, everything
     * should be merged back into the original T[] which was passed in.
     *
     * When splitting the array, if there is an odd number of elements, put the
     * extra data on the right side.
     *
     * Hint: You may need to create a helper method that merges two arrays
     * back into the original T[] array. If two data are equal when merging,
     * think about which subarray you should pull from first.
     *
     * You may assume that the passed in array and comparator are both valid
     * and will not be null.
     *
     * @param <T>        Data type to sort.
     * @param arr        The array to be sorted.
     * @param comparator The Comparator used to compare the data in arr.
     */
    /*
    public static <T> void mergeSort(T[] arr, Comparator<T> comparator) {
        if(arr.length<=1)
            return;
        int mid = arr.length/2;
        T[] left_array = (T[]) new Object[mid];
        T[] right_array = (T[]) new Object[arr.length-mid];
        for(int index=0;index<left_array.length;index++)
            left_array[index] = arr[index];
        for(int index=0;index<right_array.length;index++)
            right_array[index] = arr[mid+index];
        mergeSort(left_array,comparator);
        mergeSort(right_array,comparator);
        int i=0,j=0;
        while(i<left_array.length && j<right_array.length) {
            if (comparator.compare(left_array[i], right_array[j]) <= 0) {
                arr[i + j] = left_array[i];
                i++;
            } else{
                arr[i+j] = right_array[j];
                j++;
            }
        }
        while (i<left_array.length){
            arr[i+j] = left_array[i];
            i++;
        }
        while (j<right_array.length){
            arr[i+j] = right_array[j];
            j++;
        }

    }
    */
    /**
     * Implement merge sort.
     *
     * It should be: out-of-place stable not adaptive
     *
     * Have a worst case running time of: O(n log n) And a best case running time
     * of: O(n log n)
     *
     * You can create more arrays to run merge sort, but at the end, everything
     * should be merged back into the original T[] which was passed in.
     *
     * When splitting the array, if there is an odd number of elements, put the
     * extra data on the right side.
     *
     * Hint: You may need to create a helper method that merges two arrays back into
     * the original T[] array. If two data are equal when merging, think about which
     * subarray you should pull from first.
     *
     * You may assume that the passed in array and comparator are both valid and
     * will not be null.
     *
     * @param <T>        Data type to sort.
     * @param arr        The array to be sorted.
     * @param comparator The Comparator used to compare the data in arr.
     */
    public static <T> void mergeSort(T[] arr, Comparator<T> comparator) {
        if(arr.length<2)
            return;
        int mid = arr.length/2;
        T[] left_arr = (T[]) new Object[mid];
        T[] right_arr = (T[]) new Object[arr.length-mid];
        for(int i=0;i<left_arr.length;i++)
            left_arr[i] = arr[i];
        for(int i=0;i<right_arr.length;i++)
            right_arr[i] = arr[mid+i];
        mergeSort(left_arr,comparator);
        mergeSort(right_arr,comparator);
        int i=0,j=0;
        while(i<left_arr.length && j<right_arr.length){
            if(comparator.compare(left_arr[i],right_arr[j])<=0){
                arr[i+j] = left_arr[i];
                i++;
            }
            else{
                arr[i+j] = right_arr[j];
                j++;
            }
        }
        while(i< left_arr.length){
            arr[i+j] = left_arr[i];
            i++;
        }
        while(j< right_arr.length){
            arr[i+j] = right_arr[j];
            j++;
        }

    }
    /**
     * Implement LSD (least significant digit) radix sort.
     *
     * It should be:
     * out-of-place
     * stable
     * not adaptive
     *
     * Have a worst case running time of: O(kn)
     * And a best case running time of: O(kn)
     *
     * Feel free to make an initial O(n) passthrough of the array to
     * determine k, the number of iterations you need.
     *
     * At no point should you find yourself needing a way to exponentiate a
     * number; any such method would be non-O(1). Think about how how you can
     * get each power of BASE naturally and efficiently as the algorithm
     * progresses through each digit.
     *
     * You may use an ArrayList or LinkedList if you wish, but it should only
     * be used inside radix sort and any radix sort helpers. Do NOT use these
     * classes with merge sort. However, be sure the List implementation you
     * choose allows for stability while being as efficient as possible.
     *
     * Do NOT use anything from the Math class except Math.abs().
     *
     * You may assume that the passed in array is valid and will not be null.
     *
     * @param arr The array to be sorted.
     */
    /*public static void lsdRadixSort(int[] arr) {
        // WRITE YOUR CODE HERE (DO NOT MODIFY METHOD HEADER)!
        if (arr.length==0)
            return;
        int max = 0;
        if(arr[0]==Integer.MIN_VALUE)
            max = Integer.MAX_VALUE;
        else
            max = Math.abs(arr[0]);
        LinkedList<Integer>[] list = new LinkedList[19];
        for(int j=0;j<19;j++)
            list[j] = new LinkedList<>();
        for(int i=1; i<arr.length;i++) {
            if (arr[i] == Integer.MIN_VALUE) {
                max = Integer.MAX_VALUE;
                break;
            }
            if (Math.abs(arr[i]) > max)
                max = Math.abs(arr[i]);
        }
        int n = 1;
        while(max!=0){
            for(int i=0;i<arr.length;i++) {
                int index = (arr[i]/n)%10+9;
                list[index].add(arr[i]);
            }
            int k=0;
            for(int j=0;j<19;j++)
                while(!list[j].isEmpty()){
                    arr[k] = list[j].removeFirst();
                    k++;
                }
            n*=10;
            max/=10;
        }
    }*/
    /**
     * Implement LSD (least significant digit) radix sort.
     *
     * It should be: out-of-place stable not adaptive
     *
     * Have a worst case running time of: O(kn) And a best case running time of:
     * O(kn)
     *
     * For this question, you are given k: the number of digits in the greatest
     * magnitude number in arr. Because of this, you do not need to make an initial
     * O(n) pass through to determine this number.
     *
     * At no point should you find yourself needing a way to exponentiate a number;
     * any such method would be non-O(1). Think about how how you can get each power
     * of BASE naturally and efficiently as the algorithm progresses through each
     * digit.
     *
     * You may use an ArrayList or LinkedList if you wish. Be sure the List
     * implementation you choose allows for stability while being as efficient as
     * possible.
     *
     * Do NOT use anything from the Math class except Math.abs().
     *
     * You may assume that the passed in array is valid and will not be null.
     *
     * @param arr The array to be sorted.
     * @param k   The number of digits in the greatest magnitude number in arr.
     */
    public static void lsdRadixSort(int[] arr, int k) {
        // WRITE YOUR CODE HERE (DO NOT MODIFY METHOD HEADER)!
        if (arr.length==0)
            return;
        LinkedList<Integer>[] list = new LinkedList[19];
        for(int j=0;j<19;j++)
            list[j] = new LinkedList<>();
        int n = 1;
        for(int d=0;d<k;d++){
            for(int i=0;i<arr.length;i++) {
                int index = (arr[i]/n)%10+9;
                list[index].add(arr[i]);
            }
            int s=0;
            for(int j=0;j<19;j++)
                while(!list[j].isEmpty()){
                    arr[s] = list[j].removeFirst();
                    s++;
                }
            for(int i=0;i<arr.length;i++)
                System.out.printf(arr[i]+" ");
            System.out.println();
            n*=10;
        }
    }
}