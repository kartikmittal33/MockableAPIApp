package com.testing.mockableapiapp;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface API {

    String BASE_URL = "https://demo9838921.mockable.io/";

    @GET("testing")
    Call<Message> getInfo();

    @POST("posting")
    Call<Message> posting();

}