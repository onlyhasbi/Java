public class MethodVariableArguments {
    public static void main(String[] args) {
//        int[] nilai = {78,80,67,90,71,90};
        ucapanKelulusan("Hasbi",90,76,89,76,56,88);
    }

//    static void ucapanKelulusan(String nama, int[] angka){
//        final int standarNilaiLulus = 75;
//        var totalNilai=0;
//
//        for(var nilai : angka){
//            totalNilai += nilai;
//        }
//
//        var hitungNilai = totalNilai/angka.length;
//
//        if(hitungNilai>=75){
//            System.out.println("Selamat "+nama+", anda dinyatakan lulus");
//        } else {
//            System.out.println("Maaf, "+nama+" anda harus mengulang tahun depan");
//        }
//    }

    static void ucapanKelulusan(String nama, int... angka){
        final int standarNilaiLulus = 75;
        var totalNilai=0;

        for(var nilai : angka){
            totalNilai += nilai;
        }

        float hitungNilai = totalNilai/angka.length;
        System.out.println("Nilai akhir anda : "+hitungNilai);

        if(hitungNilai>=75){
            System.out.println("Selamat "+nama+", anda dinyatakan lulus");
        } else {
            System.out.println("Maaf, "+nama+" anda harus mengulang tahun depan");
        }
    }
}
