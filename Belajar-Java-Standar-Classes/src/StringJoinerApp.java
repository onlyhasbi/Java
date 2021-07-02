import java.util.StringJoiner;

public class StringJoinerApp {
    public static void main(String[] args) {
        String[] names = {"Hasbi","Amo","Wardin"};
        StringJoiner joinNames = new StringJoiner(",","[","]");
        for (var value : names){
            joinNames.add(value);
        }

        String value = joinNames.toString();
        System.out.println(value);
    }
}
