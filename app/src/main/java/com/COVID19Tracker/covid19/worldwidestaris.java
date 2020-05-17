package com.COVID19Tracker.covid19;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.ProgressBar;

import com.COVID19Tracker.covid19.Adapter.AdpaterClass;
import com.COVID19Tracker.covid19.ListStats.API_Imp;
import com.COVID19Tracker.covid19.ListStats.ApiResponds;
import com.COVID19Tracker.covid19.ListStats.ListModel;
import com.COVID19Tracker.covid19.ListStats.ViewData;
import com.jpardogo.android.googleprogressbar.library.ChromeFloatingCirclesDrawable;
import com.mancj.materialsearchbar.MaterialSearchBar;

import java.util.ArrayList;

public class worldwidestaris extends AppCompatActivity implements ViewData {
    private API_Imp api_imp;
    private static final String TAG = "worldwidestaris";
    int TotalCases;

    private ArrayList<ListModel> mTrackingTrip = new ArrayList<>(); // mNote
    private AdpaterClass mListCurrentDateAdapter; // Adapter
    private RecyclerView mListDataView;
    private ProgressBar mProgressBar;
    private MaterialSearchBar searchBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_worldwidestaris);
        mListDataView = findViewById(R.id.LoadStatics);
        api_imp = new API_Imp(this);
        searchBar = findViewById(R.id.searchBar);
        searchBar.addTextChangeListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                filter(s.toString());

            }
        });

        RecyclerViewMethods();

        //

        mProgressBar = findViewById(R.id.googlePross);


        mProgressBar.setIndeterminateDrawable(new ChromeFloatingCirclesDrawable.Builder(this)
                .build());
        mProgressBar.setVisibility(View.VISIBLE);

    }

    private void RecyclerViewMethods() {
        LinearLayoutManager manager = new LinearLayoutManager(this);
        mListDataView.setLayoutManager(manager);
        mListDataView.setHasFixedSize(true);
        mListCurrentDateAdapter = new AdpaterClass(this, mTrackingTrip);
        mListDataView.setAdapter(mListCurrentDateAdapter);
        mListDataView.invalidate();

    }

    private void filter(String text){
        ArrayList<ListModel> filterList = new ArrayList<>();

        for (ListModel item :mTrackingTrip){
            if (item.getCName().toLowerCase().contains(text.toLowerCase())){
                filterList.add(item);
            }
        }
        mListCurrentDateAdapter.filterList(filterList);

    }

    @Override
    protected void onStart() {
        super.onStart();
        api_imp.getData(this);

    }




    @Override
    public void OnSuccess(ApiResponds OnSuccess) {
        for (int i=0; i<OnSuccess.getResponse().size(); i++){
            ListModel listModel = new ListModel();

            listModel.setCName(OnSuccess.getResponse().get(i).getCountry());
            listModel.setConfiremed(OnSuccess.getResponse().get(i).getCases().getTotal().toString());
            listModel.setRecovery(OnSuccess.getResponse().get(i).getCases().getRecovered().toString());
            listModel.setDeath(OnSuccess.getResponse().get(i).getDeaths().getTotal().toString());
            listModel.setNewCases(OnSuccess.getResponse().get(i).getCases().getNew());
            listModel.setNewDeathCases(OnSuccess.getResponse().get(i).getDeaths().getNew());
            listModel.setNewActive(OnSuccess.getResponse().get(i).getCases().getActive().toString());
            listModel.setNewCritical(OnSuccess.getResponse().get(i).getCases().getCritical().toString());
            listModel.setTotal(OnSuccess.getResponse().get(i).getCases().getTotal().toString());



            mTrackingTrip.add(listModel);
        }
        mListCurrentDateAdapter.notifyDataSetChanged();
        mProgressBar.setVisibility(View.INVISIBLE);

        
    }

    @Override
    public void OnError(String OnError) {

    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(worldwidestaris.this, MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
        finish();
    }
}
