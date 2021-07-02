package view;

import model.Mahasiswa;

import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import java.util.List;

public class TableModelMahasiswa extends AbstractTableModel {

    private List<Mahasiswa> dataMahasiswa;
    private String[] colNames = {"Id", "Nim", "Nama", "Jurusan"};

    public TableModelMahasiswa() {
    }

    @Override
    public String getColumnName(int column) {
        return colNames[column];
    }

    public void setDataTable(List<Mahasiswa> mahasiswa){
        this.dataMahasiswa = mahasiswa;
    }

    @Override
    public int getRowCount() {
        return dataMahasiswa.size();
    }    

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int row, int column) {
        Mahasiswa mahasiswa = dataMahasiswa.get(row);
        switch(column){
            case 0 : return mahasiswa.getId();
            case 1 : return mahasiswa.getNim();
            case 2 : return mahasiswa.getNama();
            case 3 : return mahasiswa.getJurusan();
        }
        return null;
    }
}


