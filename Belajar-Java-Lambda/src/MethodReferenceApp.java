import util.StringUtil;

import java.util.Locale;
import java.util.function.Function;
import java.util.function.Predicate;

public class MethodReferenceApp {
    public static void main(String[] args) {
        //Predicate<String> predicateIsLowerCase = value -> StringUtil.isLowerCase(value);
        Predicate<String> predicateIsLowerCase = StringUtil::isLowerCase;

        System.out.println(predicateIsLowerCase.test("hasbi"));
        System.out.println(predicateIsLowerCase.test("Amriati"));

        //Method reference di parameter
//        Function<String,String> functionUpper = new Function<String, String>() {
//            @Override
//            public String apply(String value) {
//                return value.toUpperCase();
//            }
//        };

        Function<String,String> functionUpper = String::toUpperCase;
        System.out.println(functionUpper.apply("muhammad Hasbi"));
    }

    public void runInClass(){
        Predicate<String> predicateIsLowerCase = this::isLowerCase;

        System.out.println(predicateIsLowerCase.test("hasbi"));
        System.out.println(predicateIsLowerCase.test("Amriati"));
    }


    public void runOutClass(){
      MethodReferenceApp app = new MethodReferenceApp();
      Predicate<String> predicateIsLowerCase = app::isLowerCase;

      System.out.println(predicateIsLowerCase.test("hasbi"));
      System.out.println(predicateIsLowerCase.test("Amriati"));
    }

    public boolean isLowerCase(String value){
        for(var c : value.toCharArray()){
            if(!Character.isLowerCase(c)){
                return false;
            }
        }
        return true;
    }
}
