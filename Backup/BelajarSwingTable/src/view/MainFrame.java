package view;

import controller.Controller;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    private PanelForm panelForm;
    private PanelTable panelTable;
    private Controller controller;

    public MainFrame(){
        super("Belajar Input Data ke Table");
        setVisible(true);
        setSize(800,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        panelForm = new PanelForm();
        panelTable = new PanelTable();

        add(panelForm,BorderLayout.WEST);
        add(panelTable,BorderLayout.CENTER);

        controller = new Controller();
        panelTable.setData(controller.getMahasiswa());
        panelForm.setFormListener(new FormListener() {
            @Override
            public void eventSender(FormEvent fe) {
                controller.addMahasiswa(fe);
                panelTable.refresh();
            }
        });


    }
}
