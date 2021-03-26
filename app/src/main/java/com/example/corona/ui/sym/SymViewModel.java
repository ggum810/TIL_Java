package com.example.corona.ui.sym;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.MutableLiveData;

public class SymViewModel extends ViewModel {


    private MutableLiveData<String> mText;

    public SymViewModel() {
        mText = new MutableLiveData<>();
    }

    public LiveData<String> getText() {
        return mText;
    }
}