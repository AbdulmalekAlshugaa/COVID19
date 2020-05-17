package com.COVID19Tracker.covid19;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.COVID19Tracker.covid19.ThirdAPI.Third;
import com.COVID19Tracker.covid19.mainRequest.CovidImp;
import com.COVID19Tracker.covid19.mainRequest.OnView;
import com.jpardogo.android.googleprogressbar.library.NexusRotationCrossDrawable;

public class MainActivity extends AppCompatActivity implements OnView {
    private CovidImp covidImp;
    private static final String TAG = "MainActivity";
    private TextView textView,recovirred,deaths;
    private ProgressBar mProgressBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //
        textView = findViewById(R.id.Total);
        recovirred = findViewById(R.id.Recovired);
        deaths = findViewById(R.id.Deaths);
        covidImp = new CovidImp(this);
        covidImp.onSucessData();
        mProgressBar = findViewById(R.id.google_progress);


        mProgressBar.setIndeterminateDrawable(new NexusRotationCrossDrawable.Builder(this)
                .build());
        mProgressBar.setVisibility(View.VISIBLE);


    }

    public void Data (Third SuccessMessage){
        textView.setText(SuccessMessage.getCases().toString());
        recovirred.setText(SuccessMessage.getRecovered().toString());
        deaths.setText(SuccessMessage.getDeaths().toString());
        mProgressBar.setVisibility(View.INVISIBLE);
    }


    @Override
    public void onSuccess(Third SuccessMessage) {
      // List<Result> resultList = SuccessMessage;
      Data(SuccessMessage);



    }

    @Override
    public void onError(String ErrorMessage) {
        mProgressBar.setVisibility(View.INVISIBLE);
        Toast.makeText(MainActivity.this,"Error While loading",Toast.LENGTH_LONG).show();


    }

    public void Statics(View view) {
        Intent intent = new Intent(MainActivity.this, worldwidestaris.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
        finish();
    }

    public void BMI(View view) {
        Intent intent = new Intent(MainActivity.this, BMI.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
        finish();
    }

    public void Preventive(View view) {
        Intent intent = new Intent(MainActivity.this, Payment.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
        finish();
    }

    public void Symptoic(View view) {
        Intent intent = new Intent(MainActivity.this, sym.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
        finish();
    }

    public void News(View view) {
        Intent intent = new Intent(MainActivity.this, News.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
        finish();
    }
    boolean doubleBackToExitPressedOnce = false;
    @Override
    public void onBackPressed() {
        if (doubleBackToExitPressedOnce) {
            super.onBackPressed();
            return;
        }

        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, "Please click BACK again to exit", Toast.LENGTH_SHORT).show();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                doubleBackToExitPressedOnce = false;
            }
        }, 4000);
    }

    public void Suggestion(View view) {
        Intent intent = new Intent(MainActivity.this, Feedback.class);
        startActivity(intent);
        finish();
    }
}
