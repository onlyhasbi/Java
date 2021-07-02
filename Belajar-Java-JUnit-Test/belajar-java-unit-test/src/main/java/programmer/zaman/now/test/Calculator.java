package programmer.zaman.now.test;

public class Calculator {
    public Integer sum(Integer a, Integer b){
        return a+b;
    }

    public Integer divide(Integer a, Integer b){
        if(b==0) {
            throw new IllegalArgumentException("Can not divide by zero");
        } else {
            return a/b;
        }
    }
}
