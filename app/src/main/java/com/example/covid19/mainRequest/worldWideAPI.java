package com.example.covid19.mainRequest;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface worldWideAPI {
    @GET("free-api?global=stats")
    Call<Stats> getWorldData();
}
