import java.util.Random;

public class RandomApp {
    public static void main(String[] args) {
        Random random = new Random();

        for(int i=0; i<100; i++){
            var value = random.nextInt(10);
            System.out.println(value);
        }
    }
}
