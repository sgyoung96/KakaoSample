package com.sgy.kakaoui.base;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.view.WindowManager;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.sgy.kakaoui.R;

public class BaseActivity extends AppCompatActivity {

    private int getStatusbarHeight(Context context) {
        int resourceId = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (resourceId > 0) {
            return context.getResources().getDimensionPixelOffset(resourceId);
        } else {
            return 0;
        }
    }

    public void setStatusbarTranslucent(View v) {
        getWindow().clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        getWindow().setStatusBarColor(Color.TRANSPARENT);
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_FULLSCREEN);
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        v.setPadding(0, getStatusbarHeight(getApplicationContext()), 0, 0);
    }
}