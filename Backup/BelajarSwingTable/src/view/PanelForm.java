package view;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelForm extends JPanel {

    private JLabel labelNim;
    private JTextField fieldNim;
    private JLabel labelNama;
    private JTextField fieldNama;
    private JLabel labelJurusan;
    private JTextField fieldJurusan;
    private JButton buttonSubmit;

    private FormListener fl;
    private FormEvent fe;

    public void setFormListener(FormListener fl){
        this.fl = fl;
    }

    public PanelForm(){
        Dimension dim = getPreferredSize();
        dim.width = 250;
        setPreferredSize(dim);
        Border innerBorder = BorderFactory.createTitledBorder("Data Mahasiswa");
        Border outerBorder = BorderFactory.createEmptyBorder(5,5,5,5);
        setBorder(BorderFactory.createCompoundBorder(outerBorder,innerBorder));

        labelNim = new JLabel("NIM : ");
        fieldNim = new JTextField(11);

        labelNama = new JLabel("Nama : ");
        fieldNama = new JTextField(11);

        labelJurusan = new JLabel("Jurusan : ");
        fieldJurusan = new JTextField(11);

        buttonSubmit = new JButton("Submit");

        buttonSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nim = fieldNim.getText();
                String nama = fieldNama.getText();
                String jurusan = fieldJurusan.getText();

                fe = new FormEvent(this,nim,nama,jurusan);
                if(fl!=null){
                    fl.eventSender(fe);
                }
            }
        });


        setLayout(new GridBagLayout());
        GridBagConstraints gc = new GridBagConstraints();
        gc.fill = GridBagConstraints.NONE;

        gc.gridx = 0;
        gc.gridy = 0;
        gc.weightx = 1.0;
        gc.weighty = 1.0;
        gc.insets = new Insets(10,0,0,0);
        gc.anchor = GridBagConstraints.LINE_END;
        add(labelNim,gc);

        gc.gridx = 1;
        gc.weightx = 1.0;
        gc.weighty = 1.0;
        gc.insets = new Insets(10,0,0,0);
        gc.anchor = GridBagConstraints.LINE_START;
        add(fieldNim,gc);

        ///////////////////////////////////////////////////////

        gc.gridx = 0;
        gc.gridy++;
        gc.weightx = 1.0;
        gc.weighty = 1.0;
        gc.insets = new Insets(0,0,0,0);
        gc.anchor = GridBagConstraints.LINE_END;
        add(labelNama,gc);

        gc.gridx = 1;
        gc.weightx = 1.0;
        gc.weighty = 1.0;
        gc.insets = new Insets(0,0,0,0);
        gc.anchor = GridBagConstraints.LINE_START;
        add(fieldNama,gc);

        ///////////////////////////////////////////////////////

        gc.gridx = 0;
        gc.gridy++;
        gc.weightx = 1.0;
        gc.weighty = 1.0;
        gc.insets = new Insets(0,0,0,0);
        gc.anchor = GridBagConstraints.LINE_END;
        add(labelJurusan,gc);

        gc.gridx = 1;
        gc.weightx = 1.0;
        gc.weighty = 1.0;
        gc.insets = new Insets(0,0,0,0);
        gc.anchor = GridBagConstraints.LINE_START;
        add(fieldJurusan,gc);

        ///////////////////////////////////////////////////////

        gc.gridx = 1;
        gc.gridy++;
        gc.weightx = 1.0;
        gc.weighty = 50.0;
        gc.insets = new Insets(5,0,0,0);
        gc.anchor = GridBagConstraints.FIRST_LINE_START;
        add(buttonSubmit,gc);

    }
}
