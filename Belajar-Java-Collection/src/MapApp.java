import java.util.HashMap;
import java.util.Map;

public class MapApp {
    public static void main(String[] args) {
        Map<String,String> data = new HashMap<>();
        data.put("112","Hasbi");
        data.put("283","Amriati");
        data.put("23","Khaulah");

        System.out.println(data.get("112"));
        System.out.println(data.get("283"));
        System.out.println(data.get("23"));
    }
}
