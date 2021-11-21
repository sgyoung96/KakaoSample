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
    public void setStatusbarPadding(int height) {
        // Layout 에 statusbar 높이만큼 padding 주기 -> view 가 statusbar 와 겹쳐 보이지 않도록
    }
}