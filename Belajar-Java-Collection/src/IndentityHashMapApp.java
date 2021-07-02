import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class IndentityHashMapApp {
    public static void main(String[] args) {
        Map<String,String> map = new IdentityHashMap<>();
        String key1 = "name.first";

        String name = "name";
        String dot = ".";
        String first = "first";

        String key2 = name+dot+first;

        System.out.println(key1.equals(key2));
        System.out.println(key1==key2);

        map.put("key1","Hasbi");
        map.put("key2","Hasbi");

        System.out.println(map.size());
    }
}
