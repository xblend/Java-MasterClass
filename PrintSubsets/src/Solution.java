import java.util.ArrayList;

public class Solution {
    public void printSubsets(ArrayList<Integer> arrayList, int index, ArrayList<Integer> subSet){
        if(index==-1){
            System.out.println(subSet.toString());
            return;
        }
        ArrayList<Integer> newSubset = new ArrayList<>(subSet);
        subSet.add(arrayList.get(index));
        printSubsets(arrayList,index-1,subSet);
        printSubsets(arrayList,index-1,newSubset);
    }
}
