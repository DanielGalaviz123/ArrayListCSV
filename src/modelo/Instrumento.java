package modelo;

import java.util.ArrayList;

public class Instrumento {

    private int code;
    private String name;
    private String form;
    private String type;
    private String condition;
    private ArrayList<String> authors;
    private boolean evaluated;

    public Instrumento(int code, String name, String form,String type, String condition, ArrayList<String> authors,boolean evaluated){
        this.code= code;
        this.name=name;
        this.form=form;
        this.type=type;
        this.condition=condition;
        this.authors=authors;
        this.evaluated=evaluated;
    }

    public int getCode(){
        return code;
    }

    public String getName(){
        return name;
    }

    public String getForm(){
        return form;
    }

    public String getType(){
        return type;
    }

    public String getCondition(){
        return condition;
    }

    public ArrayList<String> getAuthors(){
        return authors;
    }

    public boolean getEvaluated(){
        return evaluated;
    }  


}
