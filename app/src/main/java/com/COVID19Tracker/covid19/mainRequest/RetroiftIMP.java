package com.COVID19Tracker.covid19.mainRequest;

import android.content.Context;

import com.COVID19Tracker.covid19.dashboard.StaticsAPI;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetroiftIMP {
    //private static final String BASE_URL = "https://thevirustracker.com/";
    private static final String BASE_URL = "https://corona-virus-stats.herokuapp.com/api/v1/";
    private static RetroiftIMP minstance;
    private Retrofit retrofit;
    private Context context;
    private static final String TAG = "RetroiftClass";


    final OkHttpClient okHttpClient = new OkHttpClient.Builder()
            .readTimeout(60, TimeUnit.SECONDS)
            .connectTimeout(60, TimeUnit.SECONDS)
            .build();

    private RetroiftIMP(String URl) {
        retrofit = new Retrofit.Builder()
                .baseUrl(URl)
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }


    public static synchronized RetroiftIMP getInstance(String URl) {
        if (minstance == null) {
            minstance = new RetroiftIMP(URl);
        }
        return minstance;
    }
    public worldWideAPI getWorldWideApi() {
        return retrofit.create(worldWideAPI.class);

    }

    public StaticsAPI getStaticsAPIApi() {
        return retrofit.create(StaticsAPI.class);

    }
}
