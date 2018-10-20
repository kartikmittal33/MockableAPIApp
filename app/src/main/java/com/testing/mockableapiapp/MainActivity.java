package com.testing.mockableapiapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        API api = Singleton.getSingleton().getRetrofit().create(API.class);
        Call<Message> weatherDataCall1 = api.getInfo();

        weatherDataCall1.enqueue(new Callback<Message>() {
            @Override
            public void onResponse(Call<Message> call, Response<Message> response) {
                System.out.println(response.body().getName());
                System.out.println(response.body().getMsg());

            }

            @Override
            public void onFailure(Call<Message> call, Throwable t) {
                System.out.println(t.getMessage());
            }
        });

        Call<Message> call = api.posting();

        call.enqueue(new Callback<Message>() {
            @Override
            public void onResponse(Call<Message> call, Response<Message> response) {
                System.out.println(response.body().getId());
            }

            @Override
            public void onFailure(Call<Message> call, Throwable t) {

            }
        });

        System.out.println("here");


    }
}
