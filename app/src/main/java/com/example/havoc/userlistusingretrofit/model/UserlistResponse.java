package com.example.havoc.userlistusingretrofit.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by havoc on 7/14/17.
 */

public class UserlistResponse {

    @SerializedName("status")
    private String status;

    @SerializedName("message")
    private String message;

    @SerializedName("data")
    private List<UserlistPojo> data;

    public UserlistResponse(String status, String message, List<UserlistPojo> data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<UserlistPojo> getData() {
        return data;
    }

    public void setData(List<UserlistPojo> data) {
        this.data = data;
    }
}
