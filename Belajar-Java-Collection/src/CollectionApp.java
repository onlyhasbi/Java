import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class CollectionApp {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("Hasbi");
        collection.add("Amriati");
        collection.add("Khaulah");
        collection.addAll(List.of("Khalid","Wardin","Mushab"));

        System.out.println("Jumlah data : "+collection.size());
        for(var value : collection){
            System.out.println(value);
        }

        System.out.println("\n\n");

        System.out.println("Remove");
        collection.remove("Hasbi");
        collection.removeAll(Arrays.asList("Mushab","Khaulah"));
        System.out.println("Jumlah data : "+collection.size());
        for(var value : collection){
            System.out.println(value);
        }

        System.out.println("\n\n");

        System.out.println("Pencarian Data");
        System.out.println("Apakah dalam collection ada data Hasbi ? ");
        String jawab = collection.contains("Hasbi") ? "Ya" : "Tidak";
        System.out.println(jawab);
        System.out.println(
                collection.containsAll(List.of("Amriati","Wardin"))
        );

    }
}
