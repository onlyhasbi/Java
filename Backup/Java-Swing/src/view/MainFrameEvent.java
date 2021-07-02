package view;

import java.util.EventObject;

public class MainFrameEvent extends EventObject {

    public String getName() {
        return name;
    }

    public String getOccupation() {
        return occupation;
    }

    public int getAgeCategory() {
        return ageCategory;
    }

    public String getEmploy() {
        return employ;
    }

    public String getTaxID(){
        return taxID;
    }

    public boolean getUsCitizen(){
        return usCitizen;
    }

    public String getGender(){
        return gender;
    }

    private String name;
    private String occupation;
    private int ageCategory;
    private String employ;
    private String taxID;
    private boolean usCitizen;
    String gender;

    public MainFrameEvent(Object source) {
        super(source);
    }

    public MainFrameEvent(Object source,
                          String name,
                          String occupation,
                          int ageCategory,
                          String employ,
                          String taxID,
                          boolean usCitizen,
                          String gender) {
        super(source);
        this.name = name;
        this.occupation = occupation;
        this.ageCategory = ageCategory;
        this.employ = employ;
        this.taxID = taxID;
        this.usCitizen = usCitizen;
        this.gender = gender;
    }

}
