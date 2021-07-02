import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ImmutableSetApp {
    public static void main(String[] args) {
        Set<String> empty = Collections.emptySet();
        Set<String> single = Collections.singleton("Hasbi");

        Set<String> mutableSet = new HashSet<>();
        mutableSet.add("Amriati");
        mutableSet.add("Wardin");

        Set<String> immutableSet = Collections.unmodifiableSet(mutableSet);
        Set<String> setOf = Set.of("Khalid","Khaulah","Hasbi","Mushab");
        mutableSet.addAll(setOf);

        for (var listSet : immutableSet){
            System.out.println(listSet);
        }
    }
}
