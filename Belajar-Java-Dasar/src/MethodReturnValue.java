public class MethodReturnValue {
    public static void main(String[] args) {
        tampilkan(hitung(6,'*',4));
    }

    static void tampilkan(int angka){
        System.out.println("Hasil : "+angka);
    }

    static int tambah(int a,int b){
        return a+b;
    }

    static int hitung(int a,char operator,int b){
        switch (operator){
            case '+' : return a+b;
            case '-' : return a-b;
            case '*' : return a*b;
        default : return 0;
        }
    }
}
