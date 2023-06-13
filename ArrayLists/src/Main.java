public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.addToFront(1);
        arrayList.addToFront(2);
        arrayList.addToFront(3);
        arrayList.addToFront(4);
        arrayList.printArrayList();

        ArrayQueue<Integer> arrayQueue = new ArrayQueue<>();
        arrayQueue.enqueue(2);
        arrayQueue.printArrayQueue();
        arrayQueue.enqueue(3);
        arrayQueue.printArrayQueue();
        arrayQueue.enqueue(4);
        arrayQueue.printArrayQueue();
        arrayQueue.enqueue(5);
        arrayQueue.printArrayQueue();
        arrayQueue.enqueue(6);
        arrayQueue.printArrayQueue();
        arrayQueue.enqueue(7);
        arrayQueue.printArrayQueue();
        arrayQueue.dequeue();
        arrayQueue.printArrayQueue();
        arrayQueue.enqueue(8);
        arrayQueue.printArrayQueue();

        SinglyLinkedList<Integer> singlyLinkedList = new SinglyLinkedList<>();
        singlyLinkedList.addToBack(3);
        singlyLinkedList.addToBack(4);
        singlyLinkedList.addToBack(5);
        singlyLinkedList.addToBack(6);
        singlyLinkedList.addToBack(7);
        singlyLinkedList.printLL();
        System.out.println("Head="+singlyLinkedList.getHead().getData());
        System.out.println("Tail="+singlyLinkedList.getTail().getData());
        System.out.println("Size="+singlyLinkedList.size());
    }
}