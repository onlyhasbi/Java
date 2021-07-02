public class SwitchStatement {
    public static void main(String[] args) {
        char nilaiHuruf = 'O';

//        switch (nilaiHuruf){
//            case 'A' :
//                System.out.println("Wow anda lulus dengan baik");
//                break;
//            case 'B' :
//            case 'C' :
//                System.out.println("Selamat anda lulus");
//                break;
//            case 'D' :
//                System.out.println("Selamat anda tidak lulus");
//                break;
//            default  :
//                System.out.println("Mungkin anda salah Jurusan");
//        }

        //switch lambda (->) di java 14
//        switch (nilaiHuruf){
//            case 'A' -> System.out.println("Selamat anda lulusan terbaik");
//            case 'B','C' -> System.out.println("Selamat anda lulus");
//            case 'D' -> System.out.println("Maaf, anda belum lulus");
//            default -> {
//                System.out.println("Mungkin anda salah jurusan");
//            };
//        }

        String ucapanNilaiHuruf = switch (nilaiHuruf){
            case 'A' :
                    yield "Selamat anda lulusan terbaik";
            case 'B','C' :
                    yield "Selamat anda lulus";
            case 'D' :
                    yield "Maaf, anda belum lulus";
            default :
                    yield "Mungkin anda salah jurusan";
            };

        System.out.println(ucapanNilaiHuruf);
        }
}

