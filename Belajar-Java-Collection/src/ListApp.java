import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;

public class ListApp {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        //List<String> names = new LinkedList<>();

        names.add("Hasbi");
        names.add("Amriati");
        names.add("Khaulah");
        names.add("Khalid");

        names.set(1,"Amo");
        System.out.println("Jumlah data : "+names.size());
        for(var value : names){
            System.out.println(value);
        }

        System.out.println("\n");
        names.remove(1);
        for(var value : names){
            System.out.println(value);
        }
    }
}
