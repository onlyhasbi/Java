import collection.SingleQueue;

public class SingleQueueApp {
    public static void main(String[] args) {
        SingleQueue<String> queue = new SingleQueue<>();

        System.out.println(queue.size());

        System.out.println(queue.offer("Hasbi"));
        System.out.println(queue.offer("Amriati"));
        System.out.println(queue.offer("Wardin"));

        System.out.println(queue.size());

        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());

    }
}
