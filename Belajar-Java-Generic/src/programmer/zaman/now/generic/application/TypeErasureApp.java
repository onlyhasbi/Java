package programmer.zaman.now.generic.application;

import programmer.zaman.now.generic.data.MyData;

public class TypeErasureApp {
    public static void main(String[] args) {
        MyData myData = new MyData("Hasbi");
        MyData<Integer> integerData = (MyData<Integer>) myData;
        // integerData.setData(1000);
        Integer data = integerData.getData();

    }
}
