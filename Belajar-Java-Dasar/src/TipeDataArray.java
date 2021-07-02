import java.util.ArrayList;
import java.util.Arrays;

public class TipeDataArray {

    public static void main(String[] args) {

        //contoh array initializer
        String[] nama = {"Hasbi","Ria"};
        for(int i=0;i<nama.length;i++){
            System.out.println(nama[i]);
        }

        System.out.println();

        int[] angka = new int[] {
               34,56,77,23,45,32
        };

        for(int i=0;i<angka.length;i++){
            System.out.print(angka[i]+" ");
        }

        System.out.println();

        //contoh create allocating array
        final int max=5;
        int[] nilai;
        nilai = new int[max];
        nilai[0]=45;
        nilai[1]=98;
        nilai[2]=10;
        nilai[3]=36;
        nilai[4]=2;

        for(int i=0;i<max;i++){
            System.out.print(nilai[i]+" ");
        }


        System.out.println();
        System.out.println();

        //Array 2 dimensi
        final String[][] data = {
                {"Hasbi","35"},
                {"Eko","95"},
                {"Khalid","15"}
        };

        for(int i=0;i < data.length;i++){
            for(int j=0;j < data.length-1;j++){
                System.out.print(data[i][j]+" ");
            }
            System.out.println();
        }
    }
}
