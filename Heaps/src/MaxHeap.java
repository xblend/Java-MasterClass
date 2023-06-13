/**
 * Your implementation of a MaxHeap.
 */
public class MaxHeap<T extends Comparable<? super T>> {

    /*
     * The initial capacity of the MaxHeap when created with the default
     * constructor.
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
     * This is the constructor that constructs a new MaxHeap.
     *
     * Recall that Java does not allow for regular generic array creation,
     * so instead we cast a Comparable[] to a T[] to get the generic typing.
     */
    public MaxHeap() {
        //DO NOT MODIFY THIS METHOD!
        backingArray = (T[]) new Comparable[INITIAL_CAPACITY];
    }

    /**
     * Removes and returns the max item of the heap. As usual for array-backed
     * structures, be sure to null out spots as you remove. Do not decrease the
     * capacity of the backing array.
     *
     * Method should run in O(log n) time.
     *
     * You may assume that the heap is not empty.
     *
     * @return The data that was removed.
     */
    public T remove() {
        // WRITE YOUR CODE HERE (DO NOT MODIFY METHOD HEADER)!
        T retData = this.backingArray[1];
        this.backingArray[1] = this.backingArray[this.size];
        this.backingArray[this.size]=null;
        this.size-=1;
        this.downheap(1);
        return retData;
    }
    private void downheap(int index){
        if(index*2>this.size)
            return;
        else if(index*2+1>this.size){
            if(this.backingArray[index].compareTo(this.backingArray[2*index])<0) {
                T temp = this.backingArray[index];
                this.backingArray[index] = this.backingArray[2*index];
                this.backingArray[2*index] = temp;
            }
        }
        else{
            if(this.backingArray[2*index].compareTo(this.backingArray[2*index+1])<0){
                if(this.backingArray[index].compareTo(this.backingArray[2*index+1])<0) {
                    T temp = this.backingArray[index];
                    this.backingArray[index] = this.backingArray[2*index+1];
                    this.backingArray[2*index+1] = temp;
                    downheap(2*index+1);
                }
            }
            else if(this.backingArray[2*index].compareTo(this.backingArray[2*index+1])>0){
                if(this.backingArray[index].compareTo(this.backingArray[2*index])<0) {
                    T temp = this.backingArray[index];
                    this.backingArray[index] = this.backingArray[2*index];
                    this.backingArray[2*index] = temp;
                    downheap(2*index);
                }
            }
        }
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
        if(this.backingArray[index].compareTo(this.backingArray[index/2])>0){
            T temp = this.backingArray[index];
            this.backingArray[index] = this.backingArray[index/2];
            this.backingArray[index/2] = temp;
            this.upheap(index/2);
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