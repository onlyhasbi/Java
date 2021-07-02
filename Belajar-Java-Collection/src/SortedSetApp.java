import Data.Person;
import Data.PersonComparator;

import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

import static java.util.Collections.unmodifiableSortedSet;

public class SortedSetApp {
    public static void main(String[] args) {
//        SortedSet<Person> people = new TreeSet<>(new PersonComparator().reversed());
        SortedSet<Person> people = new TreeSet<>(new PersonComparator());

        people.add(new Person("Hasbi"));
        people.add(new Person("Amriati"));
        people.add(new Person("Amril"));
        people.add(new Person("Haerurrijal"));

        SortedSet<Person> sortedSet = Collections.unmodifiableSortedSet(people);
        sortedSet.add(new Person("Wardin"));
    }
}
