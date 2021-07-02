package view;

import controller.Controller;
import data.Person;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.util.List;

public class TablePanel extends JPanel {

    JTable table;
    TableModel tableModel;
    private DefaultTableCellRenderer cellRenderer;

    public void refresh(){
        tableModel.fireTableDataChanged();
    }

    public void setData(List<Person> data){
        tableModel.setData(data);
    }

    TablePanel(){
        setBorder(BorderFactory.createEmptyBorder(13,0,5,5));
        Dimension dim = getPreferredSize();
        setPreferredSize(dim);

        tableModel = new TableModel();
        table = new JTable(tableModel);

        table.setRowHeight(23);
        table.getTableHeader().setPreferredSize(new Dimension(100,27));
        table.getColumnModel().getColumn(0).setMaxWidth(100);
        table.getColumnModel().getColumn(1).setPreferredWidth(200);
        table.getColumnModel().getColumn(2).setPreferredWidth(100);

        cellRenderer = new DefaultTableCellRenderer();
        cellRenderer.setHorizontalAlignment(JLabel.CENTER);

        table.getColumnModel().getColumn(0).setCellRenderer(cellRenderer);
        table.getColumnModel().getColumn(2).setCellRenderer(cellRenderer);

        setLayout(new BorderLayout());
        add(new JScrollPane(table),BorderLayout.CENTER);
    }
}



