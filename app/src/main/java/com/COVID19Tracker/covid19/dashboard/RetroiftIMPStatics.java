package com.COVID19Tracker.covid19.dashboard;

import android.content.Context;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetroiftIMPStatics {
    private static final String BASE_URL = "https://covid-193.p.rapidapi.com/";
    private static RetroiftIMPStatics minstance;
    private Retrofit retrofit;
    private Context context;
    private static final String TAG = "RetroiftClass";


    final OkHttpClient okHttpClient = new OkHttpClient.Builder()
            .readTimeout(60, TimeUnit.SECONDS)
            .connectTimeout(60, TimeUnit.SECONDS)
            .build();

    private RetroiftIMPStatics() {
        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }


    public static synchronized RetroiftIMPStatics getInstance() {
        if (minstance == null) {
            minstance = new RetroiftIMPStatics();
        }
        return minstance;
    }


    public StaticsAPI getStaticsAPIApi() {
        return retrofit.create(StaticsAPI.class);

    }
}
