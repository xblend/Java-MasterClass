import java.util.Iterator;

public class LinkedLists<T> implements Iterable<T> {
    private class Node<T>{
        T data;
        Node next;
        Node(T data, Node next){
            this.data = data;
            this.next = next;
        }
        Node(T data){
            this(data,null);
        }
    }
    Node<T> head = null;
    private class LinkedListsIterator implements Iterator<T>{
        private Node<T> curr;
        public LinkedListsIterator() {
            this.curr = head;
        }

        @Override
        public boolean hasNext() {
            return curr!=null;
        }

        @Override
        public T next() {
            if(this.hasNext()){
                T data = curr.data;
                curr = curr.next;
                return data;
            }
            return null;
        }
    }
    public Iterator<T> iterator(){
        return new LinkedListsIterator();
    }
    public void addFront(T data){
        Node<T> newNode = new Node<>(data);
        newNode.next = head;
        head = newNode;
    }
    /*
    //This is how I implemented
    public void removeDuplicates(){
        this.rDuplicate(this.head);
    }
    public void rDuplicate(Node curr){
        if(curr==null || curr.next==null)
            return;
        if(curr.data.equals(curr.next.data)){
            curr.next = curr.next.next;
            rDuplicate(curr);
        }
        rDuplicate(curr.next);
    }
    */
    public void removeDuplicates(){
        this.head = this.rDuplicate(this.head);
    }
    private Node<T> rDuplicate(Node curr){
        if(curr==null)
            return null;
        curr.next = rDuplicate(curr.next);
        if(curr.next!=null && curr.data.equals(curr.next.data))
            return curr.next;
        return curr;
    }

}
