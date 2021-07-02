import java.util.Date;

public class ExpressionStatementBlock {
    //kumpulan statement disebut block
    public static void main(String[] args) {
        //Assignment Statement;
        int angka = 12;
        System.out.println(angka=19); // ekspresi dan statement dalam kurung

        angka++; //Increment statement
        System.out.println(angka); // method invocation statement

        //Object Creation Statement
        Date tanggal = new Date();
        System.out.println(tanggal);
    }
}
