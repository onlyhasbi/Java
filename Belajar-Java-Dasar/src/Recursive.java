public class Recursive {
    public static void main(String[] args) {
        System.out.println(factorialRecursive(5));
        System.out.println(factorialLoop(5));
        System.out.println(recursiveError(10000));
    }

    static int factorialLoop(int angka){
        var count = 1;
        for(int i = 1;i<=angka;i++){
            count*=i;
        }
        return count;
    }

    static int factorialRecursive(int angka){
        if(angka==1){
            return 1;
        } else {
            return angka*factorialRecursive(angka-1);
        }
    }

    static int recursiveError(int angka){
        if(angka==1){
            System.out.println("Recursive selesai . . .");
            return 1;
        } else {
            System.out.println("ini adalah recursive ke-"+angka);
            return recursiveError(angka-1);
        }
    }
}
