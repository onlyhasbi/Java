package data;

import lombok.AllArgsConstructor;
import lombok.Data;

//@Data
//@AllArgsConstructor
public class Person {
    private int id;
    private String nama;
    private String kelamin;

    public Person(int id, String nama, String kelamin) {
        this.id = id;
        this.nama = nama;
        this.kelamin = kelamin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKelamin() {
        return kelamin;
    }

    public void setKelamin(String kelamin) {
        this.kelamin = kelamin;
    }
}
