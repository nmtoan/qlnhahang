package com.example.quanlynhahang.ui.thongtincanhan;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ThongTinCaNhanViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ThongTinCaNhanViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Đây là giao diện thông tin cá nhân");
    }

    public LiveData<String> getText() {
        return mText;
    }
}