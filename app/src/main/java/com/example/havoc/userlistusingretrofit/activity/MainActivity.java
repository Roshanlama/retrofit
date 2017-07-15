package com.example.havoc.userlistusingretrofit.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.havoc.userlistusingretrofit.R;
import com.example.havoc.userlistusingretrofit.adapter.UserlistAdapter;
import com.example.havoc.userlistusingretrofit.model.UserlistPojo;
import com.example.havoc.userlistusingretrofit.model.UserlistResponse;
import com.example.havoc.userlistusingretrofit.rest.ApiClient;
import com.example.havoc.userlistusingretrofit.rest.ApiInterface;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RecyclerView recyclerView=(RecyclerView)findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        ApiInterface apiService= ApiClient.getClient().create(ApiInterface.class);
        Call<UserlistResponse> call = apiService.getUserList();
        call.enqueue(new Callback<UserlistResponse>() {
            @Override
            public void onResponse(Call<UserlistResponse> call, Response<UserlistResponse> response) {
                int statusCode = response.code();
                List<UserlistPojo> userlistPojoList = response.body().getData();
                recyclerView.setAdapter(new UserlistAdapter(userlistPojoList, R.layout.adapter_recyclerview,getApplicationContext()));
            }

            @Override
            public void onFailure(Call<UserlistResponse> call, Throwable t) {

            }
        });
    }
}
