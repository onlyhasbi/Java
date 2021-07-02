public class SytemApp {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        System.out.println(System.nanoTime());
        System.out.println(System.getenv());
        System.out.println(System.getenv("Users"));

        System.gc();
        System.exit(0);
        System.out.println("Hello");
    }
}
