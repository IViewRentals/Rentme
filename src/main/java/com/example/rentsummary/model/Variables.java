package com.example.rentsummary.model;

import java.util.List;

public class Variables {

    private String query;
    private boolean testListings;
    private boolean nullifyOptionals;
    private List<String> recentHides;
    public void setQuery(String query) {
        this.query = query;
    }
    public String getQuery() {
        return query;
    }

    public void setTestListings(boolean testListings) {
        this.testListings = testListings;
    }
    public boolean getTestListings() {
        return testListings;
    }

    public void setNullifyOptionals(boolean nullifyOptionals) {
        this.nullifyOptionals = nullifyOptionals;
    }
    public boolean getNullifyOptionals() {
        return nullifyOptionals;
    }

    public void setRecentHides(List<String> recentHides) {
        this.recentHides = recentHides;
    }
    public List<String> getRecentHides() {
        return recentHides;
    }
}
