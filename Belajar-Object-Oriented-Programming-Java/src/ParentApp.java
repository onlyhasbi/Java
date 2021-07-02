public class ParentApp {
    public static void main(String[] args) {
        Child child = new Child();
        child.name = "Anto";
        child.doIt();


        Parent parent = new Parent();
        parent.setName("Hasbi");
        parent.doIt();

    }
}
