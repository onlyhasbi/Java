import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Vector;

public class HashTableApp {
    public static void main(String[] args) {
        Map<String,String> map = new Hashtable();
        map.put("hasbi","Hasbi");
        map.put("amriati","Amriati");
        map.put("wardin","Wardin");

        for(var item : map.keySet()){
            System.out.println(item);
        }
    }
}
