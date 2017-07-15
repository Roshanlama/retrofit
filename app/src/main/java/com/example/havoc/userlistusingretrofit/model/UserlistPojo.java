package com.example.havoc.userlistusingretrofit.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by havoc on 7/14/17.
 */

public class UserlistPojo {


    @SerializedName("username")
    private String username;

    @SerializedName("id")
    private String id;

    @SerializedName("address")
    private String address;

    @SerializedName("email")
    private String email;

    @SerializedName("phone")
    private String phone;

    public UserlistPojo(String username, String id, String address, String email, String phone) {
        this.username = username;
        this.id = id;
        this.address = address;
        this.email = email;
        this.phone = phone;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
