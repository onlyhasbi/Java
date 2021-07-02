public class Manager extends Employee {
    // Manager(){} // Default Constructor

    Manager(String name){  // jika default constructor tidak ada,
        super(name); // maka contructor ini harus dipanggil disemua kelas turunannya
    }

    void sayHello(String name){
        System.out.println("Hello "+name+", My Name is "+super.name+". \nI'm new Manager here");
    }
}
