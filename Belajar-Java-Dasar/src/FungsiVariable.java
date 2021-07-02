public class FungsiVariable {
    public static void main(String[] args) {
        String name = "Muhammad Hasbi";
        int age = 30;
        String address = "Jl. Perum. Bukit Nirwana 2";

        System.out.println(name);
        System.out.println(age);
        System.out.println(address);

        final double PHI = 3.14;
        final String applicationName = "Belajar Java Dasar";

        System.out.println(applicationName);
        System.out.println(PHI);

        //di java 10 ke atas, bisa menggunakan variable var
        //maka java secara otomatis akan mengenali tipe data
        //dari isi sebuah variable dan harus diinisialisasi diawal
        var nilai = 90;
        var kalimat = "Hello";

        System.out.println(nilai);
        System.out.println(kalimat);
    }
}
