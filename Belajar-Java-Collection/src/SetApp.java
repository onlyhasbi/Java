import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetApp {
    public static void main(String[] args) {
        //Set<String> nama = new HashSet<>();
        Set<String> nama = new LinkedHashSet<>();

        nama.add("Andi");
        nama.add("Hasbi");
        nama.add("Muhammad");
        nama.add("Haerurrijal");
        nama.add("Hasbi");
        nama.add("Muhammad");

        for(var name : nama){
            System.out.println(name);
        }
    }
}
