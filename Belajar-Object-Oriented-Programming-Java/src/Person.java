public class Person {
    String name;
    String address;
    final String country = "Indonesia";

    Person(String name, String address){
        this.name = name;
        this.address = address;
    }

    Person(String name){
//        name = paramName;
        this(name,null);
    }

    Person(){
    }

    void sayHello(String name){
        System.out.println("Helo, "+name+". My name is "+this.name);
    }

}
