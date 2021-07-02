import java.util.Collections;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class NavigableSetApp {
    public static void main(String[] args) {
        NavigableSet<String> names = new TreeSet<>();
        names.addAll(Set.of("Hasbi","Amriati","Khaulah","Khalid","Wardin"));

        NavigableSet<String> namesReverse = names.descendingSet();
        NavigableSet<String> amriati = names.headSet("Khalid",true); // pembacaan set dari depan(kepala)
        NavigableSet<String> hasbi = names.headSet("Hasbi",false); // jika inclusive false maka nama khalid dihilangkan dalam set
        NavigableSet<String> khaulah = names.tailSet("Khaulah",true); // pembacaan set dari belakang(ekor)

        for (var name : hasbi){
            System.out.println(name);
        }

        NavigableSet<String> imutable = Collections.unmodifiableNavigableSet(names);
        imutable.add("Arsyad"); //

    }
}
