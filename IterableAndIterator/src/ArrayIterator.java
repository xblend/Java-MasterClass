import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayIterator<T> implements Iterator {
    private ArrayList<T> arrayList;
    private ListIterator<T> arrayListIterator;

    public ArrayIterator(ArrayList<T> arrayList) {
        this.arrayList = new ArrayList<>(arrayList);
        this.arrayListIterator = this.arrayList.listIterator();
    }

    public void add(T obj){
        System.out.printf(obj.toString()+" got added\n");
        while(arrayListIterator.hasPrevious()){
            arrayListIterator.previous();
        }
        this.arrayListIterator.add(obj);
        arrayListIterator.previous();
    }

    @Override
    public String toString() {
        ListIterator<T> listIterator = this.arrayList.listIterator();
        String str="";
        while(listIterator.hasNext()) str += (listIterator.next().toString()+" ");
        return "Elements of the Array List are " + str;
    }

    @Override
    public boolean hasNext() {
        return this.arrayListIterator.hasNext();
    }

    @Override
    public Object next() {
        return this.arrayListIterator.next();
    }
}
