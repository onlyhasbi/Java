package programmer.zaman.now.generic.application;

import programmer.zaman.now.generic.data.MyData;

public class ConstraintApp {
    public static void main(String[] args) {
        numberData<Integer> numberInteger = new numberData<>(23);
        numberData<Long> numberLong = new numberData<>(12L);

        //numberData<String> stringData = new numberData<String>("Hasbi");


    }

    public static class numberData<T extends Number>{
            private T data;

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public numberData(T data) {
            this.data = data;
        }
    }
}
