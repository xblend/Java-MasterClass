public class Solution {
    public int JosephusProblem(int n, int k){
        if(n==1)
            return 0;
        return (this.JosephusProblem(n-1,k)+k)%n;
    }
}
