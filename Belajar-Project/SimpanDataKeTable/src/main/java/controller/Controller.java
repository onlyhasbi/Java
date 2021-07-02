package controller;

import data.Database;
import data.Person;
import lombok.Data;
import view.FormEvent;

import java.util.List;

@Data
public class Controller {
    private Database data = new Database();

    public void addPerson(FormEvent fe) {
        String nama = fe.getNama();
        String pekerjaan = fe.getPekerjaan();

        Person person = new Person(nama,pekerjaan);
        data.addData(person);
    }

    public List<Person> getAllData(){
        return data.getData();
    }

    public int getDataSize(){
        return data.getSize();
    }
}
