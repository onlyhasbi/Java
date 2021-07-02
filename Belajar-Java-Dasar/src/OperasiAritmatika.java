public class OperasiAritmatika {
    public static void main(String[] args) {
        //Operasi Aritmatika
        int a = 100;
        int b = 9;

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
        System.out.println();

        //Augmented Assigment
        a+=10;
        System.out.println(a);
        a-=50;
        System.out.println(a);
        a*=2;
        System.out.println(a);
        a/=20;
        System.out.println(a);
        a%=3;
        System.out.println(a);

        System.out.println();
        // Unary Operator
        a+=55;
        b=-8;

        a++;
        System.out.println(a);

        b--;
        System.out.println(b);

        System.out.println(!true);
    }
}
