import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Akshat");
        arrayList.add("Ranjana");
        arrayList.add("Ravi");
        arrayList.add("Advait");

        ArrayIterator<String> arrayIterator = new ArrayIterator<>(arrayList);
        System.out.println(arrayIterator.next());
        System.out.println(arrayIterator.next());
        System.out.println(arrayIterator.next());
        arrayIterator.add("Mani");
        arrayIterator.add("Purva");

        while(arrayIterator.hasNext())
            System.out.printf(arrayIterator.next()+" ");
        System.out.printf("\n");
        System.out.printf(arrayIterator.toString());



    }
}