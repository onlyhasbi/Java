import java.util.function.Consumer;

public class ConsumerApp {
    public static void main(String[] args) {
        Consumer<String> consumer = value -> System.out.println("Hallo "+value);
        consumer.accept("Hasbi");
    }
}
