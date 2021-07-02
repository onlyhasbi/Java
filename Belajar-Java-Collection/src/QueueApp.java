import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueApp {
    public static void main(String[] args) {
//        Queue<String> queue = new ArrayDeque<>(10);
//        Queue<String> queue = new PriorityQueue<>();
          Queue<String> queue = new LinkedList<>();

//        for (int i=0; i<30; i++){
//            queue.add(String.valueOf(i));
//        }

        queue.add("Muhammad");
        queue.add("Hasbi");
        queue.add("Amriati");

        for (String next = queue.poll(); next != null; next=queue.poll() ){
            System.out.println(next);
        }

        System.out.println(queue.size());
    }
}
