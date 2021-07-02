package view;

import java.util.EventObject;

public class FormEvent extends EventObject {
    private String nim;
    private String nama;
    private String jurusan;

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getJurusan() {
        return jurusan;
    }

    public FormEvent(Object source){
        super(source);
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public FormEvent(Object source,String nim, String nama, String jurusan) {
        super(source);
        this.nim = nim;
        this.nama = nama;
        this.jurusan = jurusan;

    }
}
