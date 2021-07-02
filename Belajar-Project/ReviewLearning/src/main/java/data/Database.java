package data;

import javax.swing.*;
import java.util.*;

public class Database {
    private List<Person> db;

    public Database(){
        db = new ArrayList<>();
    }

    public void add(Person person){
        db.add(person);
    }

    public List<Person> getAllData(){ return db; }
}
