package programmer.zaman.now.application;

import programmer.zaman.now.annotation.Fancy;
import programmer.zaman.now.data.Animal;
import programmer.zaman.now.data.Cat;

@Fancy(name="Animal",tags={"app","java"})
public class AnimalApp {

    @Fancy(name="test")
    public static void main(String[] args) {
        Animal cat = new Cat();
        cat.name = "Fish";
        cat.run();
    }
}
