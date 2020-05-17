
package com.COVID19Tracker.covid19.ListStats;


import com.google.gson.annotations.SerializedName;


@SuppressWarnings("unused")
public class Cases {

    @SerializedName("active")
    private Long mActive;
    @SerializedName("critical")
    private Long mCritical;
    @SerializedName("new")
    private String mNew;
    @SerializedName("recovered")
    private Long mRecovered;
    @SerializedName("total")
    private Long mTotal;

    public Long getActive() {
        return mActive;
    }

    public void setActive(Long active) {
        mActive = active;
    }

    public Long getCritical() {
        return mCritical;
    }

    public void setCritical(Long critical) {
        mCritical = critical;
    }

    public String getNew() {
        return mNew;
    }

    public void setNew(String mnew) {
        mNew = mnew;
    }

    public Long getRecovered() {
        return mRecovered;
    }

    public void setRecovered(Long recovered) {
        mRecovered = recovered;
    }

    public Long getTotal() {
        return mTotal;
    }

    public void setTotal(Long total) {
        mTotal = total;
    }

}
