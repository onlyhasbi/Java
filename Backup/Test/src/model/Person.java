package model;

public class Person {

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    private String id;
    private String name;

    public Person(String id, String name){
        this.id = id;
        this.name = name;
    }
}
