package controller;

import view.MainFrameEvent;
import model.*;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Controller {

    Database db = new Database();

    public List<Person> getPeople(){
        return db.getPeople();
    }

    public void addPerson(MainFrameEvent fe){
        String name = fe.getName();
        String occupation = fe.getOccupation();
        int ageCategoryId = fe.getAgeCategory();
        String employCategory = fe.getEmploy().toLowerCase();
        boolean usCitizen = fe.getUsCitizen();
        String taxId = fe.getTaxID();
        String gender = fe.getGender().toLowerCase();

        AgeCategory ageCategory = null;
        switch (ageCategoryId){
            case 0 : ageCategory = AgeCategory.child;
                     break;
            case 1 : ageCategory = AgeCategory.adult;
                     break;
            case 2 : ageCategory = AgeCategory.senior;
                     break;
            }

        EmployCategory empCategory;
        if(employCategory.equals("employed")) {
            empCategory = EmployCategory.Employed;
        } else if(employCategory.equals("selfemployed")) {
            empCategory = EmployCategory.SelfEmployed;
        } else if(employCategory.equals("unemployed")) {
            empCategory = EmployCategory.UnEmployed;
        } else {
            empCategory = EmployCategory.Other;
        }

        Gender gen;
        if(gender.equals("male")) {
            gen = Gender.male;
        } else {
            gen = Gender.female;
        }

        Person person = new Person(name,occupation, ageCategory,
                            empCategory,taxId, usCitizen,gen);

        db.addPerson(person);
    }

    public void saveToFile(File file) throws IOException {
        db.saveToFile(file);
    }

    public void loadFromFile(File file) throws IOException {
        db.loadFromFile(file);
    }
}
