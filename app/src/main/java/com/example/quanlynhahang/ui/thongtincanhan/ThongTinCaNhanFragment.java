package com.example.quanlynhahang.ui.thongtincanhan;

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

public class ThongTinCaNhanFragment extends Fragment {

    private ThongTinCaNhanViewModel thongTinCaNhanViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        thongTinCaNhanViewModel =
                new ViewModelProvider(this).get(ThongTinCaNhanViewModel.class);
        View root = inflater.inflate(R.layout.fragment_thongtincanhan, container, false);
        final TextView textView = root.findViewById(R.id.text_thongtincanhan);
        thongTinCaNhanViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}