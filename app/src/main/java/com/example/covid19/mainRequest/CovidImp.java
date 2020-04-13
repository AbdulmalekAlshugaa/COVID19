package com.example.covid19.mainRequest;

import android.app.Activity;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CovidImp implements Presenter, OnView {
    private OnView onView;
    private static final String TAG = "CovidImp";

    public CovidImp(OnView onView) {
        this.onView = onView;
    }

    @Override
    public void onSuccess(List SuccessMessage) {
        onView.onSuccess(SuccessMessage);

    }

    @Override
    public void onError(String ErrorMessage) {
        onView.onError(ErrorMessage);

    }

    @Override
    public void onSucessData() {
        RetroiftIMP.getInstance("https://thevirustracker.com/")
                .getWorldWideApi()
                .getWorldData()
                .enqueue(new Callback<Stats>() {
            @Override
            public void onResponse(Call<Stats> call, Response<Stats> response) {
                if (response.isSuccessful()){
                    onView.onSuccess(response.body().getResults());
                }else {
                    onView.onError(response.message());
                }
            }

            @Override
            public void onFailure(Call<Stats> call, Throwable t) {
                Log.d(TAG, "onFailure: "+t.getMessage().toString());

            }
        });

    }
}
