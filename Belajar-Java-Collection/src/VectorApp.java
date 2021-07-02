import java.util.*;
import java.util.Vector;

public class VectorApp {
    public static void main(String[] args) {
        List<String> list = new Vector<>();
        list.add("Hasbi");
        list.add("Amriati");
        list.add("Wardin");

        for(var item : list){
            System.out.println(item);
        }
    }
}
