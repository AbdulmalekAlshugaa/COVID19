package com.COVID19Tracker.covid19.mainRequest;

import com.COVID19Tracker.covid19.AlternativeAPI.AlterNativeAPI;
import com.COVID19Tracker.covid19.ThirdAPI.Third;

import retrofit2.Call;
import retrofit2.http.GET;

public interface worldWideAPI {
    @GET("free-api?global=stats")
    Call<Stats> getWorldData();

    @GET("cases/general-stats")
    Call<AlterNativeAPI> getWorldDataAlterNative();

    @GET("all")
    Call<Third> ThirdAPI();


}
