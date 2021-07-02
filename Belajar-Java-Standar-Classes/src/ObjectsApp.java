import java.util.Objects;

public class ObjectsApp {
    public static class Person{
        String nama;

        public Person(String nama){
            this.nama = nama;
        }

        public String toString(){
            return this.nama;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return Objects.equals(nama, person.nama);
        }

        @Override
        public int hashCode() {
            return Objects.hash(nama);
        }

        public String getNama() {
            return nama;
        }

        public void setNama(String nama) {
            this.nama = nama;
        }
    }

    public static void main(String[] args) {
//        execute(new Person("Hasbi"));
        execute(null);
    }

    public static void execute(Person person){
//        if(person!=null){
//            System.out.println(person.toString());
//            System.out.println(person.hashCode());
//        }
            System.out.println(Objects.toString(person));
            System.out.println(Objects.hashCode(person));

    }
}

