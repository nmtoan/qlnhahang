package com.example.quanlynhahang.ui.trangchu;

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

public class TrangChuFragment extends Fragment {

    private TrangChuViewModel trangChuViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        trangChuViewModel =
                new ViewModelProvider(this).get(TrangChuViewModel.class);
        View root = inflater.inflate(R.layout.fragment_trangchu, container, false);
        final TextView textView = root.findViewById(R.id.text_trangchu);
        trangChuViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}