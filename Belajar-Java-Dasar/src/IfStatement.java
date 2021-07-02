public class IfStatement {
    public static void main(String[] args) {
        int nilai = 88;
        int absen = 80;

        if(nilai>10){
            System.out.println("Nilai lebih dari 10");
        } else {
            System.out.println("Nilai kurang dari 10");
        }


        boolean lulus = nilai >= 75 && absen >= 75;

        if(absen>=75 && nilai>=80){
            System.out.println("Selamat anda lulus");
        } else {
            System.out.println("Maaf, anda harus mengulang");
        }

        if(nilai>=80 && absen>=80){
            System.out.println("Nilai anda A");
        } else if(nilai>=70 && absen>=70){
            System.out.println("Nilai anda B");
        } else if(nilai>=60 && absen>=60){
            System.out.println("Nilai anda C");
        } else if(nilai>=50 && absen>=50){
            System.out.println("Nilai anda D");
        } else {
            System.out.println("Nilai anda E");
        }
    }
}
