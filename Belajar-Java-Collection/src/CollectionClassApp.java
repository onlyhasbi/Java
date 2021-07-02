import java.util.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class CollectionClassApp {
    public static void main(String[] args) {
        List<String> data = new ArrayList<>();
        data.addAll(List.of("Muhammad","Hasbi","Haerurrijal","Programmer","Zaman","Now"));

        Collections.reverse(data);

        //Collections.shuffle(data);

        for (var item : data){
            System.out.println(item);
        }
    }
}
