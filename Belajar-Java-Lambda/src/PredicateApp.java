import java.util.function.Predicate;

public class PredicateApp {
    public static void main(String[] args) {
        Predicate<String> predicateIsBlank = value -> value.isBlank();
        System.out.println(predicateIsBlank.test(""));
        System.out.println(predicateIsBlank.test("Oke"));
    }
}
