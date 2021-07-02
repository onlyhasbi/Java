package view;

import java.util.*;

public class FormEvent extends EventObject {
    private String nama;
    private String pekerjaan;

    public FormEvent(Object source, String name, String pekerjaan) {
        super(source);
        this.nama = name;
        this.pekerjaan = pekerjaan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getPekerjaan() {
        return pekerjaan;
    }

    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }
}
