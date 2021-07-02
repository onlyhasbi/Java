package programmer.zaman.now.data;

public abstract class Location {
    public String name;

    public void sayHello(){
        System.out.println("Hello, i'm "+this.name+" city. Nice to meet you");
    }
}
