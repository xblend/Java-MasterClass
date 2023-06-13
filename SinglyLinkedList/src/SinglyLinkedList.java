import java.util.NoSuchElementException;

/**
 * Your implementation of a Singly-Linked List.
 */
public class SinglyLinkedList<T> {

    /*
     * Do not add new instance variables or modify existing ones.
     */
    private SinglyLinkedListNode<T> head;
    private SinglyLinkedListNode<T> tail;
    private int size;

    /*
     * Do not add a constructor.
     */

    /**
     * Adds the element to the front of the list.
     *
     * Method should run in O(1) time.
     *
     * @param data the data to add to the front of the list
     * @throws java.lang.IllegalArgumentException if data is null
     */
    public void addToFront(T data) {
        // WRITE YOUR CODE HERE (DO NOT MODIFY METHOD HEADER)!
        if(data==null)
            throw new java.lang.IllegalArgumentException();
        this.size+=1;
        SinglyLinkedListNode<T> node = new SinglyLinkedListNode<>(data);
        if(this.head==null){
            this.head = node;
            this.tail = node;
            return;
        }
        node.setNext(this.head);
        this.head = node;
    }

    /**
     * Adds the element to the back of the list.
     *
     * Method should run in O(1) time.
     *
     * @param data the data to add to the back of the list
     * @throws java.lang.IllegalArgumentException if data is null
     */
    public void addToBack(T data) {
        // WRITE YOUR CODE HERE (DO NOT MODIFY METHOD HEADER)!
        if(data==null)
            throw new java.lang.IllegalArgumentException();
        this.size+=1;
        SinglyLinkedListNode<T> node = new SinglyLinkedListNode<>(data);
        if(this.head==null){
            this.head = node;
            this.tail = node;
            return;
        }
        tail.setNext(node);
        tail = node;
    }

    /**
     * Adds the element to the specified index.
     *
     * Must be O(1) for indices 0 and size and O(n) for all other cases.
     *
     * ASSUMPTIONS:
     * - You may assume that the index will always be valid [0, size]
     * - You may assume that the data will not be null
     *
     * @param index the index to add the new element
     * @param data  the data to add
     */
    public void addAtIndex(int index, T data) {
        // WRITE YOUR CODE HERE (DO NOT MODIFY METHOD HEADER)!
        SinglyLinkedListNode<T> newNode = new SinglyLinkedListNode<>(data);
        this.size+=1;
        if(index==0) {
            if(this.head==null)
                this.tail = newNode;
            newNode.setNext(head);
            this.head = newNode;
            return;
        }
        if(index==this.size-1){
            this.tail.setNext(newNode);
            this.tail = newNode;
            return;
        }
        int i = 0;
        SinglyLinkedListNode<T> currNode = head;
        while(i!=(index-1)) {
            currNode = currNode.getNext();
            i++;
        }
        newNode.setNext(currNode.getNext());
        currNode.setNext(newNode);
    }


    /**
     * Removes and returns the first data of the list.
     *
     * Method should run in O(1) time.
     *
     * @return the data formerly located at the front of the list
     * @throws java.util.NoSuchElementException if the list is empty
     */
    public T removeFromFront() {
        // WRITE YOUR CODE HERE (DO NOT MODIFY METHOD HEADER)!
        if(this.head==null)
            throw new java.util.NoSuchElementException();
        this.size-=1;
        if(this.head==this.tail){
            this.tail = null;
        }
        T temp = this.head.getData();
        this.head = this.head.getNext();
        return temp;
    }

    /**
     * Removes and returns the last data of the list.
     *
     * Method should run in O(n) time.
     *
     * @return the data formerly located at the back of the list
     * @throws java.util.NoSuchElementException if the list is empty
     */
    public T removeFromBack() {
        // WRITE YOUR CODE HERE (DO NOT MODIFY METHOD HEADER)!
        if(this.head==null)
            throw new java.util.NoSuchElementException();
        this.size-=1;
        T temp = this.head.getData();
        if(this.head==this.tail){
            this.head = null;
            this.tail = null;
            return temp;
        }
        SinglyLinkedListNode<T> curr = this.head;
        while(curr.getNext().getNext()!=null)
            curr = curr.getNext();
        temp = curr.getNext().getData();
        this.tail = curr;
        this.tail.setNext(null);
        return temp;

    }

    /**
     * Returns the head node of the list.
     *
     * For grading purposes only. You shouldn't need to use this method since
     * you have direct access to the variable.
     *
     * @return the node at the head of the list
     */
    public SinglyLinkedListNode<T> getHead() {
        // DO NOT MODIFY THIS METHOD!
        return head;
    }

    /**
     * Returns the tail node of the list.
     *
     * For grading purposes only. You shouldn't need to use this method since
     * you have direct access to the variable.
     *
     * @return the node at the tail of the list
     */
    public SinglyLinkedListNode<T> getTail() {
        // DO NOT MODIFY THIS METHOD!
        return tail;
    }

    /**
     * Returns the size of the list.
     *
     * For grading purposes only. You shouldn't need to use this method since
     * you have direct access to the variable.
     *
     * @return the size of the list
     */
    public int size() {
        // DO NOT MODIFY THIS METHOD!
        return size;
    }
}