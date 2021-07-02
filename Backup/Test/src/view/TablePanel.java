package view;

import javax.swing.*;
import java.awt.*;

public class TablePanel extends JPanel {

    JTable table;
    TableModel tableModel;
    FormEvent fe;

    public TablePanel(){

        tableModel = new TableModel();
        table = new JTable(tableModel);

        setBorder(BorderFactory.createEmptyBorder(18,0,10,10));

        setLayout(new BorderLayout());
        add(new JScrollPane(table),BorderLayout.CENTER);
    }

    public void insertData(FormEvent fe){
        tableModel.setData(fe);
    }

    public void refresh(){
        tableModel.fireTableDataChanged();
    }
}
