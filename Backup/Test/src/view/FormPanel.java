package view;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class FormPanel extends JPanel {

    private JLabel labelId;
    private JTextField fieldId;
    private JLabel labelName;
    private JTextField fieldName;
    private JButton buttonSubmit;

    private JButton btnTest;

    private FormEvent fe;
    private FormListener fl;

    public void setFormListener(FormListener fl){
        this.fl = fl;
    }

    public FormPanel(){
        Dimension dim = getPreferredSize();
        dim.width = 280;
        setPreferredSize(dim);
        setLayout(new GridBagLayout());

        Border innerBorder = BorderFactory.createTitledBorder("Personal Information");
        Border outerBorder = BorderFactory.createEmptyBorder(10,10,10,10);
        setBorder(BorderFactory.createCompoundBorder(outerBorder,innerBorder));

        labelId = new JLabel("Id :");
        fieldId = new JTextField(11);
        labelName = new JLabel("Name :");
        fieldName = new JTextField(11);
        buttonSubmit = new JButton("Submit");

        btnTest = new JButton("Test");
        btnTest.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(System.getProperty("user.dir"));
            }
        });

        buttonSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String id = fieldId.getText();
                String name = fieldName.getText();

                String currentDirLocation = System.getProperty("user.dir");

                String jdbcUrl = "jdbc:sqlite:"+currentDirLocation+"/model/user.db";
                try {
                    Connection connection = DriverManager.getConnection(jdbcUrl);
                    String sqlQuery="insert into user(id,name) values (?,?)";
                    PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
                    preparedStatement.setString(1,id);
                    preparedStatement.setString(2,name);
                    preparedStatement.execute();
                    connection.close();
                    System.out.println("data saved");

                } catch (SQLException throwables) {
                    System.out.println("Error connection");
                    throwables.printStackTrace();
                }


                fe = new FormEvent(this,id,name);
                fl.senderObject(fe);
            }
        });

        GridBagConstraints gc = new GridBagConstraints();

        gc.fill = GridBagConstraints.NONE;
        gc.weighty=0.08;

        ////////// Field ID //////////

        gc.gridy=0;
        gc.gridx=0;

        gc.weightx=1;
        gc.insets = new Insets(15,0,0,5);
        gc.anchor = GridBagConstraints.LINE_END;
        add(labelId,gc);

        gc.gridx++;
        gc.weightx=1;
        gc.insets = new Insets(15,0,0,0);
        gc.anchor = GridBagConstraints.LINE_START;
        add(fieldId,gc);

        ////////// Field Name //////////

        gc.gridx=0;
        gc.gridy++;
        gc.insets = new Insets(0,0,0,5);
        gc.anchor = GridBagConstraints.LINE_END;
        add(labelName,gc);

        gc.gridx++;
        gc.insets = new Insets(0,0,0,0);
        gc.anchor = GridBagConstraints.LINE_START;
        add(fieldName,gc);

        ////////// Submit Button //////////

        gc.gridy++;
        gc.weightx=1;
        gc.insets = new Insets(8,0,0,0);
        gc.anchor = GridBagConstraints.FIRST_LINE_START;
        add(buttonSubmit,gc);

        gc.gridy++;
        gc.weightx=1;
        gc.weighty=3;
        gc.insets = new Insets(8,0,0,0);
        gc.anchor = GridBagConstraints.FIRST_LINE_START;
        add(btnTest,gc);
    }
}

