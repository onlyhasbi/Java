public class PolymorphismApp {
    public static void main(String[] args) {

//        Employee employee = new Employee("Rambo");
//
//        employee.setName("Santoso");
//        employee.sayHello("Tino");
//
//        System.out.println();
//
//        employee = new Manager("Hasbi");
//        employee.sayHello("Sambalu");
//
//        System.out.println();
//
//        employee = new VicePresident("Baso");
//        employee.sayHello("Anto");

        sayHello(new Employee("Hasbi"));
        sayHello(new Manager("Rambo"));
        sayHello(new VicePresident("Jono"));


    }

    static void sayHello(Employee employee){

        System.out.println("Hi, i'm "+employee.name);

        if(employee instanceof Manager){
            Manager manager = (Manager) employee;
            System.out.println("New Manager here.\n");
        } else if(employee instanceof VicePresident){
            VicePresident vicePresident = (VicePresident) employee;
            System.out.println("New Vice President here.\n");
        } else {
            System.out.println("New Employee here.\n");
        }


    }
}
