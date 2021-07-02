package view;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MainFramePanel extends JPanel {
    private JLabel labelName;
    private JTextField fieldName;
    private JLabel labelOccupation;
    private JTextField fieldOccupation;
    private JLabel labelAge;
    private JList listAge;
    private JLabel labelEmploy;
    private JComboBox comboEmploy;
    private JButton buttonSubmit;
    private JLabel labelUsCitizen;
    private JCheckBox checkCitizen;
    private JLabel labelTaxID;
    private JTextField fieldTaxID;

    private JLabel labelGender;
    private ButtonGroup groupGender;
    private JRadioButton radioMale;
    private JRadioButton radioFemale;

    private MainFrameListener mainFrameListener;

    public void setMainFrameListener(MainFrameListener mainFrameListener){
        this.mainFrameListener = mainFrameListener;
    }

    MainFramePanel(){
        Dimension dim = getPreferredSize();
        dim.width = 300;

        setPreferredSize(dim);
        setLayout(new GridBagLayout());

        Border innerBorder = BorderFactory.createTitledBorder("Add Person");
        Border outerBorder = BorderFactory.createEmptyBorder(10,10,10,0);
        setBorder(BorderFactory.createCompoundBorder(outerBorder,innerBorder));

        fieldName = new JTextField(11);
        labelName = new JLabel("Nama :");
        labelName.setDisplayedMnemonic(KeyEvent.VK_N);
        labelName.setLabelFor(fieldName);

        fieldOccupation = new JTextField(11);
        labelOccupation = new JLabel("Occupation :");
        labelOccupation.setDisplayedMnemonic(KeyEvent.VK_O);
        labelOccupation.setLabelFor(fieldOccupation);

        buttonSubmit = new JButton("Submit");
        buttonSubmit.setMnemonic(KeyEvent.VK_S);

        DefaultListModel ageModel = new DefaultListModel();
        ageModel.addElement(new AgeCategory(0,"Under 18"));
        ageModel.addElement(new AgeCategory(1,"18 to 65"));
        ageModel.addElement(new AgeCategory(2,"65 or Over"));

        labelAge = new JLabel("Age :");
        listAge = new JList(ageModel);

        listAge.setSelectedIndex(0);
        listAge.setBorder(BorderFactory.createEtchedBorder());
        listAge.setPreferredSize(new Dimension(125,59));

        DefaultComboBoxModel employModel = new DefaultComboBoxModel();
        employModel.addElement("Employed");
        employModel.addElement("SelfEmployed");
        employModel.addElement("Unemployed");

        labelEmploy = new JLabel("Employee :");
        comboEmploy = new JComboBox(employModel);

        comboEmploy.setEditable(true);
        comboEmploy.setSelectedIndex(0);
        comboEmploy.setPreferredSize(new Dimension(125,23));

        labelUsCitizen = new JLabel("US Citizen :");
        checkCitizen = new JCheckBox();

        labelTaxID = new JLabel("Tax ID :");
        fieldTaxID = new JTextField(11);

        labelTaxID.setEnabled(false);
        fieldTaxID.setEnabled(false);

        labelGender = new JLabel("Gender :");
        groupGender = new ButtonGroup();
        radioMale = new JRadioButton("Male");
        radioFemale = new JRadioButton("Female");
        groupGender.add(radioMale);
        groupGender.add(radioFemale);
        radioMale.setSelected(true);

        radioMale.setActionCommand("Male");
        radioFemale.setActionCommand("Female");

        buttonSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = fieldName.getText();
                String occupation = fieldOccupation.getText();
                AgeCategory ageCategory = (AgeCategory) listAge.getSelectedValue();
                String employ = (String) comboEmploy.getSelectedItem();
                boolean usCitizen = checkCitizen.isSelected();
                String taxID = fieldTaxID.getText();
                String gender = groupGender.getSelection().getActionCommand();

                MainFrameEvent fe = new MainFrameEvent(this,
                                                        name,
                                                        occupation,
                                                        ageCategory.getId(),
                                                        employ,
                                                        taxID,
                                                        usCitizen,
                                                        gender);

                if(mainFrameListener !=null) {
                    mainFrameListener.formSender(fe);
                }

            }
        });

        checkCitizen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean isChecked = checkCitizen.isSelected();

                if(!isChecked){
                    fieldTaxID.setText("");
                }

                labelTaxID.setEnabled(isChecked);
                fieldTaxID.setEnabled(isChecked);
            }
        });

        buttonSubmit.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
            if(e.getKeyCode()==KeyEvent.VK_ENTER) {
                buttonSubmit.doClick();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });

        GridBagConstraints gc = new GridBagConstraints();
        gc.fill = GridBagConstraints.NONE;

        ///////// Input Name //////////

        gc.gridx = 0;
        gc.gridy = 0;
        gc.weightx = 1;
        gc.weighty = 0.1;
        gc.insets = new Insets(10,0,0,10);
        gc.anchor = GridBagConstraints.LINE_END;
        add(labelName,gc);

        gc.gridx = 1;
        gc.gridy = 0;
        gc.weightx = 1;
        gc.weighty = 0.1;
        gc.insets = new Insets(15,0,0,0);
        gc.anchor = GridBagConstraints.LINE_START;
        add(fieldName,gc);

        ///////// Input Occupation //////////

        gc.gridx = 0;
        gc.gridy++;
        gc.weightx = 1;
        gc.weighty = 0.02;
        gc.insets = new Insets(-2,0,0,10);
        gc.anchor = GridBagConstraints.LINE_END;
        add(labelOccupation,gc);

        gc.gridx = 1;
        gc.weightx = 1;
        gc.weighty = 0.02;
        gc.insets = new Insets(4,0,0,0);
        gc.anchor = GridBagConstraints.LINE_START;
        add(fieldOccupation,gc);


        ///////// AgeList Option //////////

        gc.gridx = 0;
        gc.gridy++;
        gc.weightx = 1;
        gc.weighty = 0.02;
        gc.insets = new Insets(7,0,0,10);
        gc.anchor = GridBagConstraints.FIRST_LINE_END;
        add(labelAge,gc);

        gc.gridx = 1;
        gc.weightx = 1;
        gc.weighty = 0.02;
        gc.insets = new Insets(5,0,0,0);
        gc.anchor = GridBagConstraints.FIRST_LINE_START;
        add(listAge,gc);

        ///////// Combo Employ Option //////////

        gc.gridx = 0;
        gc.gridy++;
        gc.weightx = 1;
        gc.weighty = 0.02;
        gc.insets = new Insets(5,0,0,10);
        gc.anchor = GridBagConstraints.LINE_END;
        add(labelEmploy,gc);

        gc.gridx = 1;
        gc.weightx = 1;
        gc.weighty = 0.02;
        gc.insets = new Insets(5,0,0,0);
        gc.anchor = GridBagConstraints.LINE_START;
        add(comboEmploy,gc);

        ///////// US Citizen //////////

        gc.gridy++;

        gc.gridx = 0;
        gc.weightx = 1;
        gc.weighty = 0.02;
        gc.insets = new Insets(3,0,0,10);
        gc.anchor = GridBagConstraints.LINE_END;
        add(labelUsCitizen,gc);

        gc.gridx = 1;
        gc.weightx = 1;
        gc.weighty = 0.02;
        gc.insets = new Insets(3,-4,0,0);
        gc.anchor = GridBagConstraints.LINE_START;
        add(checkCitizen,gc);

        ///////// Tax ID  //////////

        gc.gridx = 0;
        gc.gridy++;

        gc.weightx = 1;
        gc.weighty = 0.02;
        gc.insets = new Insets(2,0,0,10);
        gc.anchor = GridBagConstraints.LINE_END;
        add(labelTaxID,gc);

        gc.gridx = 1;

        gc.weightx = 1;
        gc.weighty = 0.02;
        gc.insets = new Insets(2,0,0,0);
        gc.anchor = GridBagConstraints.LINE_START;
        add(fieldTaxID,gc);

        ///////// Tax ID  //////////

        gc.gridx = 0;
        gc.gridy++;

        gc.weightx = 1;
        gc.weighty = 0.02;
        gc.insets = new Insets(2,0,0,10);
        gc.anchor = GridBagConstraints.LINE_END;
        add(labelGender,gc);

        gc.gridx = 1;

        gc.weightx = 1;
        gc.weighty = 0.02;
        gc.insets = new Insets(2,-4,0,0);
        gc.anchor = GridBagConstraints.LINE_START;
        add(radioMale,gc);

        gc.gridx = 1;
        gc.gridy++;

        gc.weightx = 1;
        gc.weighty = 0.02;
        gc.insets = new Insets(-2,-4,0,0);
        gc.anchor = GridBagConstraints.LINE_START;
        add(radioFemale,gc);

        ///////// Button Submit //////////

        gc.gridx = 1;
        gc.gridy++;
        gc.weightx = 1;
        gc.weighty = 3;
        gc.insets = new Insets(13,0,0,0);
        gc.anchor = GridBagConstraints.FIRST_LINE_START;
        add(buttonSubmit,gc);
    }
}
