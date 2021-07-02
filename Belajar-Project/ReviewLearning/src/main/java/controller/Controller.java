package controller;

import data.Database;
import data.Person;
import view.FormEventObject;

import java.util.*;

public class Controller {
    private static int count=0;

    private Database db = new Database();

    public void addPerson(FormEventObject feo){
        int id = count;
        String nama = feo.getName();
        String kelamin = feo.getKelamin();

        Person person = new Person(id,nama,kelamin);
        count++; //generate id baru

        db.add(person);
    }

    public List<Person> getAllData(){
        return db.getAllData();
    }
}
