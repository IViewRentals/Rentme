package com.example.rentsummary.model;

public class RealestateRequestFilter {

    private boolean surroundingSuburbs;
    private boolean excludeNoSalePrice;
    private boolean furnished;
    private boolean petsAllowed;
    private boolean hasScheduledAuction;
    public void setSurroundingSuburbs(boolean surroundingSuburbs) {
        this.surroundingSuburbs = surroundingSuburbs;
    }
    public boolean getSurroundingSuburbs() {
        return surroundingSuburbs;
    }

    public void setExcludeNoSalePrice(boolean excludeNoSalePrice) {
        this.excludeNoSalePrice = excludeNoSalePrice;
    }
    public boolean getExcludeNoSalePrice() {
        return excludeNoSalePrice;
    }

    public void setFurnished(boolean furnished) {
        this.furnished = furnished;
    }
    public boolean getFurnished() {
        return furnished;
    }

    public void setPetsAllowed(boolean petsAllowed) {
        this.petsAllowed = petsAllowed;
    }
    public boolean getPetsAllowed() {
        return petsAllowed;
    }

    public void setHasScheduledAuction(boolean hasScheduledAuction) {
        this.hasScheduledAuction = hasScheduledAuction;
    }
    public boolean getHasScheduledAuction() {
        return hasScheduledAuction;
    }
}
