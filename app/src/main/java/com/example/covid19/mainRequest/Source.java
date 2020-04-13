
package com.example.covid19.mainRequest;


import com.google.gson.annotations.SerializedName;


@SuppressWarnings("unused")
public class Source {

    @SerializedName("url")
    private String mUrl;

    public String getUrl() {
        return mUrl;
    }

    public void setUrl(String url) {
        mUrl = url;
    }

}
