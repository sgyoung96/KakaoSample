package com.sgy.kakaov4.activity;

import android.view.View;

import com.sgy.kakaov4.MyApplication;
import com.sgy.kakaov4.databinding.ActivitySplashBinding;

public class SplashActivity extends BaseActivity {

    ActivitySplashBinding binding = null; // memory 문제로 null 로 초기화

    @Override
    public void createActivity() {
        MyApplication.context = getApplicationContext(); // context 초기화
        binding = ActivitySplashBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }

    @Override
    public void resumeActivity() {

    }

    @Override
    public void pauseActivity() {

    }

    @Override
    public void destroyActivity() {

    }

    @Override
    public void onViewClick(View v) {

    }

    @Override
    public void setStatusbarPadding(View v, int height) {
        binding.mainContainer.setPadding(0, getStatusbarHeight(), 0, 0);
    }
}