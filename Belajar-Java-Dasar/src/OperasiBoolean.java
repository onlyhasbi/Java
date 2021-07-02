public class OperasiBoolean {
    public static void main(String[] args) {
        var absen = 90;
        var nilaiAkhir = 80;

        boolean lulusAbsen = absen >= 75;
        boolean lulusNilai = nilaiAkhir >= 75;

        var lulus = lulusAbsen && lulusNilai;
        System.out.println();
        sayHello("Rian",lulus);
    }

    public static void sayHello(String nama, boolean lulus){
        String say = nama == null ? "Guest" : nama;
        String sayLulus = lulus ? "Lulus" : "Gagal";
        System.out.println("Hello, "+say+". Selamat anda "+sayLulus);
    }
}
