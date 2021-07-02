public class Comment {
    /*
     Komentar ini digunakan untuk mendokumentasikan
     kelas yang ada pada file ini
     */


    public static void main(String[] args) {
        System.out.println(tambah(55,22));
    }

    /**
     *
     * @param a angka pertama
     * @param b angka kedua
     * @return hasil penjumlahan a dan b
     */
    static int tambah(int a,int b){
        //menjumlahkan kedua angka a dan b
        return a + b;
    }
}
