package com.example.covid19;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.covid19.mainRequest.CovidImp;
import com.example.covid19.mainRequest.OnView;
import com.example.covid19.mainRequest.Presenter;
import com.example.covid19.mainRequest.Result;
import com.jpardogo.android.googleprogressbar.library.ChromeFloatingCirclesDrawable;
import com.jpardogo.android.googleprogressbar.library.FoldingCirclesDrawable;
import com.jpardogo.android.googleprogressbar.library.NexusRotationCrossDrawable;

import java.util.List;

import butterknife.ButterKnife;

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

    @Override
    public void onSuccess(List SuccessMessage) {
       List<Result> resultList = SuccessMessage;
       textView.setText(resultList.get(0).getTotalCases().toString());
       recovirred.setText(resultList.get(0).getTotalRecovered().toString());
       deaths.setText(resultList.get(0).getTotalDeaths().toString());
        mProgressBar.setVisibility(View.INVISIBLE);



    }

    @Override
    public void onError(String ErrorMessage) {

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
        Intent intent = new Intent(MainActivity.this, Testing.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
        finish();
    }
}
