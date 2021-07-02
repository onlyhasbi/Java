package programmer.zaman.now.generic.application;

import programmer.zaman.now.generic.data.MyData;

public class CovariantApp {
    public static void main(String[] args) {
        MyData<String> myData = new MyData<>("Hasbi");
        process(myData);
    }

    public static void process(MyData<? extends Object> myData){
        String data = (String) myData.getData();
        System.out.println(data);
        // myData.setData(1);
    }
}
