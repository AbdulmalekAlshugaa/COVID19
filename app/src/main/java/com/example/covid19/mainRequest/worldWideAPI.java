package com.example.covid19.mainRequest;

import com.example.covid19.AlternativeAPI.AlterNativeAPI;
import com.example.covid19.ThirdAPI.Third;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface worldWideAPI {
    @GET("free-api?global=stats")
    Call<Stats> getWorldData();

    @GET("cases/general-stats")
    Call<AlterNativeAPI> getWorldDataAlterNative();

    @GET("all")
    Call<Third> ThirdAPI();


}
