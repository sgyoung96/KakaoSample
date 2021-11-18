package com.sgy.kakaoui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.sgy.kakaoui.base.BaseActivity;
import com.sgy.kakaoui.databinding.ActivityMainBinding;

public class MainActivity extends BaseActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setStatusbarTranslucent(binding.vgMain);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}