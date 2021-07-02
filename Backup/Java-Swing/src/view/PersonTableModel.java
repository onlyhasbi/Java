package view;

import model.Person;
import javax.swing.table.AbstractTableModel;
import java.util.List;

public class PersonTableModel extends AbstractTableModel {

    private List<Person> db;

    private String[] colNames = {"ID","Name","Occupation","Age",
                                "Employment","US Citizen","Tax ID","Gender"};

    public PersonTableModel(){
    }

    @Override
    public String getColumnName(int column) {
        return colNames[column];
    }

    public void setData(List<Person> db){
        this.db = db;
    }

    @Override
    public int getRowCount() {
        return db.size();
    }

    @Override
    public int getColumnCount() {
        return 8;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Person person = db.get(rowIndex);
        switch (columnIndex){
            case 0 : return person.getId();
            case 1 : return person.getName();
            case 2 : return person.getOccupation();
            case 3 : return person.getAgeCategory();
            case 4 : return person.getEmploy();
            case 5 : return person.isUsCitizen();
            case 6 : return person.getTaxID();
            case 7 : return person.getGender();
        }

        return null;
    }
}
