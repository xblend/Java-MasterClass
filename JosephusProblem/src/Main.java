import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of n and k: ");
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        Solution sol = new Solution();
        System.out.println("The survivor of the Josephus Problem is " + sol.JosephusProblem(n,k));
    }
}