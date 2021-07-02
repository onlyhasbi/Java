package view;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

public class FormPanel extends JPanel {
    private JLabel labelNama;
    private JLabel labelKelamin;
    private JTextField fieldNama;
    private JTextField fieldKelamin;
    private JButton buttonSubmit;
    private FormEventObject feo;
    private FormListener fl;

    public void setFormListener(FormListener fl){
        this.fl = fl;
    }

    public FormPanel(){
        Dimension dim = getPreferredSize();
        dim.width = 250;
        setPreferredSize(new Dimension(dim));

        Border outerBorder = BorderFactory.createEmptyBorder(5,5,5,0);
        Border innerBorder = BorderFactory.createTitledBorder("Person Form");
        setBorder(BorderFactory.createCompoundBorder(outerBorder,innerBorder));

        labelNama = new JLabel("Nama : ");
        labelKelamin = new JLabel("Kelamin : ");
        fieldNama = new JTextField(11);
        fieldKelamin = new JTextField(11);
        buttonSubmit = new JButton("Submit");

        buttonSubmit.addActionListener(e -> {
            String nama = fieldNama.getText().trim();
            String kelamin = fieldKelamin.getText().trim();

            FormEventObject feo = new FormEventObject(this,nama,kelamin);
            if(feo!=null){
                fl.sendEventObject(feo);
            }
        });

        setLayout(new GridBagLayout());
        GridBagConstraints gc = new GridBagConstraints();
        gc.fill = GridBagConstraints.NONE;

        gc.gridx = 0;
        gc.gridy = 0;
        gc.weighty = 1.0;
        gc.weightx = 1.0;
        gc.anchor = GridBagConstraints.LINE_END;
        gc.insets = new Insets(8,0,0,3);
        add(labelNama,gc);

        gc.gridx++;
        gc.weighty = 1.0;
        gc.weightx = 1.0;
        gc.anchor = GridBagConstraints.LINE_START;
        gc.insets = new Insets(8,0,0,0);
        add(fieldNama,gc);

        ////////////////////////////////////////////////////

        gc.gridx = 0;
        gc.gridy++;
        gc.weighty = 1.0;
        gc.weightx = 1.0;
        gc.anchor = GridBagConstraints.LINE_END;
        gc.insets = new Insets(0,0,0,3);
        add(labelKelamin,gc);

        gc.gridx++;
        gc.weighty = 1.0;
        gc.weightx = 1.0;
        gc.anchor = GridBagConstraints.LINE_START;
        gc.insets = new Insets(0,0,0,0);
        add(fieldKelamin,gc);

        ////////////////////////////////////////////////////

        gc.gridy++;
        gc.weighty = 40.0;
        gc.weightx = 1;
        gc.anchor = GridBagConstraints.FIRST_LINE_START;
        gc.insets = new Insets(8,0,0,0);
        add(buttonSubmit,gc);

    }
}
