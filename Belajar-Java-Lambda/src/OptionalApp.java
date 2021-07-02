import java.util.*;
import java.util.function.*;

public class OptionalApp {
    public static void main(String[] args) {
        sayHello("Hasbi");
        sayHello(null);
    }

    public static void sayHello(String name){
//        Optional.ofNullable(name)
//                .map(String::toUpperCase)
//                .ifPresentOrElse(
//                        value -> System.out.println("Hello "+value),
//                        ()-> System.out.println("Hello")
//                );

          String upperName = Optional.ofNullable(name)
                .map(String::toUpperCase)
                .orElse("TEMAN");

          System.out.println("Hello "+upperName);

//        Optional<String> optionalName = Optional.ofNullable(name);
//        Optional<String> optionalNameUpper = optionalName.map(value -> value.toUpperCase());
//        optionalName.ifPresent(value -> {
//            System.out.println("Hello "+value);
//        });

        //old method
//        if(name!=null){
//            System.out.println("Hello "+name);
//        }

//        String nameUpper = name.toUpperCase();
//        System.out.println("Hello "+nameUpper);
    }
}
