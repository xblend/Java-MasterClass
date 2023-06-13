public class Main {
    public static void main(String[] args) {
        MinHeap<Integer> minHeap = new MinHeap<>();
        minHeap.add(15);
        minHeap.add(14);
        minHeap.add(13);
        minHeap.add(12);
        minHeap.add(11);
        minHeap.add(10);
        minHeap.add(9);
        minHeap.add(8);
        minHeap.add(7);
        minHeap.add(6);
        minHeap.add(5);
        minHeap.add(4);
        minHeap.add(3);
        minHeap.add(2);
        minHeap.add(1);


        System.out.println(minHeap.size());
        Comparable[] data = minHeap.getBackingArray();
        for(Comparable i:data)
            System.out.println(i);
        minHeap.remove();
        System.out.println(minHeap.size());
        data = minHeap.getBackingArray();
        for(Comparable i:data)
            System.out.println(i);

    }
}