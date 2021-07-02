package programmer.zaman.now.generic.application;

import programmer.zaman.now.generic.data.MyData;

public class InvariantApp {
    public static void main(String[] args) {
        MyData<String> stringData = new MyData<>("Hasbi");
        // doIt(stringData); //  error
        // MyData<Object> objectData = stringData; //error
        MyData<Object> objectData =  new MyData<>(1000);
        //MyData<Integer> integerData = objectData;
        //doItInteger(objectData);
    }

    public static void doIt(MyData<Object> myData){
        // do nothing
    }

    public static void doItInteger(MyData<Integer> myDataInteger){
        // do nothing
    }
}
