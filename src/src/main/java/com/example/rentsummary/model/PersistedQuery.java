package com.example.rentsummary.model;

public class PersistedQuery {

    private int version;
    private String sha256Hash;
    public void setVersion(int version) {
        this.version = version;
    }
    public int getVersion() {
        return version;
    }

    public void setSha256Hash(String sha256Hash) {
        this.sha256Hash = sha256Hash;
    }
    public String getSha256Hash() {
        return sha256Hash;
    }
}
