public class TipeDataNumber {
    public static void main(String[] args) {
        byte tipeByte = Byte.MAX_VALUE;
        short tipeShort = Short.MAX_VALUE;
        int tipeInteger = Integer.MAX_VALUE;
        long tipeLong = Long.MAX_VALUE; // biasa dipakai untuk menuliskan uang
        float tipeFloat = Float.MAX_VALUE;
        double tipeDouble = Double.MAX_VALUE;

        byte angkaByte = 15;
        short angkaShort = 1_000;
        int angkaInteger = 233_231;
        long angkaLong = 450_155_987; // biasa dipakai untuk menuliskan uang
        float angkaFloat = 434.3342f;
        double angkaDouble = 4522.234;

        System.out.println(tipeByte);
        System.out.println(tipeShort);
        System.out.println(tipeInteger);
        System.out.println(tipeLong);
        System.out.println(tipeFloat);
        System.out.println(tipeDouble);

        System.out.println();

        // Convert Type Data Widening Casting
        // Tidak memerlukan spesifikasi Convert

        short toShort = angkaByte;
        System.out.println(toShort);

        int toInt = angkaShort;
        System.out.println(toInt);

        long toLong = angkaInteger;
        System.out.println(toLong);

        // kecuali yang satu ini, Narrowing Casting

        float intToFloat = (float)angkaInteger;
        System.out.println(intToFloat);

        byte toByte = (byte)angkaInteger;
        System.out.println(toByte);

        int floatToInt = (int)angkaFloat;
        System.out.println(floatToInt);

        System.out.println();

        int decimalInt = 25;
        int hexInt = 0xA132B;
        int binInt = 0b01010101;
        System.out.println(decimalInt);
        System.out.println(hexInt);
        System.out.println(binInt);


    }
}
