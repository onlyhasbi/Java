package programmer.zaman.now.data;

import programmer.zaman.now.annotation.Fancy;

@Fancy(name="Level", tags={"app","java"})
public enum Level {
    STANDARD("Standar Level"),
    PREMIUM("Premium Level"),
    VIP("VIP Level");

    private String description;

    Level(String description){
        this.description = description;
    }

    public String getDescription(){
        return description;
    }
}
