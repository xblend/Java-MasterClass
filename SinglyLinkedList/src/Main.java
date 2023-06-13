public class Main {
    public static void main(String[] args) {
        SinglyLinkedList<Integer> sl = new SinglyLinkedList<>();
        sl.addToBack(1);
        printLinkedList(sl);
        sl.removeFromBack();
        printLinkedList(sl);
        sl.addToBack(1);
        sl.addToFront(2);
        sl.addToFront(3);
        printLinkedList(sl);
        sl.removeFromBack();
        printLinkedList(sl);
        sl.addAtIndex(0,1);
        printLinkedList(sl);
        sl.addAtIndex(3,4);
        printLinkedList(sl);
    }

    private static void printLinkedList(SinglyLinkedList singlyLinkedList){
        SinglyLinkedListNode curr = singlyLinkedList.getHead();
        System.out.println("Size="+singlyLinkedList.size());
        if(curr==null) {
            System.out.println("null");
            return;
        }
        while(curr!=null){
            System.out.printf(curr.getData()+" ");
            curr = curr.getNext();
        }
        System.out.println();
        System.out.println("head->"+ singlyLinkedList.getHead().getData());
        System.out.println("tail->"+ singlyLinkedList.getTail().getData());

    }
}