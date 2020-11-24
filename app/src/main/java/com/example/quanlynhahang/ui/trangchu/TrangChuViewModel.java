package com.example.quanlynhahang.ui.trangchu;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class TrangChuViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public TrangChuViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Đây là giao diện trang chủ");
    }

    public LiveData<String> getText() {
        return mText;
    }
}