package view;

import java.util.*;

public class FormEventObject extends EventObject {

    private String nama;
    private String kelamin;

    public FormEventObject(Object source) {
        super(source);
    }

    public FormEventObject(Object source, String nama, String kelamin){
        super(source);
        this.nama = nama;
        this.kelamin = kelamin;
    }

    public String getName() {
        return nama;
    }

    public void setName(String name) {
        this.nama = name;
    }

    public String getKelamin() {
        return kelamin;
    }

    public void setKelamin(String kelamin) {
        this.kelamin = kelamin;
    }
}
