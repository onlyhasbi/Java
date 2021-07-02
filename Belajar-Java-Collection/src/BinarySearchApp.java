import java.util.*;

public class BinarySearchApp {
    public static void main(String[] args) {
        List<Integer> number = new ArrayList<>(1000);
        for(var i=1; i<=1000; i++){
            number.add(i);
        }

        int index = Collections.binarySearch(number,542);
        System.out.println(index);

//        Comparator<Integer> comparator = new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2.compareTo(o1);
//            }
//        };
//
//        int index2 = Collections.binarySearch(number,23,comparator);
//        System.out.println(index2);
    }
}
