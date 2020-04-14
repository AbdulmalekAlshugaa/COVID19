
package com.example.covid19.ThirdAPI;


import com.google.gson.annotations.SerializedName;


@SuppressWarnings("unused")
public class Third {

    @SerializedName("active")
    private Long mActive;
    @SerializedName("affectedCountries")
    private Long mAffectedCountries;
    @SerializedName("cases")
    private Long mCases;
    @SerializedName("casesPerOneMillion")
    private Long mCasesPerOneMillion;
    @SerializedName("critical")
    private Long mCritical;
    @SerializedName("deaths")
    private Long mDeaths;
    @SerializedName("deathsPerOneMillion")
    private Long mDeathsPerOneMillion;
    @SerializedName("recovered")
    private Long mRecovered;
    @SerializedName("tests")
    private Long mTests;
    @SerializedName("testsPerOneMillion")
    private Double mTestsPerOneMillion;
    @SerializedName("todayCases")
    private Long mTodayCases;
    @SerializedName("todayDeaths")
    private Long mTodayDeaths;
    @SerializedName("updated")
    private Long mUpdated;

    public Long getActive() {
        return mActive;
    }

    public void setActive(Long active) {
        mActive = active;
    }

    public Long getAffectedCountries() {
        return mAffectedCountries;
    }

    public void setAffectedCountries(Long affectedCountries) {
        mAffectedCountries = affectedCountries;
    }

    public Long getCases() {
        return mCases;
    }

    public void setCases(Long cases) {
        mCases = cases;
    }

    public Long getCasesPerOneMillion() {
        return mCasesPerOneMillion;
    }

    public void setCasesPerOneMillion(Long casesPerOneMillion) {
        mCasesPerOneMillion = casesPerOneMillion;
    }

    public Long getCritical() {
        return mCritical;
    }

    public void setCritical(Long critical) {
        mCritical = critical;
    }

    public Long getDeaths() {
        return mDeaths;
    }

    public void setDeaths(Long deaths) {
        mDeaths = deaths;
    }

    public Long getDeathsPerOneMillion() {
        return mDeathsPerOneMillion;
    }

    public void setDeathsPerOneMillion(Long deathsPerOneMillion) {
        mDeathsPerOneMillion = deathsPerOneMillion;
    }

    public Long getRecovered() {
        return mRecovered;
    }

    public void setRecovered(Long recovered) {
        mRecovered = recovered;
    }

    public Long getTests() {
        return mTests;
    }

    public void setTests(Long tests) {
        mTests = tests;
    }

    public Double getTestsPerOneMillion() {
        return mTestsPerOneMillion;
    }

    public void setTestsPerOneMillion(Double testsPerOneMillion) {
        mTestsPerOneMillion = testsPerOneMillion;
    }

    public Long getTodayCases() {
        return mTodayCases;
    }

    public void setTodayCases(Long todayCases) {
        mTodayCases = todayCases;
    }

    public Long getTodayDeaths() {
        return mTodayDeaths;
    }

    public void setTodayDeaths(Long todayDeaths) {
        mTodayDeaths = todayDeaths;
    }

    public Long getUpdated() {
        return mUpdated;
    }

    public void setUpdated(Long updated) {
        mUpdated = updated;
    }

}
