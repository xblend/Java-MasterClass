import java.util.ArrayList;

public class Solution {
    //This function will return number of subsets whose sum is equal to the target sum provided.
    public int sumOfSubset(int targetSum, ArrayList<Integer> arrayList, int index, ArrayList<Integer> subSet){
        if(targetSum==0){
            System.out.println(subSet.toString());
            return 1;
        }
        else if(index==-1)
            return 0;
        ArrayList<Integer> newSubset=new ArrayList<>(subSet);
        newSubset.add(arrayList.get(index));

        return (this.sumOfSubset(targetSum-arrayList.get(index),arrayList,index-1,newSubset)+this.sumOfSubset(targetSum,arrayList,index-1,subSet));
    }
}
