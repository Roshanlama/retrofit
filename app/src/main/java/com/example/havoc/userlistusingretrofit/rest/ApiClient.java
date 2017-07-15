package com.example.havoc.userlistusingretrofit.rest;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by havoc on 7/14/17.
 */

public class ApiClient {

    public static  final String BASE_URL = "http://kinbech.6te.net/ResturantFoods/api/";
    private static Retrofit retrofit = null;

    public static Retrofit getClient(){

        if (retrofit==null){
            retrofit= new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
