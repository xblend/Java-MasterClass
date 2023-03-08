import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> a = new Stack<>();
        Stack<Integer> b = new Stack<>();
        Stack<Integer> c = new Stack<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = scanner.nextInt();
        int size = n-1;
        while(n!=0)
            a.push(n--);
        System.out.println("Is stack C empty? "+(c.isEmpty() ? "true" : "false"));
        Solution sol = new Solution();
        sol.TowerOfHanoi(size, a, b, c,'A','B','C');
        System.out.println("Is stack C empty? "+(c.isEmpty() ? "true" : "false"));
        while(!c.isEmpty()){
            System.out.println(c.pop());
        }
    }
}