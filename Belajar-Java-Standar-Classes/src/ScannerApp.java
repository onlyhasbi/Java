import java.io.BufferedInputStream;
import java.util.Scanner;

public class ScannerApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan Nama : ");
        String nama = scan.nextLine();
        System.out.println("Hi "+nama+", kamu sedang menggunakan kelas Scanner");
    }
}
