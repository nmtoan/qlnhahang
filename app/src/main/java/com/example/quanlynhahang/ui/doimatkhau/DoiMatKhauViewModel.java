package com.example.quanlynhahang.ui.doimatkhau;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DoiMatKhauViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public DoiMatKhauViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Đây là giao diện đổi mật khẩu");
    }

    public LiveData<String> getText() {
        return mText;
    }
}