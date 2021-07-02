package programmer.zaman.now.data;

public class Application {
    public static final int PROCESSORS;

    static {
        System.out.println("Jumlah Processor yang tersedia");
        PROCESSORS = Runtime.getRuntime().availableProcessors();
    }
}
