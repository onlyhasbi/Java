import java.util.Iterator;
import java.util.List;

public class IterableApp {
    public static void main(String[] args) {

        System.out.println("Iterable");
        Iterable<String> names = List.of("Hasbi","Amriati","Khaulah");
        for(var value : names){
            System.out.println(value);
        }

        System.out.println();

        System.out.println("Iterator");
        Iterator<String> iterator = names.iterator();
        while(iterator.hasNext()){
            String name = iterator.next();
            System.out.println(name);
        }
    }
}
