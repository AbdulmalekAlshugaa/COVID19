
package com.example.covid19.ListStats;

import java.util.List;

import com.google.gson.annotations.SerializedName;


@SuppressWarnings("unused")
public class ApiResponds {

    @SerializedName("errors")
    private List<Object> mErrors;
    @SerializedName("get")
    private String mGet;
    @SerializedName("parameters")
    private List<Object> mParameters;
    @SerializedName("response")
    private List<Response> mResponse;
    @SerializedName("results")
    private Long mResults;

    public List<Object> getErrors() {
        return mErrors;
    }

    public void setErrors(List<Object> errors) {
        mErrors = errors;
    }

    public String getGet() {
        return mGet;
    }

    public void setGet(String get) {
        mGet = get;
    }

    public List<Object> getParameters() {
        return mParameters;
    }

    public void setParameters(List<Object> parameters) {
        mParameters = parameters;
    }

    public List<Response> getResponse() {
        return mResponse;
    }

    public void setResponse(List<Response> response) {
        mResponse = response;
    }

    public Long getResults() {
        return mResults;
    }

    public void setResults(Long results) {
        mResults = results;
    }

}
