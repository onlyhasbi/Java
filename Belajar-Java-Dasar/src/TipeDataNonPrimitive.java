public class TipeDataNonPrimitive {
    public static void main(String[] args) {
        Integer angkaInteger = 2345;
        Long angkaLong = 10_000l;
        Byte angkaByte = 100;
        
        Byte iniByte = null;

        System.out.println(angkaInteger);
        System.out.println(angkaLong);
        System.out.println(angkaByte);
        System.out.println(iniByte);

        //konversi
        byte angkaByteBaru = angkaInteger.byteValue();
        System.out.println(angkaByteBaru);

        int angkaIntegerBaru = angkaInteger;
        System.out.println(angkaIntegerBaru);

        Long amount = 1_000_000l;
        float floatAmount = amount.floatValue();
        System.out.println(floatAmount);
    }
}
