public class NumberApp {
    public static void main(String[] args) {
        Integer intValue = 1_000;
        Long longValue = intValue.longValue();
        Double doubleValue = intValue.doubleValue();
        Short shortValue = intValue.shortValue();

        System.out.println(longValue);
        System.out.println(doubleValue);
        System.out.println(shortValue);

        String angka = "1394232";
        Integer number = Integer.valueOf(angka);

        System.out.println(number);

        String angkaKoma = "325.234";
        Double pointNumber = Double.valueOf(angkaKoma);
        System.out.println(pointNumber);


    }
}
