package model;
import java.util.List;
import java.util.ArrayList;

public class Database {
    private ArrayList<Mahasiswa> mahasiswa;

    public Database(){
        mahasiswa = new ArrayList<Mahasiswa>();
    }

    public void addMahasiswa(Mahasiswa person){
        mahasiswa.add(person);
    }

    public List<Mahasiswa> getMahasiswa(){
        return mahasiswa;
    }

}
