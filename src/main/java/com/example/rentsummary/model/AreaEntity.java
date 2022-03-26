package com.example.rentsummary.model;

public class AreaEntity {


    private int id;
    private String area;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "AreaEntity{" +
                "id=" + id +
                ", area='" + area + '\'' +
                '}';
    }
}
