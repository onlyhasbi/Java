package view;

import java.util.EventObject;

public class FormEvent extends EventObject {

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    private String id;
    private String name;

    public FormEvent(Object source) {
        super(source);
    }

    public FormEvent(Object source,String id,String name){
        super(source);
        this.id = id;
        this.name = name;
    }
}
