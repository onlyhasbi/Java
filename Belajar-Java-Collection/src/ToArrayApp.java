import java.util.*;

public class ToArrayApp {
    public static void main(String[] args) {
        List<String> names = List.of("Hasbi","Amriati","Wardin");

        Object[] nameObject = names.toArray();
        String[] nameString = names.toArray(new String[]{});

        System.out.println(Arrays.toString(nameObject));
        System.out.println(Arrays.toString(nameString));
    }
}
