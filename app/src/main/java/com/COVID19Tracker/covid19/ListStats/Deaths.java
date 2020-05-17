
package com.COVID19Tracker.covid19.ListStats;


import com.google.gson.annotations.SerializedName;


@SuppressWarnings("unused")
public class Deaths {

    @SerializedName("new")
    private String mNew;
    @SerializedName("total")
    private Long mTotal;

    public String getNew() {
        return mNew;
    }

    public void setNew(String mnew) {
        mNew = mnew;
    }

    public Long getTotal() {
        return mTotal;
    }

    public void setTotal(Long total) {
        mTotal = total;
    }

}
