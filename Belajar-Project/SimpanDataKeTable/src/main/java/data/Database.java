package data;


import java.util.*;

public class Database {
    private ArrayList<Person> data;

    public Database(){
        data = new ArrayList<>();
    }

    public void addData(Person person){
        data.add(person);
    }

    public List<Person> getData(){
        return data;
    }

    public int getSize(){
        return data.size();
    }
}
