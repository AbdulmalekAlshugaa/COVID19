package com.example.covid19.dashboard;

import com.example.covid19.ListStats.ApiResponds;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

public interface StaticsAPI {
    // send statics
    @Headers("x-rapidapi-key: aa0573bee2mshfd16ecea89e2716p1e364djsnb6db660af0fe")
    @GET("statistics")
    Call<ApiResponds> getCountryData();

}
