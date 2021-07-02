import java.util.function.Supplier;

public class SupplierApp {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> "Muhammad Hasbi";
        System.out.println(supplier.get());
    }
}
