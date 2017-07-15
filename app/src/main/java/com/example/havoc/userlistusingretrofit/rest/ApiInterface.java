package com.example.havoc.userlistusingretrofit.rest;

import com.example.havoc.userlistusingretrofit.model.UserlistResponse;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by havoc on 7/14/17.
 */

public interface ApiInterface {
    @GET("showuserslist")
    Call<UserlistResponse> getUserList();
}
