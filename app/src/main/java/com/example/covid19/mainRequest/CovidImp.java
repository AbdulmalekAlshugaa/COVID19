package com.example.covid19.mainRequest;

import android.app.Activity;
import android.util.Log;

import com.example.covid19.AlternativeAPI.AlterNativeAPI;
import com.example.covid19.AlternativeAPI.Data;
import com.example.covid19.ThirdAPI.Third;

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
    public void onSuccess(Third SuccessMessage) {
        onView.onSuccess(SuccessMessage);

    }

    @Override
    public void onError(String ErrorMessage) {
        onView.onError(ErrorMessage);

    }

    @Override
    public void onSucessData() {
        RetroiftIMP.getInstance("https://corona.lmao.ninja/")
                .getWorldWideApi()
                .ThirdAPI()
                .enqueue(new Callback<Third>() {
                    @Override
                    public void onResponse(Call<Third> call, Response<Third> response) {
                        if (response.isSuccessful()){
                           // Third third = (Third) response.body();
                            onView.onSuccess(response.body());
                            Log.d(TAG, "onResponse: "+response.code());
                        }else {
                            onView.onError(response.message());
                            Log.d(TAG, "onResponse Error : "+response.message());
                        }
                    }

                    @Override
                    public void onFailure(Call<Third> call, Throwable t) {
                        onView.onError(t.getMessage().toString());
                        Log.d(TAG, "onFailure: "+t.getMessage().toString());

                    }
                });

//                .getWorldDataAlterNative().enqueue(new Callback<AlterNativeAPI>() {
//            @Override
//            public void onResponse(Call<AlterNativeAPI> call, Response<AlterNativeAPI> response) {
//                if (response.isSuccessful()){
//                    onView.onSuccess(response.body().getData());
//                    Log.d(TAG, "onResponse: "+response.code());
//                }else {
//                    onView.onError(response.message());
//                    Log.d(TAG, "onResponse Error : "+response.message());
//                }
//            }
//
//            @Override
//            public void onFailure(Call<AlterNativeAPI> call, Throwable t) {
//                onView.onError(t.getMessage().toString());
//                Log.d(TAG, "onFailure: "+t.getMessage().toString());
//            }
//        });
//                .getWorldData()
//                .enqueue(new Callback<Stats>() {
//            @Override
//            public void onResponse(Call<Stats> call, Response<Stats> response) {
//                if (response.isSuccessful()){
//                    onView.onSuccess(response.body().getResults());
//                    Log.d(TAG, "onResponse: "+response.code());
//                }else {
//                    onView.onError(response.message());
//                    Log.d(TAG, "onResponse Error : "+response.message());
//                }
//            }
//
//            @Override
//            public void onFailure(Call<Stats> call, Throwable t) {
//                onView.onError(t.getMessage().toString());
//                Log.d(TAG, "onFailure: "+t.getMessage().toString());
//
//            }
//        });

    }
}
