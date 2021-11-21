package com.sgy.kakaov4.activity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.sgy.kakaov4.R;
import com.sgy.kakaov4.util.SysUtil;

public abstract class BaseActivity extends AppCompatActivity implements View.OnClickListener {

    public final String TAG = BaseActivity.class.getName();

    public abstract void createActivity();
    public abstract void resumeActivity();
    public abstract void pauseActivity();
    public abstract void destroyActivity();

    public abstract void onViewClick(View v);
    public abstract void setStatusbarPadding(int height);

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SysUtil.MY_LOG(this, TAG, getString(R.string.activity_create));
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        createActivity();
        setStatusbarPadding(getStatusbarHeight());
    }

    @Override
    protected void onResume() {
        super.onResume();
        SysUtil.MY_LOG(this, TAG, getString(R.string.activity_resume));

        resumeActivity();
    }

    @Override
    protected void onPause() {
        super.onPause();
        SysUtil.MY_LOG(this, TAG, getString(R.string.activity_pause));

        pauseActivity();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        SysUtil.MY_LOG(this, TAG, getString(R.string.activity_destroy));

        destroyActivity();
    }

    @Override
    public void onClick(View v) {

        onViewClick(v);
    }

    public int getStatusbarHeight() {
        int resourceId = this.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (resourceId > 0) {
            return this.getResources().getDimensionPixelOffset(resourceId);
        } else {
            return 0;
        }
    }
}
