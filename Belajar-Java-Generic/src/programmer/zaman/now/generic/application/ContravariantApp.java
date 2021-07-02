package programmer.zaman.now.generic.application;

import programmer.zaman.now.generic.data.MyData;

public class ContravariantApp {
    public static void main(String[] args) {
    MyData<Object> objekData = new MyData<>("Eko");
    objekData.setData(1000);

    MyData<? super String> myData = objekData;
    process(objekData);
    }

    public static void process(MyData<? super String> myData){
        //myData.setData("Hasbi"); // ini berbahaya
        // String value = (String) myData.getData();
        Object value = myData.getData();
        System.out.println(value);
    }
}
