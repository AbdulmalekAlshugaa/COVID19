package com.example.covid19.mainRequest;

import com.example.covid19.AlternativeAPI.AlterNativeAPI;
import com.example.covid19.AlternativeAPI.Data;
import com.example.covid19.ThirdAPI.Third;

import java.util.ArrayList;
import java.util.List;

public interface OnView {
    void onSuccess (Third SuccessMessage);
    void onError (String ErrorMessage);

}
