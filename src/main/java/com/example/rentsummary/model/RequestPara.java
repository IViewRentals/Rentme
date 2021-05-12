package com.example.rentsummary.model;

import org.springframework.stereotype.Component;

@Component
public class RequestPara {
//    REGION=canberra-act&
//    propertyTypes=HOUSE&
//    minprice=100&
//    maxprice=999999999&
//    minbedrooms=3&
//    maxbedrooms=99&
//    minbathrooms=2&
//    maxbathrooms=99&
//    minparking=1&
//    maxparking=99&
//    minlandsize=0&
//    maxlandsize=10000&
//    newestablished=0&
//    keywords=

    String REGION="canberra-act";
    String propertyTypes;
    Integer minprice=0;
    Integer maxprice=5000;
    Integer minbedrooms=0;
    Integer maxbedrooms=5;
    Integer minbathrooms=0;
    Integer maxbathrooms=5;
    Integer minparking=0;
    Integer maxparking=5;
    Integer minlandsize=0;
    Integer maxlandsize=10000;
    String keywords;

    public RequestPara() {
    }

    public String getREGION() {
        return REGION;
    }

    public void setREGION(String REGION) {
        this.REGION = REGION;
    }

    public String getPropertyTypes() {
        return propertyTypes;
    }

    public void setPropertyTypes(String propertyTypes) {
        this.propertyTypes = propertyTypes;
    }

    public Integer getMinprice() {
        return minprice;
    }

    public void setMinprice(Integer minprice) {
        this.minprice = minprice;
    }

    public Integer getMaxprice() {
        return maxprice;
    }

    public void setMaxprice(Integer maxprice) {
        this.maxprice = maxprice;
    }

    public Integer getMinbedrooms() {
        return minbedrooms;
    }

    public void setMinbedrooms(Integer minbedrooms) {
        this.minbedrooms = minbedrooms;
    }

    public Integer getMaxbedrooms() {
        return maxbedrooms;
    }

    public void setMaxbedrooms(Integer maxbedrooms) {
        this.maxbedrooms = maxbedrooms;
    }

    public Integer getMinbathrooms() {
        return minbathrooms;
    }

    public void setMinbathrooms(Integer minbathrooms) {
        this.minbathrooms = minbathrooms;
    }

    public Integer getMaxbathrooms() {
        return maxbathrooms;
    }

    public void setMaxbathrooms(Integer maxbathrooms) {
        this.maxbathrooms = maxbathrooms;
    }

    public Integer getMinparking() {
        return minparking;
    }

    public void setMinparking(Integer minparking) {
        this.minparking = minparking;
    }

    public Integer getMaxparking() {
        return maxparking;
    }

    public void setMaxparking(Integer maxparking) {
        this.maxparking = maxparking;
    }

    public Integer getMinlandsize() {
        return minlandsize;
    }

    public void setMinlandsize(Integer minlandsize) {
        this.minlandsize = minlandsize;
    }

    public Integer getMaxlandsize() {
        return maxlandsize;
    }

    public void setMaxlandsize(Integer maxlandsize) {
        this.maxlandsize = maxlandsize;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }
}
