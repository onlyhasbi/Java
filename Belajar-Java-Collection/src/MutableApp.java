import Data.Person;

import java.util.*;

public class MutableApp {
    public static void main(String[] args) {
        Person person = new Person("Hasbi");
        person.addHobby("Game");
        person.addHobby("Coding");
        doSomethingWithHobbies(person.getHobbies());

        for(var hobby : person.getHobbies()){
            System.out.println(hobby);
        }
    }

    public static void doSomethingWithHobbies(List<String> hobbies){
        hobbies.add("Anu");
    }
}
