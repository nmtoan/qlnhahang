package com.example.quanlynhahang.ui.doimatkhau;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.quanlynhahang.R;

public class DoiMatKhauFragment extends Fragment {

    private DoiMatKhauViewModel doiMatKhauViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        doiMatKhauViewModel =
                new ViewModelProvider(this).get(DoiMatKhauViewModel.class);
        View root = inflater.inflate(R.layout.fragment_doimatkhau, container, false);
//        final TextView textView = root.findViewById(R.id.text_doimatkhau);
//        doiMatKhauViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//                textView.setText(s);
//            }
//        });
        return root;
    }
}