import java.util.*;
import java.util.ArrayList;

public class SortingApp {
    public static void main(String[] args) {
        List<String> data = new ArrayList<>();
        data.add("Hasbi");
        data.add("Wardin");
        data.add("Ria");
        data.add("Khaulah");
        data.addAll(List.of("Programmer","Zaman","Now"));

        // diurutkan
        Collections.sort(data);

        // diurutkan menggunakan Comparator
        Comparator<String> reverse = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        };

        Collections.sort(data,reverse);

        System.out.println("setelah diurutkan");
        for(var item : data){
            System.out.println(item);
        }

    }
}
