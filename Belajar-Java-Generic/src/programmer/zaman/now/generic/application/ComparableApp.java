package programmer.zaman.now.generic.application;

import programmer.zaman.now.generic.data.Person;

import java.util.Arrays;

public class ComparableApp {
    public static void main(String[] args) {
        Person[] people = {
                new Person("Hasbi","Jalan Burung"),
                new Person("Ria","Jalan Bunga"),
                new Person("Khalid","Jalan Pahlawan"),
                new Person("Hasbi","Jalan Burung"),
        };

        Arrays.sort(people);
        System.out.println(Arrays.toString(people));
    }
}
