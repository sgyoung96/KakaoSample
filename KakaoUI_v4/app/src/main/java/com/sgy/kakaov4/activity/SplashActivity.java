package com.sgy.kakaov4.activity;

import android.content.Intent;
import android.view.View;

import com.sgy.kakaov4.MyApplication;
import com.sgy.kakaov4.databinding.ActivitySplashBinding;
import com.sgy.kakaov4.util.SysUtil;

public class SplashActivity extends BaseActivity {

    private String TAG = SplashActivity.class.getName();

    ActivitySplashBinding binding = null; // memory 문제로 null 로 초기화

    @Override
    public void createActivity() {
        MyApplication.context = getApplicationContext(); // context 초기화
        binding = ActivitySplashBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        goLoginScreen();
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

    private void goLoginScreen() {
        Thread task = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    SysUtil.MY_LOG(getApplicationContext(), TAG, "ERROR!! Intent Error");
                    e.printStackTrace();
                }
                Intent goLogin = new Intent(getApplicationContext(), LoginActivity.class);
                goLogin.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(goLogin);
                overridePendingTransition(0, 0); // TODO 애니메이션 효과 없애기가 안됨
                finish();
            }
        });
        task.start();
    }
}