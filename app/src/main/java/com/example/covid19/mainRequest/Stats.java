
package com.example.covid19.mainRequest;

import java.util.List;

import com.google.gson.annotations.SerializedName;


@SuppressWarnings("unused")
public class Stats {

    @SerializedName("results")
    private List<Result> mResults;
    @SerializedName("stat")
    private String mStat;

    public List<Result> getResults() {
        return mResults;
    }

    public void setResults(List<Result> results) {
        mResults = results;
    }

    public String getStat() {
        return mStat;
    }

    public void setStat(String stat) {
        mStat = stat;
    }

}
