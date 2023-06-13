import java.util.ArrayList;

public class Solution {
    public void increasingSubsequence(ArrayList<Integer> arrayList, int size){
        ArrayList<Integer> subsequence = new ArrayList<>();
        System.out.println(subsequence.toString());
        for(int index=0;index<size-1;index++){
            subsequence.add(arrayList.get(index));
            System.out.println(subsequence.toString());
            this.subSequence(index,index+1,arrayList,size,subsequence);
            subsequence.clear();
        }
        subsequence.add(arrayList.get(size-1));
        System.out.println(subsequence.toString());



    }
        private void subSequence(int start, int end, ArrayList<Integer> arrayList, int size, ArrayList<Integer> subsequence){
        if(end==size)
            return;
        if(arrayList.get(start)<arrayList.get(end)){
            ArrayList<Integer> newSubsequence = new ArrayList<>(subsequence);
            newSubsequence.add(arrayList.get(end));
            System.out.println(newSubsequence.toString());
            this.subSequence(start,end+1,arrayList,size,subsequence);
            start=end;
            this.subSequence(start,end+1,arrayList,size,newSubsequence);
        }
        else
            this.subSequence(start,end+1,arrayList,size,subsequence);
    }
}
