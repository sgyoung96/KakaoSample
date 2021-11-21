package com.sgy.kakaov4.activity;

import android.view.View;

import com.sgy.kakaov4.MyApplication;
import com.sgy.kakaov4.databinding.ActivityLoginBinding;

public class LoginActivity extends BaseActivity {

    ActivityLoginBinding binding = null;

    @Override
    public void createActivity() {
        MyApplication.context = getApplicationContext();
        binding = ActivityLoginBinding.inflate(getLayoutInflater());
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

    }
}