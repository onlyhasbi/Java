import java.util.*;

public class ImmutableApp {
    public static void main(String[] args) {
        List<String> one = Collections.singletonList("Datanya cuma boleh satu");
        //one.add("Dua");

        List<String> empty = Collections.emptyList();

        List<String> mutable = new ArrayList<>();
        mutable.add("Hasbi");
        mutable.add("Amriati");
        List<String> immutable = Collections.unmodifiableList(mutable);
        //immutable.add("Khalid");

        List<String> elements = List.of("Khaulah","Khalid");
        //elements.add("Putra");

    }
}
