package programmer.zaman.now.generic.application;

import programmer.zaman.now.generic.data.MyData;

public class MyDataApp {
    public static void main(String[] args) {
        MyData<String> data = new MyData<String>("Hasbi");
        String dataString = data.getData();
        System.out.println(dataString);

        MyData<Integer> integerData = new MyData<Integer>(99);
        Integer dataInteger = integerData.getData();
        System.out.println(dataInteger);
    }
}
