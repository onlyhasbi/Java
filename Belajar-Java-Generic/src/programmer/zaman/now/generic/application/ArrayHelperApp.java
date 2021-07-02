package programmer.zaman.now.generic.application;

import programmer.zaman.now.generic.data.ArrayHelper;

import java.util.Arrays;

public class ArrayHelperApp {
    public static void main(String[] args) {
        String[] names = {"Hasbi","Khaulah","Amriati"};
        Integer[] numbers = {1,3,4,5,6,5};

        System.out.println(
                ArrayHelper.count(names)
        );
        System.out.println(
                ArrayHelper.count(numbers)
        );
    }
}
