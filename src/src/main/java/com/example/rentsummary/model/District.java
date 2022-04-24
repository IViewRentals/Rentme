/**
 * define AllHomesEntitySearchResultsBean class for handle data about address
 *
 * @author rentme
 */
package com.example.rentsummary.model;

public class District {

    private int priority;
    private int value;
    private String name;
    private String type;
    public void setPriority(int priority) {
        this.priority = priority;
    }
    public int getPriority() {
        return priority;
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
