package view;

import model.Mahasiswa;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class PanelTable extends JPanel {

    TableModelMahasiswa tableModelMahasiswa;
    JTable tableMahasiswa;

    public PanelTable(){
        tableModelMahasiswa = new TableModelMahasiswa();
        tableMahasiswa = new JTable(tableModelMahasiswa);

        setLayout(new BorderLayout());
        setBorder(BorderFactory.createEmptyBorder(14,0,5,5));

        add(new JScrollPane(tableMahasiswa),BorderLayout.CENTER);
    }

    public void setData(List<Mahasiswa> mahasiswa){
        tableModelMahasiswa.setDataTable(mahasiswa);
    }

    public void refresh(){
        tableModelMahasiswa.fireTableDataChanged();
    }

}
