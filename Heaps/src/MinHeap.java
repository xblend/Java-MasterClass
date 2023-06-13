import java.util.NoSuchElementException;

/**
 * Your implementation of a MinHeap.
 */
public class MinHeap<T extends Comparable<? super T>> {

    /**
     * The initial capacity of the MinHeap.
     *
     * DO NOT MODIFY THIS VARIABLE!
     */
    public static final int INITIAL_CAPACITY = 13;

    /*
     * Do not add new instance variables or modify existing ones.
     */
    private T[] backingArray;
    private int size;

    /**
     * This is the constructor that constructs a new MinHeap.
     *
     * Recall that Java does not allow for regular generic array creation,
     * so instead we cast a Comparable[] to a T[] to get the generic typing.
     */
    public MinHeap() {
        //DO NOT MODIFY THIS METHOD!
        backingArray = (T[]) new Comparable[INITIAL_CAPACITY];
    }

    /**
     * Adds an item to the heap. If the backing array is full (except for
     * index 0) and you're trying to add a new item, then double its capacity.
     *
     * Method should run in amortized O(log n) time.
     *
     * @param data The data to add.
     * @throws java.lang.IllegalArgumentException If the data is null.
     */
    public void add(T data) {
        // WRITE YOUR CODE HERE (DO NOT MODIFY METHOD HEADER)!
        if(data==null)
            throw new IllegalArgumentException();
        this.size++;
        if(this.size==this.backingArray.length) {
            T[] tempArray = (T[]) new Comparable[this.backingArray.length*2];
            for(int i=0;i<this.backingArray.length;i++)
                tempArray[i] = this.backingArray[i];
            this.backingArray = tempArray;
        }
        this.backingArray[this.size] = data;
        this.upheap(this.size);
    }
    private void upheap(int index){
        if(index==1)
            return;
        if(this.backingArray[index].compareTo(this.backingArray[index/2])<0){
            T temp = this.backingArray[index];
            this.backingArray[index] = this.backingArray[index/2];
            this.backingArray[index/2] = temp;
            this.upheap(index/2);
        }
    }
    /**
     * Removes and returns the min item of the heap. As usual for array-backed
     * structures, be sure to null out spots as you remove. Do not decrease the
     * capacity of the backing array.
     *
     * Method should run in O(log n) time.
     *
     * @return The data that was removed.
     * @throws java.util.NoSuchElementException If the heap is empty.
     */
    public T remove() {
        // WRITE YOUR CODE HERE (DO NOT MODIFY METHOD HEADER)!
        if(this.size==0)
            throw new NoSuchElementException();
        T retData = this.backingArray[1];
        this.backingArray[1] = this.backingArray[this.size];
        this.backingArray[this.size]=null;
        this.size-=1;
        this.downheap(1);
        return retData;
    }
    private void downheap(int index){
        if(2*index>this.size)
            return;
        if(2*index+1>this.size){
            if(this.backingArray[index*2].compareTo(this.backingArray[index])<0){
                T temp = this.backingArray[index];
                this.backingArray[index] = this.backingArray[index*2];
                this.backingArray[index*2] = temp;
            }
        }
        else if(this.backingArray[index*2].compareTo(this.backingArray[index*2+1])<0){
            if(this.backingArray[index*2].compareTo(this.backingArray[index])<0){
                T temp = this.backingArray[index];
                this.backingArray[index] = this.backingArray[index*2];
                this.backingArray[index*2] = temp;
                this.downheap(index*2);
            }

        }
        else if(this.backingArray[index*2].compareTo(this.backingArray[index*2+1])>0){
            if(this.backingArray[index*2+1].compareTo(this.backingArray[index])<0){
                T temp = this.backingArray[index];
                this.backingArray[index] = this.backingArray[index*2+1];
                this.backingArray[index*2+1] = temp;
                this.downheap(index*2+1);
            }
        }
    }
    /**
     * Returns the backing array of the heap.
     *
     * For grading purposes only. You shouldn't need to use this method since
     * you have direct access to the variable.
     *
     * @return The backing array of the list
     */
    public T[] getBackingArray() {
        // DO NOT MODIFY THIS METHOD!
        return backingArray;
    }

    /**
     * Returns the size of the heap.
     *
     * For grading purposes only. You shouldn't need to use this method since
     * you have direct access to the variable.
     *
     * @return The size of the list
     */
    public int size() {
        // DO NOT MODIFY THIS METHOD!
        return size;
    }
}