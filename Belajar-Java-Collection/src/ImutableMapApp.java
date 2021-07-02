import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImutableMapApp {
    public static void main(String[] args) {
        Map<String,String> empty = Collections.emptyMap();
        Map<String,String> singleton = Collections.singletonMap("234","Rangga");

        Map<String,String> mutable = new HashMap<>();
        mutable.put("first","Hasbi");
        mutable.put("middle","Amriati");
        mutable.put("last","Khaulah");
        Map<String,String> imutableMap = Collections.unmodifiableMap(mutable);

        Map<String,String> map = Map.of(
                "first","Niar",
                "middle","Deny",
                "last","Arsyad"
        );

        //map.put("r","3");






    }
}
