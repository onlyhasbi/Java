package model;

import java.io.Serializable;

public class Person implements Serializable {

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public AgeCategory getAgeCategory() {
        return ageCategory;
    }

    public void setAgeCategory(AgeCategory ageCategory) {
        this.ageCategory = ageCategory;
    }

    public EmployCategory getEmploy() {
        return employ;
    }

    public void setEmploy(EmployCategory employ) {
        this.employ = employ;
    }

    public String getTaxID() {
        return taxID;
    }

    public void setTaxID(String taxID) {
        this.taxID = taxID;
    }

    public boolean isUsCitizen() {
        return usCitizen;
    }

    public void setUsCitizen(boolean usCitizen) {
        this.usCitizen = usCitizen;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
    private static int count=0;

    private int id;
    private String name;
    private String occupation;
    private AgeCategory ageCategory;
    private EmployCategory employ;
    private String taxID;
    private boolean usCitizen;
    private Gender gender;

    public Person(String name, String occupation, AgeCategory ageCategory,
           EmployCategory employ,String taxID,boolean usCitizen, Gender gender){
        this.id = count;
        this.name = name;
        this.occupation = occupation;
        this.ageCategory = ageCategory;
        this.employ = employ;
        this.taxID = taxID;
        this.usCitizen = usCitizen;
        this.gender = gender;
        count++;
    }

}
