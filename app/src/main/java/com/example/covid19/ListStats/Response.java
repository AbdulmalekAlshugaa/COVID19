
package com.example.covid19.ListStats;


import com.google.gson.annotations.SerializedName;


@SuppressWarnings("unused")
public class Response {

    @SerializedName("cases")
    private Cases mCases;
    @SerializedName("country")
    private String mCountry;
    @SerializedName("day")
    private String mDay;
    @SerializedName("deaths")
    private Deaths mDeaths;
    @SerializedName("tests")
    private Tests mTests;
    @SerializedName("time")
    private String mTime;

    public Cases getCases() {
        return mCases;
    }

    public void setCases(Cases cases) {
        mCases = cases;
    }

    public String getCountry() {
        return mCountry;
    }

    public void setCountry(String country) {
        mCountry = country;
    }

    public String getDay() {
        return mDay;
    }

    public void setDay(String day) {
        mDay = day;
    }

    public Deaths getDeaths() {
        return mDeaths;
    }

    public void setDeaths(Deaths deaths) {
        mDeaths = deaths;
    }

    public Tests getTests() {
        return mTests;
    }

    public void setTests(Tests tests) {
        mTests = tests;
    }

    public String getTime() {
        return mTime;
    }

    public void setTime(String time) {
        mTime = time;
    }

}
