public class ForEach {
    public static void main(String[] args) {
        int[] arrNumber = {24,98,54,42,67};

//        for(int i=0;i<arrNumber.length;i++){
//            System.out.println(arrNumber[i]);
//        }

        for(int numbers : arrNumber) {
            System.out.print(numbers+" ");
        }
    }
}
