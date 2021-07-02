package com.hasbicode;

//@Component
public class HalloSpring implements HelloSpring{
    public void sayHello() {
        System.out.println("Injeksi menggunakan metode constructor");
    }
}
