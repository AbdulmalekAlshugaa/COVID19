package com.COVID19Tracker.covid19.mainRequest;

import com.COVID19Tracker.covid19.ThirdAPI.Third;

public interface OnView {
    void onSuccess (Third SuccessMessage);
    void onError (String ErrorMessage);

}
