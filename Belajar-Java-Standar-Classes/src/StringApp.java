public class StringApp {
    public static void main(String[] args) {
        String name = "A Muh Hasbi Haerurrijal";

        String nameUppercase = name.toUpperCase();
        String nameLowerCase = name.toLowerCase();

        System.out.println(nameUppercase);
        System.out.println(nameLowerCase);
        System.out.println(name.length());
        System.out.println(name.charAt(3));
        System.out.println(name.startsWith("A"));
        System.out.println(name.endsWith("Haerurrijal"));

        String[] nameSplit = name.split(" ");
        for(var splitName : nameSplit){
            System.out.println(splitName);
        }
        System.out.println(name.isBlank());
        System.out.println(name.isEmpty());

        char[] arrChar = name.toUpperCase().toCharArray();
        for(var values : arrChar){
            System.out.println(values);
        }
    }
}
