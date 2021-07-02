package programmer.zaman.now.application;



public class StackTraceApp {
    public static void main(String[] args) {
//        try {
//            int[] number = {23,234,234};
//            String[] names = {"Hasbi","Wardin","Khaulah"};
//            System.out.println(number[100]);
//            System.out.println(names[2]);
//        } catch (Throwable throwable){
//            StackTraceElement[] stackTraceElement = throwable.getStackTrace();
//            throwable.printStackTrace();
//        }

        try {
            sampleError();
        } catch (RuntimeException exception){
            exception.printStackTrace();
        }

    }

    public static void sampleError(){
        try {
            int[] number = {23,234,234};
            String[] names = {"Hasbi","Wardin","Khaulah"};
            System.out.println(number[100]);
            System.out.println(names[2]);
        } catch (Throwable throwable){
            throw new RuntimeException(throwable);
        }
    }
}
