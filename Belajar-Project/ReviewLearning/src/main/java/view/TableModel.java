package view;

import data.Person;

import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import java.util.*;

public class TableModel extends AbstractTableModel {

    List<Person> db;
    private String[] headerNames = {"Id","Nama","Jenis Kelamin"};

    public void setDatabase(List<Person> db){
        this.db = db;
    }

    @Override
    public String getColumnName(int col) {
        return headerNames[col];
    }

    @Override
    public int getRowCount() {
        return db.size();
    }

    @Override
    public int getColumnCount() {
        return headerNames.length;
    }

    @Override
    public Object getValueAt(int row, int col) {
        Person data = db.get(row);
        switch (col){
            case 0 : return data.getId();
            case 1 : return data.getNama();
            case 2 : return data.getKelamin();
        }
        return null;
    }
}
