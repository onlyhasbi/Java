package programmer.zaman.now.application;

public class EqualsApp {
    public static void main(String[] args) {
        final String space = " ";
        String first = "Hasbi";
        first += space + "Haerurrijal";

        String name = "Hasbi Haerurrijal";

        System.out.println(first);
        System.out.println(name);

        //System.out.println(first == name);

        String nama = "Hasbi Haerurrijal";

        //System.out.println(nama == name);

        System.out.println("Kedua objek sama : "+ (nama.equals(name) ? "Iya" : "Tidak"));
    }
}
