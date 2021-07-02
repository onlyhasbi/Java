package view;

import model.Person;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.util.List;

public class TablePanel extends JPanel {

    private JTable table;
    private PersonTableModel personTableModel;

    public TablePanel(){
        setLayout(new BorderLayout());
        setBorder(BorderFactory.createEmptyBorder(18,10,10,10));

        personTableModel = new PersonTableModel();
        table = new JTable(personTableModel);
        add(new JScrollPane(table),BorderLayout.CENTER);
    }

    public void setData(List<Person> db){
        personTableModel.setData(db);
    }

    public void refresh(){
        personTableModel.fireTableDataChanged();
    }

}
