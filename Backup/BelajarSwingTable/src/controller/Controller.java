package controller;

import model.Database;
import model.Mahasiswa;
import view.FormEvent;

import java.util.List;

public class Controller {
    Database db = new Database();

    public void addMahasiswa(FormEvent fe){
        String nim = fe.getNim();
        String nama = fe.getNama();
        String jurusan = fe.getJurusan();

        Mahasiswa mahasiswa = new Mahasiswa(nim,nama,jurusan);
        db.addMahasiswa(mahasiswa);
    }

    public List<Mahasiswa> getMahasiswa(){
        return db.getMahasiswa();
    }
}
