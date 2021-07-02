package com.hasbicode;

//@Component
public class HelloControllerSetter {
    private HelloSpring helloSpring;

//    @Autowired
    public void setHelloSpring(HelloSpring helloSpring) {
        this.helloSpring = helloSpring;
    }

    public void getMessage() {
        System.out.println("Injeksi menggunakan metode setter");
    }

}
