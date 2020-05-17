
package com.COVID19Tracker.covid19.mainRequest;


import com.google.gson.annotations.SerializedName;


@SuppressWarnings("unused")
public class Result {

    @SerializedName("source")
    private Source mSource;
    @SerializedName("total_active_cases")
    private Long mTotalActiveCases;
    @SerializedName("total_affected_countries")
    private Long mTotalAffectedCountries;
    @SerializedName("total_cases")
    private Long mTotalCases;
    @SerializedName("total_deaths")
    private Long mTotalDeaths;
    @SerializedName("total_new_cases_today")
    private Long mTotalNewCasesToday;
    @SerializedName("total_new_deaths_today")
    private Long mTotalNewDeathsToday;
    @SerializedName("total_recovered")
    private Long mTotalRecovered;
    @SerializedName("total_serious_cases")
    private Long mTotalSeriousCases;
    @SerializedName("total_unresolved")
    private Long mTotalUnresolved;

    public Source getSource() {
        return mSource;
    }

    public void setSource(Source source) {
        mSource = source;
    }

    public Long getTotalActiveCases() {
        return mTotalActiveCases;
    }

    public void setTotalActiveCases(Long totalActiveCases) {
        mTotalActiveCases = totalActiveCases;
    }

    public Long getTotalAffectedCountries() {
        return mTotalAffectedCountries;
    }

    public void setTotalAffectedCountries(Long totalAffectedCountries) {
        mTotalAffectedCountries = totalAffectedCountries;
    }

    public Long getTotalCases() {
        return mTotalCases;
    }

    public void setTotalCases(Long totalCases) {
        mTotalCases = totalCases;
    }

    public Long getTotalDeaths() {
        return mTotalDeaths;
    }

    public void setTotalDeaths(Long totalDeaths) {
        mTotalDeaths = totalDeaths;
    }

    public Long getTotalNewCasesToday() {
        return mTotalNewCasesToday;
    }

    public void setTotalNewCasesToday(Long totalNewCasesToday) {
        mTotalNewCasesToday = totalNewCasesToday;
    }

    public Long getTotalNewDeathsToday() {
        return mTotalNewDeathsToday;
    }

    public void setTotalNewDeathsToday(Long totalNewDeathsToday) {
        mTotalNewDeathsToday = totalNewDeathsToday;
    }

    public Long getTotalRecovered() {
        return mTotalRecovered;
    }

    public void setTotalRecovered(Long totalRecovered) {
        mTotalRecovered = totalRecovered;
    }

    public Long getTotalSeriousCases() {
        return mTotalSeriousCases;
    }

    public void setTotalSeriousCases(Long totalSeriousCases) {
        mTotalSeriousCases = totalSeriousCases;
    }

    public Long getTotalUnresolved() {
        return mTotalUnresolved;
    }

    public void setTotalUnresolved(Long totalUnresolved) {
        mTotalUnresolved = totalUnresolved;
    }

}
