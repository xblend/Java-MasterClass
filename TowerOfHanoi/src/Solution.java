import java.util.Stack;

public class Solution {
    public void TowerOfHanoi(int n, Stack<Integer> a, Stack<Integer> b, Stack<Integer> c, char x, char y, char z){
        if(n==0){
            System.out.println("Moving " + a.peek() + " from " + x + " to " + z);
            c.push(a.pop());
            return;
        }
        this.TowerOfHanoi(n-1,a,c,b,x,z,y);
        System.out.println("Moving " + a.peek() + " from " + x + " to " + z);
        c.push(a.pop());
        this.TowerOfHanoi(n-1,b,a,c,y,x,z);
    }
}
