package com.example.rentsummary.model;

/**
 * state
 */
public class StateEntity {

    private int id;
    private String state;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "StateEntity{" +
                "id=" + id +
                ", state='" + state + '\'' +
                '}';
    }
}
