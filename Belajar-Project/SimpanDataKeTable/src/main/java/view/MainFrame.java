package view;

import controller.Controller;

import javax.swing.*;
import java.awt.BorderLayout;

public class MainFrame extends JFrame {
    private FormPanel formPanel;
    private TablePanel tablePanel;
    private Controller controller;

    public MainFrame(){
        super("Belajar Insert Table");
        setSize(800,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        formPanel = new FormPanel();
        tablePanel = new TablePanel();

        controller = new Controller();
        tablePanel.setData(controller.getAllData());
        formPanel.setFormListener(fe -> {
            controller.addPerson(fe);
            tablePanel.refresh();
        });

        setLayout(new BorderLayout());
        add(formPanel,BorderLayout.WEST);
        add(tablePanel,BorderLayout.CENTER);
    }
}
