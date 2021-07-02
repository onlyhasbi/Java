package com.hasbi.SpringBootWeb.model;

import javax.persistence.*;

@Entity
//@Table(name = "Mahasiswa")

public class Mahasiswa {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    public Integer getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    @Version @Column(name = "opt_version", columnDefinition = "integer DEFAULT 0")
    private int version;

    @Column(name="nama_mahasiswa")
    private String nama;
    private String nim;
    private String Jurusan;

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
        return Jurusan;
    }

    public void setJurusan(String jurusan) {
        Jurusan = jurusan;
    }
}
