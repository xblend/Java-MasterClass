import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        System.out.println("Enter the size of the array list: ");
        size = scanner.nextInt();
        ArrayList<Integer> arrayList = new ArrayList<>(size);
        System.out.println("Enter the values for the elements of the array list:");
        for(int i=0;i<size;i++)
            arrayList.add(scanner.nextInt());
        System.out.println(arrayList.toString());
        System.out.println("Enter the target sum:");
        int targetSum = scanner.nextInt();
        Solution sol = new Solution();
        ArrayList<Integer> subSet=new ArrayList<>();
        System.out.println("The number of subsets whose sum equals to " + targetSum + " is "+
                sol.sumOfSubset(targetSum,arrayList,size-1,subSet));
    }
}