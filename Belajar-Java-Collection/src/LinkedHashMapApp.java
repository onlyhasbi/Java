import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapApp {
    public static void main(String[] args) {

        Map<String,String> map = new LinkedHashMap<>();
        map.put("first","Hasbi");
        map.put("last","Amriati");
        map.put("middle","Khaulah");

        Set<String> keys = map.keySet();
        for (var key : keys ){
            System.out.println(key);
        }
    }
}
