package programmer.zaman.now.generic.application;

import programmer.zaman.now.generic.data.MyData;

public class WildCardApp {
    public static void main(String[] args) {
        printLength(new MyData<Integer>(100));
        printLength(new MyData<String>("Hasbi Haerurrijal"));
        printLength(new MyData<MultipleConstranintApp.Manager>(new MultipleConstranintApp.Manager()));
    }

    public static void printLength(MyData<?> myData){
        System.out.println(myData.getData());
    }
}
