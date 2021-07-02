import java.util.EnumMap;
import java.util.Map;

public class EnumHashMapApp {
    public static enum Level{
        FREE,STANDARD,VIP
    }

    public static void main(String[] args) {
        Map<Level,String> map = new EnumMap<Level, String>(Level.class);
        map.put(Level.FREE,"Gratis");
        map.put(Level.STANDARD,"Standard");
        map.put(Level.VIP,"Very Important People");

        for(var key : map.keySet()){
            System.out.println(key);
        }
    }
}
