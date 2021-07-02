import java.util.*;
import java.util.function.*;

public class MapForEachApp {
    public static void main(String[] args) {
        Map<String,String> map = new LinkedHashMap<>();
        map.put("nama","Hasbi");
        map.put("asal","Bulukumba");
        map.put("kelamin","Pria");

//      for loop
//        for(var item : map.entrySet()){
//            System.out.println(item.getKey()+" : "+item.getValue());
//        }

        // forEach Anonymous
//        map.forEach(new BiConsumer<String, String>() {
//            @Override
//            public void accept(String key, String value) {
//                System.out.println(key+" : "+value);
//            }
//        });

        map.forEach((key,value) -> System.out.println(key+" : "+value));
    }
}
