package view;

import data.Person;


import javax.swing.table.AbstractTableModel;
import java.util.*;

public class TableModel extends AbstractTableModel {
    private List<Person> data;
    String[] colNames = {"Id","Nama","Pekerjaan"};

    TableModel(){}

    public void setData(List<Person> data){
        this.data = data;
    }

    @Override
    public int getRowCount() {
        return data.size();
    }

    @Override
    public int getColumnCount() {
        return colNames.length;
    }


    @Override
    public Object getValueAt(int row, int col) {
        Person data = this.data.get(row);
        switch (col){
            case 0 : return data.getId();
            case 1 : return data.getNama();
            case 2 : return data.getPekerjaan();
        }
        return null;
    }

    @Override
    public String getColumnName(int column) {
        return colNames[column];
    }
}
