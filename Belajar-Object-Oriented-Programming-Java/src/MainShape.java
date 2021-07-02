public class MainShape {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10);

        System.out.println("Child corner is "+rectangle.getCorner());
        System.out.println("Parent corner is "+rectangle.getParentCorner());
    }
}
