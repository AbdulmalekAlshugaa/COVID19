package com.COVID19Tracker.covid19.ListStats;

import android.app.Activity;
import android.util.Log;

import com.COVID19Tracker.covid19.dashboard.RetroiftIMPStatics;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class API_Imp implements ViewData,Presenter {

    private static final String TAG = "API_Imp";
    private ViewData viewData;

    public API_Imp(ViewData viewData) {
        this.viewData = viewData;
    }

    @Override
    public void getData(Activity activity) {
        RetroiftIMPStatics.getInstance().getStaticsAPIApi()
                .getCountryData()
                .enqueue(new Callback<ApiResponds>() {
            @Override
            public void onResponse(Call<ApiResponds> call, Response<ApiResponds> response) {
                if (response.isSuccessful()){
                    viewData.OnSuccess(response.body());

                }else {
                    Log.d(TAG, "onResponse: "+response.code());
                    Log.d(TAG, "onResponse: ."+response.headers().toString());

                }



            }

            @Override
            public void onFailure(Call<ApiResponds> call, Throwable t) {
                Log.d(TAG, "onFailure: "+t.getMessage().toString());
                Log.d(TAG, "onFailure: "+t.fillInStackTrace());
                viewData.OnError(t.getMessage().toString());

            }
        });

    }

    @Override
    public void OnSuccess(ApiResponds OnSuccess) {
       viewData.OnSuccess(OnSuccess);

    }

    @Override
    public void OnError(String OnError) {
        viewData.OnError(OnError);

    }
}
