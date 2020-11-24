package com.example.quanlynhahang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class DangNhapActivity extends AppCompatActivity {

    EditText edtTenNguoiDung, edtMatKhau;
    Button btnDangNhap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dangnhap);

        edtTenNguoiDung = (EditText) findViewById(R.id.edtTenNguoiDung);
        edtMatKhau = (EditText) findViewById(R.id.edtMatKhau);
        btnDangNhap = (Button) findViewById(R.id.btnDangNhap);

        edtTenNguoiDung.setText("a");
        edtMatKhau.setText("1");

        btnDangNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edtTenNguoiDung.getText().length() == 0 || edtMatKhau.getText().length() == 0) {
                    Toast.makeText(DangNhapActivity.this, "Vui lòng nhập đầy đủ thông tin.", Toast.LENGTH_SHORT).show();
                } else {
                    if (kiemTraDangNhap()) {
                        Toast.makeText(DangNhapActivity.this, "Đăng nhập thành công.", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(DangNhapActivity.this, NavigationActivity.class);
                        startActivity(intent);
                    } else {
                        Toast.makeText(DangNhapActivity.this, "Tên người dùng hoặc mật khẩu không đúng.", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }

    private boolean kiemTraDangNhap() {
        if (edtTenNguoiDung.getText().toString().equals("a") && edtMatKhau.getText().toString().equals("1")) {
            return true;
        }
        return false;
    }

}