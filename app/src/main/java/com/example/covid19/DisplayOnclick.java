package com.example.covid19;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.covid19.ListStats.ListModel;

public class DisplayOnclick extends AppCompatActivity {
    private static final String TAG = "DisplayOnclick";
    private TextView Total,Recovired, TotalDeath,NewCasses,NewDeath,Critical,ActivieCases,Cname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_onclick);
        Total = findViewById(R.id.TotalCases);
        Recovired =  findViewById(R.id.TotalRecovired);
        TotalDeath =  findViewById(R.id.TotalDeaths);
        Cname = findViewById(R.id.CountryName);
        NewCasses = findViewById(R.id.NewCSE);
        NewDeath = findViewById(R.id.NewDeath);
        Critical = findViewById(R.id.Critical);
        ActivieCases =  findViewById(R.id.Active);



        //
        Intent i = getIntent();
        ListModel dene = (ListModel) i.getSerializableExtra("MyClass");
        Total.setText(dene.getTotal());
        Recovired.setText(dene.getRecovery());
        TotalDeath.setText(dene.getDeath());
        Cname.setText(dene.getCName());
        NewCasses.setText(dene.getNewCases());
        NewDeath.setText(dene.getNewDeathCases());
        Critical.setText(dene.getNewCritical());
        ActivieCases.setText(dene.getNewActive());
        if (NewDeath == null){
            NewDeath.setText("+0");
        }


    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(DisplayOnclick.this, worldwidestaris.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
        finish();
    }
}
