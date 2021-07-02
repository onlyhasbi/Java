package programmer.zaman.now.application;

import programmer.zaman.now.data.HelloWorld;

public class HelloApp {
    public static void main(String[] args) {

        HelloWorld hello = new HelloWorld() {

            public void sayHello() {
                System.out.println("Hello Guys");
            }

            public void sayHello(String name) {
                System.out.println("Hello "+name);
            }
        };

        hello.sayHello();
        hello.sayHello("Hasbi");

    }
}
