public class Main {
    public static void main(String[] args) {
        ExternalChainingHashMap<Integer,Integer> myMap = new ExternalChainingHashMap<>();
        /*
        System.out.println(myMap.size());
        System.out.println(myMap.put(1,1));
        System.out.println(myMap.put(14,14));
        System.out.println(myMap.put(14,15));
        System.out.println(myMap.put(27,27));
        System.out.println(myMap.put(1,2));
        System.out.println(myMap.put(2,2));
        System.out.println(myMap.put(3,4));
        System.out.println(myMap.put(3,5));
        myMap.printMap();
        System.out.println(myMap.size());
        System.out.println(myMap.remove(3));
        System.out.println(myMap.size());
        //System.out.println(myMap.remove(null));
        System.out.println(myMap.size());
         */
        System.out.println(myMap.put(0,0));
        System.out.println(myMap.put(1,1));
        System.out.println(myMap.put(2,2));
        System.out.println(myMap.put(3,3));
        System.out.println(myMap.put(4,4));
        System.out.println(myMap.put(5,5));
        System.out.println(myMap.put(6,6));
        System.out.println(myMap.put(7,7));
        System.out.println(myMap.put(8,8));
        System.out.println(myMap.put(26,26));
        System.out.println(myMap.containsKey(26));
        System.out.println(myMap.containsKey(23));
        //myMap.printMap();
    }
}