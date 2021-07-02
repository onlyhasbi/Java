import java.util.Collections;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapApp {
    public static void main(String[] args) {
        NavigableMap<String,String> map = new TreeMap<>();
        map.put("hasbi","Hasbi");
        map.put("ria","Amriati");
        map.put("ondin","Wardin");

//        for(var key : map.keySet()){
//            System.out.println(key);
//        }

//        System.out.println(map.lowerKey("ondin"));
//        System.out.println(map.higherKey("ondin"));

        NavigableMap<String,String> mapDescending = map.descendingMap();
        for(var key : mapDescending.keySet()){
            System.out.println(key);
        }

        NavigableMap<String,String> empty = Collections.emptyNavigableMap();
        NavigableMap<String,String> imutable = Collections.unmodifiableNavigableMap(map);
        //imutable.put("jojo","Jojo");

    }
}
