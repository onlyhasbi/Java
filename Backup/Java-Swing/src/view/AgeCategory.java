package view;

public class AgeCategory {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String toString(){
        return age;
    }

    private int id;
    private String age;

    public AgeCategory(int id,String age){
        this.id = id;
        this.age = age;
    }

}
