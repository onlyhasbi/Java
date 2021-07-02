class Parent {
    String name;

    void setName(String name){
        this.name = name;
    }

    void doIt(){
        System.out.println("Do it parent, right now "+name);
    }
}

class Child extends Parent{
    void doIt(){
        System.out.println("Do it child, right now "+super.name);
    }
}
