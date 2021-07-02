import java.util.List;
import java.util.function.*;

public class ForEachApp {
    public static void main(String[] args) {
        List<String> list = List.of("Hasbi","Amriati","Wardin","Khaulah");

        // for loop
//        for(var item : list){
//            System.out.println(item);
//        }

        //forEach
//        list.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });

        // lambda
        //list.forEach(value-> System.out.println(value));

        // lambda method reference
        list.forEach(System.out::println);
    }
}
