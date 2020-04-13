package com.example.covid19.mainRequest;

import java.util.ArrayList;
import java.util.List;

public interface OnView {
    void onSuccess (List SuccessMessage);
    void onError (String ErrorMessage);

}
