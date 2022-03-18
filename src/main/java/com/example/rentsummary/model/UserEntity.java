package com.example.rentsummary.model;

import lombok.Data;

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

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
                '}';
    }
}
