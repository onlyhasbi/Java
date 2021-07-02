import java.util.Arrays;

public class ArraysApp {
    public static void main(String[] args) {
        int[] number = {
           1,342,42,52,63,29,91
        };
        Arrays.sort(number);
        System.out.println(Arrays.toString(number));

        System.out.println(Arrays.binarySearch(number,29));
        System.out.println(Arrays.binarySearch(number,91));

        int[] copyArr = Arrays.copyOf(number,3);
        System.out.println(Arrays.toString(copyArr));

        int[] copyResult = Arrays.copyOfRange(number,3,6);
        System.out.println(Arrays.toString(copyResult));
    }
}
