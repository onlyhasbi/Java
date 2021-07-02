import java.util.HashMap;
import java.util.Map;

public class EntryApp {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("hasbi","Hasbi");
        map.put("amo","Amriati");
        map.put("ondin","Wardin");

        for (var entry : map.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
}
