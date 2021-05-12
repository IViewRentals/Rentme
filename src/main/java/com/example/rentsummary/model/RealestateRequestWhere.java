package com.example.rentsummary.model;

import java.util.List;

public class RealestateRequestWhere {

    private String channel;
    private int page;
    private int pageSize;
    private RealestateRequestFilter filters;
    private List<Localities> localities;
    public void setChannel(String channel) {
        this.channel = channel;
    }
    public String getChannel() {
        return channel;
    }

    public void setPage(int page) {
        this.page = page;
    }
    public int getPage() {
        return page;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
    public int getPageSize() {
        return pageSize;
    }

    public void setFilters(RealestateRequestFilter filters) {
        this.filters = filters;
    }
    public RealestateRequestFilter getFilters() {
        return filters;
    }

    public void setLocalities(List<Localities> localities) {
        this.localities = localities;
    }
    public List<Localities> getLocalities() {
        return localities;
    }
}
