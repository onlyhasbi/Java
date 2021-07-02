package programmer.zaman.now.application;

import programmer.zaman.now.data.City;

public class LocationApp {
    public static void main(String[] args) {
        City city = new City();
        city.name = "Solo";

        System.out.println(city.name);
        city.sayHello();
    }
}
