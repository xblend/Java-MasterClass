public class Main {
    public static void main(String[] args) {
        LinkedLists<Integer> integers = new LinkedLists<>();

        integers.addFront(5);
        integers.addFront(5);
        integers.addFront(4);
        integers.addFront(3);
        integers.addFront(3);
        integers.addFront(3);
        integers.addFront(2);
        integers.addFront(2);
        integers.addFront(2);
        integers.addFront(1);
        integers.addFront(1);

        for(Integer integer : integers)
            System.out.printf(integer + " ");

        integers.removeDuplicates();
        System.out.println();
        for(Integer integer : integers)
            System.out.printf(integer + " ");

    }
}