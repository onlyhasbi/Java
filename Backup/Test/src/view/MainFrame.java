package view;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame{

    private FormPanel formPanel;
    private TablePanel tablePanel;

    public MainFrame(){
        super("Sistem Informasi");
        setVisible(true);
        setSize(800,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        tablePanel = new TablePanel();
        formPanel = new FormPanel();
        formPanel.setFormListener(new FormListener() {
            @Override
            public void senderObject(FormEvent fe) {
                String id = fe.getId();
                String name = fe.getName();

                tablePanel.insertData(fe);
                tablePanel.refresh();
            }
        });

        add(formPanel,BorderLayout.WEST);
        add(tablePanel,BorderLayout.CENTER);
    }
}
