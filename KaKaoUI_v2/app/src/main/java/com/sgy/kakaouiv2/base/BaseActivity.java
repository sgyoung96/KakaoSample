package com.sgy.kakaouiv2.base;

import android.content.Context;
import android.view.View;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

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
//        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        v.setPadding(0, getStatusbarHeight(getApplicationContext()), 0, 0);
    }
}
