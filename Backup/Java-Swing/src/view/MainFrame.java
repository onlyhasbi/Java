package view;

import controller.Controller;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class MainFrame extends JFrame {
    private JButton buttonSubmit;
    private MainFramePanel mainFramePanel;
    private JFileChooser fileChooser;
    private Controller controller;
    private TablePanel tablePanel;

    MainFrame(){
        super("Belajar Swing");
        setVisible(true);
        setSize(800,600);
        setMinimumSize(new Dimension(650,500));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setJMenuBar(createMenuBar());

        mainFramePanel = new MainFramePanel();
        controller = new Controller();
        tablePanel = new TablePanel();

        tablePanel.setData(controller.getPeople());

        fileChooser = new JFileChooser();
        fileChooser.addChoosableFileFilter(new PersonFileFilter());


        mainFramePanel.setMainFrameListener(new MainFrameListener(){
            public void formSender(MainFrameEvent fe){
                controller.addPerson(fe);
                tablePanel.refresh();
            }
        });

        add(tablePanel,BorderLayout.CENTER);
        add(mainFramePanel,BorderLayout.WEST);
    }

    private JMenuBar createMenuBar(){
        JMenuBar menuBar =  new JMenuBar();

        JMenu fileMenu = new JMenu("File");
        fileMenu.setMnemonic(KeyEvent.VK_F);

        JMenu windowMenu = new JMenu("Window");
        JMenu showMenu = new JMenu("Show");

        JMenuItem exportItem = new JMenuItem("Export Data...");
        exportItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(fileChooser.showSaveDialog(MainFrame.this)==JFileChooser.APPROVE_OPTION){
                    try {
                        controller.saveToFile(fileChooser.getSelectedFile());
                        tablePanel.refresh();
                    } catch (IOException ioException) {
                        JOptionPane.showMessageDialog(MainFrame.this,
                                "Can't save data to file","Error",JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });

        JMenuItem importItem = new JMenuItem("Import Data...");
        importItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(fileChooser.showOpenDialog(MainFrame.this)==JFileChooser.APPROVE_OPTION){
                    try {
                        controller.loadFromFile(fileChooser.getSelectedFile());
                        tablePanel.refresh();
                    } catch (IOException ioException) {
                        JOptionPane.showMessageDialog(MainFrame.this,
                                "Can't load file","Error",JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });

        JMenuItem exitItem = new JMenuItem("Exit");
        exitItem.setMnemonic(KeyEvent.VK_X);
        exitItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X,ActionEvent.CTRL_MASK));
        exitItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int actionExit = JOptionPane.showConfirmDialog(MainFrame.this,"Do you want to close application ?","Confirm Exit",JOptionPane.YES_NO_OPTION);
                if(actionExit==JOptionPane.YES_OPTION){
                    System.exit(0);
                }
            }
        });

        JCheckBoxMenuItem personItem = new JCheckBoxMenuItem("Person");
        personItem.setSelected(true);
        personItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JCheckBoxMenuItem visible = (JCheckBoxMenuItem) e.getSource();
                mainFramePanel.setVisible(visible.isSelected());
            }
        });

        menuBar.add(fileMenu);
        menuBar.add(windowMenu);

        fileMenu.add(exportItem);
        fileMenu.add(importItem);
        fileMenu.addSeparator();
        fileMenu.add(exitItem);

        windowMenu.add(showMenu);
        showMenu.add(personItem);

        return menuBar;
    }
}
