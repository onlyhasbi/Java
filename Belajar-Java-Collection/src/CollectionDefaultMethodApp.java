
import java.util.*;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class CollectionDefaultMethodApp {
    public static void main(String[] args) {

        List<Integer> number = new ArrayList<>();
        for(int i=1; i<=100; i++){
            number.add(i);
        }

//        System.out.println(number);

//        number.replaceAll(new UnaryOperator<Integer>() {
//            @Override
//            public Integer apply(Integer integer) {
//                return integer*2;
//            }
//        });

        number.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });

        number.removeIf(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer>50;
            }
        });

        System.out.println(number);
    }
}
