package model;

public class Mahasiswa {
    private static int count=0;
    private int id;
    private String nim;
    private String nama;
    private String jurusan;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public Mahasiswa(String nim, String nama, String jurusan) {
        this.id = count;
        this.nim = nim;
        this.nama = nama;
        this.jurusan = jurusan;
        count++;
    }
}
