public class MethodOverloading {
    public static void main(String[] args) {
        sayHello();
        sayHello("Khalid");
        sayHello("Khaulah","Rumaisha");
    }

    static void sayHello(){
        System.out.println("Hello");
    }

    static void sayHello(String name){
        System.out.println("Hello "+name);
    }

    static void sayHello(String firstName,String lastName){
        System.out.println("Hi "+firstName+" "+lastName);
    }
}
