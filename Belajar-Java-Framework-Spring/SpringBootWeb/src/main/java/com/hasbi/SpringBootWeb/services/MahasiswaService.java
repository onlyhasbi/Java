package com.hasbi.SpringBootWeb.services;

import java.util.List;
import com.hasbi.SpringBootWeb.model.Mahasiswa;

public interface MahasiswaService {
    List<Mahasiswa> listMahasiswa();
    Mahasiswa saveMahasiswa(Mahasiswa mahasiswa);
    Mahasiswa getIdMahasiswa(Integer id);
    void deleteMahasiswa(Integer id);
}


