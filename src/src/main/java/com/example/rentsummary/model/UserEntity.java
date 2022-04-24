package com.example.rentsummary.model;

/**
 * user
 */
public class UserEntity {

    /**
     * main key ID
     */
    private int id;
    /**
     * account number
     */
    private String account;
    /**
     * password
     */
    private String password;
    /**
     * mobile number
     */
    private String phone;
    /**
     *  e-mail
     */
    private String email;
    /**
     * address
     */
    private int cityId;
    /**
     * e-mail code
     */
    private String emailCode;

    private String baseSearch;
    private String hidTypeValue;
    private String searchInputPageTxt;
    private String searchInputValue;

    public String getEmailCode() {
        return emailCode;
    }

    public void setEmailCode(String emailCode) {
        this.emailCode = emailCode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBaseSearch() {
        return baseSearch;
    }

    public void setBaseSearch(String baseSearch) {
        this.baseSearch = baseSearch;
    }

    public String getHidTypeValue() {
        return hidTypeValue;
    }

    public void setHidTypeValue(String hidTypeValue) {
        this.hidTypeValue = hidTypeValue;
    }

    public String getSearchInputPageTxt() {
        return searchInputPageTxt;
    }

    public void setSearchInputPageTxt(String searchInputPageTxt) {
        this.searchInputPageTxt = searchInputPageTxt;
    }

    public String getSearchInputValue() {
        return searchInputValue;
    }

    public void setSearchInputValue(String searchInputValue) {
        this.searchInputValue = searchInputValue;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "id=" + id +
                ", account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", cityId=" + cityId +
                ", emailCode='" + emailCode + '\'' +
                ", baseSearch='" + baseSearch + '\'' +
                ", hidTypeValue='" + hidTypeValue + '\'' +
                ", searchInputPageTxt='" + searchInputPageTxt + '\'' +
                ", searchInputValue='" + searchInputValue + '\'' +
                '}';
    }
}
