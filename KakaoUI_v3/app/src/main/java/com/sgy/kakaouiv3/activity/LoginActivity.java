package com.sgy.kakaouiv3.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.sgy.kakaouiv3.MyApplication;
import com.sgy.kakaouiv3.databinding.ActivityLoginBinding;

public class LoginActivity extends BaseActivity {

    // the reason is memory okey?
    ActivityLoginBinding binding = null;

    @Override
    public void createActivity() { // == onCreate Okey?
        MyApplication.context = getApplicationContext(); // context init

        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.tvLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goMainActivity();
            }
        });
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
    public void viewClick(View v) {   // all activity are using this method okey?
        // so If you create Activity, Source is chk your common method
        // if you dont use common method that source show error
        switch (v.getId()) {

        }
    }

    private void goMainActivity() {
        Intent goLoginActivity = new Intent(this, MainActivity.class);
        goLoginActivity.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(goLoginActivity);
        overridePendingTransition(0, 0);
    }
}