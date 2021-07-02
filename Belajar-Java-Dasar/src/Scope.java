public class Scope {
    public static void main(String[] args) {
        hello("");
        hello("Hasbi");
    }

    static void hello(String name){
        if(!name.isBlank()){
            System.out.println("Hi "+name);
        } else {
            System.out.println("Hello");
        }
    }
}
