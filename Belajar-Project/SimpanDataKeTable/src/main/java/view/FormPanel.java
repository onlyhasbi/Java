package view;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.*;

public class FormPanel extends JPanel{
    private JLabel labelNama;
    private JLabel labelPekerjaan;
    private JTextField fieldNama;
    private JTextField fieldPekerjaan;
    private JButton buttonSubmit;
    private FormEvent fe;
    private FormListener fl;

    public void setFormListener(FormListener fl){
        this.fl = fl;
    }

    FormPanel(){
        Dimension dim = getPreferredSize();
        dim.width=250;
        setPreferredSize(dim);

        Border innerBorder = BorderFactory.createTitledBorder("Personal Information");
        Border outerBorder = BorderFactory.createEmptyBorder(5,5,5,5);
        setBorder(BorderFactory.createCompoundBorder(outerBorder,innerBorder));

        labelNama = new JLabel("Nama : ");
        fieldNama = new JTextField(11);

        labelPekerjaan = new JLabel("Pekerjaan : ");
        fieldPekerjaan = new JTextField(11);
        buttonSubmit = new JButton("Submit");

        buttonSubmit.addActionListener(e -> {
            String nama = fieldNama.getText().trim();
            String pekerjaan = fieldPekerjaan.getText().trim();

            fe = new FormEvent(this,nama,pekerjaan);
            fl.senderData(fe);

            fieldNama.setText("");
            fieldPekerjaan.setText("");
            fieldNama.requestFocus();
        });

        setLayout(new GridBagLayout());
        GridBagConstraints gc = new GridBagConstraints();
        gc.fill = GridBagConstraints.NONE;

        ///////////////// FIELD NAMA ///////////////

        gc.gridx = 0;
        gc.gridy = 0;
        gc.weighty = 1.0;
        gc.weightx = 1.0;
        gc.insets = new Insets(10,0,0,0);
        gc.anchor = GridBagConstraints.LINE_END;
        add(labelNama,gc);

        gc.gridx++;
        gc.weighty = 1.0;
        gc.weightx = 1.0;
        gc.insets = new Insets(10,0,0,0);
        gc.anchor = GridBagConstraints.LINE_START;
        add(fieldNama,gc);

        ///////////////// FIELD NAMA ///////////////

        gc.gridx = 0;
        gc.gridy++;
        gc.weighty = 1.0;
        gc.weightx = 1.0;
        gc.insets = new Insets(0,0,0,0);
        gc.anchor = GridBagConstraints.LINE_END;
        add(labelPekerjaan,gc);

        gc.gridx++;
        gc.weighty = 1.0;
        gc.weightx = 1.0;
        gc.insets = new Insets(0,0,0,0);
        gc.anchor = GridBagConstraints.LINE_START;
        add(fieldPekerjaan,gc);

        ///////////////// BUTTON SUBMIT ///////////////

        gc.gridy++;
        gc.weighty = 45.0;
        gc.weightx = 1.0;
        gc.insets = new Insets(5,0,0,0);
        gc.anchor = GridBagConstraints.FIRST_LINE_START;
        add(buttonSubmit,gc);
    }

}
