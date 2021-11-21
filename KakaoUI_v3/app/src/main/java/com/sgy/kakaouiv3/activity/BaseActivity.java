package com.sgy.kakaouiv3.activity;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.sgy.kakaouiv3.R;
import com.sgy.kakaouiv3.util.SysUtil;

public abstract class BaseActivity extends AppCompatActivity implements View.OnClickListener {

    // Base = Common Method and Use Common Function Okey?

    public abstract void createActivity();
    public abstract void resumeActivity();
    public abstract void pauseActivity();
    public abstract void destroyActivity();

    public abstract void viewClick(View v);

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SysUtil.MY_LOG(this, getString(R.string.activity_create)); // chk debug

        this.createActivity();
    }

    @Override
    protected void onResume() {
        super.onResume();
        SysUtil.MY_LOG(this, getString(R.string.activity_resume));

        this.resumeActivity();
    }

    @Override
    protected void onPause() {
        super.onPause();
        SysUtil.MY_LOG(this, getString(R.string.activity_pause));

        this.pauseActivity();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        SysUtil.MY_LOG(this, getString(R.string.activity_destroy));

        this.destroyActivity();
    }

    @Override
    public void onClick(View v) {
        this.viewClick(v);
    }
}
