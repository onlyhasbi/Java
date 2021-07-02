package view;

import controller.Controller;
import data.Person;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Insets;
import java.util.List;

public class FormTable extends JPanel {
    private JTable table;
    private TableModel tableModel;

    public FormTable(){
        Dimension dim = getPreferredSize();
        setSize(new Dimension(dim));
        setBorder(BorderFactory.createEmptyBorder(11,5,5,5));

        tableModel = new TableModel();
        table = new JTable(tableModel);

        table.setRowHeight(22);
        Dimension tableDim = table.getTableHeader().getPreferredSize();
        tableDim.height = 24;
        table.getTableHeader().setPreferredSize(tableDim);

        DefaultTableCellRenderer cellRender = new DefaultTableCellRenderer();
        cellRender.setHorizontalAlignment(JLabel.CENTER);
        table.getColumnModel().getColumn(0).setCellRenderer(cellRender);
        table.getColumnModel().getColumn(2).setCellRenderer(cellRender);

        table.getColumnModel().getColumn(0).setMaxWidth(50);
        table.getColumnModel().getColumn(0).setMinWidth(50);

        table.getColumnModel().getColumn(2).setMinWidth(150);
        table.getColumnModel().getColumn(2).setMaxWidth(150);

        setLayout(new BorderLayout());
        add(new JScrollPane(table),BorderLayout.CENTER);
    }

    public void setData(List<Person> data){
        tableModel.setDatabase(data);
    }

    public void refresh(){
        tableModel.fireTableDataChanged();
    }
}
