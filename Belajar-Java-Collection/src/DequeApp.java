import java.util.Deque;
import java.util.LinkedList;

public class DequeApp {
    public static void main(String[] args) {
        Deque<String> stack = new LinkedList<>();

        /*
        offerFirst data yang dimasukkan pertama berada diposisi terakhir
        offerLast data yang pertama dimasukkan berada diposisi awal
         */
        stack.offerFirst("Hasbi");
        stack.offerFirst("Amriati");
        stack.offerFirst("Khaulah");
        stack.offerFirst("Khalid");

//        for (var item : stack){
//            System.out.println(item);
//        }

//        for (var item = stack.pollLast(); item!=null; item=stack.pollLast()){
//            System.out.println(item);
//        }

        System.out.println(stack.pollFirst());
        System.out.println(stack.pollFirst());
        System.out.println(stack.pollFirst());
        System.out.println(stack.size());
    }
}
