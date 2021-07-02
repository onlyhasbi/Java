public class VicePresident extends Employee {

    VicePresident(String name){ // Ketika dikelas parent memiliki
        super(name);    // Constructor maka kelas child harus memanggil minimal 1 dari constructor parent
    }

    void sayHello(String name){
        System.out.println("Hello "+name+", My Name is "+super.name+". \nI'm new Vide President here");
    }
}
