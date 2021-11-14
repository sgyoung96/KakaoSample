package com.sgy.kakaoui.splash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.sgy.kakaoui.MainActivity;
import com.sgy.kakaoui.base.BaseActivity;
import com.sgy.kakaoui.databinding.ActivitySplashBinding;

public class SplashActivity extends BaseActivity {

    ActivitySplashBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySplashBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setStatusbarTranslucent(binding.vgMain);

        Thread task = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                startActivity(new Intent(getApplication(), MainActivity.class));
            }
        });
        task.start();
    }

    @Override
    public void onBackPressed() {
        // 백버튼 동작 막기
    }
}