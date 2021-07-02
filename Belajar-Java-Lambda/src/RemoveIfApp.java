import java.util.*;
import java.util.function.*;

public class RemoveIfApp {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.addAll(List.of("Hasbi","Ria","Mushab","Khaulah","Khalid"));

        //removeIf anonymous class
//        names.removeIf(new Predicate<String>() {
//            @Override
//            public boolean test(String value) {
//                return value.length()>5;
//            }
//        });

        names.removeIf(value -> value.length()>5);
        names.forEach(System.out::println);
    }
}
