package com.sgy.kakaov4.util;

import android.content.Context;
import android.util.Log;

import com.sgy.kakaov4.R;

public class SysUtil {
    public static void MY_LOG(Context context, String tag, String content) {
        Log.d(context.getString(R.string.log_tag) + tag, content);
    }
}
