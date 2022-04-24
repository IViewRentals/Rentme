package com.example.rentsummary.model;

public class CommonBean {

    private int id;
    private int value;
    private String name;
    private String type;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public void setValue(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setType(String type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }
}
