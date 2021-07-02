package view;

import controller.Controller;

import javax.swing.*;
import java.awt.BorderLayout;

public class MainFrame extends JFrame {
    private FormPanel formPanel;
    private FormTable formTabel;
    private Controller controller;

    public MainFrame(){
        super("App Belajar Java");
        setSize(650,500);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        formPanel = new FormPanel();
        formTabel = new FormTable();
        controller = new Controller();

        formTabel.setData(controller.getAllData());
        formPanel.setFormListener(feo -> {
            controller.addPerson(feo);
            formTabel.refresh();
        });

        add(formPanel,BorderLayout.WEST);
        add(formTabel,BorderLayout.CENTER);
    }
}
