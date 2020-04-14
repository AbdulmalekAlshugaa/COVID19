
package com.example.covid19.AlternativeAPI;


import com.google.gson.annotations.SerializedName;


@SuppressWarnings("unused")
public class Data {

    @SerializedName("active_cases_critical_percentage")
    private String mActiveCasesCriticalPercentage;
    @SerializedName("active_cases_mild_percentage")
    private String mActiveCasesMildPercentage;
    @SerializedName("cases_with_outcome")
    private String mCasesWithOutcome;
    @SerializedName("closed_cases_death_percentage")
    private String mClosedCasesDeathPercentage;
    @SerializedName("closed_cases_recovered_percentage")
    private String mClosedCasesRecoveredPercentage;
    @SerializedName("critical_condition_active_cases")
    private String mCriticalConditionActiveCases;
    @SerializedName("currently_infected")
    private String mCurrentlyInfected;
    @SerializedName("death_cases")
    private String mDeathCases;
    @SerializedName("death_closed_cases")
    private String mDeathClosedCases;
    @SerializedName("general_death_rate")
    private String mGeneralDeathRate;
    @SerializedName("last_update")
    private String mLastUpdate;
    @SerializedName("mild_condition_active_cases")
    private String mMildConditionActiveCases;
    @SerializedName("recovered_closed_cases")
    private String mRecoveredClosedCases;
    @SerializedName("recovery_cases")
    private String mRecoveryCases;
    @SerializedName("total_cases")
    private String mTotalCases;

    public String getActiveCasesCriticalPercentage() {
        return mActiveCasesCriticalPercentage;
    }

    public void setActiveCasesCriticalPercentage(String activeCasesCriticalPercentage) {
        mActiveCasesCriticalPercentage = activeCasesCriticalPercentage;
    }

    public String getActiveCasesMildPercentage() {
        return mActiveCasesMildPercentage;
    }

    public void setActiveCasesMildPercentage(String activeCasesMildPercentage) {
        mActiveCasesMildPercentage = activeCasesMildPercentage;
    }

    public String getCasesWithOutcome() {
        return mCasesWithOutcome;
    }

    public void setCasesWithOutcome(String casesWithOutcome) {
        mCasesWithOutcome = casesWithOutcome;
    }

    public String getClosedCasesDeathPercentage() {
        return mClosedCasesDeathPercentage;
    }

    public void setClosedCasesDeathPercentage(String closedCasesDeathPercentage) {
        mClosedCasesDeathPercentage = closedCasesDeathPercentage;
    }

    public String getClosedCasesRecoveredPercentage() {
        return mClosedCasesRecoveredPercentage;
    }

    public void setClosedCasesRecoveredPercentage(String closedCasesRecoveredPercentage) {
        mClosedCasesRecoveredPercentage = closedCasesRecoveredPercentage;
    }

    public String getCriticalConditionActiveCases() {
        return mCriticalConditionActiveCases;
    }

    public void setCriticalConditionActiveCases(String criticalConditionActiveCases) {
        mCriticalConditionActiveCases = criticalConditionActiveCases;
    }

    public String getCurrentlyInfected() {
        return mCurrentlyInfected;
    }

    public void setCurrentlyInfected(String currentlyInfected) {
        mCurrentlyInfected = currentlyInfected;
    }

    public String getDeathCases() {
        return mDeathCases;
    }

    public void setDeathCases(String deathCases) {
        mDeathCases = deathCases;
    }

    public String getDeathClosedCases() {
        return mDeathClosedCases;
    }

    public void setDeathClosedCases(String deathClosedCases) {
        mDeathClosedCases = deathClosedCases;
    }

    public String getGeneralDeathRate() {
        return mGeneralDeathRate;
    }

    public void setGeneralDeathRate(String generalDeathRate) {
        mGeneralDeathRate = generalDeathRate;
    }

    public String getLastUpdate() {
        return mLastUpdate;
    }

    public void setLastUpdate(String lastUpdate) {
        mLastUpdate = lastUpdate;
    }

    public String getMildConditionActiveCases() {
        return mMildConditionActiveCases;
    }

    public void setMildConditionActiveCases(String mildConditionActiveCases) {
        mMildConditionActiveCases = mildConditionActiveCases;
    }

    public String getRecoveredClosedCases() {
        return mRecoveredClosedCases;
    }

    public void setRecoveredClosedCases(String recoveredClosedCases) {
        mRecoveredClosedCases = recoveredClosedCases;
    }

    public String getRecoveryCases() {
        return mRecoveryCases;
    }

    public void setRecoveryCases(String recoveryCases) {
        mRecoveryCases = recoveryCases;
    }

    public String getTotalCases() {
        return mTotalCases;
    }

    public void setTotalCases(String totalCases) {
        mTotalCases = totalCases;
    }

}
