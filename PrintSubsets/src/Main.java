import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the arrayList: ");
        int size = scanner.nextInt();
        ArrayList<Integer> arrayList = new ArrayList<>(size);
        System.out.println("Enter the values for the elements of the arrayList:");
        for(int i=0; i<size;i++)
            arrayList.add(scanner.nextInt());
        System.out.println(arrayList.toString());
        Solution sol = new Solution();
        System.out.println("The subsets are:");
        sol.printSubsets(arrayList,size-1,new ArrayList<Integer>());
    }
}