package programmer.zaman.now.generic.application;

public class MultipleConstranintApp {
    public static void main(String[] args) {
        //Data<Manager> manager = new Data<>(new Manager()); // ERROR manager tidak implement canSayHello
        Data<VicePresident> vicePresident = new Data<>(new VicePresident());
        vicePresident.getData();
    }

    public static interface canSayHello{
        void sayHello(String name);
    }

    public static abstract class Employee{

    }

    public static class Manager extends Employee {
        @Override
        public String toString() {
            super.toString();
            return "Manager";
        }
    }

    public static class VicePresident extends Employee implements canSayHello {
        public void sayHello(String name) {
            System.out.println("Hello "+name);
        }
    }

    public static class Data<T extends Employee & canSayHello >{
        private T data;

        public Data(T data) {
            this.data = data;
        }

        public T getData() {
            data.sayHello("Hasbi");
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }
    }
}
