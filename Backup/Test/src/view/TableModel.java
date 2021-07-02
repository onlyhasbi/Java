package view;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class TableModel extends AbstractTableModel {

    List<MainFrame> db;
    String[] columnName = {"id","nama"};

    public void setData(FormEvent fe){

    }

    @Override
    public int getRowCount() {
        return 5;
    }

    @Override
    public String getColumnName(int column) {
        return columnName[column];
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public Object getValueAt(int row, int column) {
        return null;
    }
}
