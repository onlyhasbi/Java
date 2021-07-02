package Data;

import java.util.*;

public class Person {
    private String name;
    private List<String> hobbies;

    public Person(String name) {
        this.name = name;
        this.hobbies = new ArrayList<>();
    }

    public void addHobby(String hobby) {
        hobbies.add(hobby);
    }

    public List<String> getHobbies(){
        //return hobbies; //Array bersifat mutable (bisa diubah ubah) dari mana saja
        return Collections.unmodifiableList(hobbies);
        /* Array akan bersifat immutable, artinya
        array tidak dapat dirubah kecuali dari objeknya sendiri

         */
    }

    public String getName(){
        return name;
    };
}
