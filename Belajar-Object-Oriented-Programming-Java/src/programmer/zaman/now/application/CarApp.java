package programmer.zaman.now.application;

import programmer.zaman.now.data.Avanza;
import programmer.zaman.now.data.Car;

public class CarApp {
    public static void main(String[] args) {
        Car avanza = new Avanza();
        avanza.drive();
        System.out.println(avanza.getTier());
    }
}
